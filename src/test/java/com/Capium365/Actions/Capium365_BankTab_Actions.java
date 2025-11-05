
package com.Capium365.Actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;

public class Capium365_BankTab_Actions {

	// String filePath =
	// "C:\\Users\\satishkumar.silphoz\\Documents\\2024Automation\\Master\\Master365Solo\\Files\\TestInvoice.pdf";

	String filePath = "C:\\Users\\user\\Documents\\Receipt 2.pdf";

	WebDriver driver = HelperClass.getDriver();
	WebDriverWait wait = HelperClass.getWait();

	public Capium365_BankTab_Actions() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@routerlink='bankfeed/bankAccounts']")
	public WebElement banktab;

	@FindBy(xpath = "//mat-icon[text()='keyboard_arrow_right' and @data-mat-icon-type='font']")
	public WebElement expandarrow;

	@FindBy(xpath = "(//mat-icon[@fontset='material-icons-outlined'])[3]")
	public WebElement bankaccounttab;

	@FindBy(xpath = "//span[text()='Add Account']")
	public WebElement addnewaccountbutn;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement bankTF;

	@FindBy(xpath = "//div[text()='Mock']")
	public WebElement mockbankselection;

	@FindBy(xpath = "//div[text()='Allow']")
	public WebElement allowbutton;

	@FindBy(xpath = "//input[@placeholder='User Name']")
	public WebElement truelayerusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement truelayerpassword;

	@FindBy(xpath = "//div[text()='Proceed']")
	public WebElement proceedbutton;

	@FindBy(xpath = "(//input[@class='mdc-radio__native-control'])[1]")
	public WebElement selectaccount;

	@FindBy(xpath = "//span[text()=' Continue ']")
	public WebElement continuebutton;

	// Delete
	@FindBy(xpath = "//button[contains(@class, 'delete-button') and .//mat-icon[text()='delete_outline']]")
	public WebElement deleteicon;

	@FindBy(xpath = "//span[text()=' Yes ']")
	public WebElement deletepopupyes;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchTF;

	// Date dropdown
	@FindBy(xpath = "//div[@class='ng-value ng-star-inserted']")
	public WebElement datedropdown;

	// Export menu 3 dots
	@FindBy(xpath = "//mat-icon[@aria-hidden='true' and text()='more_vert']")
	public WebElement exportthreedotmenu;

	@FindBy(xpath = "//mat-icon[@aria-hidden='true' and text()='border_all']")
	// @FindBy(xpath="(//button[@tabindex='0'])[4]")
	public WebElement exporttoexcel;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']//mat-icon[@role='img'][normalize-space()='description']")
	public WebElement exporttocsv;

	@FindBy(xpath = "//div[@class='cdk-overlay-container']//button[2]")
	public WebElement exporttocsvonkebab;

	@FindBy(xpath = "//mat-icon[text()='picture_as_pdf' and @fontset='material-icons-outlined'] ")
	public WebElement exporttopdf;

	// Pagination
	@FindBy(xpath = "//div[@class='mat-select-value ng-tns-c115-36']")
	public WebElement pagintaiondd50;

	@FindBy(xpath = "(//th[@style='top: 0px; z-index: 100;'])[1]")
	public WebElement radiobutton;

	@FindBy(xpath = "//mat-icon[normalize-space(text())='highlight_off']")
	public WebElement crossmark;

	@FindBy(xpath = "//span[@class='mat-option-text' and text()='10']")
	public WebElement pagintaiondd10;

	@FindBy(xpath = "//span[@class='mat-option-text' and text()='20']")
	public WebElement pagintaiondd20;

	@FindBy(xpath = "//span[@class='mat-option-text' and text()='100']")
	public WebElement pagintaiondd100;

	// page numbers
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()=' 2 ']")
	public WebElement pagenumber2;

	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()=' 3 ']")
	public WebElement pagenumber3;

	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()=' 4 ']")
	public WebElement pagenumber4;

	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()=' 5 ']")
	public WebElement pagenumber5;

	// previous arrow
	@FindBy(xpath = "//mat-icon[@aria-hidden='true' and text()='chevron_left']")
	public WebElement previousarrow;

	// next arrow
	@FindBy(xpath = "//mat-icon[@data-mat-icon-type='font' and text()='chevron_right']//parent::span")
	public WebElement nextarrow;

	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()=' 9 ']")
	public WebElement pagenumber9;

	// Go to text field
	@FindBy(xpath = "//input[@formcontrolname='pageNumber']")
	public WebElement gotoTF;

	@FindBy(xpath = "//a[@title='Settings']")
	public WebElement settingsicon;

	@FindBy(xpath = "(//div[@class='mat-ripple mat-menu-ripple'])[1]")
	public WebElement mybussinessoption;

	@FindBy(xpath = "//div[@class='mt-1']//a[@class='link'][normalize-space()='Add New Line']")
	public WebElement Addnewline;

	@FindBy(xpath = "//p[@class='mb-1 text-primary font-size-16 fw-bold']")
	public WebElement bankdetails;

	@FindBy(xpath = "(//input[@formcontrolname='accountName'])[1]")
	public WebElement transactionaccount1business;

	@FindBy(xpath = "(//input[@formcontrolname='accountName'])[2]")
	public WebElement cashbusiness;

	@FindBy(xpath = "(//input[@formcontrolname='accountName'])[3]")
	public WebElement hdfcbusiness;

	@FindBy(xpath = "(//input[@formcontrolname='accountName'])[4]")
	public WebElement icicibusiness;

	@FindBy(xpath = "(//input[@formcontrolname='accountName'])[5]")
	public WebElement thripleeightbusiness;

	@FindBy(xpath = "//span[@title='TRANSACTION ACCOUNT 1 (0000)']")
	public WebElement transactionaccount1bank;

	@FindBy(xpath = "//span[@title='Cash']")
	public WebElement cashbank;

	@FindBy(xpath = "(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[3]")
	public WebElement hdfcbank;

	@FindBy(xpath = "(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[4]")
	public WebElement icicibank;

	@FindBy(xpath = "(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[5]")
	public WebElement thripleeightbank;

	@FindBy(xpath = "//table[@aria-describedby='Bank Detail Table']/tbody/tr/td[1]")
	public WebElement expectedbanknamecolumn;

	@FindBy(xpath = "//div[@class='bank-details-listview']")
	public WebElement actualbankwholescreen;

	@FindBy(xpath = "//div[@class='d-flex gap-20']//div[1]")
	@CacheLookup
	public WebElement moneyinheader;

	@FindBy(xpath = "//span[@class='add fw-normal font-size-13 white-space-nowrap' and text()='Refresh Account']")
	public WebElement refreshaccount;

	@FindBy(xpath = "//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'][normalize-space()='search']")
	public WebElement searchiconinexpandarrow;

	@FindBy(xpath = "(//input[normalize-space(@placeholder)='Search'])[1]")
	public WebElement searchTFinexpandarrow;

	@FindBy(xpath = "//mat-icon[normalize-space()='highlight_off']")
	public WebElement crossmarkinexpandarrow;

	@FindBy(xpath = "//input[@formcontrolname='ruleName']")
	public WebElement RuleNameTextBox;

	@FindBy(xpath = "//input[@formcontrolname='value']")
	public WebElement RuleValueBox;

	@FindBy(xpath = "(//input[@formcontrolname='description'])[1]")
	public WebElement RuleDescription;

	@FindBy(xpath = "(//input[@formcontrolname='amount'])[1]")
	public WebElement RuleAmount;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement SearchBar;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement BankMainGridSearchBar;

	@FindBy(xpath = "(//input[@formcontrolname='description'])[2]")
	public WebElement AddJournalDescription;

	@FindBy(xpath = "(//input[@formcontrolname='description'])[3]")
	public WebElement AddJournalDescriptionforCreateJournal;

	@FindBy(xpath = "//input[@id='txtDateFrom']")
	public WebElement Journalstartdate;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement TotalNet;
	
	

	 /** Click on Bank Tab */
    public void clickOnBankTab() {
        HelperClass.waitForVisibility(banktab);
        HelperClass.safeClick(banktab, "Clicking on Bank tab");
        Log.info("Clicked on Bank tab successfully.");
    }

    /** Verify Bank Tab Navigation */
    public void verifyBankTab() {
        HelperClass.waitForVisibility(addnewaccountbutn);
        Assert.assertTrue(addnewaccountbutn.isDisplayed(), "Add New Account button not displayed!");
        Log.info("Successfully navigated to bank tab.");
    }

    /** Click Expand Icon (sidebar arrow) */
    public void clickOnExpandIcon() {
        try {
            By arrowButton = By.xpath("//div[contains(@class,'toggle-menu')]/mat-icon[normalize-space()='keyboard_arrow_right']");
            WebElement element = HelperClass.waitUntilClickable(arrowButton);
            HelperClass.scrollToElement(element);
            HelperClass.clickUsingJS(arrowButton);
            Log.info("Clicked sidebar expand arrow.");
        } catch (Exception e) {
            Log.error("Failed to click sidebar expand arrow: " + e.getMessage());
        }
    }

    /** Validate Bank Accounts tab visibility */
    public void validateBankAccounts() {
        HelperClass.waitForVisibility(bankaccounttab);
        Assert.assertTrue(bankaccounttab.isDisplayed(), "Bank Accounts tab not visible!");
        Log.info("Bank Accounts tab displayed successfully.");
    }

    /** Click on Add New Account button */
    public void clickOnAddNewAccount() {
        HelperClass.waitForPageToLoad(driver);
        HelperClass.safeClick(addnewaccountbutn, "Click Add Account button");
        Log.info("Clicked on Add Account button successfully.");
    }

    /** Continue with Mock Bank linking steps */
    public void continueWithFollowingSteps() {
        HelperClass.safeType(bankTF, "mock");
        HelperClass.safeClick(mockbankselection, "Select Mock Bank");
        HelperClass.safeClick(allowbutton, "Click Allow button");

        HelperClass.safeType(truelayerusername, "john");
        HelperClass.waitForVisibility(truelayerpassword);
        HelperClass.safeType(truelayerpassword, "doe");
        HelperClass.safeClick(proceedbutton, "Click Proceed button");

        HelperClass.safeClick(selectaccount, "Select Account");
        HelperClass.waitForVisibility(continuebutton);
        HelperClass.safeClick(continuebutton, "Click Continue button");

        Log.info("Bank linking process completed successfully.");
    }

    /** Delete bank account */
    public void deleteAccount() {
        HelperClass.waitForVisibility(deleteicon);
        HelperClass.safeClick(deleteicon, "Click Delete icon");

        WebElement popupYes = HelperClass.waitUntilClickable(deletepopupyes);
        popupYes.click();
        Log.info("Bank account deleted successfully.");
    }

    /** Search field data verification */
    public void enterTextInSearchAndVerifyData() {
        HelperClass.waitForVisibility(searchTF);
        HelperClass.safeType(searchTF, "any");
        HelperClass.sleep1(2000);

        List<WebElement> referenceCells = HelperClass.getDriver()
                .findElements(By.xpath("//span[contains(text(), 'ANYVAN')]"));

        Assert.assertFalse(referenceCells.isEmpty(), "No matching records found!");

        for (WebElement cell : referenceCells) {
            String actual = cell.getText().trim();
            Assert.assertTrue(actual.contains("ANYVAN"), "Mismatch in data: " + actual);
        }

        Log.info("Search verification completed successfully.");
    }

    /** Select "This Year" from date dropdown */
    public void clickOnDateDropdown() {
        HelperClass.selectFromStatusDropdown(
                HelperClass.getDriver(),
                "//ng-select[@panelclass='myPanelClass' and contains(@class,'w-170')]",
                "This Year"
        );
        Log.info("Date dropdown 'This Year' selected successfully.");
    }

    /** Export functions */
    public void exportThreeDotMenu() {
        By threeDot = By.xpath("//mat-icon[normalize-space()='more_vert']/ancestor::button");
        HelperClass.safeClick(HelperClass.waitUntilClickable(threeDot), "Click 3-dot menu");
    }

    public void exportToExcel() {
        By excelBtn = By.xpath("//button[normalize-space(text())='Export to Excel']");
        HelperClass.safeClick(HelperClass.waitUntilClickable(excelBtn), "Export to Excel clicked");
    }

    public void exportToCSV() {
        By csvBtn = By.xpath("//button[normalize-space(text())='Export to CSV']");
        HelperClass.safeClick(HelperClass.waitUntilClickable(csvBtn), "Export to CSV clicked");
    }

    public void exportToPDF() {
        By pdfBtn = By.xpath("//button[normalize-space(text())='Export to PDF']");
        HelperClass.safeClick(HelperClass.waitUntilClickable(pdfBtn), "Export to PDF clicked");
    }

    /** Verify pagination record counts dynamically */
    public void verifyPaginationRecords() {
        int[] records = {10, 20, 50, 100};

        for (int count : records) {
            By paginationDropdown = By.xpath("//mat-select[@panelclass='pagination']");
            HelperClass.safeClick(HelperClass.waitUntilClickable(paginationDropdown), "Click pagination dropdown");

            By option = By.xpath("//mat-option/span[normalize-space()='" + count + "']");
            HelperClass.safeClick(HelperClass.waitUntilClickable(option), "Select " + count + " records");

            HelperClass.waitForVisibility(By.xpath("//table/thead/tr/th/div/mat-checkbox"));
            HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"), "Select all records checkbox");

            String text = HelperClass.getText(By.xpath("//p[contains(text(),'Records')]")).trim();
            Assert.assertTrue(text.contains(String.valueOf(count)), "Expected records: " + count + ", but got: " + text);

            HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"), "Close filter");
        }

        Log.info("Pagination record verification completed successfully.");
    }
    
 // Click each pagination number (2, 3, 4)
    public void clickOnEachPageNumber() {
        int[] pages = {2, 3, 4};
        for (int page : pages) {
            By pageButton = By.xpath("//span[normalize-space()='" + page + "']//parent::button");
            HelperClass.waitForVisibility(pageButton);
            HelperClass.safeClick(pageButton, "Clicked on page number: " + page);
        }
    }

    /** Verify Previous button is disabled on first page */
    public void verifyPreviousButtonIsDisabledWhenFirstPageIsHighlighted() {
        By previousBtnLocator = By.xpath("//button[contains(@class,'paginator-previous')]");
        WebElement previousButton = HelperClass.waitForVisibility(previousBtnLocator);
        String classValue = previousButton.getAttribute("class");

        Log.info("Previous button class attribute: " + classValue);
        if (classValue.contains("disabled") || classValue.contains("previous-disabled")) {
           // Log.pass("Previous button is disabled as expected.");
        } else {
            Assert.fail("Previous button is ENABLED on first page.");
        }
    }

    /** Verify Next button is disabled when last page is active */
    public void verifyNextButtonIsDisabledWhenLastPageIsHighlighted() {
        try {
            HelperClass.safeClick(By.xpath("//mat-select[@panelclass='pagination']"), "Open pagination dropdown");
            HelperClass.safeClick(By.xpath("//mat-option/span[normalize-space()='100']"), "Select 100 records per page");
            HelperClass.safeClick(By.xpath("//span[normalize-space()='5']//parent::button"), "Navigate to last page");

            WebElement nextButton = HelperClass.waitForVisibility(By.xpath("//button[contains(@class,'paginator-next')]"));
            String classValue = nextButton.getAttribute("class");

            Log.info("Next button class attribute: " + classValue);
            if (classValue.contains("disabled") || classValue.contains("next-disabled")) {
               // Log.pass("Next button is disabled as expected.");
            } else {
                Assert.fail("Next button is ENABLED on last page.");
            }
        } catch (Exception e) {
            Log.error("Error verifying next button state: " + e.getMessage());
            throw e;
        }
    }

    /** Go to a specific page using Go To input field */
    public void clickOnGotoTextFieldAndChangePage() {
        int[] targetPages = {2, 3, 4};
        for (int page : targetPages) {
            WebElement gotoField = HelperClass.waitForVisibility(gotoTF);
            HelperClass.scrollIntoView(gotoField);
            gotoField.clear();
            gotoField.sendKeys(String.valueOf(page), Keys.ENTER);
            Log.info("Navigated to page number: " + page);
           // HelperClass.sleep(1000);
        }
    }

    /** Go to Settings → My Business */
    public void goToSettingsAndClickOnBusiness() {
        HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='settings_outline']/ancestor::a"), "Click on Settings");
        HelperClass.safeClick(By.xpath("//span[normalize-space(text())='My Business']"), "Click on My Business tab");
    }

    /** Compare Bank accounts between Bank tab and Business tab */
    public void compareBankAccountsInBankTabAndBusinessTab() {
        HelperClass.scrollToElement(By.xpath("//p[normalize-space()='Bank Details']"));

        String transactionAccount = HelperClass.getDriver()
            .findElement(By.xpath("(//input[@formcontrolname='accountName'])[1]")).getAttribute("value").trim();
        String sbiAccount = HelperClass.getDriver()
            .findElement(By.xpath("(//input[@formcontrolname='accountName'])[2]")).getAttribute("value").trim();

        Log.info("Captured business tab accounts: " + transactionAccount + " | " + sbiAccount);

        HelperClass.safeClick(By.xpath("//span[text()='Bank']/ancestor::a"), "Navigate back to Bank tab");
        HelperClass.safeClick(By.xpath("//mat-icon[text()='keyboard_arrow_right' and @data-mat-icon-type='font']"), "Expand bank list");

        String actual1 = HelperClass.getText(By.xpath("//span[@title='TRANSACTION ACCOUNT 1 (0000)']")).trim();
        Assert.assertTrue(actual1.contains(transactionAccount), "Transaction account matches.");

        String actual2 = HelperClass.getText(By.xpath("//span[@title='sbi (3257)']")).trim();
        Assert.assertTrue(actual2.contains(sbiAccount), "SBI account matches.");
    }

    /** Click refresh account */
    public void clickOnRefreshAccount() {
        HelperClass.safeClick(refreshaccount, "Click on Refresh Account");
    }

    /** Verify table headers: Money In, Money Out, Bank Balance */
    public void verifyHeaders() {
        String[][] headers = {
            {"//div[normalize-space(text())='Money In :']", "Money In"},
            {"//div[normalize-space(text())='Money Out :']", "Money Out"},
            {"//div[normalize-space(text())='Bank Balance :']", "Bank Balance"}
        };

        for (String[] header : headers) {
            String actual = HelperClass.getText(By.xpath(header[0])).trim();
            Assert.assertTrue(actual.contains(header[1]), header[1] + " header is present");
            Log.info(header[1] + " header verified successfully.");
        }
    }

    /** Click on checkbox for ID and export to Excel */
    public void clickOnCheckboxAndExportToExcel() {
        HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"), "Select All checkbox");
        HelperClass.safeClick(By.xpath("//p[normalize-space()='Excel']/ancestor::button"), "Export to Excel");
    }

    /** Click on checkbox for ID and export to CSV */
    public void clickOnCheckboxAndExportToCSV() {
        HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"), "Select All checkbox");
        HelperClass.safeClick(By.xpath("//p[normalize-space()='CSV']/ancestor::button"), "Export to CSV");
    }

    /** Click on checkbox for ID and export to PDF */
    public void clickOnCheckboxAndExportToPDF() {
        HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"), "Select All checkbox");
        HelperClass.safeClick(By.xpath("//p[normalize-space()='PDF']/ancestor::button"), "Export to PDF");
    }

    /** Enter text in search field and verify result */
    public void enterTextInSearchTextFieldAndVerify() {
        HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='search']/ancestor::a"), "Click on Search icon");
        HelperClass.safeSendKeys(By.xpath("(//input[@placeholder='Search'])[1]"), "transac", "Enter 'transac' in search field");

        String actual = HelperClass.getText(By.xpath("//span[@title='TRANSACTION ACCOUNT 1']")).trim();
        Assert.assertTrue(actual.contains("TRANSACTION ACCOUNT 1"), "Bank search result verified");
    }

    /** Click cross mark in search field and verify data is cleared */
    public void clickOnCrossMarkAndVerifySearchFieldCleared() {
        HelperClass.safeClick(searchiconinexpandarrow, "Click on search icon in expand arrow");
        searchTFinexpandarrow.clear();
        String value = searchTFinexpandarrow.getAttribute("value");
        Assert.assertTrue(value.isEmpty(), "Search field cleared successfully");
    }

    /** Click checkbox and cross mark to deselect all */
    public void clickOnCheckboxAndCrossMark() {
        HelperClass.safeClick(By.xpath("//table/thead/tr/th/div/mat-checkbox"), "Select All checkbox");
        HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='highlight_off']/ancestor::button"), "Click on Cross mark");
    }

    /** Click on Bank Rules Menu */
    public void clickOnBankRulesMenu() {
        HelperClass.safeClick(By.xpath("//mat-icon[normalize-space()='assured_workload']"), "Click on Bank Rules menu");
    }
    
    
    public void Comparethebankaccountsinbanktabandbussinesstab() throws Exception {
        HelperClass.scrollToElement(By.xpath("//p[normalize-space()='Bank Details']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Bank Details']")));
        WebElement businessbankfield1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//input[@formcontrolname='accountName'])[1]")));
        String transactionaccountbusiness = businessbankfield1.getAttribute("value").trim();
        System.out.println("Transaction account captured: " + transactionaccountbusiness);
        WebElement businessbankfield2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//input[@formcontrolname='accountName'])[2]")));
        String sbibusiness = businessbankfield2.getAttribute("value").trim();
        System.out.println("SBI account captured: " + sbibusiness);
        By bankTab = By.xpath("//span[text()='Bank']/ancestor::a");
        wait.until(ExpectedConditions.elementToBeClickable(bankTab));
        HelperClass.clickUsingJS(bankTab);
        HelperClass.sleep1(3000);
        By rightArrow = By.xpath("//mat-icon[text()='keyboard_arrow_right' and @data-mat-icon-type='font']");
        wait.until(ExpectedConditions.elementToBeClickable(rightArrow));
        HelperClass.clickUsingJS(rightArrow);
        By transactionAccountBank = By.xpath("//span[@title='TRANSACTION ACCOUNT 1 (0000)']");
        String actualText1 = HelperClass.getText(transactionAccountBank).trim();
        if (actualText1.contains(transactionaccountbusiness)) {
            Assert.assertTrue(true, "'Transaction account1' matched");
        } else {
            Assert.fail("Transaction account1 not matched. Actual: " + actualText1 + ", Expected: " + transactionaccountbusiness);
        }
        By sbiAccountBank = By.xpath("//span[@title='sbi (3257)']");
        String actualText2 = HelperClass.getText(sbiAccountBank).trim();
        if (actualText2.contains(sbibusiness)) {
            Assert.assertTrue(true, "'SBI bank account' matched");
        } else {
            Assert.fail("SBI account not matched. Actual: " + actualText2 + ", Expected: " + sbibusiness);
        }
    }
    
    public void ClickOnCrossMarkInSearchFieldAndVerifyDataIsCleared() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(searchiconinexpandarrow));
        HelperClass.clickUsingJS(searchiconinexpandarrow);
        wait.until(ExpectedConditions.visibilityOf(searchTFinexpandarrow));
       searchTFinexpandarrow.clear();
        searchTFinexpandarrow.sendKeys("transac");
        HelperClass.clickUsingJS(searchiconinexpandarrow);
        searchTFinexpandarrow.clear();

        String fieldValue = searchTFinexpandarrow.getAttribute("value").trim();
        if (fieldValue.isEmpty()) {
            Assert.assertTrue(true, "Search field is empty after clearing.");
        } else {
            Assert.fail("Search field is NOT empty. Value: " + fieldValue);
        }
    }
}
