package com.Capium365.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Capium365_Receipts_PurchaseInvoice_Locators {

	@FindBy(xpath="(//span[normalize-space()='Receipts'])[1]")
    public WebElement ReceiptsButton;
	
    @FindBy(xpath="(//span[normalize-space()='Upload Purchase Invoices'])[1]")
    public WebElement UploadPurchaseInvoiceButton;
    
    @FindBy(xpath="//span[normalize-space()='Choose a File']")
    public WebElement chooseaFileButton;
   
    
    @FindBy(xpath="//span[text()=' Upload Purchase Invoices ']")
    public WebElement UploadPurchasesInvoice2Button;
    
    @FindBy(xpath = "//input[@type='file']")
    public WebElement fileInput;
    
    @FindBy(xpath="//input[@placeholder='Search']")
    public WebElement SearchBar;
    
    @FindBy(xpath="//ng-select[@formcontrolname='statusChange']")
    public WebElement StatusDropdown;
    
    @FindBy(xpath="(//span[text()=' All Status '])[2]")
    public WebElement AllStatus;
    
    @FindBy(xpath="//span[text()=' Processing ']")
    public WebElement Processing;
    
    @FindBy(xpath="//span[text()=' To Review ']")
    public WebElement ToReview;
    
    @FindBy(xpath="(//span[text()=' Success '])[1]")
    public WebElement Success;
    
    @FindBy(xpath="(//span[text()=' Archived '])[1]")
    public WebElement Archived;
    
    @FindBy(xpath="//span[text()=' Duplicate ']")
    public WebElement Duplicate;

    //Export Functionality
    @FindBy(xpath="(//mat-icon[text()='more_vert'])[1]")
    public WebElement Threedoticon;
    
    @FindBy(xpath="//button[@role='menuitem']")
    public WebElement ExporttoExcel;
    
    @FindBy(xpath="(//button[@role='menuitem'])[2]")
    public WebElement Exporttocsv;
    
    @FindBy(xpath="((//button[@role='menuitem'])[3])")
    public WebElement Exporttopdf;
    
    //Delete Button
    @FindBy(xpath="(//mat-icon[text()='delete_outline'])[1]")
    public WebElement DeleteAllStatusButton;
    
    @FindBy(xpath = "(//tr[@role='row'])[1]")
    public WebElement InvoiceRow;
    
    @FindBy(xpath="//span[normalize-space(.)='19']")
    public WebElement Noofsuppliers;
    
    @FindBy(xpath="//span[normalize-space()='Yes']")
    public WebElement ArchiveYesButton;
    
    @FindBy(xpath="The record has been archived successfully.")
    public WebElement ArchiveSuccessMessage;
    
    @FindBy(xpath = "//div[normalize-space()='The record has been restored successfully.']")
	public WebElement CreditnoteSuccessMesaage;
    
    @FindBy(xpath="//span[normalize-space()='No']")
    public WebElement ArchiveNoButton;
    
    @FindBy(xpath="(//mat-icon[@class='mat-icon notranslate material-icons-outlined mat-icon-no-color'])[5])")
    public WebElement MousehoverArchiveButton;
    
    @FindBy(xpath="//button[.//mat-icon[normalize-space()='archive']]")
    public WebElement ArchiveButton;
    
    @FindBy(xpath="(//mat-icon[@class='mat-icon notranslate material-icons-outlined mat-icon-no-color'])[4]")
    public WebElement MousehoverUnarchiveButton;
    
    @FindBy(xpath="//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']")
    public WebElement dropdownXpath;
    
    @FindBy(xpath="//span[@class='mat-checkbox-inner-container']")
    public WebElement ClickonselectCheckBox;
 
	@FindBy(xpath="(//input[@class='mdc-checkbox__native-control'])[1]")
	public WebElement SelectCheckBox;
	
	@FindBy(xpath="//mat-icon[normalize-space()='highlight_off']")
	public WebElement CrossButton;
	
	@FindBy(xpath="//span[normalize-space()='Previous']")
	public WebElement PreviousButton;
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	public WebElement NextButton;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='close']")
	public WebElement EditScreenCrossButton;
	
	@FindBy(xpath = "//span[normalize-space()='Preview']")
	public WebElement PreviewButton;
	
	@FindBy(xpath ="//mat-icon[normalize-space()='close']")
	public WebElement PreviewpageClosebutton;
	
	@FindBy(xpath ="//span[normalize-space()='History']")
	public WebElement HistoryButton;
	
	
	@FindBy(xpath ="//table[@aria-describedby='Purchase Table']//tr[1]/td[1]//mat-checkbox/div")
	public WebElement ParticularCHeckBox;
	
	@FindBy(xpath = "(//td[@role='cell'])[2]")
	public WebElement FileICon;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='file_download']")
	public WebElement DownloadFileIcon;
	
	@FindBy(xpath = "//button[@class='mat-focus-indicator action-button primary-button mr-1 mat-button mat-button-base']")
	public WebElement FileIconSaveButton;
	
	@FindBy(xpath="(//a[@class='add white-space-nowrap onelineclamp ng-tns-c361-21'])[1]")
	public WebElement ClickonID;
	
	@FindBy(xpath="//mat-icon[normalize-space()='close']")
	public WebElement CloseButton;
	
	@FindBy(xpath="//span[normalize-space()='Save and Exit']")
	public WebElement SaveAndExitButton;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[2]")
	public WebElement Discounttypedropdown;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement editpurchaseinvoicesavebutton;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='settings_suggest']")
	public WebElement SettingsIcon;
	
	@FindBy(xpath = "(//mat-icon[normalize-space()='add_circle'])[2]")
	public WebElement AddSupplierButton;
	
	@FindBy(xpath = "//input[@formcontrolname='supplierName']")
	public WebElement SuuplierName;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement SaveButtonAddsupplierPage;
	
	@FindBy(xpath = "//span[normalize-space()='Cancel Changes']")
	public WebElement cancelchangesButton;
	
	@FindBy(xpath = "//span[normalize-space()='Back to Purchase Invoices']")
	public WebElement BackToPurchaseInvoicesLink;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='edit']")
	public WebElement EditSupplierButton;
	
	@FindBy(xpath = "(//div[@role='tab'])[2]")
	public WebElement HistoryTab;
	
	@FindBy(xpath = "(//div[normalize-space()='Duplicate record has been processed successfully.'])")
	public WebElement DuplicateSuccessMessage;
	
	
	@FindBy(xpath = "//a[@class='link text-decoration-none d-flex align-items-center']")
	public WebElement AddAnotherItem;
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")
	public WebElement ParticularIdCheckBox;
	
	@FindBy(xpath = "//a[normalize-space()='Cancel']")
	public WebElement CancelLinkFooter;
	
	@FindBy(xpath = "//p[normalize-space()='Bulk Edit']//parent::span//parent::button")
	public WebElement BulkEditButton;
	
	@FindBy(xpath = "//span[normalize-space()='Save']//parent::button")
	public WebElement BulkEditSaveButton;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='close']")
	public WebElement BulkEditPopupInCloseButton;
	
	@FindBy(xpath = "//span[normalize-space()='Upload Purchase Invoices']")
	public WebElement purchaseInvoiceMainGrid;
	
	@FindBy(xpath = "//p[normalize-space()='Delete']/ancestor::button")
	public WebElement FooterDeleteButton;
	
	@FindBy(xpath = "//h2[normalize-space()='Confirm Delete']")
	public WebElement ConfirmDeletePopup;
	
	@FindBy(xpath = "//p[normalize-space()='Excel']//parent::span//parent::button")
	public WebElement FooterExcelButton;
	
	@FindBy(xpath = "//p[normalize-space()='CSV']//parent::span//parent::button")
	public WebElement FooterCSVButton;
	
	@FindBy(xpath = "//p[normalize-space()='PDF']//parent::span//parent::button")
	public WebElement FooterPDFButton;
	
	@FindBy(xpath = "//p[normalize-space()='Archive']//parent::span//parent::button")
	public WebElement FooterArchiveButton;
	
	@FindBy(xpath = "//h2[normalize-space()='Confirm Archive']")
	public WebElement ConfirmArchivePopup;
	
	@FindBy(xpath ="//p[normalize-space()='Restore']//parent::span//parent::button")
	public WebElement FooterRestoreButton;
	
	@FindBy(xpath ="//tr[1]//span[normalize-space()='Duplicate']//parent::button")
	public WebElement DuplocateLogo;
	
	@FindBy(xpath ="//span[normalize-space()='Yes']//parent::button")
	public WebElement ProcessDuplicatePopupYesButton;
	
	@FindBy(xpath ="//span[normalize-space()='No']//parent::button")
	public WebElement ProcessDuplicatePopupNoButton;
	
	@FindBy(xpath ="//input[@id='txtFromDate']")
	public WebElement FromDateinbookeeping;
	
	@FindBy(xpath ="//p[normalize-space()='Approval withdrawn successfully.']")
	public WebElement WithdrawApproval;
	
	@FindBy(xpath ="//div[normalize-space()='Record has been marked as rejected successfully.']")
	public WebElement rejectMessage;
	
	@FindBy(xpath ="//p[normalize-space()='Rejection has been withdrawn successfully.']")
	public WebElement WithdrawRejection;
}