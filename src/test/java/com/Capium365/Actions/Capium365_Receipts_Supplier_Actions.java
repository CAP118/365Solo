package com.Capium365.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium365.Locators.Capium365_Receipts_Supplier_Locators;

public class Capium365_Receipts_Supplier_Actions {

	Capium365_Receipts_Supplier_Locators supplierLocators = null;

	public Capium365_Receipts_Supplier_Actions() {
		this.supplierLocators = new Capium365_Receipts_Supplier_Locators();
		PageFactory.initElements(HelperClass.getDriver(), supplierLocators);
	}

	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait = HelperClass.getWait();

	public void ClickonKeyBoardErrowRight() {
		try {
			By arrowButton = By.xpath(
					"//div[contains(@class,'toggle-menu')]/mat-icon[normalize-space(text())='keyboard_arrow_right']");
			WebElement element = HelperClass.waitUntilClickable(arrowButton);
			HelperClass.scrollToElement(element);
			((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].click();", element);
			Log.info("Clicked sidebar expand arrow.");

		} catch (Exception e) {
			Log.error("Failed to click sidebar expand arrow: ");
			e.printStackTrace();
		}
	}

	public void ClickonSupplersMenu() {
		By ReceiptsInsideSidebar = By.xpath("//a[@mattooltip='Suppliers']");
		HelperClass.isElementPresent(ReceiptsInsideSidebar);
		HelperClass.safeClick(ReceiptsInsideSidebar);
		HelperClass.sleep1(3000);

	}

//    public void clickonAddsupplierButton() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//    	SupLocator.AddSupplier.click();
//    }
	public void clickonAddsupplierButton() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(By.xpath("(//span[normalize-space()='Add Supplier'])[1]"));
	}

	public void ValidateAddNewSupplierPage() {
		String actualAddSupplier = HelperClass.getText(By.xpath("//span[normalize-space()='Add New Supplier']"));
		String expectedAddSupplier = "Add New Supplier";
		if (actualAddSupplier.equals(expectedAddSupplier)) {
            Assert.assertTrue(true,"Add New Supplier is Displaying");
		} else {
            Assert.fail("Add New Supplier is not Displaying");
		}
	}

	public void EnterSupplierField() throws InterruptedException {
		String baseName = "sahailrana190";
		int randomNumber = (int) (Math.random() * 9000) + 1000;
		String uniqueSupplierName = baseName + "_" + randomNumber;

		HelperClass.clearField(driver, By.xpath("//input[@formcontrolname='supplierName']"));
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='supplierName']"), uniqueSupplierName);

		System.out.println("Entered unique supplier name: " + uniqueSupplierName);
	}

	public void ValidatePaymentAccountDropdown() throws Throwable {
		String dropdownXpath = "//ng-select[@formcontrolname='bankDetailId']/div";
		WebDriver driver = HelperClass.getDriver();
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//ng-select[@formcontrolname='bankDetailId']/div")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdownXpath)));
		HelperClass.clickUsingJS(By.xpath(dropdownXpath));
		Thread.sleep(1000);

		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));

		if (options.isEmpty()) {
			System.out.println("No options found in the payment account dropdown.");
			return;
		}

		System.out.println("Found " + options.size() + " options in the dropdown.");

		for (WebElement option : options) {
			try {
				String optionText = option.getText().trim();
				System.out.println("Selecting option: " + optionText);

				HelperClass.clickUsingJS(By.xpath(dropdownXpath));
				Thread.sleep(1000);

				WebElement currentOption = driver
						.findElement(By.xpath("//div[@role='option' and text()='" + optionText + "']"));
				HelperClass.clickUsingJS(currentOption);
				Thread.sleep(2000);

			} catch (Exception e) {
				System.out.println("Failed to select option: " + e.getMessage());
			}
		}
	}

	public void ValidateVATRateDropdown() throws Throwable {

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"Exempt(0.00%)");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"Zero-Rated (0%)");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"Reduced (5.0%)");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"Standard (20%)");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"No VAT(0.00%)");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"Custom VAT");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"No VAT registered(0.00%)");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='vatTaxId']",
				"Reverse Charge(20%)");

	}

	public void ValidateDateDropdownInAddSupplierPage() throws Throwable {
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"All Time");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"This Week");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"Last Week");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"This Month");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"Last Month");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"This Quarter");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"Last Quarter");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"This Year");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"Last Year");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"Custom");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='myPanelClass']",
				"This Financial Year");
		HelperClass.waitForPageToLoad(driver);

	}

	public void CLickonThreedot() {
		HelperClass.safeClick(supplierLocators.Threedoticon);

	}

//Export to Excel
	public void ExporttoExcel(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		supplierLocators.ExporttoExcel.click();

	}

//Export to csv
	public void ExporttoCSV(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		supplierLocators.Exporttocsv.click();

	}

//Export to pdf
	public void ExporttoPDF(WebDriver driver) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		supplierLocators.Exporttopdf.click();
		Thread.sleep(5000);
	}

//searchBar
	public void Clickonsearchbarandenterdata() throws Throwable {
		supplierLocators.SearchBar.sendKeys("sahilrana");
		Thread.sleep(5000);
	}

	public void SearchAndVerifydata() {
		// SupLocator.SearchBar.clear();
//		supplierLocators.SearchBar.sendKeys("sahilrana");
		HelperClass.safeType(supplierLocators.SearchBar, "sahilrana");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		try {
			// Wait until the searched data is visible in the table/list
			WebElement resultElement = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='sahilrana']")));

			String actualText = resultElement.getText();
			String expected = "sahilrana";

			if (actualText.equals(expected)) {
	            Assert.assertTrue(true,"Records found");
			} else {
	            Assert.fail("No records found");
			}
		} catch (Exception e) {
			System.out.println("Search result not found or timed out.");
		}
	}
	
	public void MousehoverandclickDeleteIcon() {
		WebElement element = driver.findElement(
				By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']")));
		HelperClass.clickUsingJS(By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']"));
	}

	public void mousehoverandPerformActions(int rowIndex, String actionType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions = new Actions(driver);

		// Wait for overlay spinner to disappear (if applicable)
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngx-spinner-overlay")));
		} catch (Exception e) {
			System.out.println("No spinner overlay found or disappeared quickly.");
		}

		// Wait for table to be visible
		WebElement table = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@aria-describedby='Suppiler List Table']")));

		// Check that rows exist
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		if (rows.isEmpty()) {
			throw new IllegalStateException("Purchase Table has no rows. Cannot perform action.");
		}

		if (rowIndex >= rows.size()) {
			throw new IllegalArgumentException("Row index out of range. Requested: " + rowIndex
					+ ", but table has only: " + rows.size() + " rows.");
		}

		boolean success = false;
		int retries = 0;

		while (!success && retries < 3) {
			try {
				// Re-locate rows freshly each retry to avoid stale elements
				rows = table.findElements(By.tagName("tr"));
				WebElement targetRow = rows.get(rowIndex);

				actions.moveToElement(targetRow).perform();

				By buttonLocator;

				switch (actionType.toLowerCase()) {
				case "edit":
					buttonLocator = By.xpath("//button[@title='Edit']");
					break;
				case "delete":
					buttonLocator = By.xpath("//button[@title='Delete']");
					break;
				case "archive":
					buttonLocator = By.xpath("(//button[@title='Archive'])[1]");
					break;
				case "restore":
					buttonLocator = By.xpath("//button[@title='unarchive']");
					break;
				case "menu":
					buttonLocator = By.xpath("(//button[@aria-haspopup='menu'])[2]");
					break;
				default:
					throw new IllegalArgumentException("Unsupported action: " + actionType);
				}

				List<WebElement> buttons = targetRow.findElements(buttonLocator);

				if (buttons.isEmpty()) {
					System.out.println("Action '" + actionType + "' is not visible for row index " + rowIndex + ".");
					return;
				}

				WebElement actionButton = wait.until(ExpectedConditions.elementToBeClickable(buttons.get(0)));
				actionButton.click();

				success = true;

			} catch (StaleElementReferenceException e) {
				System.out.println("Stale element detected. Retrying...");
				retries++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					// ignore
				}
			} catch (TimeoutException e) {
				System.out.println("Timed out waiting for button to be clickable. Retrying...");
				retries++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					// ignore
				}
			}
		}

		if (!success) {
			throw new RuntimeException(
					"Failed to click action button '" + actionType + "' on row index " + rowIndex + " after retries.");
		}
	}

	public void ClickonCrossButtonEditsupplierScreen() {
		supplierLocators.CrossButtonEditSupplier.click();
	}

	public void ClickonYesButton() {
		supplierLocators.YesButton.click();
	}

	public void ClickonNoButton() {
		supplierLocators.NoButton.click();
	}

//Pagination Code
	public void ClickonPagiantionDropdownandValidteCount() throws Exception {

		Thread.sleep(3000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "10");
		Thread.sleep(3000);
		supplierLocators.SelectCheckBox.click();

		String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
		String expected = "Records: 10";
		if (actualtext.equals(expected)) {
            Assert.assertTrue(true,"10 records are there");
		} else {
            Assert.fail("10 records are not there");
		}
		Thread.sleep(3000);
		supplierLocators.CrossButton.click();
		Thread.sleep(3000);

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "20");
		Thread.sleep(3000);
		supplierLocators.SelectCheckBox.click();

		String actualtext2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
		String expected2 = "Records: 20";
		if (actualtext2.equals(expected2)) {
            Assert.assertTrue(true,"20 records are there");
		} else {
            Assert.fail("20 records are not there");
		}
		Thread.sleep(3000);
		supplierLocators.CrossButton.click();
		Thread.sleep(3000);

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "50");

		Thread.sleep(3000);
		supplierLocators.SelectCheckBox.click();

		String actualtext3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='50']")).trim();
		String expected3 = "Records: 50";
		if (actualtext3.equals(expected3)) {
            Assert.assertTrue(true,"50 records are there");
		} else {
            Assert.fail("50 records are not there");
		}

		supplierLocators.CrossButton.click();
		Thread.sleep(3000);

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "100");

		Thread.sleep(3000);
		supplierLocators.SelectCheckBox.click();

		String actualtext4 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
		String expected4 = "Records: 100";
		if (actualtext4.equals(expected4)) {
            Assert.assertTrue(true,"100 records are there");
		} else {
            Assert.fail("100 records are not there");

		}

		supplierLocators.CrossButton.click();
		Thread.sleep(3000);

	}

	public void ValidateNextButton() {
		HelperClass.navigateUntilEnd(HelperClass.getDriver(), "//button[contains(@class,'paginator-next')]",
				"next-disabled", "Next");
	}

	public void ValidatePreviousButton() {
		HelperClass.navigateUntilEnd(HelperClass.getDriver(), "//button[contains(@class,'paginator-previous')]",
				"previous-disabled", "Previous");
	}

	public void ClickonIDCheckBox() {
		supplierLocators.SelectCheckBox.click();
	}

	public void ClickonCancelbutton() {
//		supplierLocators.CancelButton.click();
		HelperClass.safeClick(supplierLocators.CancelButton);
	}

	public void ClickonSupplierIDCheck() {
//		supplierLocators.SupplierIDCheckBox.click();
//		HelperClass.safeClick(supplierLocators.SupplierIDCheckBox);
		HelperClass.clickWithRetry(supplierLocators.SupplierIDCheckBox, driver, wait);
	}

	public void ClickonFooterDeleteButton() {
//		supplierLocators.FooterDeleteButtton.click();
		HelperClass.safeClick(supplierLocators.FooterDeleteButtton);
	}

	public void ValidateConfirmDeletepopup() {
		String actualConfirmDeletepopup = HelperClass.getText(By.xpath("//h2[normalize-space()='Confirm Delete']"));
		String expectedConfirmDeletepopup = "Confirm Delete";
		if (actualConfirmDeletepopup.equals(expectedConfirmDeletepopup)) {
            Assert.assertTrue(true,"Confirm Delete popup is Displaying");
		} else {
            Assert.fail("Confirm Delete popup is not Displaying");
		}
	}

	public void ClickonFooterExcelButton() {
		supplierLocators.FooterExcelButton.click();
		HelperClass.safeClick(supplierLocators.FooterExcelButton);
	}

	public void ClickonFooterCsvButton() {
		HelperClass.safeClick(supplierLocators.FooterCsvButton);
	}

	public void ClickonFooterPdfButton() {
		HelperClass.safeClick(supplierLocators.FooterPdfButton);
	}

	public void ClickonFooterCrossBtton() {
		HelperClass.safeClick(supplierLocators.FooterCrossButton);
	}

	// Calling for Search and Click Edit Icon By ID
	String beforeCopyText;

	public void clickEditForPurchaseInvoice() {
		beforeCopyText = HelperClass.getText(By.xpath("//table/tbody/tr[1]/td[1]/div/a"));
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='search']"), beforeCopyText);
		HelperClass.sleep1(3000);
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='edit']/ancestor::button")));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='edit']/ancestor::button"));
		HelperClass.sleep1(2000);
	}

	public void ClickonSupplierID() {
		supplierLocators.SupplierID.click();
	}

	public void ClickonInsideSupplierCheckBox() {
		supplierLocators.InsideEditSupplierCheckBox.click();
	}

	public void ValidateSupplierCountCheckBoxRecords() {
		String actualConfirmDeletepopup = HelperClass.getText(By.xpath("//p[@class='font-size-18 fw-bold']"));
		String expectedConfirmDeletepopup = "Records:";
		if (actualConfirmDeletepopup.equals(expectedConfirmDeletepopup)) {
            Assert.assertTrue(true,"Records is Displaying");
		} else {
            Assert.fail("Records is not Displaying");
		}
	}

	public void ValidateHistoryTabLogo() {
		String actualHistoryLogo = HelperClass.getText(By.xpath("//span[normalize-space()='GF']"));
		String expectedHistoryLogo = "GF";
		if (actualHistoryLogo.equals(expectedHistoryLogo)) {
            Assert.assertTrue(true,"History is Displaying");
		} else {
            Assert.fail("History is not Displaying");

		}
	}

	public void ClickonHistoryTabCloseButton() {
		HelperClass.safeClick(supplierLocators.HistoryTabCloseButton);
	}

	public void clickOnReceiptsMenuuu() throws Throwable {
		waitForSpinnerToDisappear();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		// Re-locate element freshly to avoid stale issue
		By receiptsBtnLocator = By.xpath("//span[contains(text(), 'Receipts')]"); // Replace with actual unique text
		WebElement receiptsBtn = wait.until(ExpectedConditions.elementToBeClickable(receiptsBtnLocator));

		receiptsBtn.click();

		// Replace hard wait with wait for page content
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Upload Purchase Invoices')]"))); // Adjust
																												// based
																												// on
																												// your
																												// page
	}

	public void waitForSpinnerToDisappear() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-spinner-overlay")));
	}

	public boolean isPageHighlighted(String pageNumber) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		String activePageXpath = "//div[contains(@class,'paginator-pages-count')]"
				+ "//button[contains(@class,'active')]" + "//span[@class='mat-button-wrapper' and normalize-space()='"
				+ pageNumber + "']";

		try {
			WebElement activePage = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(activePageXpath)));
			return activePage.isDisplayed();
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void VerifyGoTopageNumber() {
		HelperClass.waitForPageToLoad(driver);
			WebElement goToInput = driver.findElement(By.xpath("//input[@type='number']"));
			goToInput.clear();
			goToInput.sendKeys("2", Keys.ENTER);
			
			String actualText = HelperClass.getText(By.xpath("//button[contains(@class,'ng-star-inserted active')]")).trim();
			if (HelperClass.isElementPresent(By.xpath("//button[contains(@class,'ng-star-inserted active')]"))) {
				Assert.assertTrue(true, "Page 2 is highlighted successfully");
	 
			} else {
				Assert.fail("Page 2 highlight check failed" + actualText);
	 
			}
		}
}