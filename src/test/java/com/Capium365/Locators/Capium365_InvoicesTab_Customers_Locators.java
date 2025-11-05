package com.Capium365.Locators;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class Capium365_InvoicesTab_Customers_Locators {
 
	@FindBy(xpath = "//mat-icon[text()='keyboard_arrow_right']")
	public WebElement arrowbutton;
	@FindBy(xpath = "//span[normalize-space()='Add Customer']/ancestor::button")
	public WebElement addcustomerbutton;
	@FindBy(xpath = "//input[@formcontrolname='fullName']")
	public WebElement fullnametextbox;
	@FindBy(xpath = "//input[@formcontrolname='email']")
	public WebElement enteremail;
	@FindBy(xpath = "//span[normalize-space(text())='Save']")
	public WebElement savebutton;
	@FindBy(xpath ="//span[normalize-space(text())= 'Save and Exit' ]")
	public WebElement saveandexitbutton;
	@FindBy(xpath ="//span[normalize-space(text())='Cancel Changes']")
	public WebElement cancelchangesbutton;
	@FindBy(xpath ="//input[@formcontrolname='phone']")
	public WebElement enterphnumber;
	@FindBy(xpath="//input[@formcontrolname='whatsAppNumber']")
	public WebElement enterwhatsappnumber;
	@FindBy(xpath ="//input[@formcontrolname='address']")
	public WebElement enteraddress;
	@FindBy(xpath ="//input[@formcontrolname='city']")
	public WebElement entercity;
	@FindBy(xpath ="//input[@formcontrolname='county']")
	public WebElement entercounty;
	@FindBy(xpath ="//input[@formcontrolname='postalCode']")
	public WebElement enterpostcode;
 
	@FindBy(xpath="//a[normalize-space(text())='Add New line']")
	public WebElement contactdetailsaddnewline;
	@FindBy(xpath="//a[normalize-space(text())='Add New Line']")
	public WebElement addressdetailsaddnewline;
	@FindBy(xpath="(//input[@formcontrolname='name'])[2]")
	public WebElement contactdetailsname;
	@FindBy(xpath="(//input[@formcontrolname='email'])[2]")
	public WebElement email;
	@FindBy(xpath="(//input[@formcontrolname='phone'])[2]")
	public WebElement phonenumber;
	@FindBy(xpath="(//input[normalize-space(@formcontrolname)='whatsAppNumber'])[2]")
	public WebElement whatsappnumber;
	@FindBy(xpath="(//input[@name='isPrimary'])[2]")
	public WebElement primaryradiobutton;
	@FindBy(xpath="(//mat-icon[@role='img'][normalize-space()='highlight_off'])[1]")
	public WebElement contactdetailscrossbutton;
 
	@FindBy(xpath="(//input[@formcontrolname='address'])[2]")
	public WebElement address;
	@FindBy(xpath="(//input[@formcontrolname='city'])[2]")
	public WebElement city;
	@FindBy(xpath="(//input[@formcontrolname='county'])[2]")
	public WebElement county;
	@FindBy(xpath="(//input[@formcontrolname='postalCode'])[2]")
	public WebElement postcode;
	@FindBy(xpath="(//mat-icon[@role='img'][normalize-space()='highlight_off'])[2]")
	public WebElement addressdetailscrossbutton;
 
	@FindBy(xpath="(//mat-icon[normalize-space(text())='close'])[1]")
	public WebElement searchcrossbutton;
	@FindBy(xpath="//mat-icon[normalize-space(text())='search']")
	public WebElement addnewcustomersearch;
	@FindBy(xpath="//div[contains(@class,'side-list')]/a/mat-icon[contains(text(),'add_circle')]")
	public WebElement customeraddbutton;
	@FindBy(xpath ="//mat-icon[normalize-space(text())='close']")
	public WebElement addnewcustomercrossbutton;
	@FindBy(xpath="//a[noramlize-space(text())='Cancel']")
	public WebElement cancelrecord;
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	public WebElement cross;
	@FindBy(xpath="//mat-icon[normalize-space(text())='search']")
	public WebElement customersearchbutton;
	@FindBy(xpath="//mat-icon[normalize-space(text())='more_vert']")
	public WebElement actions;
	@FindBy(xpath="//a[normalize-space(text())='Cancel']")
	public WebElement recordcancel;
 
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	public WebElement selecteditemcrosssbutton;
	@FindBy(xpath="//mat-icon[normalize-space(text())='keyboard_arrow_down']")
	public WebElement addcustomerarrow;
	@FindBy(xpath="//mat-icon[normalize-space()='edit']/ancestor::button")
	public WebElement mousehoveredit;
 
	@FindBy(xpath="//mat-icon[normalize-space()='archive']/ancestor::button")
	public WebElement mousehoverarchive;
 
	@FindBy(xpath="//span[normalize-space(text())='Next']")
	public WebElement nextpageincustomer;
	@FindBy(xpath="//span[normalize-space(text())='Previous']")
	public WebElement previouspageincustomer;
	@FindBy(xpath="//table[@aria-describedby='Client List Table']//tr[1]/td[1]//mat-checkbox")
	public WebElement customercheckboxincustomer;
	@FindBy(xpath="//mat-icon[normalize-space()='unarchive']/ancestor::button")
	public WebElement mousehoverunarchive;
 
}