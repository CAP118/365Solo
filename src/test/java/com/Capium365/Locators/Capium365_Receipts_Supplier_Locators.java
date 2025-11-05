package com.Capium365.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Capium365_Receipts_Supplier_Locators {

	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_arrow_right']")
	public WebElement KeyBoardErrowRight;
	
	@FindBy(xpath = "//mat-icon[text()='people_outline']//parent::div")
	public WebElement SuppliersMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Add Supplier']")
	public WebElement AddSupplier;
	
	@FindBy(xpath = "//input[@formcontrolname='supplierName']")
	public WebElement SupplierField;
	
	// Export Functionality
	@FindBy(xpath = "(//mat-icon[text()='more_vert'])[1]")
	public WebElement Threedoticon;
	
	@FindBy(xpath = "//button[@role='menuitem']")
	public WebElement ExporttoExcel;
	
	@FindBy(xpath = "(//button[@role='menuitem'])[2]")
	public WebElement Exporttocsv;
	
	@FindBy(xpath = "((//button[@role='menuitem'])[3])")
	public WebElement Exporttopdf;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement SearchBar;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='close']")
	public WebElement CrossButtonEditSupplier;
	
	@FindBy(xpath = "//span[normalize-space()='Yes']")
	public WebElement YesButton;
	
	@FindBy(xpath = "//span[normalize-space()='No']")
	public WebElement NoButton;
	
	@FindBy(xpath = "(//input[@class='mdc-checkbox__native-control'])[1]")
	public WebElement SelectCheckBox;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='highlight_off']")
	public WebElement CrossButton;
	
	@FindBy(xpath = "//button[contains(@class,'paginator-next')]")
	public WebElement NextButton;
	
	@FindBy(xpath = "//button[contains(@class,'paginator-previous')]")
	public WebElement PreviousButton;
	
	@FindBy(xpath = "//a[normalize-space()='Cancel']")
	public WebElement CancelButton;
	
	@FindBy(xpath = "//table[@aria-describedby='Suppiler List Table']//tr[1]/td[1]//mat-checkbox/div")
	public WebElement SupplierIDCheckBox;
	
	@FindBy(xpath = "(//mat-icon[normalize-space()='delete_outline'])[51]")
	public WebElement FooterDeleteButtton;
	
	@FindBy(xpath = "(//mat-icon[normalize-space()='delete_outline'])[51]")
	public WebElement ConfirmDeletePopup;
	
	@FindBy(xpath = "//p[normalize-space()='Excel']//parent::span//parent::button")
	public WebElement FooterExcelButton;
	
	@FindBy(xpath = "//p[normalize-space()='CSV']//parent::span//parent::button")
	public WebElement FooterCsvButton;
	
	@FindBy(xpath = "//p[normalize-space()='PDF']//parent::span//parent::button")
	public WebElement FooterPdfButton;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='highlight_off']//parent::span//parent::button")
	public WebElement FooterCrossButton;
	
	@FindBy(xpath = "//a[@class='add onelineclamp']")
	public WebElement SupplierID;
	
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	public WebElement InsideEditSupplierCheckBox;
	
	@FindBy(xpath = "//span[normalize-space()='GF']")
	public WebElement HistoryLogo;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='close']")
    public WebElement HistoryTabCloseButton;

}