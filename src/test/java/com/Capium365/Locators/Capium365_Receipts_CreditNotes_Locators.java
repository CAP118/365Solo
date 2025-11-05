package com.Capium365.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Capium365_Receipts_CreditNotes_Locators {

	@FindBy(xpath = "//mat-icon[normalize-space()='credit_score']")
	public WebElement CreditNotesMenu;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='credit_score']")
	public WebElement UplaodCreditNotesButton;
	
	@FindBy(xpath = "(//span[normalize-space()='Upload Credit Notes'])[1]")
	public WebElement UploadCreditNotesButton;
	
	@FindBy(xpath = "//span[normalize-space()='Upload Credit Notes']")
	public WebElement UploadCreditNotes2Button;
	
	@FindBy(xpath = "(//span[normalize-space()='Cancel'])[1]")
	public WebElement UploadCreditNoteCancelButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement SearchBarCreditnote;
	
	// Export Functionality
	@FindBy(xpath = "(//mat-icon[text()='more_vert'])[1]")
	public WebElement Threedoticon;
	
	@FindBy(xpath = "//button[@role='menuitem']")
	public WebElement ExporttoExcel;
	
	@FindBy(xpath ="//input[@id='txtFromDate']")
	public WebElement FromDateinbookeeping;
	
	@FindBy(xpath = "(//button[@role='menuitem'])[2]")
	public WebElement Exporttocsv;
	
	@FindBy(xpath = "((//button[@role='menuitem'])[3])")
	public WebElement Exporttopdf;
	
	@FindBy(xpath = "(//span[normalize-space()='Duplicate'])[1]")
	public WebElement DuplocateLogo;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='close']")
	public WebElement EditScreenCrossButton;
	
	@FindBy(xpath = "//label[normalize-space()='Delete by selecting the box']")
	public WebElement ClickonselectCheckBox;
	
	@FindBy(xpath = "//span[normalize-space()='Yes']")
	public WebElement CreditNoteYeButton;
	
	@FindBy(xpath = "//span[normalize-space()='No']")
	public WebElement CreditNoteNoButton;
	
	@FindBy(xpath = "//span[normalize-space()='Preview']")
	public WebElement PreviewButton;
	
	@FindBy(xpath = "//span[normalize-space()='History']")
	public WebElement HistoryButton;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='close']")
	public WebElement HistoryCloseButton;
	
	@FindBy(xpath = "//h2[normalize-space()='PCRN023']")
	public WebElement CreditNoteID;
	
	@FindBy(xpath = "//tbody/tr[1]//div[normalize-space()='description']")
	public WebElement ReceiptLogo;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_arrow_right']")
	public WebElement KeyBoardErrowRight;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div/div")
	public WebElement ReceiptID;
	
	@FindBy(xpath = "//div[normalize-space()='The record has been restored successfully.']")
	public WebElement CreditnoteSuccessMesaage;
		
	@FindBy(xpath = "//span[normalize-space()='Choose a File']")
	public WebElement Creditnotechoosefilebutton;
	
	@FindBy(xpath = "//table[@aria-describedby='Purchase Credit Note Table']//tr[1]/td[1]//mat-checkbox/div")
	public WebElement CreditnoteParticularcheckbox;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div/div")
	public WebElement CreditnoteClickonID;
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	public WebElement calendrorbutton;
	
	@FindBy(xpath = "//span[normalize-space()='Save and Exit']")
	public WebElement SaveandExitButton;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='settings_suggest']")
	public WebElement SettingsIcon;
	
	@FindBy(xpath = "(//mat-icon[normalize-space()='close'])[2]")
	public WebElement closebuttonsetiingspopup;
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[3]")
	public WebElement savebuttonsettingsIcon;
	
	@FindBy(xpath="//input[@formcontrolname='purchaseNo']")
	public WebElement CreditNoteIDD;
	
	
	@FindBy(xpath = "(//mat-icon[normalize-space()='add_circle'])[2]")
	public WebElement PlusICon;
	
	@FindBy(xpath = "//input[@formcontrolname='supplierName']")
	public WebElement SupplierField;
	
	@FindBy(xpath = "(//span[normalize-space()='Save'])[2]")
	public WebElement SaveButtonnn;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='edit']")
	public WebElement supplierEditElement;
	
	@FindBy(xpath = "//span[normalize-space()='Yes']//parent::button")
	public WebElement ProcessDuplicatePopupYesButton;
	
	@FindBy(xpath = "//span[normalize-space()='No']//parent::button")
	public WebElement ProcessDuplicatePopupNoButton;

}