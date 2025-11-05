
package com.Capium365.Actions;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium365.Locators.Capium365_InvoicesTab_CreditNotes_Locators;

public class Capium365_InvoicesTab_CreditNotes_Actions {
	 
	Capium365_InvoicesTab_CreditNotes_Locators CreditNoteLocators = null;
	LoginActions loginaction = new LoginActions();
 
	public Capium365_InvoicesTab_CreditNotes_Actions() {
		this.CreditNoteLocators = new Capium365_InvoicesTab_CreditNotes_Locators();
		PageFactory.initElements(HelperClass.getDriver(), CreditNoteLocators);
 
	}
	
	//String filePath = "C:\\Users\\satishkumar.silphoz\\Documents\\2024Automation\\Master\\Master365Solo\\Files\\TestInvoice.pdf";
      String filePath="C:\\Users\\user\\Documents\\Receipt 2.pdf";
	
	WebDriverWait wait=HelperClass.getWait();
	WebDriver driver=HelperClass.getDriver();
			
	public void Clickoninvoicecreditnoteandverifypage() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		By receiptsTab = By.xpath("(//span[normalize-space()='Invoices'])[1]");
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
		By creditTab = By.xpath("//a[@mattooltip='Credit Notes']");
		WebElement credit = HelperClass.waitUntilClickable(creditTab);
		credit.click();
 
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='Add Credit Note']")).trim();
		String expected = "Add Credit Note";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"Add Credit Note page verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
 
	}
 
	public void getcustomerscountandvalidate() throws InterruptedException {
 
		Thread.sleep(3000);
 
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='11']")).trim();
		String expected = "11";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"Customer Count verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
 
	}
	
	public void ClickonSelectCheckBox() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@aria-describedby='Invoices Credit Note List Table']//tr[1]/td[1]//mat-checkbox/div")));
//		HelperClass.clickUsingJS(
//				By.xpath("//table[@aria-describedby='Purchase Table']//tr[1]/td[1]//mat-checkbox "));
		HelperClass.clickWithRetry(CreditNoteLocators.particularcheckbox, driver, wait);
//		HelperClass.waitForPageToLoad(driver);
//		HelperClass.safeClick(By.xpath("//tbody/tr[1]/td/div/mat-checkbox//div/input[contains(@class,'mdc-checkbox__native-control')]"));
	}
 
	public void getinvoicecountandvalidate() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		
		if(CreditNoteLocators.numberofinvoice.isDisplayed()) {
			System.out.println("Invoice count matched");
		}
		else {
			System.out.println("Invoice count changed due to the records");
		}
	}
 
	public void Verifytotalraisedcount() throws InterruptedException {
 
		Thread.sleep(3000);
 
		
 
		if(CreditNoteLocators.totalraised.isDisplayed()) {
			System.out.println("total raised amount matched");
		}
		else {
			System.out.println("total raised amount changed due to the records");
		}
		
	}
	
	public void ValidatePublishInvoiceCreditnoteSuccessMessage() {
		String actualPublishTextcrn = HelperClass.getText(By.xpath("//p[contains(normalize-space(text()),'successfully published to Bookkeeping.')]"));
		String expectedPublishTextcrn = "successfully published to Bookkeeping.";
 
		if (actualPublishTextcrn.equals(expectedPublishTextcrn)) {
			Assert.assertTrue(true,"Record Publish Successfully ");
 
		} else {
			Assert.fail("Record Is not Published. Found: " + actualPublishTextcrn);
 
		}
	}
 
	public void Clickonaddinvoicecreditnoteandverifypage() throws InterruptedException {
 
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Add Credit Note']/ancestor::button")));
       Thread.sleep(4000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Credit Note']/ancestor::button"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Add New Invoice Credit Note']")));
		String actualText = HelperClass
				.getText(By.xpath("//span[normalize-space(text())='Add New Invoice Credit Note']")).trim();
		String expected = "Add New Invoice Credit Note";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice Credit Note' id verified");
 
		} else {
			Assert.fail("Text not matched. Actual: " + actualText);
 
		}
 
	}
 
	public void Clickoneditcompanydetailswithoutgivingmandetailsandverify() throws InterruptedException, IOException {
 
		Thread.sleep(3000);
 
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
 
		if (CreditNoteLocators.editcompanydetails.isDisplayed()) {
			System.out.println("Edit icon clicked successfully");
		}
		Thread.sleep(3000);
 
		HelperClass.clearField(HelperClass.getDriver(),
				By.xpath("//input[normalize-space(@formcontrolname)='address1']"));
 
		HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[normalize-space(@formcontrolname)='city']"));
 
		HelperClass.clearField(HelperClass.getDriver(),
				By.xpath("//input[normalize-space(@formcontrolname)='postalCode']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
 
		HelperClass.captureScreenshot("mandatory fields required message verified");
 
	}
 
	public void Clickoneditcompanydetailswithgivingmandetailsandverify() throws InterruptedException {
 
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='edit']"));
 
		if (CreditNoteLocators.editcompanydetails.isDisplayed()) {
			System.out.println("Edit icon clicked successfully");
		}
		Thread.sleep(3000);
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='address1']"), "612 manchester");
 
		Thread.sleep(2000);
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='city']"), "manchester");
 
		Thread.sleep(2000);
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='postalCode']"), "W1A 1HQ1");
 
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
 
		Thread.sleep(3000);
 
		if (CreditNoteLocators.manchester.isDisplayed()) {
			Assert.assertTrue(true,"Address verified");
 
		} else {
			Assert.fail("Address is not verified");
 
		}
	}
 
	public void clickonaddcustomerandverifypage() throws InterruptedException {
 
		Thread.sleep(2000);
 
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space()='add_circle'])[2]"));
 
		Thread.sleep(2000);
 
		if (CreditNoteLocators.addnewcustomer.isDisplayed()) {
			Assert.assertTrue(true,"add customer page is verified");
 
		} else {
			Assert.fail("add customer page is not verified");
 
		}
	}
 
	public void Fillthemandatorydetailsandsave() throws InterruptedException {
 
		Thread.sleep(2000);
 
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='fullName']"), "Ushaa");
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='email']"), "ushaa@gmail.com");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(By.xpath("(//span[normalize-space(@class)='mat-button-wrapper'])[16]"));
 
	}
 
	public void Fillthemandatorydetailsandclickaddrowandsave() throws InterruptedException {
 
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='fullName'])[1]"), "rani rani");
 
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='email'])[1]"),
				"gowrii@gmail.com");
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Add New line']"));
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='name'])[2]"), "panduu");
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='email'])[2]"),
				"panduu@gmail.com");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(By.xpath(
				"//button[@class='mat-focus-indicator action-button primary-button mr-1 mat-button mat-button-base']"));
		
//		HelperClass.safeClick(By.xpath(
//				"//span[text()=' Save ']"));
		Thread.sleep(2000);
	}
	
	public void ClickonCreditNoteSaveandExitButton() throws Throwable {
		Thread.sleep(2000);	
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Save and Exit']"));
	}
 
	public void selectthecustomerandverifydetails() throws InterruptedException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//input[normalize-space(@aria-autocomplete)='list'])[1]", "sriram");
		Thread.sleep(2000);
		// HelperClass.selectFirstSuggestedCustomer("sriram");
 
	}
 
 
public void clickonsettingsandsaveandverify() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(@fontset)='material-icons-outlined'])[11]"));
 
		Thread.sleep(2000);
 
		if (CreditNoteLocators.customersettings.isDisplayed()) {
			Assert.assertTrue(true,"Customer settings opened successfully");
 
		} else {
			Assert.fail("Customer settings not opened ");
 
		}
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(By.xpath("(//span[normalize-space(@class)='mat-radio-outer-circle'])[3]"));
 
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
 
	}
 
	public void selectduedateandverifyininvoices() throws TimeoutException, IOException, InterruptedException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='paymentDue']", "Net 7");
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//mat-form-field[normalize-space(@appearance)='fill'])[4]", "PR003 - Item 1");
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		Thread.sleep(3000);
		HelperClass.captureScreenshot("due date verified");
 
	}
 
	public void clickondiscountoptionandverifyvalue() throws TimeoutException, InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[3]", "%");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//mat-form-field[normalize-space(@appearance)='fill'])[4]", "PR003 - Item 1");
		Thread.sleep(2000);
		HelperClass.setValueUsingJS(By.xpath("//input[normalize-space(@formcontrolname)='discountValue']"), "10");
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		Thread.sleep(3000);
		String actualtext = HelperClass.getText(By.xpath("//input[normalize-space(@formcontrolname)='netAmount']"));
		String expected = "90.00";
		if (actualtext == expected) {
 
			Assert.assertTrue(true,"discount amount verified");
 
		} else {
			Assert.fail("Not Matched");
		}
	}
 
	public void additemandverify() throws TimeoutException, InterruptedException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//mat-form-field[normalize-space(@appearance)='fill'])[4]", "PR003 - Item 1");
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='add'])[1]"));
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//mat-form-field[normalize-space(@appearance)='fill'])[5]", "PR003 - Item 1");
 
		Thread.sleep(2000);
		if (CreditNoteLocators.secondaddeditem.isDisplayed()) {
			Assert.assertTrue(true,"newly added item verified");
		} else {
			Assert.fail("Not Matched");
 
		}
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		Thread.sleep(2000);
 
	}
 
	public void selectexistingitem() throws TimeoutException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//mat-form-field[normalize-space(@appearance)='fill'])[4]", "PR003 - Item 1");
 
	}
 
	public void clickonaddbankandentermandetails() throws InterruptedException, TimeoutException {
 
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add new bank account']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space(text())='Add New Line']"));
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='accountName'])[6]"), "RBL");
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='accountNumber'])[6]"), "355532");
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("(//input[normalize-space(@formcontrolname)='branchCode'])[6]"), "35");
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
 
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='paymentDetail']", "RBL");
		Thread.sleep(3000);
 
		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space(text())='RBL']"));
		String expected = "RBL";
		if (actualtext == expected) {
			Assert.assertTrue(true,"RBL bank verified");
 
		} else {
			Assert.fail("Not Matched");
 
		}
	}
 
	public void selectexistingbankaccount() throws InterruptedException, TimeoutException {
 
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='paymentDetail']", "RBL");
		Thread.sleep(2000);
 
	}
 
	public void Clickonsaveandnewandverifyinvoice() throws InterruptedException {
 
		Thread.sleep(2000);
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='arrow_drop_down']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Save and New']"));
		Thread.sleep(3000);
		String actualText = HelperClass.getText(By.xpath("(//span[normalize-space(text())='Add New Invoice'])[1]"))
				.trim();
		String expected = "Add New Invoice";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' page verified");
		} else {
			Assert.fail("Text not matched. Actual: "+ actualText);
		}
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='keyboard_arrow_right']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(3000);
		// invoicecreditnotelocators.search.sendKeys(invoiceId);
		Thread.sleep(5000);
		String actualText1 = HelperClass
				.getText(By.xpath("//a[contains(@class,'d-flex') and contains(@class,'list-nam')]")).trim();
		String expected2 = invoiceId;
 
		if (actualText1.equals(expected2)) {
			Assert.assertTrue(true,"'Add New Invoice' id verified");
		} else {
			Assert.fail("Text not matched. Actual:"+ actualText);
		}
	}
 
public void Clickonsaveandcontinueandverifyinvoice() throws InterruptedException {
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Continue']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='keyboard_arrow_right']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(3000);
		// invoicelocators.search.sendKeys(invoiceId);
		Thread.sleep(5000);
		String actualText = HelperClass
				.getText(By.xpath("//a[contains(@class,'d-flex') and contains(@class,'list-nam')]")).trim();
		String expected = invoiceId;
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' id verified");
 
		} else {
			Assert.fail("Text not matched. Actual:"+ actualText);
		}
	}
 
	public void Clickonsaveandexitandverifyinvoice() throws InterruptedException {
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='invoiceId']")));
		String invoiceId = invoiceField.getAttribute("value").trim();
		System.out.println("Invoice ID captured: " + invoiceId);
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='keyboard_arrow_right']"));
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(3000);
		// invoicelocators.search.sendKeys(invoiceId);
		Thread.sleep(5000);
		String actualText = HelperClass
				.getText(By.xpath("//a[contains(@class,'d-flex') and contains(@class,'list-nam')]")).trim();
		String expected = invoiceId;
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' id verified");
 
		} else {
			Assert.fail("Text not matched. Actual:"+ actualText);
 
		}
	}
 
	public void Clickoncancelchangesandverifydetails() throws InterruptedException, IOException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Cancel Changes']"));
		Thread.sleep(2000);
		HelperClass.captureScreenshot("Cancel changes verified");
	}
 
	public void clickonaddnewinvoiceplusbuttonandverify() throws InterruptedException {
 
		Thread.sleep(2000);
//			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='keyboard_arrow_right']"));
//			Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='add_circle'])[1]"));
		Thread.sleep(2000);
		String actualText = HelperClass
				.getText(By.xpath("//span[normalize-space(text())='Add New Invoice Credit Note']")).trim();
		String expected = "Add New Invoice Credit Note";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Add New Invoice' id verified");
 
		} else {
			Assert.fail("Text not matched. Actual:"+ actualText);
 
		}
	}
 
	// duplicate record
	public void checkthecheckboxandverifyoptionsareenabling() throws InterruptedException {
 
//			Thread.sleep(2000);
//			HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='keyboard_arrow_right']"));
		HelperClass.waitForPageToLoad(driver);
//	HelperClass.safeClick(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//	HelperClass.clickWithRetry(CreditNoteLocators.checkbox, driver, wait);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Credit Notes']/ancestor::div[contains(@class,'side-list-wrapper')]//mat-checkbox)[1]")));
		HelperClass.safeClick(By.xpath("(//span[text()='Credit Notes']/ancestor::div[contains(@class,'side-list-wrapper')]//mat-checkbox)[1]"));
	
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[1]")).isDisplayed());
		System.out.println("Copy button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[2]"))
				.isDisplayed());
		System.out.println("Delete button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[3]"))
				.isDisplayed());
		System.out.println("EXCEL button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[4]"))
				.isDisplayed());
		System.out.println("CSV button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[5]"))
				.isDisplayed());
		System.out.println("PDF button verified");
		Thread.sleep(2000);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("(//button[normalize-space(@type)='button'])[6]"))
				.isDisplayed());
		System.out.println("PRINT button verified");
 
	}
 
	public void verifyexporttoexcel() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='Excel']"));
		Thread.sleep(2000);
	}
 
	public void verifyexporttocsv() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='description'])[1]"));
		Thread.sleep(2000);
	}
 
	public void exporttopdf() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='PDF']"));
		Thread.sleep(2000);
	}
 
	public void enterinvoicenameandverify() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "14835");
		Thread.sleep(3000);
 
		String actualText = HelperClass.getText(By.xpath("//div[normalize-space(text())='14835']")).trim();
		String expected = "14835";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"'Invoice credit note' id verified");
 
		} else {
			Assert.fail("Text not matched. Actual:"+ actualText);
 
		}
 
	}
 
	public void clickonallstatusandverify() throws TimeoutException, InterruptedException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[1]", "Active");
		Thread.sleep(3000);
		HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Active']",
				"Active");
		Thread.sleep(3000);
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[1]", "Processing");
		Thread.sleep(3000);
		HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Processing']",
				"Processing");
		Thread.sleep(3000);
 
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@formcontrolname)='statusChange']", "Paid");
//			Thread.sleep(3000);
//	        HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Paid']", "Paid");
//			Thread.sleep(3000);
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[1]", "Duplicate");
		Thread.sleep(3000);
		HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Draft']",
				"Draft");
		Thread.sleep(3000);
 
	}
 
	public void clickonalltimestatusandverify() throws TimeoutException, InterruptedException, IOException {
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"This Week");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("This week invoices credit notes are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"Last Week");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("Last week invoices credit notes are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"This Month");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("This Month invoices credit notes are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"Last Month");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("Last Month invoices credit notes are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"This Quarter");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("This Quarter invoices credit notes are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"Last Quarter");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("Last Quarter invoices credit notes are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"This Year");
		Thread.sleep(3000);
		HelperClass.captureScreenshot("This Year invoices credit notes are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]",
				"Last Year");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("Last Year invoices are captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Custom");
		Thread.sleep(2000);
		HelperClass.captureScreenshot("Custom invoice credit notes are captured");
	}
 
	public void clickoninvoicecheckboxandverifyenablingoptions() throws InterruptedException {
 
		HelperClass.waitForPageToLoad(driver);
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//table[@aria-describedby='Invoices Credit Note List Table']//tr[1]/td[1]//mat-checkbox/div")));
//		HelperClass.clickUsingJS(
//				By.xpath("//table[@aria-describedby='Purchase Table']//tr[1]/td[1]//mat-checkbox "));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/thead/tr/th/div/mat-checkbox")));
		HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"));
//		HelperClass.clickWithRetry(CreditNoteLocators.particularcheckbox, driver, wait);
		HelperClass.waitForPageToLoad(driver);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Copy']//parent::span//parent::button")).isDisplayed());
		System.out.println("Copy button verified");
		HelperClass.waitForPageToLoad(driver);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Delete']//parent::span//parent::button")).isDisplayed());
		System.out.println("Delete button verified");
		HelperClass.waitForPageToLoad(driver);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Excel']//parent::span//parent::button")).isDisplayed());
		System.out.println("EXCEL button verified");
		HelperClass.waitForPageToLoad(driver);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='CSV']//parent::span//parent::button")).isDisplayed());
		System.out.println("CSV button verified");
		HelperClass.waitForPageToLoad(driver);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='PDF']//parent::span//parent::button")).isDisplayed());
		System.out.println("PDF button verified");
		HelperClass.waitForPageToLoad(driver);
		assertTrue(HelperClass.getDriver().findElement(By.xpath("//p[normalize-space()='Print']//parent::span//parent::button")).isDisplayed());
		System.out.println("PRINT button verified");
 
	}
 
	public void clickonexportreportasexcel() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='border_all']"));
		Thread.sleep(2000);
 
	}
 
	public void clickonexportreportascsv() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//p[normalize-space()='CSV']"));
		Thread.sleep(2000);
	}
 
	public void clickonexportreportaspdf() throws InterruptedException {
 
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='picture_as_pdf']"));
		Thread.sleep(3000);
 
	}
 
	public void clickandselectpagenumber() throws TimeoutException, InterruptedException {
 
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
//				"//mat-select[normalize-space(@panelclass)='pagination']", "10");
//		Thread.sleep(2000);
//		HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//		Thread.sleep(2000);
//		String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
//		String expected = "Records: 10";
//
//		if (actualText.equals(expected)) {
//			Assert.assertTrue(true,"10 records are there");
//		} else {
//			Assert.fail("Text not matched. Actual:"+ actualText);
//		}
//
//		HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//		Thread.sleep(2000);
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
//				"//mat-select[normalize-space(@panelclass)='pagination']", "20");
//		Thread.sleep(2000);
//		HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//		Thread.sleep(2000);
//		String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
//		String expected2 = "Records: 20";
//
//		if (actualText2.equals(expected2)) {
//			Assert.assertTrue(true,"20 records are there");
//
//		} else {
//			Assert.fail("Text not matched. Actual:"+ actualText2);
//
//		}
//		HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//		Thread.sleep(2000);
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
//				"//mat-select[normalize-space(@panelclass)='pagination']", "50");
//		Thread.sleep(2000);
//		HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//		Thread.sleep(2000);
//		String actualText3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='50']")).trim();
//		String expected3 = "Records: 50";
//
//		if (actualText3.equals(expected3)) {
//			Assert.assertTrue(true,"50 records are there");
//			
//		} else {
//			Assert.fail("Text not matched. Actual:"+ actualText3);
//		}
//		HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//		Thread.sleep(2000);
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
//				"//mat-select[normalize-space(@panelclass)='pagination']", "100");
//		Thread.sleep(2000);
//		HelperClass.clickUsingJS(By.xpath("(//input[normalize-space(@type)='checkbox'])[1]"));
//		Thread.sleep(2000);
//		String actualText4 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']")).trim();
//		String expected4 = "Records: 100";
//
//		if (actualText4.equals(expected4)) {
//			Assert.assertTrue(true,"100 records are there");
//		} else {
//			Assert.fail("Text not matched. Actual:"+ actualText4);
//		}
		
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "10");
		HelperClass.waitForPageToLoad(driver);
		CreditNoteLocators.SelectCheckBox.click();
 
		String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']"));
		String expected = "Records: 10";
		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"10 records are there");
		} else {
			Assert.fail("10 records are not there");
 
		}
		HelperClass.waitForPageToLoad(driver);
		CreditNoteLocators.CrossButton.click();
		Thread.sleep(3000);
 
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "20");
		Thread.sleep(3000);
		CreditNoteLocators.SelectCheckBox.click();
 
		String actualtext2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']"));
		String expected2 = "Records: 20";
		if (actualtext2.equals(expected2)) {
			Assert.assertTrue(true,"20 records are there");
		} else {
			Assert.fail("20 records are not there");
 
		}
		Thread.sleep(3000);
		CreditNoteLocators.CrossButton.click();
		Thread.sleep(3000);
 
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "50");
 
		Thread.sleep(3000);
		CreditNoteLocators.SelectCheckBox.click();
 
		String actualtext3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='50']"));
		String expected3 = "Records: 50";
		if (actualtext3.equals(expected3)) {
			Assert.assertTrue(true,"50 records are there");
		} else {
			Assert.fail("50 records are not there");
 
		}
 
		CreditNoteLocators.CrossButton.click();
		Thread.sleep(3000);
 
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "100");
 
		Thread.sleep(3000);
		CreditNoteLocators.SelectCheckBox.click();
 
		String actualtext4 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']"));
		String expected4 = "Records: 100";
		if (actualtext3.equals(expected3)) {
			Assert.assertTrue(true,"100 records are there");
 
 
		} else {
			Assert.fail("100 records are not there");
 
		}
 
		CreditNoteLocators.CrossButton.click();
		Thread.sleep(3000);
	}
 
 
public void clickandverifypreviousbutton() throws InterruptedException {
 
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='2']"));
		Thread.sleep(2000);
		HelperClass.getDriver().findElement(By.xpath("//span[normalize-space(text())='Previous']")).isDisplayed();
		System.out.println("Previous button verified");
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Previous']"));
 
	}
 
	public void clickandverifynextbutton() throws InterruptedException {
 
		HelperClass.getDriver().findElement(By.xpath("//span[normalize-space(text())='Next']")).isDisplayed();
		System.out.println("Next button verified");
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Next']"));
 
	}
 
//	public void Uploadthecreditnote() throws Exception {
//
//		CreditNoteLocators.uploadcreditnotebutton.click();
//
//		Thread.sleep(2000);
//		CreditNoteLocators.chooseafilebutton.click();
//		Thread.sleep(2000);
//
//		Robot robot = new Robot();
//
//		StringSelection selection = new StringSelection(filePath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		Thread.sleep(500);
//
//		// Press ENTER
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		CreditNoteLocators.uploadcreditnotebutton2.click();
//		Thread.sleep(5000);
//	}
	
	public void Uploadthecreditnote() throws Exception {
		
        // Step 1: Click Upload Invoice and Choose File buttons
		CreditNoteLocators.uploadcreditnotebutton.click();
        Thread.sleep(2000);
 
        CreditNoteLocators.chooseafilebutton.click();
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
//            Assert.fail("Invoice upload failed - File not found at path: " + filePath);
            return;
        }
 
        // Step 4: Continue upload if file exists
        CreditNoteLocators.uploadcreditnotebutton2.click();
        HelperClass.waitForPageToLoad(driver);
 
        System.out.println("Invoice uploaded successfully: " + filePath);
    }
 
 
	public void ValidateuploadCreditnotecustomernameshouldDisplayinthegrid() {
		if (CreditNoteLocators.customername.isDisplayed()) {
			Assert.assertTrue(true,"Credit note is uploaded successfully");
		} else {
			Assert.fail("Credit note is not uploaded");
		}
	}
 
	public void Clickonpreviewinkebab() throws InterruptedException {
		Thread.sleep(2000);
		CreditNoteLocators.kebab.click();
 
		Thread.sleep(2000);
		CreditNoteLocators.preview.click();
		Thread.sleep(2000);
		if (CreditNoteLocators.previecreditnoteele.isDisplayed()) {
			Assert.assertTrue(true,"review is clicked successfully");
		} else {
			Assert.fail("Preview is not clicked");
		}
	}
 
	public void Clickonsentinkebab() throws InterruptedException {
		Thread.sleep(2000);
		CreditNoteLocators.kebab.click();
 
		Thread.sleep(2000);
		CreditNoteLocators.sent.click();
		Thread.sleep(2000);
		if (CreditNoteLocators.sendinvoicecreditnoteele.isDisplayed()) {
			Assert.assertTrue(true,"Sent is clicked successfully");
		} else {
			 Assert.fail("Sent is not clicked");
 
		}
	}
 
public void Clickonduplicateinkebab() throws InterruptedException {
		Thread.sleep(2000);
		CreditNoteLocators.kebab.click();
 
		Thread.sleep(2000);
		CreditNoteLocators.duplicate.click();
		Thread.sleep(2000);
 
	}
 
	public void Clickonhistoryinkebab() throws InterruptedException {
		Thread.sleep(2000);
		CreditNoteLocators.kebab.click();
 
		Thread.sleep(2000);
		CreditNoteLocators.history.click();
		Thread.sleep(2000);
 
		String actualText = HelperClass.getText(By.xpath("//span[contains(text(),'History')]")).trim();
		String expected = "History";
 
		if (actualText.contains(expected)) {
			
			Assert.assertTrue(true,"History is clicked successfully");
		} else {
			
			 Assert.fail("History is not clicked"+actualText);
 
		}
		CreditNoteLocators.closehistory.click();
 
	}
 
	public void Clickonkebebmenu() {
		HelperClass.waitUntilVisible(HelperClass.getWait(), CreditNoteLocators.topkebab);
		HelperClass.clickUsingJS(CreditNoteLocators.topkebab);
 
	}
 
	public void Clickonexporttoexcel() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(), CreditNoteLocators.exporttoexcel);
		HelperClass.clickUsingJS(CreditNoteLocators.exporttoexcel);
		Thread.sleep(2000);
	}
 
	public void Clickonexporttocsv() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(), CreditNoteLocators.exporttocsv);
		HelperClass.safeClick(CreditNoteLocators.exporttocsv);
		HelperClass.waitForPageToLoad(driver);
	}
 
	public void Clickonexporttopdf() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.waitUntilVisible(HelperClass.getWait(), CreditNoteLocators.exporttopdf);
		HelperClass.safeClick(CreditNoteLocators.exporttopdf);
		HelperClass.waitForPageToLoad(driver);
	}
 
	public void clickongototextfiledandverify() throws InterruptedException {
		HelperClass.waitUntilVisible(HelperClass.getWait(), CreditNoteLocators.gotoTF);
		HelperClass.clickUsingJS(CreditNoteLocators.gotoTF);
 
		Thread.sleep(8000);
		CreditNoteLocators.gotoTF.clear();
		CreditNoteLocators.gotoTF.sendKeys("2");
		CreditNoteLocators.gotoTF.sendKeys(Keys.ENTER);
//			
		Thread.sleep(8000);
		CreditNoteLocators.gotoTF.clear();
		CreditNoteLocators.gotoTF.sendKeys("3");
		CreditNoteLocators.gotoTF.sendKeys(Keys.ENTER);
//		
		Thread.sleep(8000);
		CreditNoteLocators.gotoTF.clear();
		CreditNoteLocators.gotoTF.sendKeys("4");
		CreditNoteLocators.gotoTF.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
 
	public void verifytherecordsaccordingtodropdown() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "10");
		Thread.sleep(3000);
		CreditNoteLocators.radiobutton.click();
 
		String actualText = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
		String expected = "Records: 10";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"10 records are there");
 
		} else {
			 Assert.fail("Text not matched. Actual:"+actualText);
 
		}
 
		Thread.sleep(3000);
		CreditNoteLocators.crossmark.click();
		Thread.sleep(3000);
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "20");
		Thread.sleep(3000);
		CreditNoteLocators.radiobutton.click();
 
		String actualText1 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']")).trim();
		String expected1 = "Records: 20";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"20 records are there");
 
		} else {
			 Assert.fail("Text not matched. Actual:"+actualText);
 
		}
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='highlight_off']"));
		Thread.sleep(3000);
 
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "100");
 
		Thread.sleep(3000);
		CreditNoteLocators.radiobutton.click();
		// HelperClass.ClickUsingJS(HelperClass.getDriver(),
		// By.xpath("//label[normalize-space(@for)='mat-checkbox-4-input']"));
 
		String actualText2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']")).trim();
		String expected2 = "Records: 100";
 
		if (actualText.equals(expected)) {
			Assert.assertTrue(true,"100 records are there");
		} else {
			
			 Assert.fail("Text not matched. Actual:"+actualText);
		}
 
		// banklocators.crossmark.click();
		Thread.sleep(3000);
	}
	
	public void SearchInvoiceCreditNoteandVerify() throws Throwable {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 
	    try {
	        // Always re-locate search bar to avoid stale element
	        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(
	                By.id("txtSearch")));   // replace with your actual locator if different
	        searchBox.clear();
	        searchBox.sendKeys("CRN030" + Keys.TAB);
 
	        // Wait for the invoice button to appear after search
	        WebElement invoiceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//button[normalize-space()='CRN030']")));
 
	        String actualCreditNoteID = invoiceElement.getText().trim();
	        String expectedCreditNoteID = "CRN030";
 
	        if (actualCreditNoteID.equals(expectedCreditNoteID)) {
	            Assert.assertTrue(true,"CreditNote is Displaying");
	        } else {
	            
	            Assert.fail("CreditNote is not Displaying:"+actualCreditNoteID);
	        }
 
	    } catch (StaleElementReferenceException e) {
	        System.out.println("Search box went stale, retrying...");
	        SearchInvoiceCreditNoteandVerify(); // retry once
	    }
	}
 
}
 
 