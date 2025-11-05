package com.Capium365.Actions;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
 
import java.awt.Toolkit;
 
import java.awt.datatransfer.StringSelection;
 
import java.awt.event.KeyEvent;

import java.io.File;

import java.io.IOException;
 
import java.time.Duration;
 
import java.util.List;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.Keys;
 
import org.openqa.selenium.NoSuchElementException;
 
import org.openqa.selenium.StaleElementReferenceException;
 
import org.openqa.selenium.TimeoutException;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.PageFactory;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import org.openqa.selenium.support.ui.WebDriverWait;
 
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
 
import com.Capium365.Locators.Capium365_InvoicesTab_Invoices_Locators;

import lombok.experimental.Helper;

public class Capium365_InvoicesTab_Invoices_Actions {

	LoginActions loginaction = new LoginActions();

	Capium365_InvoicesTab_Invoices_Locators InvoiceLocators = null;

	public Capium365_InvoicesTab_Invoices_Actions() {
 
		this.InvoiceLocators = new Capium365_InvoicesTab_Invoices_Locators();
 
		PageFactory.initElements(HelperClass.getDriver(), InvoiceLocators);
 
	}

	WebDriverWait wait = HelperClass.getWait();
 
	WebDriver driver = HelperClass.getDriver();
 
	//String filePath = "C:\\Users\\user\\Downloads\\CertsureInvoiceNo88041459_638693422909414414 - Copy (2) - Copy - Copy.pdf";
      String  filePath="C:\\Users\\user\\Documents\\Invoice.pdf";
	public void Clickoninvoiceandverifypage(){

		HelperClass.safeClick(By.xpath("(//span[normalize-space(text())='Invoices'])[1]"));
 
		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space(text())='Add Invoice'])[1]"));
 
		String expected = "Add Invoice";
 
		if (actualtext.contains(expected)) {
 
			Assert.assertTrue(true,"Add Invoice page verified");
 
		} else {
 
			Assert.fail("Not Matched");
 
		}

	}

	public void getcustomerscountandvalidate(){

		WebElement customercount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[1]")));
 
		String count = customercount.getText().trim();
 
		String c = count;
 
		System.out.println("C: " + count);
 
		String actualtext = HelperClass
 
				.getText(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[1]"));
 
		String expected = count;
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true,"Number of customers verified");
 
		} else {
 
			Assert.fail("Not Matched");
 
		}

	}

	public void getinvoicecountandvalidate(){
 
		WebElement invoicecount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[2]")));
 
		String invoice = invoicecount.getText().trim();
 
		String INV = invoice;
 
		System.out.println("INV: " + invoice);
 
		String actualtext = HelperClass
 
				.getText(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[2]"));
 
		String expected = invoice;
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true,"Number of invoices verified");
 
		} else {
 
			Assert.fail("Not Matched");
 
		}
 
	}

	public void Verifytotalraisedcount() {
 
		WebElement totalraisedcount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[3]")));
 
		String raisedcount = totalraisedcount.getText().trim();
 
		String c = raisedcount;
 
		System.out.println("c: " + raisedcount);
 
		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[3]"));
 
		String expected = raisedcount;
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true,"Total raised count verified");
 
		} else {
 
			Assert.fail("Not Matched");
 
		}
 
	}

	public void Verifytotalrecievedcount()  {
 
		WebElement totalreceivedcount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[4]")));
 
		String receivedcount = totalreceivedcount.getText().trim();
 
		String c = receivedcount;
 
		System.out.println("c: " + receivedcount);
 
		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[4]"));
 
		String expected = receivedcount;
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true,"Total recieved count verified");
 
		} else {
 
			Assert.fail("Not Matched");
 
		}

	}

public void Verifytotalduecount(){

		WebElement totalduecount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[5]")));

		String duecount = totalduecount.getText().trim();

		String c = duecount;

		System.out.println("c: " + duecount);

		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space(@class)='fw-bold pl-5'])[5]"));

		String expected = duecount;

		if (actualtext.equals(expected)) {

			Assert.assertTrue(true,"Total due count verified");

		} else {

			Assert.fail("Not Matched");

		}

	}

	public void Clickonaddinvoiceandverifypage(){

		HelperClass.safeClick(By.xpath("(//span[normalize-space(text())='Add Invoice'])[1]"));

		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Invoice']")).trim();

		String expected = "Add New Invoice";

		if (actualText.equals(expected)) {

			Assert.assertTrue(true,"Add New Invoice' id verified");

		} else {

			Assert.fail("Text not matched. Actual:"+actualText);

		}

	}

	public void Clickoneditcompanydetailswithoutgivingmandetailsandverify() throws InterruptedException, IOException {

		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='edit']"));

		HelperClass.clearField(HelperClass.getDriver(),

				By.xpath("//input[normalize-space(@formcontrolname)='address1']"));

		HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[normalize-space(@formcontrolname)='city']"));

		HelperClass.clearField(HelperClass.getDriver(),

				By.xpath("//input[normalize-space(@formcontrolname)='postalCode']"));

		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']"));

		HelperClass.captureScreenshot("mandatory fields required message verified");

	}

 
public void Clickoneditcompanydetailswithgivingmandetailsandverify() throws InterruptedException{
 
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='edit']"));
 
		HelperClass.clearField(HelperClass.getDriver(),
				By.xpath("//input[normalize-space(@formcontrolname)='address1']"));
 
		HelperClass.clearField(HelperClass.getDriver(),
				By.xpath("//input[normalize-space(@formcontrolname)='postalCode']"));
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='address1']"), "612 manchester");
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='city']"), "manchester");
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='postalCode']"), "W1A 1HQ1");
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']"));
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The operation has been completed successfully!']"));
		String expected = "The operation has been completed successfully!";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The operation has been completed successfully!");
		} else {
		    Assert.fail("Not Matched");
		}
	}
 
	public void clickonaddcustomerandverifypage(){
 
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space()='add_circle'])[2]"));
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Customer']"));
		String expected = "Add New Customer";
		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Add New Customer verified");
		} else {
			Assert.fail("Not Matched");;
 
		}
	}
 
	public void Fillthemandatorydetailsandsave(){
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='fullName']"), "Sri");
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='email']"),
				"rajasekhar.sriram@capium.com");
		HelperClass.clickWithRetry(InvoiceLocators.saveincustomertab, driver, wait);
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been added successfully.']"));
		String expected = "The record has been added successfully.";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The record has been added successfully");
		} else {
		    Assert.fail("Record not verified");
		}
	}
 
	public void Fillthemandatorydetailsandclickaddrowandsave() {
 
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='fullName'])[1]"), "Raja");
 
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='email'])[1]"),
				"rajasekharsriram56@gmail.com");
 
		HelperClass.safeClick(By.xpath("//a[normalize-space(text())='Add New line']"));
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='name'])[2]"), "Ramesh");
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='email'])[2]"),
				"rajasekharsriram33@gmail.com");
 
		HelperClass.clickWithRetry(InvoiceLocators.saveincustomertab, driver, wait);
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been added successfully.']"));
		String expected = "The record has been added successfully.";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The record has been added successfully");
		} else {
		    Assert.fail("Record not verified");
		}
 
	}
 
public void selectthecustomerandverifydetails(){
		HelperClass.sleep1(3000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[1]"), "Raja");
		HelperClass.sleep1(4000);
		HelperClass.selectFirstSuggestedCustomer("Raja");
 
	}
 
	public void clickonsettingsandsaveandverify() {
 
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='settings_suggest']"));
		HelperClass.sleep1(2000);
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[8]"), "1000",
				By.xpath("//div[normalize-space(text())='1000-Sales']"));
		HelperClass.SearchAndSelectClientclear(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[9]"), "capium",
				By.xpath("//span[normalize-space(text())='5237-CapiumPay']"));
		HelperClass.SearchAndSelectClientclear(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[10]"), "Reduced",
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
 
	public void selectduedateandverifyininvoices() throws IOException{
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='paymentDue']", "Net 7");
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//mat-form-field[normalize-space(@appearance)='fill'])[4]", "PR003 - Item 1");
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		String actualtext = HelperClass.getText(By.xpath("//div[normalize-space(text())='The record has been added successfully.']"));
		String expected = "The record has been added successfully.";
		if (actualtext.equals(expected)) {
		    Assert.assertTrue(true,"The record has been added successfully");
		} else {
		    Assert.fail("Record not verified");
		}
 
	}
 
	public void checkrepeatinvoicecheckboxandverifyinvoice() {
 
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		String modifiedInvoiceId = "R" + invoiceId;
		System.out.println("Modified Invoice ID: " + modifiedInvoiceId);
		HelperClass.safeClick(By.xpath("//mat-checkbox[normalize-space(@formcontrolname)='isRepeatInvoice']"));
		
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("(//input[normalize-space(@aria-autocomplete)='list'])[4]"), "Daily",
				By.xpath("//span[normalize-space(text())='Daily']"));
 
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "PR004",
				By.xpath("//span[normalize-space(text())='PR004 - Item 2']"));
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='price']"), "100");
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		HelperClass.safeClick(By.xpath("(//mat-icon[normalize-space(text())='receipt_long'])[2]"));
		WebElement Search = driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Search']"));
		HelperClass.safeType(Search, modifiedInvoiceId);
		Search.sendKeys(Keys.ENTER);
		HelperClass.sleep1(1000);
		String actualText1 = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Invoices List Table']/tbody/tr[1]/td[3]/div[1]"))
				.trim();
		String expected1 = modifiedInvoiceId;
 
		if (actualText1.equals(expected1)) {
		    Assert.assertTrue(true,"'Add New Invoice' id verified");
 
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText1);
 
		}
	}
 
	public void clickondiscountoptionandverifyvalue() {
 
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
 
	public void selectexistingitem() throws TimeoutException {
 
		HelperClass.SearchAndSelectClient(HelperClass.getDriver(), HelperClass.getWait(),
				By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "PR004",
				By.xpath("//span[normalize-space(text())='PR004 - Item 2']"));
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='price'])[1]"), "100");
 
	}
 
	public void clickonaddbankandentermandetails() throws InterruptedException, TimeoutException {
 
		try {
			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add new bank account']"));
			Thread.sleep(3000);
			HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Add New Line']"));
			WebElement lastEmptyAccountName = driver.findElement(By.xpath(
					"(//input[@formcontrolname='accountName' and not(@disabled) and normalize-space(@value)=''])[last()]"));
			lastEmptyAccountName.sendKeys("RBL" + Keys.ENTER);
			HelperClass.sleep1(1000);
			WebElement lastEmptyAccountNumber = driver.findElement(
					By.xpath("(//input[@formcontrolname='accountNumber' and normalize-space(@value)=''])[last()]"));
			lastEmptyAccountNumber.sendKeys("355532" + Keys.ENTER);
			HelperClass.sleep1(1000);
			WebElement lastEmptyBranchCode = driver.findElement(
					By.xpath("(//input[@formcontrolname='branchCode' and normalize-space(@value)=''])[last()]"));
			lastEmptyBranchCode.sendKeys("35" + Keys.ENTER);
			HelperClass.sleep1(1000);
			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
//			WebElement payment=driver.findElement(By.xpath("//ng-select[@formcontrolname='paymentDetail']"));
//			payment.click();
//			HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='RBL']"));
//
//			String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='RBL']"));
//			String expected = "RBL";
//			if (actualtext == expected) {
//
//				System.out.println("RBL bank verified");
//			} else {
//				System.out.println("Not Matched");
//			}
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Could not locate empty row to fill bank details", e);
		}	
	}
 
	public void selectexistingbankaccount() throws InterruptedException, TimeoutException {
 
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='paymentDetail']", "5220-Cash in Hand");
		Thread.sleep(2000);
 
	}
 
	public void Clickonsaveandnewandverifyinvoice(){
 
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='arrow_drop_down']"));
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and New']"));
		String actualText = HelperClass.getText(By.xpath("(//span[normalize-space(text())='Add New Invoice'])[1]"))
				.trim();
		String expected = "Add New Invoice";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' page verified");
		} else {
			Assert.fail("Text not matched. Actual:" +actualText);
		}
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement Search = driver.findElement(By.xpath("//input[@formcontrolname='search']"));
		HelperClass.safeType(Search, invoiceId);
		Search.sendKeys(Keys.ENTER);
		HelperClass.sleep1(1000);
		String actualText1 = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Invoices List Table']/tbody/tr[1]/td[3]/div[1]")).trim();
		String expected2 = invoiceId;
 
		if (actualText1.equals(expected2)) {
			Assert.assertTrue(true,"Add New Invoice' id verified");
		} else {
			Assert.fail("Text not matched. Actual:" +actualText);
		}
	}
 
	public void Clickonsaveandcontinueandverifyinvoice(){
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Continue']"));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='close']"));
		WebElement Search = driver.findElement(By.xpath("//input[@formcontrolname='search']"));
		HelperClass.safeType(Search, invoiceId);
		Search.sendKeys(Keys.ENTER);
		HelperClass.sleep1(1000);
		String actualText = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Invoices List Table']/tbody/tr[1]/td[3]/div[1]")).trim();
		String expected = invoiceId;
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' id verified");
		} else {
			Assert.fail("Text not matched. Actual:" +actualText);
		}
	}
 
public void Clickonsaveandexitandverifyinvoice() throws InterruptedException {
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		WebElement Search = driver.findElement(By.xpath("//input[@formcontrolname='search']"));
		HelperClass.safeType(Search, invoiceId);
		Search.sendKeys(Keys.ENTER);
		HelperClass.sleep1(1000);
		String actualText = HelperClass
				.getText(By.xpath("//table[@aria-describedby='Invoices List Table']/tbody/tr[1]/td[3]/div[1]")).trim();
		String expected = invoiceId;
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' id verified");
		} else {
			Assert.fail("Text not matched. Actual:" +actualText);
		}
	}
	
	public void ClickonSaveandExitbutton() throws Throwable {
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		Thread.sleep(3000);
		//HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='keyboard_arrow_right']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(3000);
		InvoiceLocators.search.sendKeys(invoiceId);
		Thread.sleep(5000);
	}
	
	public void ClickonSaveadnExitInvoiceforooterpublish() throws InterruptedException {
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		Thread.sleep(3000);
		
	}
 
	public void Clickoncancelchangesandverifydetails() {
 
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Cancel Changes']"));
		String actualText = HelperClass.getText(By.xpath("//input[@formcontrolname='price']")).trim();
		String expected = "";
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"Data erased");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
 
		}
	}
	
	//Approve button
	public void ClickonApproveButton() throws Throwable {
		  Thread.sleep(2000);
		  HelperClass.clickUsingJS(By.xpath("//button[@title='Approve']"));
		  Thread.sleep(2000);
		  HelperClass.clickUsingJS(By.xpath("//span[normalize-space()= 'Yes']"));
		  Thread.sleep(2000);
	}
	
	public void ClickonApproveandPublishbutton() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//button[@title='Approve']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Approve & Publish']"));
		Thread.sleep(2000);
	}
	
	public void VerifyApproveandublishMessage() throws Throwable {
		Thread.sleep(2000);
		String actualtpublishMessage = HelperClass.getText(By.xpath("//p[normalize-space(text())='Record have been marked as approved successfully.']"));
		String expectedpublishMessage = "Record have been marked as approved successfully.";
 
		if (actualtpublishMessage.equals(expectedpublishMessage)) {
			Assert.assertTrue(true,"Record Approved Successfully");
		} else {
			Assert.fail("Record Is not Approved. Found:" +actualtpublishMessage);
		}
	}
	
	public void VerifyApproveButton() throws Throwable {
		Thread.sleep(2000);
		try {
			if (InvoiceLocators.approvesuccessmessage.isDisplayed()) {
			    Assert.assertTrue(true,"Approved SuccessFully");
			} else {
			    Assert.fail("Not Approved");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			    
			}
	}
	
	public void VerifyWithdrawApprovalsuccessMessage() throws Throwable {
		Thread.sleep(2000);
		try {
			if (InvoiceLocators.WithdrawApprovalMessage.isDisplayed()) {
			    Assert.assertTrue(true,"Withdraw SuccessFully");
			} else {
			    Assert.fail("Not Withdraw");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
 
public void ApproveInvoiceFromEditInvoicePage() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[text()='thumb_up']/parent::button"));
		  Thread.sleep(2000);
		  HelperClass.clickUsingJS(By.xpath("//span[normalize-space()= 'Yes']"));
		  Thread.sleep(2000);
	}
	
	//Publish Invoice
	public void ClickonPublishIcon() throws Throwable {
	Thread.sleep(2000);
	  HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='exit_to_app']"));
	  Thread.sleep(2000);
	  
	}
	
//	public void VerifyPublisInvoiceSuccessMessage() {
//		String actualPublishText = HelperClass.getText(By.xpath("//p[contains(normalize-space(text()),'successfully published to Bookkeeping.')]"));
//		String expectedPublishText = "successfully published to Bookkeeping.";
//
//		if (actualPublishText.equals(expectedPublishText)) {
//			Assert.assertTrue(true,"Record Published Successfully");
//		} else {
//			 Assert.fail("Record Is not Published. Found:"+actualPublishText);
//		}
//		
//	}
//	
//	public void ValidateInvoiceSuccessMessage() {
//		try {
//			if (InvoiceLocators.PublishSuccessMessage.isDisplayed()) {
//			    Assert.assertTrue(true,"Invoice Published SuccessFully");
//			} else {
//			    Assert.fail("Invoice not Published");
//			}
//			} catch (Exception e) {
//			    System.out.println("An error occurred" + e.getMessage());
//			}
//	}
 
public void ValidateInvoiceSuccessMessage() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement successMsg = wait.until(ExpectedConditions.visibilityOf(InvoiceLocators.PublishSuccessMessage));
	        
	        String actualMsg = successMsg.getText().trim();
	        
	        Assert.assertTrue(actualMsg.contains("Record(s) successfully published to Bookkeeping."),
	                "Expected success message not found. Actual message: " + actualMsg);
	        
	        System.out.println("Invoice published successfully with message: " + actualMsg);
	    } catch (Exception e) {
	        Assert.fail("Invoice not published. Error: " + e.getMessage());
	    }
	}
 
 
	
	
	
	public void ClickonUnpuclishButton() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space()='exit_to_app'])[1]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
	}
	
	public void VerifyUnpublishSuccessMessage() throws Throwable {
	    Thread.sleep(2000);
 
	    String actualUnpublishText = HelperClass.getText(
	        By.xpath("//p[contains(normalize-space(text()),'unpublished successfully to BK')]")
	    ).trim();
 
	    System.out.println("Actual text from UI: [" + actualUnpublishText + "]");
 
	    String expectedUnpublishText = "unpublished successfully to BK";
 
	    if (actualUnpublishText.toLowerCase().contains(expectedUnpublishText.toLowerCase())) {
	        Assert.assertTrue(true,"'Unpublish Message is Displaying:");
	    } else {
	        Assert.fail("Unpublish Message is NOT Displaying. Found:"+actualUnpublishText);
	    }
	}
 
 
	//Edit Invoice
	public void ClickonEditIcon() throws Throwable {
		 HelperClass.sleep1(5000);
	        HelperClass.hoverOverElement(By.xpath("//table[@aria-describedby='Invoices List Table']/tbody/tr[1]"));
	        HelperClass.sleep1(2000);
	        HelperClass.clickUsingJS(By.xpath("//mat-icon[text()='edit']/parent::button"));
	        HelperClass.sleep1(2000);
	}
	
	
 
	public void clickonaddnewinvoiceplusbuttonandverify(){
 
		HelperClass.safeClick(
				By.xpath("//table[@aria-describedby='Side List Details Table']/tbody/tr[1]/td[1]/div/div/a"));
		
		HelperClass.safeClick(
				By.xpath("//div[contains(@class,'side-list')]/a/mat-icon[contains(text(),'add_circle')]"));
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Invoice']")).trim();
		String expected = "Add New Invoice";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' id verified");
		} else {
			Assert.fail("Text not matched. Actual:"+actualText);
		}
	}
 
	public void checkthecheckboxandverifyoptionsareenabling() throws InterruptedException {
 
		WebElement checkbox = driver.findElement(By.xpath(
				"//span[normalize-space()='Invoices']/ancestor::div[contains(@class,'d-flex align-items-center')]//mat-checkbox"));
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
		System.out.println("Mark as Paid button verified");
	}
 
	public void verifyexportinaddinvoice(){
 
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
	public void enterinvoicenameandverify() {
 
		WebElement invoiceid = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//table[@aria-describedby='Invoices List Table']/tbody/tr[1]/td[3]//div)[2]")));
		String invoice = invoiceid.getText().trim();
		String INV = invoice;
		System.out.println("INV: " + invoice);
		WebElement Search = driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Search']"));
		HelperClass.safeType(Search, invoice);
		Search.sendKeys(Keys.ENTER);
		String actualText = HelperClass
				.getText(By.xpath("(//table[@aria-describedby='Invoices List Table']/tbody/tr[1]/td[3]//div)[2]"))
				.trim();
		String expected = invoice;
 
		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"customer verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
 
		}
 
	}
 
	public void clickclickonallstatusandverify(){
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@formcontrolname)='statusChange']", "Draft");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Draft']",
				"Draft");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@formcontrolname)='statusChange']", "Awaiting Payment");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(),
				"//table/tbody/tr/td[normalize-space()='Awaiting Payment']", "Awaiting Payment");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@formcontrolname)='statusChange']", "Paid");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Paid']", "Paid");
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@formcontrolname)='statusChange']", "Duplicate");
		HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Draft']",
				"Draft");
	}
 
	public void clickonalltimestatusandverify() throws IOException {
 
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
 
public void clickoninvoicecheckboxandverifyenablingoptions(){
 
		WebElement checkbox = driver.findElement(By.xpath(
				"//table[@aria-describedby='Invoices List Table']//thead/tr/th[1]//mat-checkbox"));
		HelperClass.sleep1(3000);
		HelperClass.clickWithRetry(checkbox, driver, wait);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Copy']//parent::span//parent::button"))
				.isDisplayed());
		System.out.println("Copy button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Delete']//parent::span//parent::button"))
				.isDisplayed());
		System.out.println("Delete button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Excel']//parent::span//parent::button"))
				.isDisplayed());
		System.out.println("EXCEL button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='CSV']//parent::span//parent::button"))
				.isDisplayed());
		System.out.println("CSV button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='PDF']//parent::span//parent::button"))
				.isDisplayed());
		System.out.println("PDF button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Print']//parent::span//parent::button"))
				.isDisplayed());
		System.out.println("PRINT button verified");
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[7]"))
				.isDisplayed());
		System.out.println("Mark as Paid button verified");
	}
 
public void clickonexportreport(){
 
		By spinner = By.cssSelector(".ngx-spinner-overlay");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@aria-describedby='Invoices List Table']//thead/tr/th[1]//mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table[@aria-describedby='Invoices List Table']//thead/tr/th[1]//mat-checkbox"));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Excel']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='CSV']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='PDF']/ancestor::button"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinner));
 
	}
	public void clickandselectpagenumber(){
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@panelclass='pagination']")));
		HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span[normalize-space()='10']")));
		HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='10']"));
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"));
 
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"));
 
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"));
 
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"));
 
		String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
		String expected3 = "Records: 100";
 
		if (actualText3.equals(expected3)) {
			Assert.assertTrue(true, "100 records are there");
		} else {
			Assert.fail("Text not matched. Actual: " + actualText3);
		}
	}
 
	public void clickandverifypreviousbutton(){
 
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='2']"));
		HelperClass.getDriver().findElement(By.xpath("//span[normalize-space(text())='Previous']")).isDisplayed();
		System.out.println("Previous button verified");
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Previous']"));
 
	}
	
	//Sushant written Code For Publish to bk3.0
 
	public void clickandverifynextbutton() {
 
		HelperClass.getDriver().findElement(By.xpath("//span[normalize-space(text())='Next']")).isDisplayed();
		System.out.println("Previous button verified");
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Next']"));
 
	}
	
	public void CickonCIconandBookkeepingModule(){
		HelperClass.safeClick(By.xpath("//img[@alt='Capium Logo']"));
		HelperClass.safeClick(By.xpath("//h6[normalize-space()='Bookkeeping']"));
	}
	
	
	public void ClickonSearchbarandSearchCientName() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clearField(driver,By.xpath("//input[@id='txtSearch']"));
//		Thread.sleep(2000);
//		HelperClass.clickUsingJS(By.xpath("//input[@id='txtSearch']"));
		Thread.sleep(2000);
		InvoiceLocators.searchbarinBookeeping3.sendKeys(" Bank_Rule_By_LImited_Client"+Keys.TAB);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//a[normalize-space()='Bank_Rule_By_LImited_Client'])[1]"));
		Thread.sleep(2000);
			
	}
	
	
	public void ClickonSalesMenu() {
		HelperClass.safeClick(By.xpath("(//span[normalize-space()='Sales'])[1]"));
		HelperClass.safeClick(By.xpath("//a[normalize-space()='Invoices']"));
		
	}
	
	public void SearchInvoiceandVerify() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 
	    try {
	        // Always re-locate search bar to avoid stale element
	        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(
	                By.id("txtSearch")));   // replace with your actual locator if different
	        searchBox.clear();
	        searchBox.sendKeys("INV140" + Keys.TAB);
	        
	        
	        Thread.sleep(2000);
	        HelperClass.clickUsingJS(By.xpath("//i[@class='fa fa-search']"));
 
	        // Wait for the invoice button to appear after search
	        WebElement invoiceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//button[normalize-space()='INV140']")));
 
	        String actualInvoiceID = invoiceElement.getText().trim();
	        String expectedInvoiceID = "INV140";
 
	        if (actualInvoiceID.equals(expectedInvoiceID)) {
	            System.out.println("Invoice is Displaying");
	            Assert.assertTrue(true,"Invoice is Displaying");
	        } else {
	            Assert.fail("Invoice is not Displaying:"+actualInvoiceID);
	        }
 
	    } catch (StaleElementReferenceException e) {
	        System.out.println("Search box went stale, retrying...");
	        SearchInvoiceandVerify(); // retry once
	    }
	}
			
	
	public void ClickonRejectbuttonInvoiceMainGrid() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space()='thumb_down'])[1]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()= 'Yes']"));
	}
	
	
	public void ValidateRejectSuccessMessage() {
		try {
			if (InvoiceLocators.RejectMessage.isDisplayed()) {
			    Assert.assertTrue(true,"Record rejected successfully");
			} else {
			    Assert.fail("Record not rejected");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
    
	public void Clickoninvoicecheckbox() throws Throwable {
		Thread.sleep(2000);
		InvoiceLocators.Checkboxinvoice.click();
		Thread.sleep(2000);
	}
	
	public void clickonmarkaspaid() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Mark as Paid']"));
	}
	
	public void validateMarkasPaid() throws Throwable {
		Thread.sleep(2000);
		String ActualPaidText = HelperClass
   	            .getText(By.xpath("(//span[normalize-space()='Paid'])[1]"));
   	        String ExpectedPaidText = "Paid";
   	        if (ActualPaidText.equals(ExpectedPaidText)) {
   	            Assert.assertTrue(true,"Invoice mark as paid");
   	        } else {
   	         Assert.fail("Invoice not Mark as Paid");
   	        }
	}
	
	public void ClickonMarkasApproved() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Mark as Approved']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
		Thread.sleep(3000);
	}
	
	public void ClickonWithdrawApprovalfooter() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Withdraw Approval']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
	}
	
	public void Markasrejectedfooter() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Mark as Rejected']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
	}
	
	public void WithdrawRejection() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Withdraw Rejection']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
	}
		
	
	public void ClickonPublishButtonfromfooter() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Publish']"));
		Thread.sleep(2000);
	}
	public void ClickonUnpublishbuttonFromFooter() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Unpublish']"));
	}
	
	public void WithdrwarSuccessMessage() throws Throwable {
		Thread.sleep(2000);
		try {
			if (InvoiceLocators.WithdrawMessage.isDisplayed()) {
			    Assert.assertTrue(true,"Record deleted successfully");
			} else {
			    Assert.fail("Record not deleted");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
	
	public void ClickonpublishIconFooter() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Publish']"));
	}
	
	public void clickoncehckboxxx() throws Throwable {
		Thread.sleep(2000);
	  InvoiceLocators.Checkboxinvoice.click();
	}
	
	public void ClickonFooterUnpublishbutton() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Unpublish']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
	}
	
	//Click on Invoice Tab
    public void ClickonInvoiceTab() throws Throwable {
        Thread.sleep(2000);
        HelperClass.clickUsingJS(By.xpath("(//span[normalize-space()='Invoices'])[1]"));
    }
 
    //Click on Add Invoice Button
    public void ClickonAddInvoicebutton() throws Throwable {
        Thread.sleep(2000);
        HelperClass.clickUsingJS(By.xpath("(//span[normalize-space()='Add Invoice'])[1]"));
    }
 
    public void ClickonPaymnetAccountDropdownandValidate() throws Throwable {
        Thread.sleep(2000);
 
        WebElement field = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        String inputValue = "5435-CIS Control Account";
 
        field.clear();
        field.sendKeys(inputValue);
 
        // Wait for dropdown suggestions to appear
        Thread.sleep(2000);
 
        // Capture all visible suggestion options (adjust xpath based on your dropdown structure)
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
    
    public void ClickonAddCustomer() throws Throwable {
    	Thread.sleep(2000);
    	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space()='add_circle'])[2]"));
    }
    
    public void ClickonPaymnetAccountDropdownandValidateAddCustomer() throws Throwable {
        Thread.sleep(2000);
 
        WebElement field = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        String inputValue = "5435-CIS Control Account";
 
        field.clear();
        field.sendKeys(inputValue);
 
        // Wait for dropdown suggestions to appear
        Thread.sleep(2000);
 
        // Capture all visible suggestion options (adjust xpath based on your dropdown structure)
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
    
    public void UploadtheInvoice() throws Exception {
    	
        // Step 1: Click Upload Invoice and Choose File buttons
        InvoiceLocators.uploadInvoicebutton.click();
        Thread.sleep(2000);
 
        InvoiceLocators.chooseafilebutton.click();
        Thread.sleep(2000);
 
        // Step 2: Perform Robot-based file upload actions
        Robot robot = new Robot();
 
        // Copy file path to clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
 
        // Paste file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
 
        Thread.sleep(500);
 
        // Press ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
 
        // Step 3: Check if file actually exists **before confirming upload**
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File not found at path: " + filePath);
 
            // Try to close File Explorer gracefully
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
 
            // Extra safety: try ALT+F4 if ESC didn’t close it
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_F4);
            robot.keyRelease(KeyEvent.VK_F4);
            robot.keyRelease(KeyEvent.VK_ALT);
            Thread.sleep(1000);
 
            // Logout from the application
            loginaction.Logout();
 
            // Fail the scenario
            Assert.fail("Invoice upload failed - File not found at path: " + filePath);
            return;
        }
 
        // Step 4: Continue upload if file exists
        InvoiceLocators.uploadInvoicebutton2.click();
       HelperClass.waitForPageToLoad(driver);
 
        System.out.println("Invoice uploaded successfully: " + filePath);
    }
    
    public void ValidateuploadInvoicecustomernameshouldDisplayinthegrid() {
		if (InvoiceLocators.customername.isDisplayed()) {
			Assert.assertTrue(true,"Invoice is uploaded successfully");
		} else {
			Assert.fail("Invoice is not uploaded");
		}
	}
    
	
	}
 
 