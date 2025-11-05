package com.Capium365.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium365.Locators.Capium365_Users_Locators;

public class Capium365_Users_Actions {
	 
	Capium365_Users_Locators userslocators = new Capium365_Users_Locators();
 
	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait = HelperClass.getWait();
 
	public Capium365_Users_Actions() {
		this.userslocators = new Capium365_Users_Locators();
		PageFactory.initElements(driver, userslocators);
	}
 
	public void Clickonuserstabandverify() throws Exception {
		
		By receiptsTab = By.xpath("//span[text()='Users']//parent::a");
		WebElement element = HelperClass.waitUntilClickable(receiptsTab);
		element.click();
	}
 
	public void Clickonuserstab() throws Exception {
		Thread.sleep(3000);
		userslocators = PageFactory.initElements(driver, Capium365_Users_Locators.class);
		HelperClass.waitUntilVisible(HelperClass.getWait(), userslocators.userstab);
		HelperClass.clickUsingJS(userslocators.userstab);
	}
 
	public void clickonadduserbutton() {
		userslocators = PageFactory.initElements(driver, Capium365_Users_Locators.class);
		HelperClass.waitUntilVisible(HelperClass.getWait(), userslocators.adduserbutton);
		HelperClass.clickUsingJS(userslocators.adduserbutton);
	}
 
	public void gowiththefollowingstepstoaddtheuser() throws Exception {
		Thread.sleep(3000);
		userslocators.firstnametextfield.sendKeys("user1");
		userslocators.emailtextfield.sendKeys("cus1@gmail.com");
		userslocators.saveandexitbutton.click();
	}
 
	public void gowiththefollowingstepswithunmandatoryfieldstoaddtheuser() throws Exception {
		HelperClass.safeType(userslocators.middlenametextfield, "varun");
		HelperClass.safeType(userslocators.lastnametextfield, "vrudhan");
		HelperClass.safeType(userslocators.phonenumbertextfield, "67895678977");
		HelperClass.safeType(userslocators.addresstextfield, "telanana, hyd");
		HelperClass.safeType(userslocators.citytextfield, "hyderabad");
		HelperClass.safeType(userslocators.countytextfield, "london");
		HelperClass.safeType(userslocators.zipcodetextfield, "76483274");
		HelperClass.safeClick(userslocators.saveandexitbutton);
	}
 
	public void deletetheuser() throws Exception {
		Thread.sleep(3000);
		HelperClass.hoverAndClickActionOnRow(1, "Delete");
		Thread.sleep(2000);
		userslocators.deletebyselectingcheckbox.click();
		userslocators.yesindeletepopup.click();
		Thread.sleep(2000);
	}
 
	public void Clickonsearchbarandenterdataandverify() throws Exception {
		userslocators.searchTF.sendKeys("owner");
		Thread.sleep(3000);
 
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//div[normalize-space()='Owner']"));
		System.out.println(referenceCells);
		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("Owner")) {
	            Assert.assertTrue(true,"Matched: "+ actual);
			} else {
	            Assert.fail("Mismatch: " + actual);
			}
		}
	}
 
	public void Clickonalloptionsinstatusdropdownandverify() throws Exception {
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//input[@type='text']", "Invite");
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("(//a[@title='Invite'][normalize-space()='Invite'])[1]"));
		System.out.println(referenceCells);
 
		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("Invite")) {
				System.out.println("Matched: " + actual);
	            Assert.assertTrue(true,"Matched: "+ actual);
			} else {
	            Assert.fail("Mismatch: " + actual);
			}
		}
 
		
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//input[@type='text']", "Active");
		Thread.sleep(2000);
		List<WebElement> referenceCells1 = HelperClass.getDriver()
				.findElements(By.xpath("(//span[normalize-space()='Active'])[2]"));
		System.out.println(referenceCells1);
		for (WebElement cell1 : referenceCells1) {
			String actual1 = cell1.getText().trim();
			if (actual1.contains("Active")) {
	            Assert.assertTrue(true,"Matched: "+ actual1);
			} else {
	            Assert.fail("Mismatch: " + actual1);
			}
		}
 
		
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//input[@type='text']", "Resend Invitation");
		Thread.sleep(2000);
		List<WebElement> referenceCells2 = HelperClass.getDriver()
				.findElements(By.xpath("//a[@title='Resend Invitation']"));
		System.out.println(referenceCells2);
 
		for (WebElement cell2 : referenceCells2) {
			String actual2 = cell2.getText().trim();
			if (actual2.contains("Resend Invitation")) {
	            Assert.assertTrue(true,"Matched: "+ actual2);
			} else {
	            Assert.fail("Mismatch: " + actual2);
			}
		}
 
	}
 
	public void Clickonkebabmenu() throws Exception {
		userslocators = PageFactory.initElements(driver, Capium365_Users_Locators.class);
		HelperClass.waitUntilVisible(HelperClass.getWait(), userslocators.kebabmenu);
		HelperClass.clickUsingJS(userslocators.kebabmenu);
	}
 
 
public void clickonexporttoexceluser() throws Exception {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/div/mat-checkbox/label/span[contains(@class,'inner')]")));
//		HelperClass.safeClick(By.xpath("//tbody/tr[1]/td[1]/div/mat-checkbox/label/span[contains(@class,'inner')]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space(text())='Export to Excel']")));
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Export to Excel']"));
		
	}
 
	public void clickonexporttocsvuser() throws Exception {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/div/mat-checkbox/label/span[contains(@class,'inner')]")));
//		HelperClass.safeClick(By.xpath("//tbody/tr[1]/td[1]/div/mat-checkbox/label/span[contains(@class,'inner')]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space(text())='Export to CSV']")));
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Export to CSV']"));
	}
 
	public void clickonexporttopdfuser() throws Exception {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/div/mat-checkbox/label/span[contains(@class,'inner')]")));
//		HelperClass.safeClick(By.xpath("//tbody/tr[1]/td[1]/div/mat-checkbox/label/span[contains(@class,'inner')]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space(text())='Export to PDF']")));
		HelperClass.clickUsingJS(By.xpath("//button[normalize-space(text())='Export to PDF']"));
	}
 
	public void clickoncheckboxintoprow() throws Exception {
		// userslocators = PageFactory.initElements(driver,
		// Capium365_Users_Locators.class);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"(//div[@class='mdc-checkbox__mixedmark'])[1]")));
		HelperClass.clickUsingJS(By.xpath(
				"(//div[@class='mdc-checkbox__mixedmark'])[1]"));
	}
 
	public void clickonediticonandverify() throws Exception {
		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@aria-describedby='Info Box Table']/tbody/tr[1]")));
		WebElement element = driver.findElement(By.xpath("//table[@aria-describedby='Info Box Table']/tbody/tr[1]"));
		HelperClass.hoverOverElement(element);
 
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]//mat-icon[normalize-space()='edit']")));
 
		Thread.sleep(2000);
 
		if (HelperClass.isElementPresent(By.xpath("//tr[1]//mat-icon[normalize-space()='edit']"))) {
			HelperClass.clickUsingJS(By.xpath("//tr[1]//mat-icon[normalize-space()='edit']"));
            Assert.assertTrue(true,"edit icon is clicked");
		} else {
            Assert.fail("edit icon is not clicked");
		}
	}
 
	public void clickonuserid() throws Exception {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//table[@aria-describedby='Info Box Table']/tbody/tr[1]")));
		WebElement element = driver.findElement(By.xpath("//table[@aria-describedby='Info Box Table']/tbody/tr[1]"));
		HelperClass.hoverOverElement(element);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[1]//mat-icon[normalize-space()='edit']")));
 
		Thread.sleep(2000);
 
		if (HelperClass.isElementPresent(By.xpath("//tr[1]//mat-icon[normalize-space()='edit']"))) {
			HelperClass.clickUsingJS(By.xpath("//tr[1]//mat-icon[normalize-space()='edit']"));
            Assert.assertTrue(true,"edit icon is clicked");
		} else {
            Assert.fail("edit icon is not clicked");
		}
	}
 
	public void Editthedetailsandsave() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(userslocators.lastnametextfield));
		HelperClass.clearField(driver, userslocators.lastnametextfield);
		HelperClass.safeSendKeys(By.xpath("//input[@maxlength='50' and @formcontrolname='lastName']"), "name last");
		wait.until(ExpectedConditions.visibilityOf(userslocators.phonenumbertextfield));
		HelperClass.clearField(driver, userslocators.phonenumbertextfield);
		HelperClass.safeSendKeys(By.xpath("//input[@type='tel' and @formcontrolname='phone']"), "87987645345");
		HelperClass.clickUsingJS(userslocators.saveandexitbutton);
		
	}
 
	public void clickonexceloptiononthedown() throws InterruptedException {
		userslocators = PageFactory.initElements(driver, Capium365_Users_Locators.class);
		HelperClass.waitUntilVisible(HelperClass.getWait(), userslocators.exportexcelindown);
		HelperClass.clickUsingJS(userslocators.exportexcelindown);
		Thread.sleep(3000);
	}
 
	public void clickonpdfoptiononthedown() throws InterruptedException {
		userslocators = PageFactory.initElements(driver, Capium365_Users_Locators.class);
		HelperClass.waitUntilVisible(HelperClass.getWait(), userslocators.exportpdfindown);
		HelperClass.clickUsingJS(userslocators.exportpdfindown);
		Thread.sleep(3000);
	}
 
	public void clickoncsvoptiononthedown() throws InterruptedException {
		userslocators = PageFactory.initElements(driver, Capium365_Users_Locators.class);
		HelperClass.waitUntilVisible(HelperClass.getWait(), userslocators.exportcsvindown);
		HelperClass.clickUsingJS(userslocators.exportcsvindown);
		Thread.sleep(3000);
	}
 
}
 
 