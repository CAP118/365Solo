package com.Capium365.StepDefination;

import java.io.File;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.LoginActions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentService;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

/**
 * Parallel-ready Hooks class.
 * Each thread keeps its own ExtentTest and WebDriver instance.
 * Browser quits once per Runner (AfterAll).
 */
public class Hooks {

    // Thread-safe reporting objects
    private static ExtentReports extent = ExtentService.getInstance();
    private static ThreadLocal<ExtentTest> scenarioTest = new ThreadLocal<>();

    // Scenario-level context
    private static ThreadLocal<Map<String, Object>> scenarioContext = ThreadLocal.withInitial(HashMap::new);

    /* =========================================================
       One-time driver setup before any scenarios start (per suite)
       ========================================================= */
    @BeforeAll
    public static void globalSetup() {
        Log.info("Global driver setup initialized (parallel-ready).");
        System.out.println("Starting the Test Execution...");
    }

    /* =========================================================
       Before each scenario (per thread)
       ========================================================= */
    @Before
    public void beforeScenario(Scenario scenario) {
        HelperClass.setUpDriver(); // Creates thread-local driver if absent

        ExtentTest test = extent.createTest("Scenario: " + scenario.getName());
        scenarioTest.set(test);

        Log.info("Starting Scenario: " + scenario.getName());
        System.out.println("Starting Scenario: " + scenario.getName());
    }

    /* =========================================================
    Capture screenshot after each step (thread-safe)
    ========================================================= */
 @AfterStep
 public void afterStep(Scenario scenario) {
     WebDriver driver = HelperClass.getDriver();
     ExtentTest test = scenarioTest.get();
     String stepName = StepTracker.getCurrentStep();

     try {
         String screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
         String pageSource = driver.getPageSource().toLowerCase();
         boolean serverError = pageSource.contains("http error 502") ||
                               pageSource.contains("server error") ||
                               pageSource.contains("service unavailable") ||
                               pageSource.contains("this page isn’t working");
         boolean blankPage = pageSource.trim().isEmpty();
         String reason = null;
         if (scenario.isFailed()) reason = "Step failed.";
         else if (serverError) reason = "Server error (502 / Unavailable).";
         else if (blankPage) reason = "Blank page or slow response.";
         if (reason != null) {
             scenario.attach(Base64.getDecoder().decode(screenshot), "image/png", stepName);
             test.log(Status.FAIL, stepName + " - " + reason,
                     MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());
             Log.error("Captured failed step: " + stepName + " | " + reason);

             if (serverError || blankPage) {
                 Log.warn("Critical issue detected (" + reason + "). Closing browser...");
                 try { driver.quit(); } catch (Exception ignore) {}
                 Assert.fail(reason);
             }
         } else {
             test.log(Status.PASS, stepName);
             Log.info("Step passed: " + stepName);
         }
     } catch (Exception e) {
         Log.error("AfterStep failed: " + e.getMessage());
     }
 }
    /* =========================================================
       After each scenario (logout but keep driver until runner ends)
       ========================================================= */
 @After
 public void afterScenario(Scenario scenario) {
     WebDriver driver = HelperClass.getDriver();
     ExtentTest test = scenarioTest.get();
     try {
         String result = scenario.isFailed() ? "Failed" : "Passed";
         test.log(scenario.isFailed() ? Status.FAIL : Status.PASS,
                  "Scenario " + result + ": " + scenario.getName());
         Log.info("Scenario " + result + ": " + scenario.getName());
         if (driver != null) {
             try {
                 if (!((RemoteWebDriver) driver).getSessionId().toString().isEmpty()) {
                     LoginActions login = PageFactory.initElements(driver, LoginActions.class);
                     login.Logout();
                     Log.info("Logged out after scenario.");
                 }
             } catch (Exception e) {
                 Log.warn("Logout skipped or browser already closed: " + e.getMessage());
             }
             HelperClass.tearDown();
         }
     } catch (Exception e) {
         Log.error("Error in afterScenario: " + e.getMessage());
     } finally {
         scenarioContext.get().clear();
     }
 }

    /* =========================================================
       After all scenarios of the Runner (quit browser per runner)
       ========================================================= */
    @AfterAll
    public static void afterAllScenarios() {
        System.out.println("Ending Test Execution for Runner...");
        try {
            HelperClass.tearDown();  // closes only current thread's driver
            Log.info("Browser closed successfully for this runner.");
        } catch (Exception e) {
            Log.error("Error during browser teardown: " + e.getMessage());
        }

        try {
            extent.flush();
            System.out.println("Extent report flushed successfully.");
        } catch (Exception e) {
            System.out.println("Error flushing extent report: " + e.getMessage());
        }
    }

    /* =========================================================
       Extra Utilities (same as before)
       ========================================================= */

    public static void captureScreenshotBase64(WebDriver driver, ExtentTest test, String message) {
        try {
            String base64Screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BASE64);
            test.log(Status.INFO, message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            Log.info("Screenshot captured: " + message);
        } catch (Exception e) {
            Log.error("Failed to capture screenshot: " + message + " | Error: " + e.getMessage());
        }
    }

    public static void captureScreenshot(String screenshotName, Scenario scenario, ExtentTest test) {
        try {
            WebDriver driver = HelperClass.getDriver();
            TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();

            byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", screenshotName);

            String base64Screenshot = ts.getScreenshotAs(OutputType.BASE64);
            test.log(Status.INFO, "Screenshot: " + screenshotName,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());

            File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
            String filePath = System.getProperty("user.dir") + "/screenshots/" +
                    screenshotName + "_" + System.currentTimeMillis() + ".png";
            FileUtils.copyFile(screenshotFile, new File(filePath));

            Log.info("Saved screenshot: " + filePath);
        } catch (Exception e) {
            Log.error("Failed to capture screenshot: " + e.getMessage());
        }
    }

    public static void setScenarioContext(String key, Object value) {
        scenarioContext.get().put(key, value);
    }

    public static Object getScenarioContext(String key) {
        return scenarioContext.get().get(key);
    }

    public static void clearScenarioContext() {
        scenarioContext.get().clear();
    }

    public static ExtentTest getScenarioTest() {
        return scenarioTest.get();
    }

    public static void DetailsInfo(String message) {
        ExtentTest test = scenarioTest.get();
        test.log(Status.INFO, message);
        Log.info(message);
    }
}
