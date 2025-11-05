package com.Capium365.Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
public class Capium365_InvoicesTab_Invoices_Locators {
	@FindBy(xpath = "//input[normalize-space(@placeholder)='Search']")
	@CacheLookup
	public WebElement search;
	@FindBy(xpath = "//input[@id='txtSearch']")
	@CacheLookup
	public WebElement searchbarinBookeeping3;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement Checkboxinvoice;
 

	@FindBy(xpath = "//div[normalize-space()='Rejection has been withdrawn successfully.']")
	public WebElement WithdrawMessage;
//	@FindBy(xpath = "//div[normalize-space()='INV136 Record(s) successfully published to Bookkeeping.']")
//	public WebElement PublishSuccessMessage;
	@FindBy(xpath = "(//div[contains(text(),'Record(s) successfully published to Bookkeeping.')])[last()]")
	public WebElement PublishSuccessMessage;
	@FindBy(xpath="(//div[@title='Certsure LLP'][normalize-space()='Certsure LLP'])[1]")
	@CacheLookup
	public WebElement customername;

	@FindBy(xpath ="//div[normalize-space()='Record have been marked as approved successfully.']")
	public WebElement approvesuccessmessage;
	@FindBy(xpath = "//div[normalize-space()='Approval withdrawn successfully.']")
	public WebElement WithdrawApprovalMessage;
 
	@FindBy(xpath = "//div[normalize-space()='Record has been marked as rejected successfully.']")
	public WebElement RejectMessage;
	@FindBy(xpath="(//span[normalize-space()='Upload Invoices'])[1]")
	public WebElement uploadInvoicebutton;
	@FindBy(xpath="//span[normalize-space()='Choose a File']")
	public WebElement chooseafilebutton;
	@FindBy(xpath="(//span[normalize-space()='Upload Invoices'])[1]")
	public WebElement uploadInvoicebutton2;
	@FindBy(xpath="//span[normalize-space()='Save']")
	public WebElement saveincustomertab;
}