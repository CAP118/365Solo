package com.Capium365.Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium365.Locators.Capium365_InvoicesTab_Products_Locators;
import com.Capium365.StepDefination.Hooks;

public class Capium365_InvoicesTab_Products_Actions {

	Capium365_InvoicesTab_Products_Locators productlocators=null;
	
	public Capium365_InvoicesTab_Products_Actions() {
		this.productlocators=new Capium365_InvoicesTab_Products_Locators();
		PageFactory.initElements(HelperClass.getDriver(), productlocators);
	}
	
	WebDriverWait wait=HelperClass.getWait();
	WebDriver driver =HelperClass.getDriver();
	
	public void Clickoninvoiceandsidebar() throws InterruptedException {
		
        HelperClass.clickUsingJS(By.xpath("(//span[normalize-space(text())='Invoices'])[1]"));
        Thread.sleep(2000);
		 HelperClass.clickUsingJS(By.xpath("//div[normalize-space(@class)='toggle-menu']"));
		
	}
	public void clickonproductsandverifyproductspage() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		 HelperClass.safeClick(By.xpath("//a[normalize-space(@mattooltip)='Products']"));
	 	 HelperClass.waitForPageToLoad(driver);
	 	String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add Product']")).trim();
		String expected = "Add Product";

		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"'Add Product' id verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);

		}
	}
	public void clickonaddproductandverifypage() throws InterruptedException {
		 HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Add Product']"));
	 	 HelperClass.waitForPageToLoad(driver);
	 	String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Product']")).trim();
		String expected = "Add New Product";

		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"'Add new Product' id verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);

		}
	}
	public void verifysavebuttonisdisplayingornotbeforeenteringmandetails() throws InterruptedException, IOException{
		
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "raja");
	
     HelperClass.waitForPageToLoad(driver);
		
		HelperClass.clearField(HelperClass.getDriver(), By.xpath("//input[normalize-space(@formcontrolname)='itemName']"));
		
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']"));
		
		HelperClass.captureScreenshot("mandatory fields required message verified");
	}
	public void entermandatorydetailsandsaveandverify() throws InterruptedException {
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "Bat");
//		Thread.sleep(3000);
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='salesUnitPrice']"), "1000");
//		Thread.sleep(3000);
		HelperClass.safeSendKeys(By.xpath("//textarea[normalize-space(@formcontrolname)='salesDescription']"), "SG Bat");
//		Thread.sleep(2000);
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='itemName']")));
       String ProductId = invoiceField.getAttribute("value").trim();
       System.out.println("Invoice ID captured: " + ProductId);
//       Thread.sleep(2000);
//		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save']"));
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Save']"));
//	 Thread.sleep(2000);
//	 HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='search']"));
	 HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='search']"));
//	 Thread.sleep(3000);
	  productlocators.search.sendKeys(ProductId);
	 Thread.sleep(5000);
     String actualText = HelperClass.getText(By.xpath("//a[normalize-space(text())='Bat']")).trim();
     String expected = ProductId;

if (actualText.equals(expected)) {
   Assert.assertTrue(true,"'Add New product' name verified");
} else {
   Assert.fail("Text not matched. Actual: "+ actualText);

}
		
	}
	
	public void entermandatorydetailsandsaveexitandverify() throws InterruptedException {
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='itemName']"), "Ball");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='salesUnitPrice']")));
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='salesUnitPrice']"), "1000");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@formcontrolname='salesDescription']")));
		HelperClass.safeSendKeys(By.xpath("//textarea[@formcontrolname='salesDescription']"), "Stiched");
		WebElement invoiceField = HelperClass.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[normalize-space(@formcontrolname)='itemName']")));
       String ProductId = invoiceField.getAttribute("value").trim();
       System.out.println("Invoice ID captured: " + ProductId);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Save and Exit']")));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Save and Exit']"));
	HelperClass.waitForPageToLoad(driver);
	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
//	productlocators.search.sendKeys(ProductId);
//	Thread.sleep(5000);
//String actualText = HelperClass.getText(By.xpath("//input[@placeholder='Search']")).trim();
//String expected = ProductId;
//
//if (actualText.equals(expected)) {
//   System.out.println("'Add New product' name verified");
//} else {
//   System.out.println("Text not matched. Actual: " + actualText);
//}
	}
	
	public void entermandatorydetailsandsavecancelandverify() throws InterruptedException {
		
		
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@formcontrolname)='itemName']"), "Stumps");
		Thread.sleep(3000);
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='salesUnitPrice']"), "1000");
		Thread.sleep(3000);
		HelperClass.safeSendKeys(By.xpath("//textarea[@formcontrolname='salesDescription']"), "SG");
		Thread.sleep(2000);
		HelperClass.safeClick(By.xpath("//span[normalize-space(text())='Cancel Changes']"));
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "cancel changes captured");
		
	}
	public void clickonplusbuttonandverifypage() throws InterruptedException {
		
		 HelperClass.clickUsingJS(By.xpath("//span[normalize-space(text())='Add Product']"));
	 	 Thread.sleep(2000);
	 	HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='add_circle']"));
	 	 Thread.sleep(2000);
	 	String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Product']")).trim();
		String expected = "Add New Product";

		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"'Add Product' page verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);
		}	
	}
	
	public void clickonsearchenterproductnameandverify() throws InterruptedException {
		
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='search']"));
		Thread.sleep(2000);
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "Ball");
		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("//a[normalize-space(text())='Balll']")).trim();
		String expected = "Balll";

		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"'search Product' verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);

		}	
		
	}
	public void enterproductnameandverify() throws InterruptedException {
		
		HelperClass.safeSendKeys(By.xpath("//input[normalize-space(@placeholder)='Search']"), "Ball");
		HelperClass.waitForPageToLoad(driver);
		String actualText = HelperClass.getText(By.xpath("//span[normalize-space(text())='Balll']")).trim();
		String expected = "Balll";

		if (actualText.equals(expected)) {
		    Assert.assertTrue(true,"'search Product' verified");
		} else {
		    Assert.fail("Text not matched. Actual: "+ actualText);

		}	
	}
	public void clickondropdownandverifystatus() throws TimeoutException, InterruptedException {
		
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='myPanelClass']", "Active");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.verifyClientTypes(HelperClass.getDriver(), "//span[text()=' Active ']", "Active");
		
	}
	public void clickondropdownandverifyalltimestatus() throws TimeoutException, InterruptedException {
		
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Week");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "this week status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Week");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "last week status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Month");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "This month status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Month");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Last month status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Quarter");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "This quarter status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Quarter");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Last quarter status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Year");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "This year status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "Last Year");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Last year status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "Custom");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Customer status captured");
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@panelclass)='myPanelClass']", "This Financial Year");
		Thread.sleep(2000);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "this financial year status captured");	
	}
	public void clickonexcelanddownload() throws InterruptedException {
		
		
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='border_all']"));
		
	}
	public void clickoncsvanddownload() throws InterruptedException {
		
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space(text())='description'])[2]"));
		
	}
	public void clickonpdfanddownload() throws InterruptedException {
		
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='more_vert']"));
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space(text())='picture_as_pdf']"));
		
	}
	public void verifyeditmouseoverforparticularproduct() {
			WebElement element = driver.findElement(
					By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']"));
			HelperClass.hoverOverElement(element);

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']")));
			HelperClass.clickWithRetry(productlocators.EditProduct, driver, wait);
	}
	
	
	public void verifydeletemouseoverforparticularproduct() {
		HelperClass.waitForPageToLoad(driver);
		WebElement element = driver.findElement(
				By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']")));
		HelperClass.clickWithRetry(productlocators.DeleteProduct, driver, wait);
		
		
	}
	
	public void ClikonDeleteYesButton() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(By.xpath("//span[normalize-space()='Yes']"));
	}
	
	public void verifyarchivemouseoverforparticularproduct() {
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element = driver.findElement(
				By.xpath("//tr[1]//td//mat-icon[normalize-space()='archive']"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='archive']")));
		HelperClass.clickWithRetry(productlocators.Archivebutton, driver, wait);
		
	}
	
	public void CLickonArchiveYesbuttonandVerify() {
		HelperClass.safeClick(By.xpath("//span[normalize-space()='Yes']"));
	}
}
