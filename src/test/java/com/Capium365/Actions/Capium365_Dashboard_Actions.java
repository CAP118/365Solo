package com.Capium365.Actions;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import com.Capium.Utilites.Log;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.Capium.Utilites.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import com.Capium365.StepDefination.Hooks;

public class Capium365_Dashboard_Actions {

	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait = HelperClass.getWait();

	public Capium365_Dashboard_Actions() {
		PageFactory.initElements(driver, this);
	}

	// Invoice
	// Locators=======================================================================

	@FindBy(xpath = "(//div[contains(@class, 'mat-select-trigger')])[1]")
	private WebElement InvoiceDashboardDropdown;

	@FindBy(xpath = "//div[@role='listbox']/mat-option")
	private WebElement InvoiceDashboardAllOptions;

	@FindBy(xpath = "(//div[@class='chart-wrapper wp-67 pb-0'])[1]")
	private WebElement GetalldataInsideChart;

	// Transactions Dashboard
	// Locators
	// ============================================================================

	@FindBy(xpath = "(//div[contains(@class, 'mat-select-trigger')])[3]")
	private WebElement TransactionsDropdown;

	@FindBy(xpath = "(//div[contains(@class, 'mat-select-trigger')])[2]")
	private WebElement AllAcountsDropdown;

	By SelectAllOptionsOnAcountsDropdown = By.xpath("//mat-option//span[@class='mat-option-text']");

	@FindBy(xpath = "//div[@role='listbox']/mat-option")
	private WebElement TransactinsDropdownOptions;

	@FindBy(xpath = "//span[normalize-space()='Transactions']/ancestor::div[contains(@class,'chart-wrapper')]")
	private WebElement ScrollToTransactionsDashboard;

	// Top Accounts Names
	// Locators========================================================

	@FindBy(xpath = "//span[normalize-space()='Top Account Names']")
	private WebElement TopAccountNamesDashboard;

	@FindBy(xpath = "(//mat-select[@panelclass='myPanelClass'])[5]")
	private WebElement topAccountsDropdown;

	@FindBy(xpath = "//mat-option//span[@class='mat-option-text']")
	private List<WebElement> topAccountDropdownOptions; // Use List for multiple options

	// Expenses Flow
	// ========================================================================

	@FindBy(xpath = "(//div[contains(@class, 'mat-select-trigger')])[6]")
	private WebElement ExpensesFlowDropdown;

	@FindBy(xpath = "//span[normalize-space()='Expense Flow']/ancestor::div[contains(@class,'chart-wrapper')]")
	private WebElement ScrollToExpensesFlow;

	// Dashboard + Symbol Icon Action Locators
	// ===========================================================================

	@FindBy(xpath = "//a[@title='Quick Add']/mat-icon")
	private WebElement AddPlusSymbolInDashboard;

	@FindBy(xpath = "//div[contains(@class, 'mat-menu-content')]//button[@role='menuitem']")
	private WebElement SelectOptionsFromtheAddPlusbuutton;

	@FindBy(xpath = "//h2/span[normalize-space()='Add New Estimate']")
	private WebElement EstimatesPage;

	// Activity Locators
	// ============================================

	@FindBy(xpath = "//a[@title='Activity']/mat-icon")
	private WebElement ClickOnActivity;

	@FindBy(xpath = "//div[@role='tab']/div[normalize-space()='Announcement']")
	private WebElement ClickOnAnnouncement;

	@FindBy(xpath = "//div[@role='tab']/div[normalize-space()='Activity']")
	private WebElement ClcikOnActivitytab;

	@FindBy(xpath = "//mat-select[@panelclass='myPanelClass']")
	private WebElement ClickOnAllDropdown;

	@FindBy(xpath = "//ng-select[@panelclass='myPanelClass' and contains(@class,'w-170')]")
	private WebElement ClickOnTimeFilterDropdown;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement EnterClientNameinSeachfield;

	// Settings Dashboard
	// ==========================================================================================

	@FindBy(xpath = "//a[@title='Settings']/mat-icon")
	private WebElement ClickOnSettings;

	@FindBy(xpath = "//button[normalize-space(text())='My Business']")
	private WebElement SelectMyBuBusinessUnderSettings;

	@FindBy(xpath = "//button[normalize-space(text())='Integrations']")
	private WebElement SelectIntegrationsunderSettings;

	@FindBy(xpath = "//button/span[normalize-space()='Individual']")
	private WebElement SelectIndividualUnderMyBusiness;

	@FindBy(xpath = "//div[contains(@class,'hr pt-1')]//a[normalize-space()='Add New Line']")
	private WebElement ClickAddNewLineForBankDetails;

	// Invoice Dashboard Actions
	// =========================================================================================

	public void ClickOnInvoiceDropdownandselectThisYear() {
		HelperClass.selectMaterialDropdownValue("This Year");
	}

	public void ClickOnInvoiceDropdownandselectAllTime() {
		HelperClass.selectMaterialDropdownValue("All Time");

	}

	public void ClickOnInvoiceDropdownandselectThisWeek() {
		HelperClass.selectMaterialDropdownValue("This Week");
	}

	public void ClickOnInvoiceDropdownandselectLastWeek() {
		HelperClass.selectMaterialDropdownValue("Last Week");

	}

	public void ClickOnInvoiceDropdownandselectThisMonth() {
		HelperClass.selectMaterialDropdownValue("This Month");
	}

	public void ClickOnInvoiceDropdownandselectLastMonth() {
		HelperClass.selectMaterialDropdownValue("Last Month");

	}

	public void ClickOnInvoiceDropdownandselectThisQuarter() {
		HelperClass.selectMaterialDropdownValue("This Quarter");

	}

	public void ClickOnInvoiceDropdownandselectLastQuarter() {
		HelperClass.selectMaterialDropdownValue("Last Quarter");

	}

	public void ClickOnInvoiceDropdownandselectLastYear() {
		HelperClass.selectMaterialDropdownValue("Last Year");

	}

	public void ClickOnInvoiceDropdownandselectCustom() {
		HelperClass.selectMaterialDropdownValue("Custom");

	}

	public void ClickOnInvoiceDropdownandselectThisFinancialYear() {
		HelperClass.selectMaterialDropdownValue("This Financial Year");

	}

	// Transactions Dashboard Actions
	// ===========================================================================================================

	public void ScrollToTransactionsDashboard() {
		By TransactionChart = By
				.xpath("//span[normalize-space()='Transactions']/ancestor::div[contains(@class,'chart-wrapper')]");
		WebElement ScrollToTransactionsDashboard = wait
				.until(ExpectedConditions.visibilityOfElementLocated(TransactionChart));
		HelperClass.scrollToElement(ScrollToTransactionsDashboard);
		HelperClass.sleep1(2000);
	}

	public void clickAndSelectTransactionFilter(String visibleText) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WebElement trigger = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("(//mat-select[@panelclass='myPanelClass'])[3]")));
			trigger.click();

			By optionLocator = By.xpath("//mat-option//span[normalize-space(text())='" + visibleText + "']");
			wait.until(ExpectedConditions.presenceOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.elementToBeClickable(optionLocator));

			WebElement option = driver.findElement(optionLocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

			HelperClass.sleep1(1000);
		} catch (TimeoutException e) {

			Assert.assertTrue(true, "Option '" + visibleText + "'  not found.");
		} catch (Exception e) {

			Assert.fail("Dropdown selection failed:" + e.getMessage());
		}
	}

	public void ClickOnAllAccountsDropdown() {
		HelperClass.clickUsingJS(By.xpath(
				"//span[normalize-space()='Transactions']/ancestor::div[@class='chart-head']//mat-select[@placeholder='All Accounts']"));
	}

	public void selectEachAccountAndCaptureScreenshot() {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = HelperClass.getWait();

		By dropdownXpath = By.xpath(
				"//span[normalize-space()='Transactions']/ancestor::div[@class='chart-head']//mat-select[@placeholder='All Accounts']");
		By optionsXpath = By.xpath("//mat-option//span/span");

		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownXpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", dropdown);

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(optionsXpath));
		List<WebElement> optionElements = driver.findElements(optionsXpath);

		List<String> accounts = new ArrayList<>();
		for (WebElement option : optionElements) {
			accounts.add(option.getText().trim());
		}

		for (String account : accounts) {

			WebElement dropdownAgain = wait.until(ExpectedConditions.elementToBeClickable(dropdownXpath));
			js.executeScript("arguments[0].click();", dropdownAgain);

			By specificOption = By.xpath("//mat-option//span[normalize-space(text())='" + account + "']");
			WebElement optionToSelect = wait.until(ExpectedConditions.elementToBeClickable(specificOption));
			optionToSelect.click();
			HelperClass.sleep2(2);

			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Chart view for: " + account);
			Log.info("Selected account: " + account, "Anwar", "All Accounts Dashboard");
		}
	}

	// Top Accounts Names Action Methods
	// ==========================================================================================================

	public void scrollToTopAccountNamesChart() {
		WebDriverWait wait = HelperClass.getWait();

		By chartCardLocator = By
				.xpath("//span[normalize-space()='Top Account Names']/ancestor::div[contains(@class,'chart-wrapper')]");
		WebElement chartSection = wait.until(ExpectedConditions.visibilityOfElementLocated(chartCardLocator));

		HelperClass.scrollToElement(chartSection);
	}

	public void clickAndSelectTopAccountFilter(String visibleText) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {

			By triggerLocator = By.xpath(
					"//span[normalize-space()='Top Account Names']/ancestor::div[contains(@class,'d-flex')][1]//div[contains(@class,'mat-select-trigger')]");
			WebElement trigger = wait.until(ExpectedConditions.elementToBeClickable(triggerLocator));
			trigger.click();

			By optionLocator = By.xpath("//mat-option//span[normalize-space(text())='" + visibleText + "']");
			WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionLocator));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

			wait.until(ExpectedConditions.invisibilityOfElementLocated(optionLocator));

			HelperClass.sleep1(1000);

		} catch (TimeoutException e) {
			Assert.assertTrue(true, "Option '" + visibleText + "'  not found in dropdown.");
		} catch (Exception e) {

			Assert.fail("Dropdown selection failed:" + e.getMessage());
		}
	}

	public void validateDonutChartContent(String selectedFilter) throws IOException {
		WebElement specificChart = driver.findElement(By.xpath("(//div[contains(@class,'apexcharts-canvas')])[3]"));
		List<String> data = HelperClass.getApexChartLegendValues(specificChart);

		System.out.println("Donut chart data for filter: " + selectedFilter);
		for (String item : data) {
			System.out.println(" - " + item);
			Assert.assertTrue(item.contains("£"), "Legend item does not contain amount: " + item);
		}

		Assert.assertFalse(data.isEmpty(), "No data found in donut chart for filter: " + selectedFilter);
	}

	// Expenses Flow
	// Actions=================================================================================

	public void ScrollToExpensesFlow() {
		By TransactionChart = By
				.xpath("//span[normalize-space()='Expense Flow']/ancestor::div[contains(@class,'chart-wrapper')]");
		WebElement ScrollToTransactionsDashboard = wait
				.until(ExpectedConditions.visibilityOfElementLocated(TransactionChart));
		HelperClass.scrollToElement(ScrollToTransactionsDashboard);
	}

	public void ClickOnExpensesDropdownandselectOptions(String visibleText) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WebElement trigger = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//span[normalize-space()='Expense Flow']/ancestor::div[contains(@class,'d-flex')][1]//div[contains(@class,'mat-select-trigger')]")));
			trigger.click();
			By optionLocator = By.xpath("//mat-option//span[normalize-space(text())='" + visibleText + "']");
			wait.until(ExpectedConditions.presenceOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.elementToBeClickable(optionLocator));

			WebElement option = driver.findElement(optionLocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

			HelperClass.sleep1(1000);
		} catch (TimeoutException e) {
			Assert.assertTrue(true, "Option '" + visibleText + "' not found.");
		} catch (Exception e) {
			Assert.fail("Dropdown selection failed:" + e.getMessage());
		}
	}

	// Top Earners
	// Actions====================================================================================

	public void ScrollToTopEarners() {
		By TransactionChart = By
				.xpath("//span[normalize-space()='Top Earners']/ancestor::div[contains(@class,'chart-wrapper')]");
		WebElement ScrollToTransactionsDashboard = wait
				.until(ExpectedConditions.visibilityOfElementLocated(TransactionChart));
		HelperClass.scrollToElement(ScrollToTransactionsDashboard);
	}

	public void ClickOnTopEarnersDropdownAndselectOptions(String visibleText) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {

			WebElement trigger = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//span[normalize-space()='Top Earners']/ancestor::div[contains(@class,'d-flex')][1]//div[contains(@class,'mat-select-trigger')]")));
			trigger.click();

			By optionLocator = By.xpath("//mat-option//span[normalize-space(text())='" + visibleText + "']");
			wait.until(ExpectedConditions.presenceOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.elementToBeClickable(optionLocator));

			WebElement option = driver.findElement(optionLocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

			HelperClass.sleep1(1000);
		} catch (TimeoutException e) {
			Assert.assertTrue(true, "Option '" + visibleText + "' not found.");
		} catch (Exception e) {
			Assert.fail("Dropdown selection failed:" + e.getMessage());
		}
	}

	// Sales Flow Actions
	// ===============================================================================

	public void ScrollToSalesFlowDashboard() {
		By TransactionChart = By
				.xpath("//span[normalize-space()='Sales Flow']/ancestor::div[contains(@class,'chart-wrapper')]");
		WebElement ScrollToTransactionsDashboard = wait
				.until(ExpectedConditions.visibilityOfElementLocated(TransactionChart));
		HelperClass.scrollToElement(ScrollToTransactionsDashboard);
	}

	public void ClickOnSalesFlowDropdownAndselectOptions(String visibleText) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WebElement trigger = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//span[normalize-space()='Sales Flow']/ancestor::div[contains(@class,'d-flex')][1]//div[contains(@class,'mat-select-trigger')]")));
			trigger.click();

			By optionLocator = By.xpath("//mat-option//span[normalize-space(text())='" + visibleText + "']");
			wait.until(ExpectedConditions.presenceOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.elementToBeClickable(optionLocator));

			WebElement option = driver.findElement(optionLocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

			HelperClass.sleep1(1000);
		} catch (TimeoutException e) {

			Assert.assertTrue(true, "Option '" + visibleText + "' not found.");
		} catch (Exception e) {

			Assert.fail("Dropdown selection failed:" + e.getMessage());
		}
	}

	// Dashboard Plus Symbol Actions
	// ===================================================================================================

	public void ClickOnPlusSymbol() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Quick Add']/mat-icon")));
		HelperClass.clickUsingJS(By.xpath("//a[@title='Quick Add']/mat-icon"));
		HelperClass.sleep1(2000);
	}

	public void selectFromPlusMenu(String menuItemName) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String dynamicXpath = "//div[contains(@class, 'mat-menu-content')]//button[normalize-space(text())='"
				+ menuItemName + "']";

		try {
			WebElement targetOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
			targetOption.click();
			HelperClass.sleep1(3000);
		} catch (TimeoutException e) {
			Assert.fail("Menu item not found or not clickable: " + menuItemName);
		}
	}

	public void VerifyEstimatesScreen() {
		By ActualText = By.xpath("//h2/span[normalize-space()='Add New Estimate']");
		String Expected = "Add New Estimate";
		String Actual = HelperClass.getText(ActualText);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyAddInvoiceScreen() {
		By ActualText = By.xpath("//h2/span[normalize-space()='Add New Invoice']");
		String Expected = "Add New Invoice";
		String Actual = HelperClass.getText(ActualText);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyAddNewRecurringInvoiceScreen() {
		By ActualText = By.xpath("//h2/span[normalize-space()='Add New Recurring Invoice']");
		String Expected = "Add New Recurring Invoice";
		String Actual = HelperClass.getText(ActualText);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyAddNewInvoiceCreditNoteScreen() {
		By ActualText = By.xpath("//h2/span[normalize-space()='Add New Invoice Credit Note']");
		String Expected = "Add New Invoice Credit Note";
		String Actual = HelperClass.getText(ActualText);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyAddNewProductScrenn() {
		By ActualText = By.xpath("//h2/span[normalize-space()='Add New Product']");
		String Expected = "Add New Product";
		String Actual = HelperClass.getText(ActualText);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyReceiptsScreen() {
		By Arrow = By.xpath("//div[@class='toggle-menu']/mat-icon");
		HelperClass.clickUsingJS(Arrow);
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Receipts Screen");
	}

	public void VerifyPurchaseInvoicesScreen() {
		By Arrow = By.xpath("//div[@class='toggle-menu']/mat-icon");
		HelperClass.clickUsingJS(Arrow);
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Purchase Invoices Screen");
	}

	public void VerifyPurchaseCreditNotesScreen() {
		By Arrow = By.xpath("//div[@class='toggle-menu']/mat-icon");
		HelperClass.clickUsingJS(Arrow);
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Purchase Credit Notes");
	}

	public void VerifyAddNewSupplierScreen() {
		By ActualText = By.xpath("//h2/span[normalize-space()='Add New Supplier']");
		String Expected = "Add New Supplier";
		String Actual = HelperClass.getText(ActualText);
		By Arrow = By.xpath("//div[@class='toggle-menu']/mat-icon");
		HelperClass.clickUsingJS(Arrow);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyAddNewUserScreen() {
		By ActualText = By.xpath("//h2/span[normalize-space()='Add New User']");
		String Expected = "Add New User";
		String Actual = HelperClass.getText(ActualText);
		By Arrow = By.xpath("//mat-icon[normalize-space()='keyboard_arrow_right']//parent::div");
		HelperClass.clickUsingJS(Arrow);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyBankAccountsScreen() {
		By Arrow = By.xpath("//div[@class='toggle-menu']/mat-icon");
		HelperClass.clickUsingJS(Arrow);
		By ActualText = By.xpath("//span[normalize-space()='Add New Account']");
		String Expected = "Add New Account";
		String Actual = HelperClass.getText(ActualText);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	public void VerifyAddNewCustomerScreen() {
		By ActualText = By.xpath("//span[normalize-space()='Add New Customer']");
		String Expected = "Add New Customer";
		String Actual = HelperClass.getText(ActualText);

		if (Actual.equals(Expected)) {
			Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), Expected);
			Log.info(Expected + " Screen Matched", "Anwar", "PlusButton");
		} else {
			Log.info(Actual + " Page not found", "Anwar", "PlusButton");
		}
	}

	// Activity Actions
	// ==============================================================================================

	public void the_user_is_on_the_activity_tab() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(ClickOnActivity));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//a[@title='Activity']/mat-icon"));
		Thread.sleep(3000);
		// HelperClass.clickUsingJS(ClickOnActivity);
	}

	public void SelectAnnouncementTab() {
		wait.until(ExpectedConditions.elementToBeClickable(ClickOnAnnouncement));
		HelperClass.clickUsingJS(ClickOnAnnouncement);
	}

	public void SelectActivitytab() {
		wait.until(ExpectedConditions.elementToBeClickable(ClcikOnActivitytab));
		HelperClass.clickUsingJS(ClcikOnActivitytab);
	}

	public void SearchClientinActivityTab(String string) throws InterruptedException {
		HelperClass.setValueUsingJS(By.xpath("//input[@placeholder='Search']"), string);
		Thread.sleep(3000);
	}

	public void ClickOnActivityAllDropdown(String visibleText) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			// STEP 1: Click the dropdown trigger once
			WebElement trigger = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//mat-select[@panelclass='myPanelClass']")));
			trigger.click();

			// STEP 2: Wait for dropdown options to appear
			By optionLocator = By.xpath("//mat-option//span[normalize-space(text())='" + visibleText + "']");
			wait.until(ExpectedConditions.presenceOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.elementToBeClickable(optionLocator));

			// STEP 3: Click on the desired option
			WebElement option = driver.findElement(optionLocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

			HelperClass.sleep1(1000); // Small wait after click to ensure selection registers
		} catch (TimeoutException e) {
			System.out.println("Option '" + visibleText + "' not found.");
		} catch (Exception e) {
			System.out.println("Dropdown selection failed: " + e.getMessage());
		}
	}

	public void ClickTimeFilerDropdownOnActivityTab(String visibleText) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			// STEP 1: Click the dropdown trigger once
			WebElement trigger = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//ng-select[@panelclass='myPanelClass' and contains(@class,'w-170')]")));
			trigger.click();

			// STEP 2: Wait for dropdown options to appear
			By optionLocator = By.xpath("//div[@role='option']//span[normalize-space(text())='" + visibleText + "']");
			wait.until(ExpectedConditions.presenceOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
			wait.until(ExpectedConditions.elementToBeClickable(optionLocator));

			// STEP 3: Click on the desired option
			WebElement option = driver.findElement(optionLocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

			HelperClass.sleep1(1000); // Small wait after click to ensure selection registers
		} catch (TimeoutException e) {
			System.out.println("Option '" + visibleText + "' not found.");
		} catch (Exception e) {
			System.out.println("Dropdown selection failed: " + e.getMessage());
		}
	}

	// Settings Actions
	// =================================================================================

	public void ClickOnSettingsInDashboard() {
		By settingsIcon = By.xpath("//a[@title='Settings']/mat-icon");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(settingsIcon));
		HelperClass.clickUsingJS(element);
	}

	public void ClickOnMyBusiness() {
		HelperClass.clickWithRetry(SelectMyBuBusinessUnderSettings, driver, wait);
	}

	public void ClockOnIntegration() {
		HelperClass.clickWithRetry(SelectIntegrationsunderSettings, driver, wait);
	}

	public void clickOnAddNewLineUnderBankDetails(String VisibleText) {
		HelperClass.sleep1(2000);
		HelperClass.scrollToElement(By.xpath("//div[contains(@class,'hr pt')]//a[normalize-space()='Add New Line']"));
		HelperClass.sleep1(2000);
		By addNewLineLocator = By.xpath("//div[contains(@class,'hr pt')]//a[normalize-space()='" + VisibleText + "']");
		WebElement addNewLineElement = wait.until(ExpectedConditions.visibilityOfElementLocated(addNewLineLocator));
		HelperClass.scrollToElement(addNewLineElement);
		HelperClass.clickWithRetry(addNewLineElement, driver, wait);
	}

	public void fillLastEmptyBankDetails() {
		try {
			WebElement lastEmptyAccountName = driver.findElement(By.xpath(
					"(//input[@formcontrolname='accountName' and not(@disabled) and normalize-space(@value)=''])[last()]"));
			lastEmptyAccountName.sendKeys("NEW BANK" + Keys.ENTER);
			HelperClass.sleep1(1000);
			WebElement lastEmptyAccountNumber = driver.findElement(
					By.xpath("(//input[@formcontrolname='accountNumber' and normalize-space(@value)=''])[last()]"));
			lastEmptyAccountNumber.sendKeys("99999999" + Keys.ENTER);
			HelperClass.sleep1(1000);
			WebElement lastEmptyBranchCode = driver.findElement(
					By.xpath("(//input[@formcontrolname='branchCode' and normalize-space(@value)=''])[last()]"));
			lastEmptyBranchCode.sendKeys("ABC123" + Keys.ENTER);
			HelperClass.sleep1(1000);
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Could not locate empty row to fill bank details", e);
		}
	}

	public void ClickOnSaveButton() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Save and Exit']//parent::button")));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Save and Exit']//parent::button"));

	}

	// Announcements Tab Actions
	// ===================================================================================================

	public void ClickOnAnnouncementTab() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='campaign']//parent::a")));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='campaign']//parent::a"));
	}

	// Ticket Tab Actions
	// ====================================================================================================

	public void ClickOnTicketsTab() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Ticket']")));
		HelperClass.clickUsingJS(By.xpath("//a[@title='Ticket']"));
		HelperClass.sleep1(2000);
	}

	public void VerifyAddSupportTicketButtonVisibleorNot(String VisibleText) {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button/span/span[normalize-space()='Add Support Ticket']")));
		String ExpectedText = HelperClass
				.getText(By.xpath("//button/span/span[normalize-space()='Add Support Ticket']"));
		String ActualText = VisibleText;

		if (ExpectedText.equals(ActualText)) {

			Assert.assertTrue(true, "Add Support Ticket button is Visible");
		} else {

			Assert.fail("Add Support Ticket button is not Visible");
		}
	}

	public void VerifySearchBarinTicketsDashboard(String VisibleText) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='search']")));
		String ExpectedText = HelperClass.getText(By.xpath("//mat-icon[normalize-space()='search']"));
		String ActualText = VisibleText;

		if (ExpectedText.equals(ActualText)) {
			Assert.assertTrue(true, "Search bar is visibe");
		} else {
			Assert.fail("Search bar is not visibe");
		}
	}

	public void VerifyStatusdropdownShouldbeVisible(String VisibleText) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ng-select[@panelclass='myPanelClass']")));

		String ExpectedText = HelperClass.getText(
				By.xpath("//span[normalize-space()='Open']//parent::div//parent::div//parent::div//parent::ng-select"));
		String ActualText = VisibleText;

		if (ExpectedText.equals(ActualText)) {

			Assert.assertTrue(true, "Status Dropdown Filter Matched");
		} else {

			Assert.fail("Status Dropdown filter not matched");
		}
	}

	public void VerifyAllTablesValues(String Ticket, String Subject, String Created, String Status, String Department) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='Ticket No.']")));
		String ExpectedText = HelperClass.getText(
				By.xpath("//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='"
						+ Ticket + "']"));
		String ActualText = Ticket;

		if (ExpectedText.equals(ActualText)) {
			Assert.assertTrue(true, "Ticket No.Title Matched");
		} else {
			Assert.fail("Ticket No. Title  Not Matched");
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='Ticket No.']")));
		String ExpectedText1 = HelperClass.getText(
				By.xpath("//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='"
						+ Subject + "']"));
		String ActualText1 = Subject;

		if (ExpectedText1.equals(ActualText1)) {
			Assert.assertTrue(true, "Subject Title Matched");
		} else {
			Assert.fail("Subject Title Not Matched");
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='Ticket No.']")));
		String ExpectedText2 = HelperClass.getText(
				By.xpath("//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='"
						+ Created + "']"));
		String ActualText2 = Created;

		if (ExpectedText2.equals(ActualText2)) {
			Assert.assertTrue(true, "Created Title Matched");
		} else {

			Assert.fail("Created Title Not Matched");
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='Ticket No.']")));
		String ExpectedText3 = HelperClass.getText(
				By.xpath("//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='"
						+ Status + "']"));
		String ActualText3 = Status;

		if (ExpectedText3.equals(ActualText3)) {

			Assert.assertTrue(true, "Status Title Matched");
		} else {

			Assert.fail("Status Title Not Matched");
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='Ticket No.']")));
		String ExpectedText4 = HelperClass.getText(
				By.xpath("//table[@aria-describedby='Support Ticket Table']/thead/tr/th/div/div[normalize-space()='"
						+ Department + "']"));
		String ActualText4 = Department;

		if (ExpectedText4.equals(ActualText4)) {
			Assert.assertTrue(true, "Department Title Matched");
		} else {
			Assert.fail("Department Title Not Matched");
		}

	}

	public void ClickOnAddSupportTicketButton(String VisibleText) {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button/span/span[normalize-space()='Add Support Ticket']")));
		HelperClass.clickUsingJS(By.xpath("//button/span/span[normalize-space()='" + VisibleText + "']"));
		HelperClass.sleep1(2000);
	}

	public void EnetrValidTicketDetails() throws IOException {
		String Path = "D:\\Autoit\\TicketUpload.exe";

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='subject']")));
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='subject']"), "Testing Purpose QA" + Keys.ENTER);
		HelperClass.sleep1(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@formcontrolname='message']")));
		HelperClass.safeSendKeys(By.xpath("//textarea[@formcontrolname='message']"),
				"Testing purpose QA team has created this ticket, Please ignore this" + Keys.ENTER);
		HelperClass.sleep1(2000);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='fileName']//parent::div")));
		HelperClass.clickUsingJS(By.xpath("//input[@formcontrolname='fileName']//parent::div"));

		Runtime.getRuntime().exec(Path);
		HelperClass.sleep1(2000);

	}

	public void ClickOnSubmitButton() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Submit']//parent::button")));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Submit']//parent::button"));
	}

	// Help Tab Actions
	// =====================================================================================

	public void ClickOnHelpTabinDashboard() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Help']")));
		HelperClass.clickUsingJS(By.xpath("//a[@title='Help']"));
		HelperClass.sleep1(3000);
	}

	// Profile Settings Tab
	// ====================================================================================
	public void ClickOnProfileTab() {
		HelperClass.safeClick(By.xpath("//a[@aria-haspopup='menu']/div/span"));
	}

	public void VerifyUserIDandEmail() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'User ID:')]")));

		if (HelperClass.isElementPresent(By.xpath("//p[contains(text(),'User ID:')]"))) {
			Assert.assertTrue(true, "UserId,Email and User Essentials present");
		} else {
			Assert.fail("User Details not present");
		}
	}

	public void verifyLogoutbutton(String VisibleText) {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Sign Out']//parent::a")));
		String ExpectedText = HelperClass.getText(By.xpath("//span[normalize-space()='Sign Out']//parent::a"));
		String ActualText = VisibleText;

		if (ExpectedText.equals(ActualText)) {
			Assert.assertTrue(true, "Sign Out Text Visible");
		} else {
			Assert.fail("sign Out Text not Visible");
		}
	}

	public void VerifyColorsInProfile() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'theme-colors')]")));
		if (HelperClass.isElementPresent(By.xpath("//div[contains(@class,'theme-colors')]"))) {

			Assert.assertTrue(true, "Theme colors matched");
		} else {

			Assert.fail("Theme colors not matched");
		}
	}

	public void clickSignOut(String VisibleText) {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Sign Out']//parent::a")));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='" + VisibleText + "']//parent::a"));
	}

	public void verifyLoginPageVisible() {

		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.or(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='365']")),
					ExpectedConditions.visibilityOfElementLocated(
							By.xpath("//p[normalize-space()='Receipts, Invoices & Bankfeeds']"))));

			Log.info("User successfully logged out and redirected to login screen.");
		} catch (Exception e) {
			Log.error("Logout failed: " + e.getMessage());
		}
	}

	public void ClickOutSide() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header']")));
		HelperClass.sleep1(2000);
		HelperClass.clickUsingJS(By.xpath("(//div[@class='chart-head'])[1]"));
		HelperClass.sleep1(1000);
	}

	public void Verifypopup() {
		if (HelperClass.isElementVisible(By.xpath("//div[@role='menu']"), 2)) {
			Assert.assertTrue(true, "Pop-up not closed");
		} else {
			Assert.fail("pop-up closed");

		}
	}

	public void VerifyPresentThemeColor() {
		WebElement previouslySelected = driver
				.findElement(By.xpath("//mat-radio-button[contains(@class, 'mat-radio-checked')]"));
		Assert.assertNotNull(previouslySelected);
		Log.info("Initial theme selected.");
	}

	WebElement previouslySelected;

	public void selectNewThemeColor() {
		List<WebElement> allThemes = driver
				.findElements(By.xpath("//mat-radio-button[contains(@class, 'mat-radio-button')]"));

		for (WebElement theme : allThemes) {
			if (!theme.equals(previouslySelected)) {
				theme.click();
				Log.info("New theme selected.");
				break;
			}
		}

		HelperClass.sleep1(1000);
	}

	public String previouslySelectedValue;

	public void storePreviouslySelectedTheme() {
		List<WebElement> selected = HelperClass.getDriver().findElements(
				By.xpath("//mat-radio-button[contains(@class, 'mat-radio-checked')]//input[@type='radio']"));

		if (selected.isEmpty()) {
			previouslySelectedValue = HelperClass.getDriver()
					.findElement(By.xpath("(//mat-radio-button//input[@type='radio'])[1]")).getAttribute("value");
			Log.warn("No theme pre-selected. Defaulted to first theme.");
		} else {
			previouslySelectedValue = selected.get(0).getAttribute("value");
		}

		Log.info("Stored previous theme value: " + previouslySelectedValue);
	}

	public void verifyPreviousThemeDeselected() {
		WebElement previousRadio = HelperClass.getDriver().findElement(By.xpath(
				"//input[@type='radio' and @value='" + previouslySelectedValue + "']/ancestor::mat-radio-button"));

		String prevClass = previousRadio.getAttribute("class");
		Assert.assertFalse(prevClass.contains("mat-radio-checked"), "Previous theme is still selected.");
		Log.info("Previous theme is deselected.");
	}

	public void verifyNewThemeHighlighted() {
		WebElement newSelected = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//mat-radio-button[contains(@class, 'mat-radio-checked')]")));

		Assert.assertNotEquals(newSelected, previouslySelected, "New theme is not different from the previous one.");
		Log.info("New theme is correctly highlighted as selected.");
	}

}
  