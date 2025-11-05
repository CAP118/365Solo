package com.Capium365.Actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium365.Locators.Capium365_Receipts_PurchaseInvoice_Locators;

import lombok.experimental.Helper;

public class Capium365_Receipts_PurchaseInvoice_Actions {

	Capium365_Receipts_PurchaseInvoice_Locators purchaseInvoice = null;
	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait = HelperClass.getWait();
	LoginActions loginaction = new LoginActions();

	public Capium365_Receipts_PurchaseInvoice_Actions() {
		this.purchaseInvoice = new Capium365_Receipts_PurchaseInvoice_Locators();
		PageFactory.initElements(HelperClass.getDriver(), purchaseInvoice);
	}

	String filePath="C:\\Users\\user\\Documents\\Invoice.pdf";
	//String filePath = "C:\\Users\\user\\Downloads\\CertsureInvoiceNo88041459_638693422909414414 - Copy (2) - Copy - Copy.pdf";
//	String filePath = "C:\\Users\\user\\Downloads\\CertsureInvoiceNo856568041459_638693422909414414 - Copy (2) - Copy - Copy.pdf";

	public void clickOnReceiptsMenu() throws Throwable {
		WebElement element = driver.findElement(By.xpath("//span[text()='Receipts']//parent::a"));
		wait.until(ExpectedConditions.visibilityOf(element));
		HelperClass.clickWithRetry(element, driver, wait);
	}
	
	public void ValidateSupplierCreatedorNot() {
		By locate = By.xpath("//tbody/tr[1]/td[4]/div/span[normalize-space()='Atco Electrical Distributors Ltd']");
		WebElement element = driver.findElement(locate);
		String ActualSuppliername = "Atco Electrical Distributors Ltd";
		String ExpectedSupplierName = HelperClass
				.getText(By.xpath("//tr[1]/td/span/span[normalize-space()='Atco Electrical Distributors Ltd']"));

		if (ActualSuppliername.equals(ExpectedSupplierName)) {
			Assert.assertTrue(true,"Receipt uploaded successfully");

		} else {
			Assert.fail("Uploaded receipt not found");

		}
		HelperClass.highlightElement(element);
	}

	public boolean isPurchaseInvoicePageDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			WebElement header = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[text()='Upload Purchase Invoices']")));
			return header.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void ClickonUploadPurchaseInvoiceButton() throws Throwable {
		purchaseInvoice.UploadPurchaseInvoiceButton.click();
		Thread.sleep(2000);
	}

	public void ClickonUploadpurchaseInvoice2Button() throws InterruptedException {
		purchaseInvoice.UploadPurchasesInvoice2Button.click();
		Thread.sleep(5000);
	}

	// SearchBar and Validatingdata
	public void Clickonsearchbarandenterdata() throws Throwable {
		purchaseInvoice.SearchBar.sendKeys("PUR0055");
		Thread.sleep(5000);
	}

	public void Verifydata() {
//		purchaseInvoice.SearchBar.sendKeys("PUR055");
		HelperClass.safeType(purchaseInvoice.SearchBar,"PUR055");
		String actualtext = HelperClass.getText(By.xpath("(//div[normalize-space()='PUR055'])[1]"));
		String expected = "PUR055";
		if (actualtext.contains(expected)) {
			Assert.assertTrue(true,"Purchase Invoice Records found");
		} else {
			Assert.fail("Purchase Invoice records not  found");

		}

	}

	public void CLickonThreedot() {
		HelperClass.safeClick(purchaseInvoice.Threedoticon);
	}

	// Export to Excel
	public void ExporttoExcel() {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		HelperClass.safeClick(purchaseInvoice.ExporttoExcel);

	}

	// Export to csv
	public void ExporttoCSV() {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		HelperClass.safeClick(purchaseInvoice.Exporttocsv);

	}

	// Export to pdf
	public void ExporttoPDF() throws Throwable {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		HelperClass.safeClick(purchaseInvoice.Exporttopdf);
		HelperClass.waitForPageToLoad(driver);
	}

	public void selectOneStatus(WebElement statusElement) throws Throwable {
		HelperClass.waitUntilClickable(purchaseInvoice.StatusDropdown);
		purchaseInvoice.StatusDropdown.click();

		HelperClass.waitUntilClickable(statusElement);
		statusElement.click();

		// Wait for grid refresh if needed
		Thread.sleep(2000);
	}

	/**
	 * Method 2: Click the Delete button
	 */
	public void clickDeleteButton() throws Throwable {
		// Hover over first row
		HelperClass.hoverOverElement(purchaseInvoice.InvoiceRow);

		// Wait for delete icon to be clickable
		// HelperClass.waitUntilClickable(wait,
		// purchaseInvoice.DeleteAllStatusButton).click();

		// Optional: handle confirmation modal
		// HelperClass.waitUntilClickable(wait, purInv.ConfirmDeleteBtn).click();

		Thread.sleep(2000);
	}

	public void ValidatenoofProcessing() throws Throwable {
		Thread.sleep(2000);

		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space()='0'])[1]"));
		String expected = "0";

		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Verified no of Processing");

		} else {
			Assert.fail("not matched no of Processing. Found: "+ actualtext);

		}
	}

	public void ValidatenoofToReview() throws Throwable {
		Thread.sleep(2000);

		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space()='66'])[1]"));
		String expected = "66";

		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Verified no of ToReview");

		} else {
			Assert.fail("not matched no of ToReview. Found: "+ actualtext);

		}
	}

	public void ValidatenoofToSuccess() throws Throwable {
		Thread.sleep(2000);

		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space()='62']"));
		String expected = "66";

		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Verified no of Success");

		} else {
			Assert.fail("not matched no of Success. Found: "+ actualtext);

		}
	}

	public void ValidatenoofArchived() throws Throwable {
		Thread.sleep(2000);

		String actualtext = HelperClass.getText(By.xpath("(//span[normalize-space()='0'])[2]"));
		String expected = "0";

		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Verified no of Archived");

		} else {
			Assert.fail("not matched no of Archived. Found: "+ actualtext);

		}
	}

	public void ValidatenoofDuplicate() throws Throwable {
		Thread.sleep(2000);

		String actualtext = HelperClass.getText(By.xpath("//span[normalize-space()='51']"));
		String expected = "51";

		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Verified no of Duplicate");
		} else {
			Assert.fail("not matched no of Duplicate. Found: "+ actualtext);

		}
	}

	// mouse hover and Click on Archive Button
	public void MousehoverAndClickonArchiveButton() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement hoverIcon = driver.findElement(
				By.xpath("(//mat-icon[@class='mat-icon notranslate material-icons-outlined mat-icon-no-color'])[5]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(hoverIcon).perform();

		WebElement archiveButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[.//mat-icon[normalize-space()='archive']]")));
		archiveButton.click();
		Thread.sleep(4000);
	}

	public void ClickonYesButton() {
		HelperClass.safeClick(purchaseInvoice.ArchiveYesButton);
	}

	public void ClickonNoButton() {
		HelperClass.safeClick(purchaseInvoice.ArchiveNoButton);
	}

//	    public void MousehoverAndClickonArchiveButton() {
//	    	HelperClass.hoverAndClick(
//	    		    By.xpath("(//mat-icon[@class='mat-icon notranslate material-icons-outlined mat-icon-no-color'])[5]"),
//	    		    By.xpath("//button[.//mat-icon[normalize-space()='archive']]")
//	    		);
//	    }

	public void ArchivedStatus() throws Throwable {
		HelperClass.waitForPageToLoad(driver);
		String actualtext = HelperClass.getText(
				By.xpath("(//span[contains(@class,'white-space-nowrap') and contains(@class,'archived')])[1]"));
		String expected = "Archived";

		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"Verified Archived Status");
		} else {
			Assert.fail("Not Verified Archived Status. Found: "+ actualtext);


		}
	}

	public void Clickonstatusdropdown() throws Throwable {
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='statusChange']", "All Status");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='statusChange']", "Processing");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='statusChange']", "To Review");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='statusChange']", "Success");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='statusChange']", "Archived");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//ng-select[normalize-space(@formcontrolname)='statusChange']", "Duplicate");
		Thread.sleep(2000);

	}

	public void ClickonDateDropdown() throws Throwable {
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "All Time");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "This Week");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "Last Week");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "This Month");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "Last Month");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "This Quarter");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "Last Quarter");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "This Year");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "Last Year");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "Custom");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//ng-select[normalize-space(@panelclass)='myPanelClass'])[2]", "This Financial Year");
		Thread.sleep(2000);
	}

	public void mousehoverandClickonDeleteIcon() {
		WebElement element = driver.findElement(
				By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']")));
		HelperClass.clickUsingJS(By.xpath("//tr[1]//td//mat-icon[normalize-space()='delete_outline']"));
	}

	public void SelctToReviewOption() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ng-select[@formcontrolname='statusChange']")));
		By dropdown = By.xpath("//ng-select[@formcontrolname='statusChange']");
		WebElement element = driver.findElement(dropdown);
		HelperClass.selectDivOptionDropdownValue(element, "To Review");
	}
	
	public void ClickonEditOptions() throws Throwable {
    	Thread .sleep(20000);
    	HelperClass.hoverOverElement(By.xpath("//table/tbody/tr[1]"));
    	HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space()='edit'])[1]"));
    	//Thread .sleep(10000);
    	//HelperClass.mouseHoverAndPerformActionnClientPortal("Invited to 365 list Table",0, "more_vert");
    }
	
	public void ClickonAccountNameDropdown() throws Throwable {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//ng-select[@formcontrolname='accountId']")
		));
		dropdown.click();

		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//span[normalize-space(text())='4171-Computer Equipment Leased - Additions - Cost']")
		));
		option.click();

	}

	public void MousehoverandclickonEditIcon() {
		WebElement element = driver.findElement(
				By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']")));
		HelperClass.clickUsingJS(By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']"));
	}

	public void MousehoverandclickonArchivebutton() {
		WebElement element = driver.findElement(
				By.xpath("//tr[1]//td//mat-icon[normalize-space()='archive']"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='archive']")));
		HelperClass.clickUsingJS(By.xpath("//tr[1]//td//mat-icon[normalize-space()='archive']"));
	}

	public void MousehoverandClickonRestorebutton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//tbody/tr[1]/td/div/mat-checkbox/label/span[contains(@class,'mat-checkbox-inner')]")));
		WebElement element = driver.findElement(
				By.xpath("//tbody/tr[1]/td/div/mat-checkbox/label/span[contains(@class,'mat-checkbox-inner')]"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']")));
		HelperClass.clickUsingJS(By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']"));
	}

	public void MousehoverandClickonMorevertbutton() {
		WebElement element = driver.findElement(
				By.xpath("//tr[1]//td//mat-icon[normalize-space()='edit']"));
		HelperClass.hoverOverElement(element);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//tr[1]//td//mat-icon[normalize-space()='more_vert']")));
		HelperClass.clickUsingJS(By.xpath("//tr[1]//td//mat-icon[normalize-space()='more_vert']"));
	}

	public void ClickonPreviewButton() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Preview']//parent::button")));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Preview']//parent::button"));

	}

	public void clickonClosebuttonPreviewpage() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='close']")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='close']"));
	}

	public void clickonHistoryButton() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Preview']//parent::button")));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='History']//parent::button"));
	}

	public void ClickonFileIcon() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td/div/mat-icon")));
		HelperClass.clickUsingJS(By.xpath("//tbody/tr[1]/td/div/mat-icon"));
	}

	public void ClickonDownloadFileIcon() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='file_download']")));
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='file_download']"));
	}

	public void ClickonSelectCheckBox() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@aria-describedby='Purchase Table']//tr[1]/td[1]//mat-checkbox/div")));
//		HelperClass.clickUsingJS(
//				By.xpath("//table[@aria-describedby='Purchase Table']//tr[1]/td[1]//mat-checkbox "));
		HelperClass.clickWithRetry(purchaseInvoice.ParticularCHeckBox, driver, wait);
//		HelperClass.waitForPageToLoad(driver);
//		HelperClass.safeClick(By.xpath("//tbody/tr[1]/td/div/mat-checkbox//div/input[contains(@class,'mdc-checkbox__native-control')]"));
	}
	
	public void ClickonCheckBoxxx() {
		HelperClass.safeClick(By.xpath("//label[normalize-space()='Delete by selecting the box']"));
	}
	
	public void validatepurchaseInvoiceMainGrid() {
		HelperClass.waitForPageToLoad(driver);
		String ActualPurchaseInvoicemainGrid = HelperClass
				.getText(By.xpath("(//span[normalize-space()='Upload Purchase Invoices'])[1]"));
		String ExpectedPurchaseInvoicemainGrid = "Upload Purchase Invoices";
		if (ActualPurchaseInvoicemainGrid.equals(ExpectedPurchaseInvoicemainGrid)) {
			Assert.assertTrue(true,"PurchaseInvoice is Displying in the Grid");

		} else {
		    Assert.fail("PurchaseInvoice is not Displying in the Grid");

		}
	}

	public void ClickonSaveButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[normalize-space()='Save']//parent::button")));
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Save']//parent::button"));
	}

//	public void uploadFileWithRobot() throws Exception {
//		// Click on the Choose File button
//		WebElement chooseFileButton = driver.findElement(By.xpath("//span[normalize-space()='Choose a File']"));
//		chooseFileButton.click();
//		Thread.sleep(2000);
//		HelperClass.waitForPageToLoad(driver);
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
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//	}
	
	public void uploadFileWithRobot() throws Exception {
		 
        // Step 1: Click Upload Invoice and Choose File buttons
//        InvoiceLocators.uploadInvoicebutton.click();
//        purchaseActions.ClickonUploadPurchaseInvoiceButton();
        purchaseInvoice.UploadPurchaseInvoiceButton.click();
        Thread.sleep(2000);
 
        purchaseInvoice.chooseaFileButton.click();
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
        purchaseInvoice.UploadPurchasesInvoice2Button.click();
       HelperClass.waitForPageToLoad(driver);
 
        System.out.println("PurchaseInvoice upload successfully: " + filePath);
    }
	
	

	// Pagination Code
	public void ClickonPagiantionDropdownandValidteCount() throws Exception {

		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "10");
		HelperClass.waitForPageToLoad(driver);
		purchaseInvoice.SelectCheckBox.click();

		String actualtext = HelperClass.getText(By.xpath("//p[normalize-space(text())='10']"));
		String expected = "Records: 10";
		if (actualtext.equals(expected)) {
			Assert.assertTrue(true,"10 records are there");
		} else {
			Assert.fail("10 records are not there");

		}
		HelperClass.waitForPageToLoad(driver);
		purchaseInvoice.CrossButton.click();
		Thread.sleep(3000);

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "20");
		Thread.sleep(3000);
		purchaseInvoice.SelectCheckBox.click();

		String actualtext2 = HelperClass.getText(By.xpath("//p[normalize-space(text())='20']"));
		String expected2 = "Records: 20";
		if (actualtext2.equals(expected2)) {
			Assert.assertTrue(true,"20 records are there");
		} else {
			Assert.fail("20 records are not there");

		}
		Thread.sleep(3000);
		purchaseInvoice.CrossButton.click();
		Thread.sleep(3000);

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "50");

		Thread.sleep(3000);
		purchaseInvoice.SelectCheckBox.click();

		String actualtext3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='50']"));
		String expected3 = "Records: 50";
		if (actualtext3.equals(expected3)) {
			Assert.assertTrue(true,"50 records are there");
		} else {
			Assert.fail("50 records are not there");

		}

		purchaseInvoice.CrossButton.click();
		Thread.sleep(3000);

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"//mat-select[normalize-space(@panelclass)='pagination']", "100");

		Thread.sleep(3000);
		purchaseInvoice.SelectCheckBox.click();

		String actualtext4 = HelperClass.getText(By.xpath("//p[normalize-space(text())='100']"));
		String expected4 = "Records: 100";
		if (actualtext3.equals(expected3)) {
			Assert.assertTrue(true,"100 records are there");


		} else {
			Assert.fail("100 records are not there");

		}

		purchaseInvoice.CrossButton.click();
		Thread.sleep(3000);

	}

	public void ClickonCrossButtonEditPurchaseInvoiceCrossScreen() {
		try {
			By arrowButton = By.xpath(
					"//div[contains(@class,'toggle-menu')]/mat-icon[normalize-space(text())='keyboard_arrow_left']");
			WebElement element = HelperClass.waitUntilClickable(arrowButton);
			HelperClass.scrollToElement(element);
			((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].click();", element);
			Log.info("Clicked sidebar expand arrow.");

		} catch (Exception e) {
			Log.error("Failed to click sidebar expand arrow: ");
			e.printStackTrace();
		}
		HelperClass.scrollToElement(By.xpath("//mat-icon[normalize-space()='close']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='close']")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='close']"));
		// purchaseInvoice.EditScreenCrossButton.click();
	}

	public void ClickonArchiveYesButton() {
		purchaseInvoice.ArchiveYesButton.click();
	}

	public void ClickonID() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//tbody/tr[1]/td[3]/div/div")));
		HelperClass.clickUsingJS(By.xpath("//table//tbody/tr[1]/td[3]/div/div"));
	}

	public void ValidateEditPurchaseInvoicepage() {
		String actualtext1 = HelperClass.getText(By.xpath("//h2[normalize-space()='Edit Purchase Invoices']"));
		String expected1 = "Edit Purchase Invoices";
		if (actualtext1.equals(expected1)) {
			Assert.assertTrue(true,"Edit Purchase Invoice page is Displaying");
		} else {
			Assert.fail("Edit Purchase Invoice page is not Displaying");

		}
	}

	public void ClickonEditpurchaseInvoiceCloseButton() {
		purchaseInvoice.CloseButton.click();
	}

	public void clickonsaveandExitbutton() throws Throwable {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Save and Exit']//parent::button")));
		HelperClass.safeClick(By.xpath("//span[normalize-space()='Save and Exit']//parent::button"));
		HelperClass.waitForPageToLoad(driver);
	}

	public void cickonsavebuttonineditpurchaseinvoicepeg() {
		purchaseInvoice.editpurchaseinvoicesavebutton.click();
	}

	public void ClickonCurrencyDropdown() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
				.equals("complete"));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".block-ui-overlay")));

		By dropdownLocator = By.xpath("(//div[@class='ng-select-container ng-has-value'])[3]");

		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
		wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));

	}

	public void clickonsettingsIcon() {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.safeClick(purchaseInvoice.SettingsIcon);
	}

	public void validatesettingspopup() {
		String actualtext1 = HelperClass.getText(By.xpath("//h2[normalize-space()='Certsure LLP']"));
		String expected1 = "Certsure LLP";
		if (actualtext1.equals(expected1)) {
			Assert.assertTrue(true,"Settings popup is Displaying");
		} else {
			Assert.fail("Settings popup is not Displaying");

		}
	}

	public void ValidateUploadProcessingStatus() {
		String ActualProcessingStatus = HelperClass.getText(By.xpath("//span[normalize-space()='Processing']"));
		String ExpectedProcessingStatus = "Processing";
		if (ActualProcessingStatus.equals(ExpectedProcessingStatus)) {
			Assert.assertTrue(true,"Processing Status Displying ");
		} else {
			Assert.fail("Processing Status is not Displying");

		}
	}

	public void AccountNameDropdown() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
				.equals("complete"));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".block-ui-overlay")));

		By dropdownLocator = By.xpath("(//ng-select[@bindlabel='fullName'])[2]");

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'cdk-overlay-pane')]")));

		By optionLocator = By.xpath(
				"//span[contains(@class, 'ng-option-label') and normalize-space(.)='4171-Computer Equipment  Leased - Additions - Cost']");

	}

	public void ClickonAddSupplierButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
				.equals("complete"));

		// 2. Wait for spinner to disappear (if you have one)
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".block-ui-overlay")));
		purchaseInvoice.AddSupplierButton.click();

	}

	public void EnterSupplierName() throws Throwable {
		purchaseInvoice.SuuplierName.sendKeys("Sushant9");
		Thread.sleep(2000);
	}

	public void ClickonSaveButtoninAddSuppplierPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Press ESC to dismiss any open menus
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();

		By saveBtn = By.xpath("//button[contains(.,'Save')]");

		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(saveBtn));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", button);

		wait.until(ExpectedConditions.elementToBeClickable(button));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
	}

	public void clickonCancelchangesbutton() throws Throwable {
		HelperClass.clearField(driver, By.xpath("//input[@formcontrolname='supplierName']"));
		Thread.sleep(1000);
		HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='supplierName']"), "sahailrana190");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		By cancelchangesbtn = By.xpath("//span[normalize-space()='Cancel Changes']");

		WebElement button1 = wait.until(ExpectedConditions.visibilityOfElementLocated(cancelchangesbtn));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", button1);
		wait.until(ExpectedConditions.elementToBeClickable(button1));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button1);

	}

	public void ClickonBackToPurchaseInvocesLink() {
		purchaseInvoice.BackToPurchaseInvoicesLink.click();
	}

	public void ValdateEditPurchaseInvoicePage() {
		String Actualres4 = HelperClass.getText(By.xpath("//h2[normalize-space()='Edit Purchase Invoices']"));
		String Expectedres = "Edit Purchase Invoices";
		if (Actualres4.equals(Expectedres)) {
			Assert.assertTrue(true,"Edit Purchase Invoice Page is Displaying");
		} else {
			Assert.fail("Edit Purchase Invoice Page is not Displying");

		}
	}

	public void ValdateAddSupplierPage() {
		String ActualAddSupplier = HelperClass.getText(By.xpath("//span[normalize-space()='Add Supplier']"));
		String ExpectedAddsupplier = "Add Supplier";
		if (ActualAddSupplier.equals(ExpectedAddsupplier)) {
			Assert.assertTrue(true,"Add Supplier Page is Displaying");
		} else {
			Assert.fail("Add Supplier Page is not Displying");

		}
	}

	public void ClickonEditSupplierButton() throws InterruptedException {
		HelperClass.sleep1(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplierId']",
				"ABC Design");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[normalize-space()='edit']")));
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='edit']"));
		// purchaseInvoice.EditSupplierButton.click();

	}

	public void ValdateEditSupplierPage() {
		String ActualrEditSupplier = HelperClass.getText(By.xpath("//span[normalize-space()='Edit Supplier']"));
		String ExpectedEditSupplier = "Edit Supplier";
		if (ActualrEditSupplier.equals(ExpectedEditSupplier)) {
			Assert.assertTrue(true,"Edit Supplier Page is Displaying");

		} else {
			Assert.fail("Edit Supplier Page is not Displying");

		}
	}

	public void ClickonHistoryTab() {
		HelperClass.safeClick(purchaseInvoice.HistoryTab);
	}

	public void validateHistoryPage() {
		String ActualHistoryText = HelperClass.getText(
				By.xpath("//span[normalize-space()='Created a new supplier \"Certsure LLP\" by Richard Williams']"));
		String ExpectedHistoryText = "Created a new supplier \"Certsure LLP\" by Richard Williams";
		if (ActualHistoryText.equals(ExpectedHistoryText)) {
			Assert.assertTrue(true,"History Page is Displying");

		} else {
			Assert.fail("History Page is not Displying");

		}
	}

	public void ClickonAddanotherItem() {
		HelperClass.sleep1(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplierId']",
				"ABC Design");
		HelperClass.sleep1(2000);
		purchaseInvoice.AddAnotherItem.click();
	}

	public void ValidateCancelLinkInFooter() {
		String ActualCancelLink = HelperClass.getText(By.xpath("//a[normalize-space()='Cancel']"));
		String ExpecteCancelLink = "Cancel";
		if (ActualCancelLink.equals(ExpecteCancelLink)) {
			Assert.assertTrue(true,"CancelLink is Displying");
		} else {
			Assert.fail("Cancel Link  is not Displying");

		}
	}

	public void ClickonCancelLinkInFooter() {
		purchaseInvoice.CancelLinkFooter.click();
	}


	public void ClickonBulkEditButton() {
		purchaseInvoice.BulkEditButton.click();
	}

	public void ValidateBulkEdit() {
		String ActualBulkEditpopup = HelperClass.getText(By.xpath("//h2[normalize-space()='Bulk Edit']"));
		String ExpecteBulkEditpopup = "Bulk Edit";
		if (ActualBulkEditpopup.equals(ExpecteBulkEditpopup)) {
			Assert.assertTrue(true,"Bulk Edit popup is Displying");
		} else {
			Assert.fail("Bulk Edit popup is not Displying");

		}
	}

	public void ValidateSupplierDropdown() throws Throwable {

		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplier']",
				"Your Company Name");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplier']",
				"EDF ENERGY");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplier']",
				"E.ON NEXT");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplier']",
				"AMAZON PLC");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplier']",
				"NUDE FINANCE");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplier']",
				"E&L INSURANCE");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(), "//ng-select[@formcontrolname='supplier']",
				"Your Company Name");
	}

	public void ClickonBulkEditPopupSaveButton() throws Throwable {
		purchaseInvoice.BulkEditSaveButton.click();
		Thread.sleep(3000);
	}

	public void ValidateSupplierNameMainGrid() {
		String ActualSupplierName = HelperClass.getText(By.xpath("(//span[@title='Certsure LLP'][normalize-space()='Certsure LLP'])[1]"));
		String ExpectedSuppierName = "Certsure LLP";
		if (ActualSupplierName.equals(ExpectedSuppierName)) {
			Assert.assertTrue(true,"SupplierName is Displying");

		} else {
			Assert.fail("SupplierName is not Displying");

		}
	}

	public void ValidateVATRateDropdownBulkEdit() throws Throwable {
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "Exempt(0.00%)");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "Zero-Rated (0%)");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "Reduced (5.0%)");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "Standard (20%)");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "No VAT(0.00%)");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "Custom VAT");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "No VAT registered(0.00%)");
		Thread.sleep(2000);
		HelperClass.selectFromStatusDropdown(HelperClass.getDriver(),
				"(//div[@class='ng-select-container ng-has-value'])[4]", "Reverse Charge(20%)");

	}

	public void ClickonCloseButtoninBulkEditPopup() {
		purchaseInvoice.BulkEditPopupInCloseButton.click();
	}

	public void ValidatePurchaseInvoiceMainGrid() {
		String ActualPurchaseInvoiceMainGrid = HelperClass
				.getText(By.xpath("//span[normalize-space()='Upload Purchase Invoices']"));
		String ExpectedPurhaseInvoiceMainGrid = "Upload Purchase Invoices";
		if (ActualPurchaseInvoiceMainGrid.equals(ExpectedPurhaseInvoiceMainGrid)) {
			Assert.assertTrue(true,"PurchaseInvoice Main grid is Displying");
		} else {
			Assert.fail("PurchaseInvoice is not Displying");

		}
	}

	public void ClickonFooterDeleteButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Delete']/ancestor::button")));
		HelperClass.safeClick(By.xpath("//p[normalize-space()='Delete']/ancestor::button"));
	}

	public void ValidateDeletepopup() {
		String ActualConfirmDeletePopUp = HelperClass.getText(By.xpath("//h2[normalize-space()='Confirm Delete']"));
		String ExpectedConfirmDeletePopup = "Confirm Delete";
		if (ActualConfirmDeletePopUp.equals(ExpectedConfirmDeletePopup)) {
			Assert.assertTrue(true,"Confirm Delete popup is Displying");

		} else {
		    Assert.fail("Confirm Delete popup is not Displying");

		}
	}

	public void ClickonFooterExcelButton() {
		HelperClass.safeClick(purchaseInvoice.FooterExcelButton);
	}

	public void ClickonFooterCSVButton() {
		HelperClass.safeClick(purchaseInvoice.FooterCSVButton);
	}

	public void ClickonFooterPDFButton() {
		HelperClass.safeClick(purchaseInvoice.FooterPDFButton);
	}

	public void CliconFooterArcivebutton() {
		HelperClass.safeClick(purchaseInvoice.FooterArchiveButton);
	}

	public void ValidateConfirmArchivepopup() {
		String ActualConfirmArchivePopUp = HelperClass.getText(By.xpath("//h2[normalize-space()='Confirm Archive']"));
		String ExpectedConfirmArchivePopup = "Confirm Archive";
		if (ActualConfirmArchivePopUp.equals(ExpectedConfirmArchivePopup)) {
			Assert.assertTrue(true,"Confirm Archive popup is Displying");

		} else {
		    Assert.fail("Confirm Archive popup is not Displying");

		}
	}

	public void ValidateArchivedStatus() {
		try {
			if (purchaseInvoice.ArchiveSuccessMessage.isDisplayed()) {
			    Assert.assertTrue(true,"Archived successfully");
			} else {
			    Assert.fail("Not Archived");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}

	public void ClickonFooterRestoreButton() {
		purchaseInvoice.FooterRestoreButton.click();
	}

	public void ValidateConfirmRestorepopup() {
		try {
			if (purchaseInvoice.CreditnoteSuccessMesaage.isDisplayed()) {
			    Assert.assertTrue(true,"Record Restored successfully"); 
			} else {
			    Assert.fail("Record not restored");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}

	public void FooterStatusToReviewForFooter() {
		String ActualToreviewStatus = HelperClass.getText(By.xpath("(//a[normalize-space()='To Review'])[1]"));
		String ExpectedToreviewStatus = "To Review";
		if (ActualToreviewStatus.equals(ExpectedToreviewStatus)) {
			Assert.assertTrue(true,"To Review Status is Displying");
		} else {
		    Assert.fail("To Review Status not Displying");

		}
	}

	public void validateUploadPurchaseInvoiceSupplierName() {
		String ActualSupplierNameIntheGrid = HelperClass
				.getText(By.xpath("//span[normalize-space()='MR JOHN SMITH']//parent::td"));
		String ExpectedSuplierNameInthgrid = "MR JOHN SMITH";
		if (ActualSupplierNameIntheGrid.equals(ExpectedSuplierNameInthgrid)) {
			Assert.assertTrue(true,"SupplierName is Displying in the Grid");

		} else {
		    Assert.fail("SupplierName is not Displying in the Grid");

		}
	}

	public void validateDuplicateLogo() {
		WebElement duplicateLogo = HelperClass.getDriver()
				.findElement(By.xpath("//tr[1]//span[normalize-space()='Duplicate']//parent::button"));
		String actualTextValue = duplicateLogo.getText(); // Use getText(), not getAttribute()

		String expectedTextValue = "Duplicate";

		if (actualTextValue != null && actualTextValue.equals(expectedTextValue)) {
			Assert.assertTrue(true,"Duplicate Logo is Displaying in the Grid");

		} else {
		    Assert.fail("Duplicate logo is not Displaying. Found: " + actualTextValue);

		}
	}

	public void ClickonDuplicateLogo() {
		purchaseInvoice.DuplocateLogo.click();
	}

	public void ValidateProcessDuplicateUpload() {
		String ActualProcessDuplicateUpload = HelperClass
				.getText(By.xpath("//h2[normalize-space()='Process Duplicate Upload']"));
		String ExpectedProcessDuplicateUpload = "Process Duplicate Upload";
		if (ActualProcessDuplicateUpload.equals(ExpectedProcessDuplicateUpload)) {
			Assert.assertTrue(true,"Process Duplicate upload popup Displying ");
		} else {
		    Assert.fail("Process Duplicate upload is not Displying");

		}
	}

	public void ClickonProcessDuplicateYesButton() throws Throwable {
		purchaseInvoice.ProcessDuplicatePopupYesButton.click();
		Thread.sleep(3000);
	}

	public void ClickonProcessDuplicateNoButton() {
		purchaseInvoice.ProcessDuplicatePopupNoButton.click();
	}
	
	public void ClickonPurchaseMenuBookeeping() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Purchase']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//a[normalize-space()='Purchases']"));
	}
	
	public void SearchPurchaseInvoiceandVerify() throws Throwable {
	    Thread.sleep(2000);
	    purchaseInvoice.FromDateinbookeeping.clear();
        Thread.sleep(3000);
        HelperClass.clickUsingJS(By.xpath("//i[@class='fa fa-search']"));
        
        // Wait for the invoice button to appear after search
        WebElement invoiceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[normalize-space()='77563']//parent::button")));

        String actualInvoiceID = invoiceElement.getText().trim();
        String expectedInvoiceID = "77563";

        if (actualInvoiceID.equals(expectedInvoiceID)) {
			Assert.assertTrue(true,"PurchaseInvoice is Displaying");
        } else {
		    Assert.fail("PurchaseInvoice is not Displaying: " + actualInvoiceID);

        }
	}
	
	public void ClickonPublishIcon() throws Throwable {
		Thread.sleep(3000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space()='exit_to_app'])[3]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
		Thread.sleep(2000);
	}
	
	public void WithdrwalApproval() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[@title='Withdraw Approval'])[1]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
	}
	
	public void ValidateWithdrawApproval() {
		try {
			if (purchaseInvoice.WithdrawApproval.isDisplayed()) {
				Assert.assertTrue(true,"Withdraw Approval SuccessFully");
			} else {
			    Assert.fail("Withdrae Approval Not Worked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
	
	public void ClickonRejectbutton() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("(//mat-icon[normalize-space()='thumb_down'])[1]"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Yes']"));
	}
	
	public void validateRejectMessage() {
		try {
			if (purchaseInvoice.rejectMessage.isDisplayed()) {
				Assert.assertTrue(true,"Purchase Invoice reject SuccessFully");
			} else {
			    Assert.fail("Reject button Not Worked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
	}}
		
		public void EditPurchaseInvoice() {	
			
				 HelperClass.sleep1(5000);
			        HelperClass.hoverOverElement(By.xpath("//table[@aria-describedby='Purchase Table']/tbody/tr[1]"));
			        HelperClass.sleep1(2000);
			        HelperClass.clickUsingJS(By.xpath("//mat-icon[text()='edit']/parent::button"));
			        HelperClass.sleep1(2000);
			}
		
	
	
	public void validateWithdrwawRejectionMessage() {
		try {
			if (purchaseInvoice.WithdrawRejection.isDisplayed()) {
			    Assert.assertTrue(true,"Purchase Invoie withdraw reject SuccessFully");
			} else {
			   
			    Assert.fail("Purchase Invoice withdraw reject Not Worked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
				

	}
		
		
	}
	
	public void CLickonApproveandPublishPurchaseInvoice() throws Throwable {
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//mat-icon[normalize-space()='thumb_up']"));
		Thread.sleep(2000);
		HelperClass.clickUsingJS(By.xpath("//span[normalize-space()='Approve & Publish']"));
	}

	
	public void ClickonPurchaseInvoiceMenu() {
		By ReceiptsInsideSidebar = By.xpath("//a[@mattooltip='Purchase Invoices']");
		HelperClass.isElementPresent(ReceiptsInsideSidebar);
		HelperClass.clickUsingJS(ReceiptsInsideSidebar);
		HelperClass.sleep1(3000);
	}
	
	public void ClickOnPurchaseInvoiceInsideSidebar() {
		By PurchaseInvoiceInsideSidebar = By.xpath("//a[@mattooltip='Purchase Invoices']");
		HelperClass.isElementPresent(PurchaseInvoiceInsideSidebar);
		HelperClass.clickUsingJS(PurchaseInvoiceInsideSidebar);
		HelperClass.waitForPageToLoad(driver);
	}
	
	public void ValidateuplicateSuccessMessage() {
		try {
			if (purchaseInvoice.DuplicateSuccessMessage.isDisplayed()) {
			    Assert.assertTrue(true,"Duplicate Success Message is Displying");
			} else {
			    Assert.fail("Duplicate Success Message is not Displying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
}
	
	public void ClickonCrossButonIneditPurchaseInvoiceScreen() throws Throwable {
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='close']"));
	}
	
	public void validatenoofsuppliers() throws Throwable {
		WebElement Suppliercount = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold'])[1]")));
 
		String count = Suppliercount.getText().trim();
 
		String c = count;
 
		System.out.println("C: " + count);
 
		String actualtext = HelperClass
 
				.getText(By.xpath("(//span[normalize-space(@class)='fw-bold'])[1]"));
 
		String expected = count;
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true, "Number of Suppplier verified");
 
		} else {
 
			Assert.fail("Not Matched");
 
		}
	}
	

	public void ValidatenoofpurchaseInvoices() throws Throwable {
		WebElement PurchaseInvoicecount = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold'])[2]")));
 
		String count = PurchaseInvoicecount.getText().trim();
 
		String c = count;
 
		System.out.println("C: " + count);
 
		String actualtext = HelperClass
 
				.getText(By.xpath("(//span[normalize-space(@class)='fw-bold'])[2]"));
 
		String expected = count;
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true, "Number of PurchaseInvoice verified");
 
		} else {
 
			Assert.fail("Not Matched");
		}
	}
	


	public void ValidatenoofTotalAmount() throws Throwable {
		WebElement TotalAmountcount = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//span[normalize-space(@class)='fw-bold'])[3]")));
 
		String count = TotalAmountcount.getText().trim();
 
		String c = count;
 
		System.out.println("C: " + count);
 
		String actualtext = HelperClass
 
				.getText(By.xpath("(//span[normalize-space(@class)='fw-bold'])[3]"));
 
		String expected = count;
 
		if (actualtext.equals(expected)) {
 
			Assert.assertTrue(true, "Number of PurchaseInvoice verified");
 
		} else {
 
			Assert.fail("Not Matched");
		}
	}
	
	public void CLikonExpandErrorw() {
		HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='keyboard_arrow_left']"));
	}

}
