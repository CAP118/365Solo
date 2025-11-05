package com.Capium365.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium365.Locators.Capium365_InvoicesTab_Estimates_Locators;
import com.Capium365.StepDefination.Hooks;

public class Capium365_InvoicesTab_Estimates_Actions {

	Capium365_InvoicesTab_Estimates_Locators estimatelocators = null;

	public Capium365_InvoicesTab_Estimates_Actions() {
		this.estimatelocators = new Capium365_InvoicesTab_Estimates_Locators();
		PageFactory.initElements(HelperClass.getDriver(), estimatelocators);
	}

	public void Clickoninvoiceandsidebarandestimateoptionandverify() throws InterruptedException {
		By receiptsTab = By.xpath("//span[text()='Invoices']//parent::a");
		WebElement element = HelperClass.waitUntilClickable(receiptsTab);
		element.click();
		try {
			By arrowButton = By.xpath(
					"//div[contains(@class,'toggle-menu')]/mat-icon[normalize-space(text())='keyboard_arrow_right']");
			WebElement arrow = HelperClass.waitUntilClickable(arrowButton);
			HelperClass.scrollToElement(arrow);
			((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].click();", arrow);
			Log.info("Clicked sidebar expand arrow.");

		} catch (Exception e) {
			Log.error("Failed to click sidebar expand arrow: ");
			e.printStackTrace();
		}
		By creditTab = By.xpath("//a[@mattooltip='Estimates']");
		WebElement credit = HelperClass.waitUntilClickable(creditTab);
		credit.click();

		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Estimate']")).trim();
		String expected = "Add Estimate";
		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Add Estimate page verified");
		} else {
            Assert.fail("Not Matched"+ actualtext);

		}

	}

	public void clickonaddestimatesandverify() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Estimate']"));
		Thread.sleep(2000);
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Estimate']")).trim();
		String expected = "Add New Estimate";
		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Add New Estimate page verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualtext);

		}

	}

	public void clickoneditcompanydetailswithoutgivingmandatorydetails() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		Thread.sleep(2000);
		HelperClass.clearField(HelperClass.getDriver(),
				By.xpath("//input[normalize-space(@formcontrolname)='address1']"));
		HelperClass.clearField(HelperClass.getDriver(),
				By.xpath("(//input[normalize-space(@formcontrolname)='city'])[2]"));
		HelperClass.clearField(HelperClass.getDriver(),
				By.xpath("(//input[normalize-space(@formcontrolname)='postalCode'])[2]"));
		Thread.sleep(2000);
		estimatelocators.enterkeys.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Save'])[2]"));

		String actualtext = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='Please complete all mandatory fields.']")).trim();
		String expected = "Please complete all mandatory fields.";
		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Please complete all mandatory fields. message verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualtext);

		}
	}

	public void clickoneditcompanydetailswithgivingmandatorydetails() throws InterruptedException {
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='address1']"), "512 manchester");
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='city'])[2]"), "yorkshire");
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='postalCode'])[2]"), "W1A 1HQ1");
		HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Save'])[2]"));
		Thread.sleep(2000);
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='512 manchester']")).trim();
		String expected = "512 manchester";
		if (actualtext.equals(expected)) {

			System.out.println("company editing details verified");
		} else {
			System.out.println("Not Matched" + actualtext);
		}
		Thread.sleep(2000);
		String actualtext1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='yorkshire']")).trim();
		String expected1 = "yorkshire";
		if (actualtext1.equals(expected1)) {
			Assert.assertTrue(true,"company editing details verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualtext1);

		}
	}

	public void Clickonaddcustomerandverifythefunctionality() {

		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='add_circle'])[2]"));
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='fullName']"), "sriramraja");
		// HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='name']"),
		// "raja");
		HelperClass.scrollToElement(By.xpath("//input[normalize-space(@formcontrolname)='email']"));
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='email']"),
				"rajasekhar.sriram@capium.com");
//		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='address']"), "manchester");
//		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='city']"), "yorkshire");
//		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='postalCode']"), "W1A 1HQ1");
		HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Save'])[1]"));

	}

	public void selectexistingcustomerandverifydetails() throws InterruptedException {

		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[1]"), "sriramraja");
		Thread.sleep(2000);

		HelperClass.selectFirstSuggestedCustomer("sriramraja");

	}

	public void selectexistingitemandverifydetails() throws InterruptedException {

		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='itemName'])[1]"),
				"PR003 - Item 1");
		Thread.sleep(2000);

		HelperClass.selectFirstSuggestedCustomer("PR003 - Item 1");

	}

	public void selectanotheritemandverifydetails() throws InterruptedException {

		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='itemName'])[2]"),
				"PR003 - Item 2");
		Thread.sleep(2000);

		HelperClass.selectFirstSuggestedCustomer("PR003 - Item 2");

	}

	public void clickonsaveandnewandverifyestimaterecordininsidesearch() throws InterruptedException {

		Thread.sleep(2000);
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//input[normalize-space(@formcontrolname)='estimateId'])[1]")));
		String EstimateId = invoiceField.getAttribute("value").trim();
		System.out.println("Estimate ID captured: " + EstimateId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='arrow_drop_down']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Save and New']"));

		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(3000);
		estimatelocators.search.sendKeys(EstimateId);
		estimatelocators.search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		String actualText = HelperClass.getText(By.xpath("(//div[normalize-space(@class)='onelineclamp'])[1]")).trim();
		String expected = EstimateId;

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Estimate ID' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);


		}

	}

	public void clickonsaveandcontiinueandverifyestimaterecordininsidesearch() throws InterruptedException {

		Thread.sleep(2000);
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//input[normalize-space(@formcontrolname)='estimateId'])[1]")));
		String EstimateId = invoiceField.getAttribute("value").trim();
		System.out.println("Estimate ID captured: " + EstimateId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Continue']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(3000);
		estimatelocators.search.sendKeys(EstimateId);
		estimatelocators.search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String actualText = HelperClass.getText(By.xpath("(//div[normalize-space(@class)='onelineclamp'])[1]")).trim();
		String expected = EstimateId;

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Estimate ID' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);
		}
	}

	public void clickonsaveandexitandverifyestimaterecordinoutsearch() throws InterruptedException {

		Thread.sleep(2000);
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//input[normalize-space(@formcontrolname)='estimateId'])[1]")));
		String EstimateId = invoiceField.getAttribute("value").trim();
		System.out.println("Estimate ID captured: " + EstimateId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		Thread.sleep(2000);
		estimatelocators.search.sendKeys(EstimateId);
		estimatelocators.search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String actualText = HelperClass
				.getText(By.xpath("(//div[normalize-space(@class)='add white-space-nowrap'])[1]")).trim();
		String expected = EstimateId;

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Estimate ID' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}
	}

	public void clickoncancelchangesandtakescreenshot() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Cancel Changes'])[1]"));
		Thread.sleep(3000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Cancel changes verified");

	}

	public void clickonsearchbarpassestimatevalueandverify() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(3000);
		estimatelocators.search.sendKeys("EST001");
		estimatelocators.search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		String actualText = HelperClass.getText(By.xpath("(//div[normalize-space(@class)='onelineclamp'])[1]")).trim();
		String expected = "EST001";

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Estimate ID' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);
		}
	}

	public void clickonestimaterecordandverifyexportasexcel() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath(
				"//table[@aria-describedby='Side List Details Table']/tbody/tr[1]/td/div/div/mat-checkbox/label"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']/ancestor::button"));

	}

	public void clickonestimaterecordandverifyexportascsv() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']/ancestor::button"));

	}

	public void clickonestimaterecordandverifyexportaspdf() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']/ancestor::button"));

	}

	public void clickonestimaterecordandverifyexportasprint() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Print']/ancestor::button"));

	}

	public void clickonsearchandverifyestimaterecord() throws InterruptedException {

		estimatelocators.search.sendKeys("EST001");
		estimatelocators.search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		String actualText = HelperClass.getText(By.xpath("(//div[normalize-space(@class)='onelineclamp'])[1]")).trim();
		String expected = "EST001";

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Estimate ID' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}
	}

	public void clickonallsatusdropdownandverifyeachstatus() throws TimeoutException, InterruptedException {

		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='myPanelClass']", "Draft");
		Thread.sleep(2000);
		HelperClass.verifyClientTypes(HelperClass.getDriver(),
				"//div[normalize-space(@class)='d-flex align-items-center justify-space-between']", "Draft");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='myPanelClass']", "Accepted");
		Thread.sleep(2000);
		HelperClass.verifyClientTypes(HelperClass.getDriver(),
				"//div[normalize-space(@class)='d-flex align-items-center justify-space-between']", "Accepted");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='myPanelClass']", "Declined");
		Thread.sleep(2000);
		HelperClass.verifyClientTypes(HelperClass.getDriver(),
				"//div[normalize-space(@class)='d-flex align-items-center justify-space-between']", "Declined");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='myPanelClass']", "Sent");
		Thread.sleep(2000);
		HelperClass.verifyClientTypes(HelperClass.getDriver(),
				"//div[normalize-space(@class)='d-flex align-items-center justify-space-between']", "Sent");

	}

	public void clickonalltimedropdownandverifyeachstatus() throws TimeoutException, InterruptedException {

		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Week");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"This Week Estimate records verified");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Week");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"Last Week Estimate records verified");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Month");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"This Month Estimate records verified");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Month");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"Last Month Estimate records verified");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Quarter");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"This Quarter Estimate records verified");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Quarter");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"Last Quarter Estimate records verified");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Year");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"This Year Estimate records verified");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Year");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"Last Year Estimate records verified");
	}

	public void verifyexportasexcelmainestimatedashboard() throws InterruptedException {

		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='more_vert']/ancestor::button"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Export to Excel']"));
	}

	public void verifyexportascsvmainestimatedashboard() throws InterruptedException {
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='more_vert']/ancestor::button"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Export to CSV']"));
	}

	public void verifyexportaspdfmainestimatedashboard() throws InterruptedException {
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='more_vert']/ancestor::button"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Export to PDF']"));
		Thread.sleep(2000);
	}

	public void verifyeditmouseactionmainestimatedashboard() throws InterruptedException {

		HelperClass.hoverOverElement(By.xpath("//tbody/tr[4]"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='edit'])[4]"));

		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[1]"), "TESCO");
		Thread.sleep(2000);

		HelperClass.selectFirstSuggestedCustomer("TESCO");

		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));

		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "TESCO");

		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='TESCO']")).trim();
		String expected = "TESCO";

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Customer' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}

	}

	public void verifypreviewinmainestimatedashboard() throws InterruptedException {

		HelperClass.hoverOverElement(By.xpath("//tbody/tr[4]"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[5]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Preview']"));
		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Preview Estimate']")).trim();
		String expected = "Preview Estimate";

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Preview Estimate' verified");

		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}

		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "preview estimate verified");

	}

	public void verifysendinmainestimatedashboard() throws InterruptedException, TimeoutException {
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='myPanelClass']", "Draft");
		Thread.sleep(2000);

		HelperClass.hoverOverElement(By.xpath("//tbody/tr[1]"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[2]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='send']"));
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='to']"),
				"rajasekhar.sriram@capium.com");

		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Send this Estimate']"))
				.trim();
		String expected = "Send this Estimate";

		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Send Estimate' verified");

		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}

		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Send estimate verified");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Send']"));
		Thread.sleep(2000);
		String actualText1 = HelperClass
				.getText(By.xpath("//span[normalize-space(text())='The operation has been completed successfully']"))
				.trim();
		String expected1 = "The operation has been completed successfully";

		if (actualText1.equals(expected1)) {
			Assert.assertTrue(true,"'Send Estimate' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}

	}

	public void verifymarkassentinmainestimatedashboard() throws InterruptedException {

		HelperClass.hoverOverElement(By.xpath("//tbody/tr[1]"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[2]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='check_circle_outline']"));
		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("(//span[normalize-space(text())='Sent'])[1]")).trim();
		String expected = "Sent";

		if (actualText.equals(expected)) {
			 Assert.assertTrue(true,"'Sent Estimate' verified");

		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}
	}

	public void verifymarkasdeciplaineinmainestimatedashboard() throws InterruptedException {

		HelperClass.hoverOverElement(By.xpath("//tbody/tr[4]"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[5]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='highlight_off']"));
		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("(//span[normalize-space(text())='Declined'])[2]")).trim();
		String expected = "Declined";

		if (actualText.equals(expected)) {
			 Assert.assertTrue(true,"'Declined' verified");

		} else {
            Assert.fail("'Declined' verified "+ actualText);

		}
	}

	public void verifymarkasacceptedinmainestimatedashboard() throws InterruptedException {

		HelperClass.hoverOverElement(By.xpath("//tbody/tr[6]"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[7]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='beenhere']"));
		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("(//span[normalize-space(text())='Accepted'])[1]")).trim();
		String expected = "Accepted";

		if (actualText.equals(expected)) {
			 Assert.assertTrue(true,"'Accepted' verified");
		} else {
            Assert.fail("not matched. Actual: "+ actualText);

		}
	}

	public void verifyduplicateinmainestimatedashboard() throws InterruptedException {

		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "ABC Seller");
		HelperClass.hoverOverElement(By.xpath("//tbody/tr[1]"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[2]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='content_copy']"));
		Thread.sleep(2000);
		estimatelocators.search.sendKeys(Keys.ENTER);
		HelperClass.verifyClientTypes(HelperClass.getDriver(), "//span[normalize-space(text())='ABC Seller']",
				"ABC Seller");
	}
}
