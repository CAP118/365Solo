package com.Capium365.Actions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium365.Locators.LoginLocators;
import com.Capium365.StepDefination.Hooks;
import com.aventstack.extentreports.Status;

public class LoginActions {

	LoginLocators loginLocators = null;

	public LoginActions() {
		this.loginLocators = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginLocators);
	}
	
	WebDriverWait wait=HelperClass.getWait();
	WebDriver driver=HelperClass.getDriver();

	public void EnterUsername(String username) {
		loginLocators.emailaddressTF.clear();
		loginLocators.emailaddressTF.sendKeys(username);

	}

	public void Clicknextbtn() throws Exception {
		loginLocators.nextbutton.click();
		Thread.sleep(2000);
	}

	public void EnterOTP() {
		By OTP = By.xpath("//input[@type='text']");
		HelperClass.isElementPresent(OTP);
		HelperClass.setValueUsingJS(OTP, "000000");
	}
	
//	public void Clickonverifyaccount() {
//		By verifyAccountBtn = By.xpath("//button[normalize-space()='Verify Account']");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(verifyAccountBtn));
//		HelperClass.safeClick(verifyAccountBtn);
//	}
	
	public void verifyAccount() {
		try {
			By verifyBtn = By.xpath("//a[contains(text(),'Verify Account')]");
			WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(verifyBtn));
			HelperClass.clickWithRetry(btn, driver, wait);
			Log.info("Clicked on Verify Account button");
			By errorMsg = By.xpath("//div[contains(@class,'alert-danger') and contains(@class,'fixed-alert')]");
			try {
				wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(errorMsg));
 
				if (HelperClass.isElementPresent(errorMsg)) {
					String err = HelperClass.getTextIfPresent(errorMsg);
					Log.error("Login failed: " + err);
					Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Login Failed");
					Hooks.getScenarioTest().log(Status.FAIL, "Scenario failed due to login issue: " + err);
					Assert.fail("Scenario failed due to login issue: " + err);
				}
			} catch (TimeoutException ignored) {
				Log.info("OTP verification successful or no error displayed. Proceeding with next steps.");
			}
 
		} catch (TimeoutException e) {
			Log.error("Timeout while waiting for Verify Account button: " + e.getMessage());
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Timeout Verify Account");
			Hooks.getScenarioTest().log(Status.FAIL,
					"Scenario failed due to login issue: Timeout while waiting for Verify Account button.");
			Assert.fail("Scenario failed due to login issue: Timeout while waiting for Verify Account button.");
		} catch (Exception e) {
			Log.error("Unexpected error during Verify Account: " + e.getMessage());
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Verify Account Exception");
			Hooks.getScenarioTest().log(Status.FAIL,
					"Scenario failed due to login issue: Unexpected error - " + e.getMessage());
			Assert.fail("Scenario failed due to login issue: Unexpected error - " + e.getMessage());
		}
	}


	public boolean isHomePage() {
		try {
			return loginLocators.Homepage_Element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickCapium365ClientLogin() {
		By loginSection = By.xpath("//h6[normalize-space()='365']");
		By clientLoginButton = By.xpath("//h6[normalize-space()='365']/following::a[normalize-space()='Login'][1]");
		HelperClass.isElementPresent(loginSection);
		HelperClass.waitUntilClickable(clientLoginButton);
		HelperClass.clickUsingJS(clientLoginButton);
	}

	public void navigateToCapium365Module() {
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(2));

		try {
			if (isElementVisible(loginLocators.Capiuum365_Module, wait)) {
				loginLocators.Capiuum365_Module.click();
				System.out.println("Navigated to Capium365 module from Homepage.");
				return;
			}

			if (isElementVisible(loginLocators.CiconFivepoint_o, wait)) {
				loginLocators.CiconFivepoint_o.click();
				Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOf(loginLocators.InsideCicon5_0_365Module));

				if (isElementVisible(loginLocators.InsideCicon5_0_365Module, wait)) {
					loginLocators.InsideCicon5_0_365Module.click();
					System.out.println("Navigated to Capium365 module from inside 5.0 module.");
					return;
				}
			}

			if (isElementVisible(loginLocators.C_icon_inside_modules, wait)) {
				loginLocators.C_icon_inside_modules.click();
				Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOf(loginLocators.insideCicon3_0_365Module));

				if (isElementVisible(loginLocators.insideCicon3_0_365Module, wait)) {
					loginLocators.insideCicon3_0_365Module.click();
					System.out.println("Navigated to Capium365 module from inside 3.0 module.");
					return;
				}
			}

			System.out.println("Capium365 module could not be found in any known location.");

		} catch (Exception e) {
			System.out.println("Error while navigating to Capium365 module.");
			Log.info("Error while navigating to Capium365 module.", "Anwar", "Redirection To Capium365 Module");
		}
	}

	public void Logout() throws IOException {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(2));
		shortWait.pollingEvery(Duration.ofMillis(250));

		try {
			boolean logoutClicked = false;

			// CASE 1: 5.0 Module Logout
			if (isElementVisible(loginLocators.FivePointProfileIcon, shortWait)) {
				HelperClass.clickWithRetry(loginLocators.FivePointProfileIcon, driver, shortWait);
				Log.info("Clicked 5.0 Profile Icon.");

				if (isElementVisible(loginLocators.SignoutFivePointZero, shortWait)) {
					HelperClass.clickWithRetry(loginLocators.SignoutFivePointZero, driver, shortWait);
					Log.info("Clicked 5.0 Sign Out.");
					logoutClicked = true;
				}
			}
			// CASE 2: Homepage → Logo → Logout
			else if (isElementVisible(loginLocators.Logo_in_homepage, shortWait)) {
				HelperClass.clickWithRetry(loginLocators.Logo_in_homepage, driver, shortWait);
				Log.info("Clicked homepage logo.");

				if (isElementVisible(loginLocators.Logout_inside_logo, shortWait)) {
					HelperClass.clickWithRetry(loginLocators.Logout_inside_logo, driver, shortWait);
					Log.info("Clicked logout inside logo.");
					logoutClicked = true;
				}
			}
			// CASE 3: Direct Logout Element
			else if (isElementVisible(loginLocators.Logout_element, shortWait)) {
				HelperClass.clickWithRetry(loginLocators.Logout_element, driver, shortWait);
				Log.info("Clicked direct logout element.");
				logoutClicked = true;
			}

			if (logoutClicked) {
				WebDriverWait loginWait = new WebDriverWait(driver, Duration.ofSeconds(8));
				loginWait.pollingEvery(Duration.ofMillis(200));
				loginWait.until(ExpectedConditions.or(
						ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='365']")),
						ExpectedConditions.visibilityOfElementLocated(
								By.xpath("//p[normalize-space()='Receipts, Invoices & Bankfeeds']"))));
				Log.info("Successfully redirected to login page after logout.");
			} else {
				Log.warn("No logout element was clicked.");

			}

		} catch (TimeoutException e) {
			Log.error("Timeout: Login page not detected after logout.");

			e.printStackTrace();
			HelperClass.captureScreenshot("LogoutTimeout");
		} catch (Exception e) {
			Log.error("Logout failed: " + e.getMessage());

			e.printStackTrace();
			HelperClass.captureScreenshot("LogoutFailure");
		}
	}

	public boolean isElementVisible(WebElement element, WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
}
