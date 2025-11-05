package com.Capium365.Actions;

import static org.testng.Assert.assertTrue;

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
 
import com.Capium365.Locators.Capium365_InvoicesTab_Customers_Locators;

public class Capium365_InvoicesTab_Customers_Actions {

	Capium365_InvoicesTab_Customers_Locators customerLocators = null;
 
	WebDriver driver = HelperClass.getDriver();
 
	WebDriverWait wait = HelperClass.getWait();

	String FilePath = "src\\test\\resources\\Files_Excel\\Add customers.xlsx";
 
	//String imgpath = "C:\\Users\\user\\Documents\\Capium logo.jpg";
	String imgpath="C:\\Users\\user\\Documents\\company logo.jpg";

	public Capium365_InvoicesTab_Customers_Actions() {
 
		this.customerLocators = new Capium365_InvoicesTab_Customers_Locators();
 
		PageFactory.initElements(driver, customerLocators);
 
	}

	public void invoicestab() {
 
		By invoicetab = By.xpath("//span[text()='Invoices']//parent::a");
 
		WebElement element = driver.findElement(invoicetab);
 
		wait.until(ExpectedConditions.visibilityOf(element));
 
		HelperClass.safeClick(element);
 
	}

	public void Arrowbutton() {
 
		HelperClass.waitForTableToLoad();
 
		customerLocators = PageFactory.initElements(HelperClass.getDriver(),
 
				Capium365_InvoicesTab_Customers_Locators.class);
 
		HelperClass.waitUntilVisible(wait, customerLocators.arrowbutton);
 
		HelperClass.clickUsingJS(customerLocators.arrowbutton);
 
		String actualText = HelperClass.getText(By.xpath("//mat-icon[normalize-space()='keyboard_arrow_left']")).trim();
 
		String expected = "keyboard_arrow_left";
 
		if (actualText.equals(expected)) {
 
			Assert.assertTrue(true, "Arrow button verified");

		} else {
 
			Assert.fail("Arrow button not verified: " + actualText);

		}
 
	}

	public void customerstab() {
 
		By customerTab = By.xpath("//mat-icon[normalize-space()='person_outline']//parent::div");
 
		WebElement element = HelperClass.waitUntilClickable(customerTab);
 
		element.click();
 
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='Add Customer']"));
 
		String expected = "Add Customer";
 
		if (actualText.equals(expected)) {
 
			Assert.assertTrue(true, "Add Customer page verified");
 
		} else {
 
			Assert.fail("Not Matched: " + actualText);

		}
 
	}

	public void addcustomerbutton() {
 
		HelperClass.clickUsingJS(customerLocators.addcustomerbutton);
 
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
 
		String expected = "Add New Customer";
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true, "Add New Customer verified");
 
		} else {
 
			Assert.fail("Add New Customer not verified");

		}
 
	}

	public void Fillthemandatorydetailsandsave() {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//ng-select[@formcontrolname='title'])[1]",
 
				"Miss");
 
		String[][] data = ExcelReader.getSheetData(FilePath, "Sheet1");
 
		String[] customer = data[0];
 
		customerLocators.fullnametextbox.sendKeys(customer[0]);
 
		customerLocators.enteremail.sendKeys(customer[1]);
 
		customerLocators.savebutton.click();
 
		customerLocators.addnewcustomersearch.click();
 
		HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search']"), "Raj");
 
		HelperClass.waitForTableToLoad();
 
		String actualText = HelperClass.getText(By.xpath("//a[normalize-space(text())='Raj']")).trim();
 
		String expected = "Raj";
 
		if (actualText.equals(expected)) {
 
			Assert.assertTrue(true, "Customer name added successfully");
 
		} else {
 
			Assert.fail("Customer name not added: " + actualText);

		}
 
	}

	public void searchandeditcustomer() {

		HelperClass.safeSendKeys(By.xpath("//input[@placeholder='Search']"), "Raj");
 
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
 
		HelperClass.clickWithRetry(customerLocators.mousehoveredit, driver, wait);
 
	}

	public void Fillthenonmandatorydetailsinaddcustomerandsaveandexit() throws AWTException, IOException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='phoneCountryId']",
 
				"+91");
 
		String[][] data = ExcelReader.getSheetData(FilePath, "Sheet2");
 
		String[] customer = data[0];
 
		customerLocators.enterphnumber.sendKeys(customer[0]);
 
		customerLocators.enterwhatsappnumber.sendKeys(customer[1]);
 
		customerLocators.enteraddress.sendKeys(customer[2]);
 
		customerLocators.entercity.sendKeys(customer[3]);
 
		customerLocators.entercounty.sendKeys(customer[4]);
 
		customerLocators.enterpostcode.sendKeys(customer[5]);
 
		// upload file
 
		WebDriver driver = HelperClass.getDriver();
 
		WebElement chooseFileButton = driver.findElement(By.xpath("//div[@class='attachFile']"));
 
		chooseFileButton.click();
 
		HelperClass.waitForTableToLoad();
 
		Robot robot = new Robot();
 
		StringSelection selection = new StringSelection(imgpath);
 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
 
		robot.keyPress(KeyEvent.VK_CONTROL);
 
		robot.keyPress(KeyEvent.VK_V);
 
		robot.keyRelease(KeyEvent.VK_V);
 
		robot.keyRelease(KeyEvent.VK_CONTROL);
 
		HelperClass.waitForTableToLoad();
 
		robot.keyPress(KeyEvent.VK_ENTER);
 
		robot.keyRelease(KeyEvent.VK_ENTER);

		HelperClass.safeClick(By.xpath("//a[normalize-space(text())='Delete Photo']"));
 
		String actualText = HelperClass.getText(By.xpath("//mat-icon[normalize-space(text())='cloud_upload']")).trim();
 
		String expected = "cloud_upload";
 
		if (actualText.equals(expected)) {
 
			Assert.assertTrue(true, "File deleted successfully");

		} else {
 
			Assert.fail("File not deleted: " + actualText);

		}
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), ("//ng-select[@formcontrolname='paymentDue']"),
 
				"On receipt");
 
		HelperClass.safeClick(customerLocators.saveandexitbutton);
 
		HelperClass.captureScreenshot("mandatory fields required message verified");
 
	}

	public void cancelchangesbutton() {

		String[][] data = ExcelReader.getSheetData(FilePath, "Sheet1");
 
		String[] customer = data[0];
 
		customerLocators.enterphnumber.sendKeys(data[1]);
 
		customerLocators.cancelchangesbutton.click();
 
		String actualText = HelperClass.getText(By.xpath("//input[@formcontrolname='email']")).trim();
 
		System.out.println(actualText);
 
		String expected = "";
 
		if (actualText.equals(expected)) {
 
			Assert.assertTrue(true, "Data cleared successfully");

		} else {

			Assert.fail("Email not cleared:" + actualText);

		}
 
	}
 
public void Entercontactdetails() {
 
		HelperClass.waitForTableToLoad();
 
		HelperClass.clickWithRetry(customerLocators.contactdetailsaddnewline, driver, wait);
 
		String actualText = HelperClass.getText(By.xpath("//table[@aria-describedby='Add Customer Table']/tbody/tr[2]"))
 
				.trim();
 
		if (HelperClass.isElementPresent(By.xpath("//table[@aria-describedby='Add Customer Table']/tbody/tr[2]"))) {
 
			Assert.assertTrue(true, "Contact details line added successfully");
 
		} else {
 
			Assert.fail("Contact details line not added: " + actualText);
 
		}
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), ("(//ng-select[@formcontrolname='title'])[3]"),
 
				"Ms");
 
		String[][] data = ExcelReader.getSheetData(FilePath, "Sheet1");
 
		String[] customer = data[0];
 
		customerLocators.contactdetailsname.sendKeys(customer[0]);
 
		customerLocators.email.sendKeys(customer[1]);
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
 
				("(//ng-select[@formcontrolname='phoneCountryId'])[2]"), "+255");
 
		String[][] data1 = ExcelReader.getSheetData(FilePath, "Sheet2");
 
		String[] customer1 = data1[1];
 
		customerLocators.phonenumber.sendKeys(customer1[0]);
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
 
				"(//ng-select[@formcontrolname='whatsAppCountryId'])[2]", "+246");
 
		String[][] data2 = ExcelReader.getSheetData(FilePath, "Sheet2");
 
		String[] customer2 = data2[1];
 
		customerLocators.whatsappnumber.sendKeys(customer2[1]);
 
		HelperClass.waitForTableToLoad();
 
		customerLocators.primaryradiobutton.click();
 
		customerLocators.contactdetailscrossbutton.click();
 
		if (HelperClass.isElementPresentAndDisplayed(
 
				By.xpath("//table[@aria-describedby='Add Customer Table']/tbody/tr[2]"))) {
 
			Assert.fail("Element is removed");
 
		} else {
 
			Assert.assertTrue(true, "Element is still present");
 
		}
 
	}
 
public void Enteraddressdetails() {
		HelperClass.waitForTableToLoad();
		HelperClass.clickWithRetry(customerLocators.addressdetailsaddnewline, driver, wait);
		String actualText = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Address details table']/tbody/tr[2]")).trim();
		if (HelperClass.isElementPresent(By.xpath("//table[@aria-describedby='Address details table']/tbody/tr[2]"))) {
			Assert.assertTrue(true, "Address details line added successfully");
 
		} else {
			Assert.fail("Address details line not added: " + actualText);
 
		}
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				("(//ng-select[@formcontrolname='addressType'])[2]"), "Business");
		String[][] data = ExcelReader.getSheetData(FilePath, "Sheet2");
		String[] customer = data[1];
		customerLocators.address.sendKeys(customer[2]);
		customerLocators.city.sendKeys(customer[3]);
		customerLocators.county.sendKeys(customer[4]);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				("(//ng-select[normalize-space(@formcontrolname)='country'])[2]"), "United States");
		customerLocators.postcode.sendKeys(customer[5]);
		customerLocators.addressdetailscrossbutton.click();
		if (HelperClass.isElementPresentAndDisplayed(
				By.xpath("//table[@aria-describedby='Address details table']/tbody/tr[2]"))) {
			Assert.fail("Element is removed");
 
		} else {
			Assert.assertTrue(true, "Element is still present");
 
		}
 
	}
	public void addnewcustomercrossbutton() {
		HelperClass.safeClick(customerLocators.addnewcustomercrossbutton);
		String actualText = HelperClass.getText(By.xpath("(//span[normalize-space(text())='Add Customer'])[1]"));
		String expected = "Add Customer";
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Add Customer page verified");
 
		} else {
			Assert.fail("Not Matched: " + actualText);
 
		}
 
	}
 
	public void addnewcustomersearch() {
		HelperClass.safeClick(customerLocators.addnewcustomersearch);
		String actualText = HelperClass.getText(By.xpath("//mat-icon[text()='search']")).trim();
		String expected = "search";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Search box is displayed");
 
		} else {
			Assert.fail("Search box is not displayed" + actualText);
 
		}
		WebElement customername = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@aria-describedby='Side List Table']/tbody/tr[1]/td//a")));
		String customer = customername.getText().trim();
		String C = customer;
		System.out.println("c: " + customer);
		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		HelperClass.safeType(Search, customer);
		Search.sendKeys(Keys.ENTER);
		String actualText1 = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Side List Table']/tbody/tr[1]/td//a")).trim();
		String expected1 = customer;
 
		if (actualText1.equals(expected1)) {
			Assert.assertTrue(true, "Customer name verified");
 
		} else {
			Assert.fail("Customer name is not verified" + actualText1);
 
		}
		HelperClass.safeClick(customerLocators.searchcrossbutton);
		String actualText2 = HelperClass.getText(By.xpath("//input[normalize-space(@placeholder)='Search']")).trim();
		if (HelperClass.isElementPresentAndDisplayed(By.xpath("//input[normalize-space(@placeholder)='Search']"))) {
			Assert.assertTrue(true, "Customer name erased");
 
		} else {
			Assert.fail("Customer name is not erased: " + actualText2);
 
		}
 
	}
 
	public void customeraddbutton() {
 
		HelperClass.safeClick(By.xpath("//table[@aria-describedby='Side List Table']/tbody/tr[1]/td//a"));
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Edit Customer']"));
		String expected = "Edit Customer";
		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Edit Customer verified");
		} else {
			Assert.fail("Edit Customer not verified");
		}
		
		HelperClass.safeClick(customerLocators.customeraddbutton);
		String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
		String expected1 = "Add New Customer";
		if (actualtext1.equals(expected1)) {
 
			Assert.assertTrue(true, "Add New Customer verified");
 
		} else {
			Assert.fail("Add New Customer not verified" + actualtext1);
 
		}
	}
 
	public void Clickthecheckboxandverifyoptionsareenabling() throws InterruptedException {
		WebElement checkbox = driver.findElement(By.xpath(
				"//span[normalize-space()='Customers']/ancestor::div[contains(@class,'d-flex align-items-center')]//mat-checkbox"));
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
		System.out.println("ARCHIVE button verified");
	}
 
	public void Clickoncopybuttoninaddnewcustomer() {
		HelperClass.safeClick(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
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
 
	public void Clickondeleteyesbuttoninaddnewcustomer() {
		HelperClass.safeClick(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
		HelperClass.safeClick(By.xpath("(//button[normalize-space(@type)='button'])[2]"));
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
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.assertTrue(true, "The record has been deleted successfully.");
 
			} else {
				Assert.fail("Unable to delete, Customers are in use." + actualText1);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
 
	public void Clickondeletenobuttoninaddnewcustomer(){
		HelperClass.safeClick(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
		HelperClass.safeClick(By.xpath("(//button[normalize-space(@type)='button'])[2]"));
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
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
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
 
	public void exportinaddnewcustomer() {
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
	public void Clickonarchiveyesbuttoninaddnewcustomer() {
		HelperClass.safeClick(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
		HelperClass.safeClick(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Archive']")).trim();
		String expected = "Confirm Archive";
		try {
			if (actualText.equals(expected)) {
				Assert.assertTrue(true, "Confirm Archive verified");
 
			} else {
				Assert.fail("Confirm Archive not verified: " + actualText);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been archived successfully.']"))
				.trim();
		String expected1 = "The record has been archived successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.assertTrue(true, "The record has been archived successfully.");
 
			} else {
				Assert.fail("The record has been not archived." + actualText1);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Archived: " + e.getMessage());
		}
	}
 
	public void Clickonarchivenobuttoninaddnewcustomer(){
		HelperClass.safeClick(By.xpath("(//input[@type='checkbox'])[2]//parent::div"));
		HelperClass.safeClick(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Archive']")).trim();
		String expected = "Confirm Archive";
		try {
			if (actualText.equals(expected)) {
				Assert.assertTrue(true, "Confirm Archive verified");
 
			} else {
				Assert.fail("Confirm Archive should not display" + actualText);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been archived successfully.']"))
				.trim();
		String expected1 = "The record has been archived successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.fail("The record has been not archived." + actualText1);
 
			} else {
				Assert.assertTrue(true, "The record has been archived successfully.");
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Archived: " + e.getMessage());
		}
	}
	public void cross() {
		HelperClass.safeClick(customerLocators.cross);
		String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
		String expected1 = "Add New Customer";
		if (actualtext1.equals(expected1)) {
			Assert.assertTrue(true, "Add New Customer verified");
 
		} else {
			System.out.println("Add New Customer not verified");
			Assert.fail("Add New Customer not verified");
 
		}
	}
 
public void customername(){
		HelperClass.safeClick(customerLocators.customersearchbutton);
		String actualText = HelperClass.getText(By.xpath("//mat-icon[normalize-space(text())='search']")).trim();
		String expected = "search";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Search box is displayed");
 
		} else {
			Assert.fail("Search box is not displayed" + actualText);
 
		}
		WebElement customername = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@aria-describedby='Client List Table']/tbody/tr[1]/td[2]//span")));
		String customer = customername.getText().trim();
		String C = customer;
		System.out.println("c: " + customer);
		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		HelperClass.safeType(Search, customer);
		Search.sendKeys(Keys.ENTER);
		String actualText1 = HelperClass.getText(By.xpath("//table[@aria-describedby='Client List Table']/tbody/tr[1]/td[2]//span")).trim();
		String expected1 = customer;
 
		if (actualText1.equals(expected1)) {
			Assert.assertTrue(true, "Customer name verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText1);
 
		}
	}
	public void selectallstatusandvalidate(){
		HelperClass.waitUntilVisible(By.xpath("//span[normalize-space()='All Status']"));
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//span[normalize-space()='All Status']","Active");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//table/tbody/tr/td//span[normalize-space()='Active']","Active");
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),"//mat-select[@panelclass='myPanelClass']/div/div/div[contains(@class,'mat-mdc-select-arrow')]", "Archived");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(),"//table/tbody/tr/td//span[normalize-space()='Archived']", "Archived");
	}
	public void actionsexport() {
		HelperClass.waitForPageToLoad(driver);
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		HelperClass.safeClick(customerLocators.actions);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to Excel']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.safeClick(customerLocators.actions);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to CSV']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.safeClick(customerLocators.actions);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Export to PDF']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	}
	public void customercheckboxes() throws InterruptedException {
		WebElement checkbox = driver.findElement(By.xpath(
				"//table[@aria-describedby='Client List Table']//thead/tr/th[1]//mat-checkbox"));
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
		System.out.println("ARCHIVE button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[8]"))
				.isDisplayed());
		System.out.println("RESTORE button verified");
	}
 
	public void recordcancel() {
		HelperClass.safeClick(customerLocators.recordcancel);
		if (HelperClass.isElementPresentAndDisplayed(
				By.xpath("//mat-icon[normalize-space()='highlight_off']//parent::span"))) {
			Assert.fail("Element is removed");
 
		} else {
			Assert.assertTrue(true, "Element is still present");
 
		}
	}
	public void Clickonselecteditemscopybutton() {
		HelperClass.clickWithRetry(customerLocators.customercheckboxincustomer, driver, wait);
		HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[1]"));
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
 
	public void Clickonselecteditemsdeleteyesbutton(){
		HelperClass.clickWithRetry(customerLocators.customercheckboxincustomer, driver, wait);
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
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.assertTrue(true, "The record has been deleted successfully.");
 
			} else {
				Assert.fail("Unable to delete, Customers are in use." + actualText1);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
 
	public void Clickonselecteditemsdeletenobutton(){
		HelperClass.clickWithRetry(customerLocators.customercheckboxincustomer, driver, wait);
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
	public void exportinselecteditem() {
		HelperClass.waitForPageToLoad(driver);
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@aria-describedby='Client List Table']//thead/tr/th[1]//mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table[@aria-describedby='Client List Table']//thead/tr/th[1]//mat-checkbox"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Excel']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.safeClick(By.xpath("//table[@aria-describedby='Client List Table']//thead/tr/th[1]//mat-checkbox"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='CSV']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.safeClick(By.xpath("//table[@aria-describedby='Client List Table']//thead/tr/th[1]//mat-checkbox"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='PDF']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
	}
	public void selecteditemsarchiveyesbutton(){
		HelperClass.clickWithRetry(customerLocators.customercheckboxincustomer, driver, wait);
		HelperClass.safeClick(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space()='Confirm Archive']")).trim();
		String expected = "Confirm Archive";
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "'Confirm Archive' page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been archived successfully.']"))
				.trim();
		String expected1 = "The record has been archived successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.assertTrue(true, "The record has been archived successfully.");
 
			} else {
				Assert.fail("The record has been not archived." + actualText1);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying archived: " + e.getMessage());
		}
	}
 
public void selecteditemsarchivenobutton() {
		HelperClass.clickWithRetry(customerLocators.customercheckboxincustomer, driver, wait);
		HelperClass.safeClick(By.xpath("(//button[normalize-space(@type)='button'])[7]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space()='Confirm Archive']")).trim();
		String expected = "Confirm Archive";
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "'Confirm Archive' page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: ");
 
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been archived successfully.']"))
				.trim();
		String expected1 = "The record has been archived successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.fail("The record should not archived" + actualText1);
 
			} else {
				Assert.assertTrue(true, "The record has been archived successfully");
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying archived: " + e.getMessage());
		}
	}
	public void selecteditemsrestoreyesbutton(){
		HelperClass.clickWithRetry(customerLocators.customercheckboxincustomer, driver, wait);
		HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[8]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Restore']")).trim();
		String expected = "Confirm Restore";
		try {
			if (actualText.equals(expected)) {
				Assert.assertTrue(true, "Confirm Restore verified");
 
			} else {
				Assert.fail("Confirm Restore not verified: " + actualText);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Restore: " + e.getMessage());
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been restored successfully.']"))
				.trim();
		String expected1 = "The record has been restored successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.assertTrue(true, "The record has been restored successfully.");
 
			} else {
				Assert.fail("The record has been not restored." + actualText1);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Restore: " + e.getMessage());
		}
	}
 
	public void selecteditemsrestorenobutton(){
		HelperClass.clickWithRetry(customerLocators.customercheckboxincustomer, driver, wait);
		HelperClass.clickUsingJS(By.xpath("(//button[normalize-space(@type)='button'])[8]"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Restore']")).trim();
		String expected = "Confirm Restore";
		try {
			if (actualText.equals(expected)) {
				Assert.assertTrue(true, "Confirm Restore verified");
 
			} else {
				Assert.fail("Confirm Restore not verified: " + actualText);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Restore: " + e.getMessage());
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
		HelperClass.sleep1(3000);
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been restored successfully.']"))
				.trim();
		String expected1 = "The record has been restored successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.fail("The record should not restore" + actualText1);
 
			} else {
				Assert.assertTrue(true, "The record has been restored successfully");
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying restore: " + e.getMessage());
		}
	}
	public void selecteditemcrossbutton() {
		customerLocators.selecteditemcrosssbutton.click();
		if (HelperClass.isElementPresentAndDisplayed(
				By.xpath("//mat-icon[normalize-space()='highlight_off']//parent::span"))) {
			Assert.fail("Element is removed");
 
		} else {
			Assert.assertTrue(true, "Element is still present");
		}
	}
 
	public void addcustomerarrow() {
		HelperClass.safeClick(customerLocators.addcustomerarrow);
		String actualText = HelperClass.getText(By.xpath("//mat-icon[normalize-space()='keyboard_arrow_up']")).trim();
		String expected = "keyboard_arrow_up";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Arrow action verified");
 
		} else {
			Assert.fail("Arrow action not verified: " + actualText);
 
		}
	}
	public void mousehoveredit() {
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickWithRetry(customerLocators.mousehoveredit, driver, wait);
		By addressInput = By.xpath("//input[@formcontrolname='address']");
		HelperClass.safeClick(addressInput);
		HelperClass.safeSendKeys(addressInput, "Hyderabad");
		String actualText = driver.findElement(addressInput).getAttribute("value").trim();
		String expected = "Hyderabad";
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "edited successfully");
 
		} else {
			Assert.fail("Not edited: " + actualText);
 
		}
		HelperClass.safeClick(customerLocators.saveandexitbutton);
	}
	public void mousehoverdeleteyesbutton(){
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='delete_outline']/ancestor::button"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
		String expected = "Confirm Delete";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "'Confirm Delete' page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Yes']"));
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
 
		if (actualText1.equals(expected1)) {
			Assert.assertTrue(true, "The record has been deleted successfully");
 
		} else {
			Assert.fail("The record has not deleted" + actualText1);
 
		}
	}
 
	public void mousehoverdeletenobutton(){
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='delete_outline']/ancestor::button"));
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Delete']")).trim();
		String expected = "Confirm Delete";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "'Confirm Delete' page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='No']"));
		HelperClass.sleep1(2000);
		String actualText1 = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been deleted successfully.']")).trim();
		String expected1 = "The record has been deleted successfully.";
 
		if (actualText1.equals(expected1)) {
			Assert.fail("The record has not deleted" + actualText1);
 
		} else {
			Assert.assertTrue(true, "The record has been deleted successfully");
 
		}
	}
	public void mousehoverarchiveyesbutton() {
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickWithRetry(customerLocators.mousehoverarchive, driver, wait);
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Archive']")).trim();
		String expected = "Confirm Archive";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Confirm Archive page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		String actualText1 = HelperClass
				.getText(By.xpath("//div[normalize-space(text())='The record has been archived successfully.']"))
				.trim();
		String expected1 = "The record has been archived successfully.";
		try {
			if (actualText1.equals(expected1)) {
				Assert.assertTrue(true, "The record has been archived successfully.");
 
			} else {
				Assert.fail("The record has been not archived." + actualText1);
 
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Archived: " + e.getMessage());
		}
	}
 
	public void mousehoverarchivenobutton() {
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickWithRetry(customerLocators.mousehoverunarchive, driver, wait);
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Yes']//parent::button"));
		HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
		HelperClass.clickWithRetry(customerLocators.mousehoverarchive, driver, wait);
		String actualText = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Archive']")).trim();
		String expected = "Confirm Archive";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true, "Confirm Archive page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='No']//parent::button"));
		HelperClass.sleep1(2000);
		String actualText1 = HelperClass.getText(By.xpath("//h2[normalize-space(text())='Confirm Archive']")).trim();
		String expected1 = "Confirm Archive";
		try {
			if (HelperClass.isElementPresentAndDisplayed(By.xpath("//h2[normalize-space(text())='Confirm Archive']"))) {
				Assert.fail("Confirm Archive should not display" + actualText1);
 
			} else {
				Assert.assertTrue(true, "Confirm Archive should display");
			}
		} catch (Exception e) {
			System.out.println("An error occurred while verifying Confirm Archive: " + e.getMessage());
		}
	}
	public void ClickonPagiantionDropdownandValidteCount(){
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox"));
 
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox"));
 
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox"));
 
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/div/div/mat-checkbox"));
 
		String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
		String expected3 = "Records: 100";
 
		if (actualText3.equals(expected3)) {
			Assert.fail("Text not matched. Actual: " + actualText3);
		} else {
			Assert.assertTrue(true, "100 records are there");
		}
	}
 
	public void nextpageincustomer() {
		customerLocators.nextpageincustomer.click();
	}
 
	public void previouspageincustomer() {
		customerLocators.previouspageincustomer.click();
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
 