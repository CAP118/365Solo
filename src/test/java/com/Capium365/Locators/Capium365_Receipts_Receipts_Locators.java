package com.Capium365.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Capium365_Receipts_Receipts_Locators {
	
	@FindBy(xpath="//span[text()='Receipts']//parent::a")
	public WebElement Receipts;
	
	@FindBy(xpath="//mat-icon[normalize-space()='inbox']")
	public WebElement ReceiptsInbox;
	
	@FindBy(xpath="//a[@mattooltip='Receipts']")
	public WebElement ReceiptsInsideSidebar;
	
	@FindBy(xpath="//span[normalize-space()='Upload Purchase Invoices']")
	public WebElement ClickOnAddUploadPurchaseInvoices;
	
	@FindBy(xpath="//input[@formcontrolname='search']")
	public WebElement SearchBar;
	
	@FindBy(xpath="//div[contains(@class, 'toolbar')]//button[@aria-haspopup='menu']//mat-icon[normalize-space()='more_vert']")
	public WebElement ThreedotsinReceipts;
	
	@FindBy(xpath="//button[normalize-space(text())='Export to Excel']")
	public WebElement ExportToExcel;
	
	@FindBy(xpath="//button[normalize-space(text())='Export to CSV']")
	public WebElement ExportToCSV;
	
	@FindBy(xpath="//button[normalize-space(text())='Export to PDF']")
	public WebElement ExportToPDF;
	
	@FindBy(xpath="//button/span[normalize-space()='Choose a File']")
	public WebElement ChooseAfile;
	
	@FindBy(xpath="//button/span[normalize-space()='Upload Receipts']")
	public WebElement UploadReceipts;
	
	@FindBy(xpath="//table[@aria-describedby='Receipt Table']/tbody/tr[1]/td/div/mat-checkbox/label/span[1]")
	public WebElement ClickOnPurchaseInvoiceCheckbox;
	
	@FindBy(xpath="//div[contains(@class,'action-list')]/div/p")
	public WebElement AllOptions;
	
	@FindBy(xpath="//p[normalize-space()='Bulk Edit']//parent::span//parent::button")
	public WebElement ClickOnBulkEditOption;
	
	@FindBy(xpath="//h2[normalize-space()='Bulk Edit']")
	public WebElement VerifyBulkEditpopupPage;
	
	@FindBy(xpath="//ng-select[@formcontrolname='supplier']")
	public WebElement SupplierDropdowninBulkEdit;
	
	@FindBy(xpath="//p[normalize-space()='Copy']//parent::span//parent::button")
	public WebElement ClickOnCopyOption;
	
	@FindBy(xpath="//p[normalize-space()='Delete']//parent::span//parent::button")
	public WebElement ClickOnDeleteOption;
	
	@FindBy(xpath="//ng-select[@formcontrolname='statusChange']")
	public WebElement ClickOnStatusChangeDropdown;
	
	@FindBy(xpath="//p[normalize-space()='Restore']//parent::span//parent::button")
	public WebElement ClickOnRestoreOption;
	
	
	@FindBy(xpath="//input[@formcontrolname='receiptNo']")
	public WebElement ReceiptID;
	
	@FindBy(xpath ="//input[@id='txtFromDate']")
	public WebElement FromDateinbookeeping;
	
	
	
	
	
	
	

}
