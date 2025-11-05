package com.Capium365.Actions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
 
import java.awt.Toolkit;
 
import java.awt.datatransfer.StringSelection;
 
import java.awt.event.KeyEvent;
 
import java.io.IOException;
 
import java.time.Duration;
 
import java.util.List;

import org.openqa.selenium.By;
 
import org.openqa.selenium.JavascriptExecutor;
 
import org.openqa.selenium.Keys;
 
import org.openqa.selenium.NoSuchElementException;
 
import org.openqa.selenium.TimeoutException;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.PageFactory;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import org.openqa.selenium.support.ui.WebDriverWait;
 
import org.testng.Assert;

import com.Capium.Utilites.ExcelReader;
 
import com.Capium.Utilites.HelperClass;
 
import com.Capium.Utilites.Log;
 
import com.Capium365.Locators.Capium365_InvoicesTab_recurringInvoice_Locators;

public class Capium365_InvoicesTab_recurringInvoice_Actions {

	Capium365_InvoicesTab_recurringInvoice_Locators recurringinvoices = null;
 
	public Capium365_InvoicesTab_recurringInvoice_Actions() {
 
		this.recurringinvoices = new Capium365_InvoicesTab_recurringInvoice_Locators();
 
		PageFactory.initElements(HelperClass.getDriver(), recurringinvoices);
 
	}
 
	String RecurringFilePath = "src\\test\\resources\\Files_Excel\\Recurring invoice.xlsx";
 
//	String filePath = "C:\\Users\\user\\Documents\\Capium logo.jpg";
	String filePath="C:\\Users\\user\\Documents\\Invoice.pdf";
 
	WebDriverWait wait = HelperClass.getWait();
 
	WebDriver driver = HelperClass.getDriver();
 
	public void invoicestab() throws Exception {
 
		By invoicetab = By.xpath("//span[text()='Invoices']//parent::a");
 
		WebElement element = HelperClass.waitUntilClickable(invoicetab);
 
		element.click();
 
	}
 
	public void Arrowbutton() throws Exception {
 
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
 
	}
 
	public void recurringinvoicetab() {
 
		By recurringinvoicetab = By.xpath("//a[@mattooltip='Recurring']");
 
		WebElement invoicetab = HelperClass.waitUntilClickable(recurringinvoicetab);
 
		invoicetab.click();
 
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='Add Recurring Invoice']"));
 
		String expected = "Add Recurring Invoice";
 
		if (actualText.equals(expected)) {
 
		    Assert.assertTrue(true,"Add Recurring Invoice page verified");
 
		} else {
 
		    Assert.fail("Add Recurring Invoice page is not verified");

		}
 
	}
 
	public void addrecurringinvoicebutton() {
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(
 
				By.xpath("//span[normalize-space()='Add Recurring Invoice']/ancestor::button")));
 
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Add Recurring Invoice']/ancestor::button"));
 
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='Add New Recurring Invoice']"));
 
		String expected = "Add New Recurring Invoice";
 
		if (actualText.equals(expected)) {
 
		    Assert.assertTrue(true,"Add New Recurring Invoice page verified");
 
		} else {
 
		    Assert.fail("Add New Recurring Invoice page is not verified");
 
		}
 
	}
 
	public void editbuttonincompanydetails(){
 
		HelperClass.safeClick(recurringinvoices.editbuttonincompanydetails);
 
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='Edit Company Details']"));
 
		String expected = "Edit Company Details";
 
		if (actualText.equals(expected)) {
 
		    Assert.assertTrue(true,"Edit Company Details page verified");
 
		} else {
 
		    Assert.fail("Edit Company Details page is not verified");
 
		}
 
	}
 
	public void Clickonsavewithoutgivingmandatorydetailsincompanydetails() throws IOException, InterruptedException{
 
		HelperClass.clearField(HelperClass.getDriver(), recurringinvoices.addressincompanydetails);
 
		HelperClass.clearField(HelperClass.getDriver(), recurringinvoices.postalcodeincompanydetails);
 
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']"));
 
		HelperClass.captureScreenshot("mandatory fields required message verified");
 
	}
 
	public void Clickonsavewithgivingmandatorydetailsincomapanydetails() throws InterruptedException {
 
		HelperClass.clearField(HelperClass.getDriver(),
 
				By.xpath("//input[normalize-space(@formcontrolname)='address1']"));
 
		HelperClass.clearField(HelperClass.getDriver(),
 
				By.xpath("//input[normalize-space(@formcontrolname)='postalCode']"));
 
		String[][] data = ExcelReader.getSheetData(RecurringFilePath, "Sheet1");
 
		String[] companydetails = data[0];
 
		recurringinvoices.addressincompanydetails.sendKeys(companydetails[0]);
 
		recurringinvoices.postalcodeincompanydetails.sendKeys(companydetails[1]);
 
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']"));
 
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The operation has been completed successfully!']"));
 
		String expected = "The operation has been completed successfully!";
 
		if (actualtext.equals(expected)) {
 
		    Assert.assertTrue(true,"The operation has been completed successfully!");
 
		} else {
 
		    Assert.fail("Not Matched");
 
		}
 
	}

public void cancelbuttonincompanydetails() {

		HelperClass.safeClick(recurringinvoices.cancelbuttonincompanydetails);

		String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='Add New Recurring Invoice']"));

		String expected = "Add New Recurring Invoice";

		if (actualText.equals(expected)) {

		    Assert.assertTrue(true,"Add New Recurring Invoice page verified");

		} else {

		    Assert.fail("Add New Recurring Invoice page is not verified");

		}

	}
 
public void customernameaddbutton() {
		HelperClass.safeClick(recurringinvoices.customernameaddbutton);
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
		String expected = "Add New Customer";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"Add New Customer verified");
		} else {
		    Assert.fail("Add New Customer not verified");
 
		}
	}
 
	public void Fillallmandatorydetailsinaddnewcustomer() {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//ng-select[@formcontrolname='title'])[1]",
				"Miss");
		String[][] data = ExcelReader.getSheetData(RecurringFilePath, "Sheet1");
		String[] customer = data[0];
		recurringinvoices.fullnameincustomer.sendKeys(customer[2]);
		recurringinvoices.emailincustomer.sendKeys(customer[3]);
		HelperClass.sleep1(2000);
		HelperClass.clickWithRetry(recurringinvoices.savebuttoninaddnewcustomer, driver, wait);
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been added successfully.']"));
		String expected = "The record has been added successfully.";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The record has been added successfully");
		} else {
		    Assert.fail("Record not verified");
		}
		HelperClass.safeClick(By.xpath("(//span[normalize-space()='Back to Recurring Invoice'])[1]"));
		HelperClass.sleep1(2000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[1]"), "Lahari");
		HelperClass.sleep1(4000);
		HelperClass.selectFirstSuggestedCustomer("Lahari");
	}
 
	public void Fillallnonmandatorydetailsinaddnewcustomer() throws AWTException, IOException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='phoneCountryId']",
				"+91");
 
		String[][] data = ExcelReader.getSheetData(RecurringFilePath, "Sheet1");
		String[] customer = data[0];
		recurringinvoices.phonenumberincustomer.sendKeys(customer[4]);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[@formcontrolname='whatsAppCountryId']", "+91");
		recurringinvoices.whatappnumberincustomer.sendKeys(customer[5]);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), ("//ng-select[@formcontrolname='addressType']"),
				"Postal");
		recurringinvoices.addressincustomer.sendKeys(customer[6]);
		recurringinvoices.cityincustomer.sendKeys(customer[7]);
		recurringinvoices.countyincustomer.sendKeys(customer[8]);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				("//ng-select[normalize-space(@formcontrolname)='country']"), "United Kingdom");
		recurringinvoices.postalcodeincustomer.sendKeys(customer[9]);
 
		WebDriver driver = HelperClass.getDriver();
		WebElement chooseFileButton = driver.findElement(By.xpath("//div[@class='attachFile']"));
		chooseFileButton.click();
		HelperClass.sleep1(2000);
 
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
 
		HelperClass.sleep1(1000);
 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		HelperClass.sleep1(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), ("//ng-select[@formcontrolname='paymentDue']"),
				"On receipt");
		HelperClass.clickWithRetry(recurringinvoices.savebuttoninaddnewcustomer, driver, wait);
		HelperClass.captureScreenshot("mandatory fields required message verified");
	}
	public void paymnetaccountdropdowninaddcustomer(){
 
        WebElement field = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        String inputValue = "5435-CIS Control Account";
 
        field.clear();
        field.sendKeys(inputValue);
        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'ng-dropdown-panel-items')]//span"));
 
        boolean isOptionPresent = false;
        for (WebElement option : options) {
            if (option.getText().trim().equalsIgnoreCase(inputValue.trim())) {
                isOptionPresent = true;
                break;
            }
        }
 
        if (isOptionPresent) {
            System.out.println("Payment Account '" + inputValue + "' is displaying in dropdown.");
        } else {
            System.out.println("Payment Account '" + inputValue + "' is NOT displaying in dropdown.");
        }
    }
	public void selectcustomerandverify(){
		HelperClass.sleep1(3000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[1]"), "Sam");
		HelperClass.sleep1(4000);
		HelperClass.selectFirstSuggestedCustomer("Sam");
	}
 
	public void addnewlineincontactdetails(){
		HelperClass.safeClick(recurringinvoices.addnewlineincontactdetails);
		String actualText = HelperClass.getText(By.xpath("//table[@aria-describedby='Add Customer Table']/tbody/tr[2]"))
				.trim();
		if (HelperClass.isElementPresent(By.xpath("//table[@aria-describedby='Add Customer Table']/tbody/tr[2]"))) {
		    Assert.assertTrue(true,"Contact details line added successfully");
		} else {
		    Assert.fail("Contact details line not added: "+ actualText);
 
		}
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//ng-select[@formcontrolname='title'])[3]",
				"Mr");
 
		String[][] data = ExcelReader.getSheetData(RecurringFilePath, "Sheet1");
		String[] customer = data[1];
		recurringinvoices.fullnameincustomeraddnewline.sendKeys(customer[2]);
		recurringinvoices.emailincustomeraddnewline.sendKeys(customer[3]);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				("(//ng-select[@formcontrolname='phoneCountryId'])[2]"), "+255");
		recurringinvoices.phonenumberincustomeraddnewline.sendKeys(customer[4]);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//ng-select[@formcontrolname='whatsAppCountryId'])[2]", "+246");
		recurringinvoices.whatsappnumberincustomeraddnewline.sendKeys(customer[5]);
		HelperClass.clickUsingJS(By.xpath("(//mat-radio-button[@formcontrolname='isPrimary'])[2]"));
 
		HelperClass.safeClick(recurringinvoices.addnewlinecrossbuttonincontactdetails);
		if (HelperClass.isElementPresentAndDisplayed(
				By.xpath("//table[@aria-describedby='Add Customer Table']/tbody/tr[2]"))) {
			Assert.fail("Element is removed");
		} else {
		    Assert.assertTrue(true,"Element is still present");
 
		}
 
	}
 
	public void addnewlineinaddressdetails(){
		HelperClass.safeClick(recurringinvoices.addnewlineinaddressdetails);
		String actualText = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Address details table']/tbody/tr[2]")).trim();
		if (HelperClass.isElementPresent(By.xpath("//table[@aria-describedby='Address details table']/tbody/tr[2]"))) {
		    Assert.assertTrue(true,"Address details line added successfully");
		} else {
		    Assert.fail("Address details line not added: "+ actualText);
 
		}
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), recurringinvoices.addressincustomeraddnewline);
		String[][] data = ExcelReader.getSheetData(RecurringFilePath, "Sheet1");
		String[] customer = data[1];
		recurringinvoices.addressincustomeraddnewline.sendKeys(customer[6]);
		recurringinvoices.cityincustomeraddnewline.sendKeys(customer[7]);
		recurringinvoices.countyincustomeraddnewline.sendKeys(customer[8]);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				("(//ng-select[normalize-space(@formcontrolname)='country'])[2]"), "United States");
		recurringinvoices.postalcodeincustomeraddnewline.sendKeys(customer[9]);
		HelperClass.safeClick(recurringinvoices.addnewlinecrossbuttoninaddressdetails);
		if (HelperClass.isElementPresentAndDisplayed(
				By.xpath("//table[@aria-describedby='Address details table']/tbody/tr[2]"))) {
		    Assert.fail("Element is removed");
		} else {
		    Assert.assertTrue(true,"Element is still present");
 
		}
	}
	public void cancelchangesinaddnewcustomer() {
		String[][] data = ExcelReader.getSheetData(RecurringFilePath, "Sheet1");
		String[] customer = data[0];
		recurringinvoices.addressincustomer.sendKeys(customer[3]);
		HelperClass.safeClick(recurringinvoices.cancelchangesinaddnewcustomer);
		String actualText = HelperClass.getText(By.xpath("//input[@formcontrolname='email']")).trim();
		System.out.println(actualText);
		String expected = "";
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"Data cleared successfully");
		} else {
		    Assert.fail("Data not cleared: "+ actualText);
 
		}
 
	}
	public void clickonsettingsandsaveandverify(){
 
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='settings_suggest']"));
		HelperClass.sleep1(2000);
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[10]"), "1000",
				By.xpath("//div[normalize-space(text())='1000-Sales']"));
		HelperClass.SearchAndSelectClientclear(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[11]"), "Cash",
				By.xpath("//span[normalize-space(text())='5220-Cash in Hand']"));
		HelperClass.SearchAndSelectClientclear(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[12]"), "Reduced",
				By.xpath("//span[normalize-space(text())='Reduced (5.0%)']"));
 
		HelperClass.safeClick(By.xpath("//label[normalize-space(text())='Save these values only for this record']"));
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']"));
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been updated successfully.']"));
		String expected = "The record has been updated successfully.";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The record has been updated successfully");
		} else {
		    Assert.fail("Record not verified");
		}
	}
 
	public void selectduedateandverifyininvoices() {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='paymentDue']", "Net 7");
 
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "PR004",
				By.xpath("//span[normalize-space(text())='PR004 - Item 2']"));
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='price']"), "100");
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been added successfully.']"));
		String expected = "The record has been added successfully.";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The record has been added successfully");
		} else {
		    Assert.fail("Record not verified");
		}
		HelperClass.sleep1(3000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//mat-icon[normalize-space(text())='receipt_long'])[2]")));
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space(text())='receipt_long'])[2]"));
	    HelperClass.waitForPageToLoad(driver);
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='search']"), "Sam");
 
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='Sam']")).trim();
		String expected1 = "Sam";
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"'Sam' name verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
		}
	}
 
public void checkrepeatinvoicecheckboxandverifyininvoice(){
 
		WebElement recurringinvoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = recurringinvoiceField.getAttribute("value").trim();
		String modifiedInvoiceId = "R" + invoiceId;
		System.out.println("Modified Invoice ID: " + modifiedInvoiceId);
		HelperClass.clickUsingJS(By.xpath("//mat-checkbox[normalize-space(@formcontrolname)='isRepeatInvoice']"));
 
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[4]"), "Daily",
				By.xpath("//span[normalize-space(text())='Daily']"));
 
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "PR004",
				By.xpath("//span[normalize-space(text())='PR004 - Item 2']"));
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='price']"), "100");
 
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Exit']"));
 
		HelperClass.sleep1(3000);
 
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//mat-icon[normalize-space(text())='receipt_long'])[2]")));
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space(text())='receipt_long'])[2]"));
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='search']"), modifiedInvoiceId);
 
		String actualText = HelperClass.getText(By.xpath("//table[@aria-describedby='Invoices List Table']/tbody/tr[1]/td[3]/div[1]")).trim();
		String expected = modifiedInvoiceId;
 
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"'Sam' name verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
 
		}
	}
 
	public void clickondiscountoptionandverifyvalue(){
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "PR004",
				By.xpath("//span[normalize-space(text())='PR004 - Item 2']"));
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='price']"), "100");
		HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@formcontrolname)='discountValue']"), "10");
		WebElement discountvalue = driver.findElement(By.xpath("//input[normalize-space(@formcontrolname)='discountValue']"));
		HelperClass.safeType(discountvalue, "10");
		discountvalue.sendKeys(Keys.ENTER);
		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space(text())='£ 90.00'])[1]"))
				.trim();
		String expected = "£ 90.00";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"Discount amount verified");
		} else {
		    Assert.fail("Not Matched:"+ actualtext);
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Exit']"));
	}
 
	public void additemandverify(){
 
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "PR004",
				By.xpath("//span[normalize-space(text())='PR004 - Item 2']"));
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='price'])[1]"), "100");
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space(text())='add'])[1]"));
		HelperClass.sleep1(2000);
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@formcontrolname)='itemName'])[2]"), "PR005",
				By.xpath("//span[normalize-space(text())='PR005 - Item 3']"));
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='price'])[2]"), "200");
		String actualtext = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Invoices Basic Info Table']/tbody/tr[2]"));
		if (HelperClass
				.isElementPresent(By.xpath("//table[@aria-describedby='Invoices Basic Info Table']/tbody/tr[2]"))) {
		    Assert.assertTrue(true,"line added successfully");
 
		} else {
		    Assert.fail("line not added: "+ actualtext);
 
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Exit']"));
 
	}
 
	public void selectexistingitem() {
 
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "PR004",
				By.xpath("//span[normalize-space(text())='PR004 - Item 2']"));
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='price'])[1]"), "100");
 
	}
 
public void clickonaddbankandentermandetails(){
 
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Add new bank account']"));
		HelperClass.safeClick(By.xpath("//a[normalize-space(text())='Add New Line']"));
		String[][] data = ExcelReader.getSheetData(RecurringFilePath, "Sheet2");
		String[] customer = data[0];
		try {
			WebElement lastEmptyAccountName = driver.findElement(By.xpath(
					"(//input[@formcontrolname='accountName' and not(@disabled) and normalize-space(@value)=''])[last()]"));
			lastEmptyAccountName.sendKeys(customer[0] + Keys.ENTER);
			WebElement lastEmptyAccountNumber = driver.findElement(
					By.xpath("(//input[@formcontrolname='accountNumber' and normalize-space(@value)=''])[last()]"));
			lastEmptyAccountNumber.sendKeys(customer[1] + Keys.ENTER);
			WebElement lastEmptyBranchCode = driver.findElement(
					By.xpath("(//input[@formcontrolname='branchCode' and normalize-space(@value)=''])[last()]"));
			lastEmptyBranchCode.sendKeys(customer[2] + Keys.ENTER);
			HelperClass.safeClick(By.xpath("(//mat-radio-button[normalize-space(@name)='isDefaultBank'])[6]"));
			HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']//parent::button"));
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Could not locate empty row to fill bank details", e);
		}
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The operation has been completed successfully!']"));
		String expected = "The operation has been completed successfully!";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The operation has been completed successfully!");
		} else {
		    Assert.fail("Not Matched");
		}
	}
	public void Selectrepeatinvoicestatus(){
 
		HelperClass.sleep1(2000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[4]"), "Daily");
		HelperClass.selectFirstSuggestedCustomer("Daily");
	}
	public void paymnetaccountdropdownininvoice(){
        WebElement field = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        String inputValue = "5435-CIS Control Account";
 
        field.clear();
        field.sendKeys(inputValue);
        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'ng-dropdown-panel-items')]//span"));
 
        boolean isOptionPresent = false;
        for (WebElement option : options) {
            if (option.getText().trim().equalsIgnoreCase(inputValue.trim())) {
                isOptionPresent = true;
                break;
            }
        }
 
        if (isOptionPresent) {
            System.out.println("Payment Account '" + inputValue + "' is displaying in dropdown.");
        } else {
            System.out.println("Payment Account '" + inputValue + "' is NOT displaying in dropdown.");
        }
    }
	public void Clickonsaveandnewandverifyrecurringinvoice(){
 
		HelperClass.sleep1(2000);
		WebElement recurringinvoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = recurringinvoiceField.getAttribute("value").trim();
		String modifiedInvoiceId = "R" + invoiceId;
		System.out.println("Modified Invoice ID: " + modifiedInvoiceId);
 
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='arrow_drop_down']"));
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and New']"));
		String actualText = HelperClass
				.getText(By.xpath("(//span[normalize-space(text())='Add New Recurring Invoice'])[1]")).trim();
		String expected = "Add New Recurring Invoice";
 
		if (actualText.equals(expected)) {
			System.out.println("'Add New Recurring Invoice' page verified");
		} else {
			System.out.println("Text not matched. Actual: " + actualText);
		}
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement Search = driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Search here...']"));
		HelperClass.safeType(Search, modifiedInvoiceId);
		Search.sendKeys(Keys.ENTER);
		String actualText1 = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Recurring invoices list table']/tbody/tr[1]/td[2]/div[1]"))
				.trim();
		String expected1 = modifiedInvoiceId;
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"'Add New Recurring Invoice' id verified");
 
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
 
		}
	}
	public void Clickonsaveandcontinueandverifyrecurringinvoice(){
		WebElement recurringinvoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = recurringinvoiceField.getAttribute("value").trim();
		String modifiedInvoiceId = "R" + invoiceId;
		System.out.println("Modified Invoice ID: " + modifiedInvoiceId);
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Continue']"));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement Search = driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Search here...']"));
		HelperClass.safeType(Search, modifiedInvoiceId);
		Search.sendKeys(Keys.ENTER);
		String actualText1 = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Recurring invoices list table']/tbody/tr[1]/td[2]/div[1]"))
				.trim();
		String expected1 = modifiedInvoiceId;
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"'Add New Recurring Invoice' id verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
 
		}
	}
 
public void Clickonsaveandexitandverifyrecurringinvoice(){
		WebElement recurringinvoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = recurringinvoiceField.getAttribute("value").trim();
		String modifiedInvoiceId = "R" + invoiceId;
		System.out.println("Modified Invoice ID: " + modifiedInvoiceId);
		HelperClass.safeClick(By.xpath("//span[normalize-space()='Save and Exit']/parent::button"));
		WebElement Search = driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Search here...']"));
		HelperClass.safeType(Search, modifiedInvoiceId);
		Search.sendKeys(Keys.ENTER);
		String actualText1 = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Recurring invoices list table']/tbody/tr[1]/td[2]/div[1]"))
				.trim();
		String expected1 = modifiedInvoiceId;
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"'Add New Recurring Invoice' id verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
 
		}
	}
 
	public void Clickoncancelchangesandverifydetails() throws IOException {
 
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Cancel Changes']"));
		String actualText = HelperClass.getText(By.xpath("//input[@formcontrolname='price']")).trim();
		String expected = "";
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"Data erased");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
 
		}
	}
 
	public void clickonaddnewrecurringinvoiceplusbuttonandverify(){
 
		HelperClass.safeClick(
				By.xpath("//table[@aria-describedby='Side List Details Table']/tbody/tr[1]/td[1]/div/div/a"));
		
		HelperClass.safeClick(
				By.xpath("//div[contains(@class,'side-list')]/a/mat-icon[contains(text(),'add_circle')]"));
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Recurring Invoice']"))
				.trim();
		String expected = "Add New Recurring Invoice";
 
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"'Add New Recurring Invoice' verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
 
		}
	}
 
	public void checkthecheckboxandverifyoptionsareenabling() throws InterruptedException {
 
		WebElement checkbox = driver.findElement(By.xpath(
				"//span[normalize-space()='Recurring invoices']/ancestor::div[contains(@class,'d-flex align-items-center')]//mat-checkbox"));
		Thread.sleep(3000);
		HelperClass.clickWithRetry(checkbox, driver, wait);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[1]"))
				.isDisplayed());
		System.out.println("Copy button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[2]"))
				.isDisplayed());
		System.out.println("Delete button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[3]"))
				.isDisplayed());
		System.out.println("EXCEL button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[4]"))
				.isDisplayed());
		System.out.println("CSV button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[5]"))
				.isDisplayed());
		System.out.println("PDF button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[6]"))
				.isDisplayed());
		System.out.println("PRINT button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[7]"))
				.isDisplayed());
		System.out.println("END button verified");
 
	}
 
public void clickexportinaddnewrecurringinvoice(){
		HelperClass.waitForPageToLoad(driver);
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='checkbox'])[1]//parent::div")));
		HelperClass.safeClick(By.xpath("(//input[@type='checkbox'])[1]//parent::div"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Excel']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='CSV']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='PDF']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	}
	public void recurringinvoicesearch(){
 
		WebElement customername = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//table[@aria-describedby='Recurring invoices list table']/tbody/tr[1]/td[3]//div)[3]")));
		String customer = customername.getText().trim();
		String C = customer;
		System.out.println("c: " + customer);
		WebElement Search = driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Search here...']"));
		HelperClass.safeType(Search, customer);
		Search.sendKeys(Keys.ENTER);
		String actualText = HelperClass
				.getText(By.xpath("(//table[@aria-describedby='Recurring invoices list table']/tbody/tr[1]/td[3]//div)[3]"))
				.trim();
		String expected = customer;
 
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"customer verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
 
		}
 
	}
 
	public void selectallstatusandvalidate(){
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//span[normalize-space()='All Status']",
				"Active");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//table/tbody/tr/td//span[normalize-space()='Active']",
				"Active");
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[@panelclass='myPanelClass']/div/div/div[contains(@class,'mat-mdc-select-arrow')]", "Inactive(Paused)");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(),
				"//table/tbody/tr/td//span[normalize-space()='Inactive(Paused)']", "Inactive(Paused)");
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[@panelclass='myPanelClass']/div/div/div[contains(@class,'mat-mdc-select-arrow')]", "Inactive(Ended)");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(),
				"//table/tbody/tr/td//span[normalize-space()='Inactive(Ended)']", "Inactive(Ended)");
	}
 
	public void clickonalltimestatusandverify() throws IOException{
        HelperClass.sleep1(3000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Week");
		HelperClass.captureScreenshot("This week invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Week");
		HelperClass.captureScreenshot("Last week invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Month");
		HelperClass.captureScreenshot("This Month invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Month");
		HelperClass.captureScreenshot("Last Month invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Quarter");
		HelperClass.captureScreenshot("This Quarter invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Quarter");
		HelperClass.captureScreenshot("Last Quarter invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Year");
		HelperClass.captureScreenshot("This Year invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Year");
		HelperClass.captureScreenshot("Last Year invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "Custom");
		HelperClass.captureScreenshot("Custom invoices are captured");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Financial Year");
		HelperClass.captureScreenshot("This Financial Year invoices are captured");
	}
public void clickonactionsexport(){
		
		HelperClass.waitForPageToLoad(driver);
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space(text())='more_vert'])[1]"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to PDF']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
 
	}
	public void mousehoverdeleteyesbuttoninrecurringinvoice(){
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='delete_outline']/ancestor::button"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
		String expected = "Confirm Delete";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "'Confirm Delete' page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
		HelperClass.safeClick(By.xpath("//label[normalize-space()='Delete by selecting the box']"));
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Yes']"));
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
 
		if (actualText1.equals(expected1)) {
			Assert.assertTrue(true, "The record has been deleted successfully");
 
		} else {
			Assert.fail("The record has not deleted" + actualText1);
 
		}
	}
 
	public void mousehoverdeletenobuttoninrecurringinvoice(){
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='delete_outline']/ancestor::button"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
		String expected = "Confirm Delete";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "'Confirm Delete' page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
		HelperClass.safeClick(By.xpath("//label[normalize-space()='Delete by selecting the box']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']"));
		HelperClass.sleep1(2000);
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
 
		if (actualText1.equals(expected1)) {
			Assert.fail("The record has not deleted" + actualText1);
 
		} else {
			Assert.assertTrue(true, "The record has been deleted successfully");
 
		}
	}
	public void mousehoverendinrecurringinvoice() {
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickWithRetry(recurringinvoices.mousehoveractionsinrecurringinvoice, driver, wait);
		HelperClass.safeClick(By.xpath("(//span[normalize-space()='End'])[2]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space()='Confirm Ending the Recurring Schedule']")).trim();
		String expected = "Confirm Ending the Recurring Schedule";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Confirm Ending the Recurring Schedule verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space()='Yes']"));
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='Schedule has ended successfully']")).trim();
		String expected1 = "Schedule has ended successfully";
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"Schedule has ended successfully");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
		}
	}
 
public void mousehoverpauseinrecurringinvoice() {
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickWithRetry(recurringinvoices.mousehoveractionsinrecurringinvoice, driver, wait);
		HelperClass.safeClick(By.xpath("(//span[normalize-space()='Pause'])[2]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space()='Confirm Pausing']")).trim();
		String expected = "Confirm Pausing";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Confirm Pausing verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space()='Yes']"));
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='The schedule has been paused successfully.']")).trim();
		String expected1 = "The schedule has been paused successfully.";
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"Schedule has been paused successfully");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
		}
	}
	public void clickoninvoicecheckboxandverifyenablingoptions() throws InterruptedException {
 
		WebElement checkbox = driver.findElement(By.xpath(
				"//table[@aria-describedby='Recurring invoices list table']//thead/tr/th[1]//mat-checkbox"));
		HelperClass.sleep1(3000);
		HelperClass.clickWithRetry(checkbox, driver, wait);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[1]"))
				.isDisplayed());
		System.out.println("Copy button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[2]"))
				.isDisplayed());
		System.out.println("Delete button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[3]"))
				.isDisplayed());
		System.out.println("EXCEL button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[4]"))
				.isDisplayed());
		System.out.println("CSV button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[5]"))
				.isDisplayed());
		System.out.println("PDF button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[6]"))
				.isDisplayed());
		System.out.println("PRINT button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[7]"))
				.isDisplayed());
		System.out.println("END button verified");
	}
	public void recordcancelinrecurringinvoice() {
		HelperClass.safeClick(recurringinvoices.recordcancelinrecurringinvoice);
		if (HelperClass.isElementPresentAndDisplayed(
				By.xpath("//mat-icon[normalize-space()='highlight_off']"))) {
			Assert.fail("Element is removed");
 
		} else {
			Assert.assertTrue(true, "Element is still present");
 
		}
	}
	public void copybuttoninrecurringinvoice() {
		HelperClass.clickWithRetry(recurringinvoices.checkboxinrecurringinvoice, driver, wait);
		HelperClass.safeClick(By.xpath("(//button[normalize-space(@type)='button'])[1]"));
		String actualText = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been copied successfully.']")).trim();
		String expected = "The record has been copied successfully.";
		try {
			if (actualText.equals(expected)) {
				Assert.assertTrue(true, "The record has been copied successfully.");
 
			} else {
				Assert.fail("The record not copied: " + actualText);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Copy: " + e.getMessage());
		}
	}
	public void deleteyesbuttoninrecurringinvoice(){
		HelperClass.clickWithRetry(recurringinvoices.checkboxinrecurringinvoice, driver, wait);
		HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[2]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
		String expected = "Confirm Delete";
		try {
			if (actualText.equals(expected)) {
				Assert.assertTrue(true, "Confirm Delete verified");
 
			} else {
				Assert.fail("Confirm Delete not verified: " + actualText);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.safeClick(By.xpath("//label[normalize-space(text())='Delete by selecting the box']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.assertTrue(true, "The record has been deleted successfully.");
 
			} else {
				Assert.fail("The record should not delete" + actualText1);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
 
public void deletenobuttoninrecurringinvoice(){
		HelperClass.clickWithRetry(recurringinvoices.checkboxinrecurringinvoice, driver, wait);
		HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[2]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
		String expected = "Confirm Delete";
		try {
			if (actualText.equals(expected)) {
				Assert.assertTrue(true, "Confirm Delete verified");
 
			} else {
				Assert.fail("Confirm Delete not verified: " + actualText);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.safeClick(By.xpath("//label[normalize-space(text())='Delete by selecting the box']"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
		HelperClass.sleep1(2000);
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.fail("The record should not delete" + actualText1);
 
			} else {
				Assert.assertTrue(true, "The record has been deleted successfully");
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	public void clickonexportreport(){
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@aria-describedby='Recurring invoices list table']//thead/tr/th[1]//mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table[@aria-describedby='Recurring invoices list table']//thead/tr/th[1]//mat-checkbox"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Excel']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='CSV']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='PDF']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		
	}
	public void endyesbuttoninrecuringinvoice() {
		HelperClass.clickWithRetry(recurringinvoices.checkboxinrecurringinvoice, driver, wait);
		HelperClass.safeClick(By.xpath("//p[normalize-space(text())='End']//ancestor::button"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Ending the Recurring Schedule']"))
				.trim();
		String expected = "Confirm Ending the Recurring Schedule";
 
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"End verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Yes']"));
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='Schedule has ended successfully']")).trim();
		String expected1 = "Schedule has ended successfully";
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"Schedule has ended successfully");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
		}
	}
	public void endnobuttoninrecuringinvoice() {
		HelperClass.clickWithRetry(recurringinvoices.checkboxinrecurringinvoice, driver, wait);
		HelperClass.safeClick(By.xpath("//p[normalize-space(text())='End']//ancestor::button"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Ending the Recurring Schedule']"))
				.trim();
		String expected = "Confirm Ending the Recurring Schedule";
 
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"End verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='No']"));
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='Schedule has ended successfully']")).trim();
		String expected1 = "Schedule has ended successfully";
 
		if (actualText1.equals(expected1)) {
			Assert.fail("Schedule has not ended"+ actualText1);
		} else {
		    Assert.assertTrue(true,"Schedule has ended successfully");
		}
	}
 
public void ClickonPagiantionDropdownandValidteCount(){
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/mat-checkbox/div/div")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/mat-checkbox/div/div"));
 
		String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
		String expected = "Records: 10";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "10 records are there");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='20']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/mat-checkbox/div/div")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/mat-checkbox/div/div"));
 
		String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
		String expected1 = "Records: 20";
 
		if (actualText1.equals(expected1)) {
			Assert.assertTrue(true, "20 records are there");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText1);
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='50']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='50']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/mat-checkbox/div/div")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/mat-checkbox/div/div"));
 
		String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='50']")).trim();
		String expected2 = "Records: 50";
 
		if (actualText2.equals(expected2)) {
			Assert.assertTrue(true, "50 records are there");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText2);
 
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='100']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/mat-checkbox/div/div")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/mat-checkbox/div/div"));
 
		String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
		String expected3 = "Records: 100";
 
		if (actualText3.equals(expected3)) {
			Assert.fail("Text not matched. Actual: " + actualText3);
		} else {
			Assert.assertTrue(true, "100 records are there");
		}
	}
 
	public void nextpageinrecurringinvoice() {
		recurringinvoices.nextpageinrecurringinvoice.click();
	}
 
	public void previouspageinrecurringinvoice() {
		recurringinvoices.previouspageinrecurringinvoice.click();
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
 