//package com.Capium365.Locators;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//
//public class Capium365_BankTab_Locators {
//
//	@FindBy(xpath="//span[text()='Bank']/ancestor::a")
//	@CacheLookup
//	public WebElement banktab;
//	
//	@FindBy(xpath="//mat-icon[text()='keyboard_arrow_right' and @data-mat-icon-type='font']")
//	@CacheLookup
//	public WebElement expandarrow;
//	
//	@FindBy(xpath="(//mat-icon[@fontset='material-icons-outlined'])[3]")
//	@CacheLookup
//	public WebElement bankaccounttab;
//	
//	@FindBy(xpath="//span[text()='Add New Account']")
//	@CacheLookup
//	public WebElement addnewaccountbutn;
//	
//	@FindBy(xpath="//input[@type='search']")
//	@CacheLookup
//	public WebElement bankTF;
//	
//	@FindBy(xpath="//div[text()='Mock']")
//	@CacheLookup
//	public WebElement mockbankselection;
//	
//	@FindBy(xpath="//div[text()='Allow']")
//	@CacheLookup
//	public WebElement allowbutton;
//	
//	@FindBy(xpath="//input[@placeholder='User Name']")
//	@CacheLookup
//	public WebElement truelayerusername;
//	
//	@FindBy(xpath="//input[@placeholder='Password']")
//	@CacheLookup
//	public WebElement truelayerpassword;
//	
//	@FindBy(xpath="//div[text()='Proceed']")
//	@CacheLookup
//	public WebElement proceedbutton;
//	
//	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[1]")
//	@CacheLookup
//	public WebElement selectaccount;
//	
//	@FindBy(xpath="//span[text()=' Continue ']")
//	@CacheLookup
//	public WebElement continuebutton;
//	
//	//Delete
//	@FindBy(xpath="//button[contains(@class, 'delete-button') and .//mat-icon[text()='delete_outline']]")
//	@CacheLookup
//	public WebElement deleteicon;
//	
//	@FindBy(xpath="//span[text()=' Yes ']")
//	@CacheLookup
//	public WebElement deletepopupyes;
//	
//	@FindBy(xpath="//input[@data-placeholder='Search']")
//	@CacheLookup
//	public WebElement searchTF;
//	
////	@FindBy(xpath="//span[text()='No records found']")
////	@CacheLookup
////	public WebElement norecordsfound;
//	
//	//Date dropdown
//	@FindBy(xpath="//div[@class='ng-value ng-star-inserted']")
//	@CacheLookup
//	public WebElement datedropdown;
//	
//	//Export menu 3 dots
//	@FindBy(xpath="//mat-icon[@aria-hidden='true' and text()='more_vert']")
//	@CacheLookup
//	public WebElement exportthreedotmenu;
//	
//	@FindBy(xpath="//mat-icon[@aria-hidden='true' and text()='border_all']")
//	//@FindBy(xpath="(//button[@tabindex='0'])[4]")
//	@CacheLookup
//	public WebElement exporttoexcel;
//	
//	@FindBy(xpath="//span[@class='mat-button-wrapper']//mat-icon[@role='img'][normalize-space()='description']")
//	@CacheLookup
//	public WebElement exporttocsv;
//	
//	@FindBy(xpath="//div[@class='cdk-overlay-container']//button[2]")
//	@CacheLookup
//	public WebElement exporttocsvonkebab;
//	
//	@FindBy(xpath="//mat-icon[text()='picture_as_pdf' and @fontset='material-icons-outlined'] ")
//	@CacheLookup
//	public WebElement exporttopdf;
//	
//	//Pagination
//	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c115-36']")
//	@CacheLookup
//	public WebElement pagintaiondd50;
//	
//	//@FindBy(xpath="//mat-checkbox[normalize-space(@class)='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']")
//	@FindBy(xpath="(//th[@style='top: 0px; z-index: 100;'])[1]")
//	@CacheLookup
//	public WebElement radiobutton;
//	
//	
//	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
//	@CacheLookup
//	public WebElement crossmark;
//	
//	@FindBy(xpath="//span[@class='mat-option-text' and text()='10']")
//	@CacheLookup
//	public WebElement pagintaiondd10;
//	
//	@FindBy(xpath="//span[@class='mat-option-text' and text()='20']")
//	@CacheLookup
//	public WebElement pagintaiondd20;
//	
//	@FindBy(xpath="//span[@class='mat-option-text' and text()='100']")
//	@CacheLookup
//	public WebElement pagintaiondd100;
//	
//	//page numbers
//	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 2 ']")
//	@CacheLookup
//	public WebElement pagenumber2;
//	
//	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 3 ']")
//	@CacheLookup
//	public WebElement pagenumber3;
//	
//	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 4 ']")
//	@CacheLookup
//	public WebElement pagenumber4;
//	
//	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 5 ']")
//	@CacheLookup
//	public WebElement pagenumber5;
//	
//	//previous arrow
//	@FindBy(xpath="//mat-icon[@aria-hidden='true' and text()='chevron_left']")
//	@CacheLookup
//	public WebElement previousarrow;
//	
//	//next arrow
//	@FindBy(xpath="//mat-icon[@data-mat-icon-type='font' and text()='chevron_right']//parent::span")
//	@CacheLookup
//	public WebElement nextarrow;
//	
//	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 9 ']")
//	@CacheLookup
//	public WebElement pagenumber9;
//	
//	//Go to text field
//	@FindBy(xpath="//input[@formcontrolname='pageNumber']")
//	@CacheLookup
//	public WebElement gotoTF;
//	
//	//settings and business
//	@FindBy(xpath="//a[@title='Settings']")
//	@CacheLookup
//	public WebElement settingsicon;
//	
//	@FindBy(xpath="(//div[@class='mat-ripple mat-menu-ripple'])[1]")
//	@CacheLookup
//	public WebElement mybussinessoption;
//	
//	@FindBy(xpath="//div[@class='mt-1']//a[@class='link'][normalize-space()='Add New Line']")
//	@CacheLookup
//	public WebElement Addnewline;
//	
//	@FindBy(xpath="//p[@class='mb-1 text-primary font-size-16 fw-bold']")
//	@CacheLookup
//	public WebElement bankdetails;
//	
//	@FindBy(xpath="(//input[@formcontrolname='accountName'])[1]")
//	@CacheLookup
//	public WebElement transactionaccount1business;
//	
//	@FindBy(xpath="(//input[@formcontrolname='accountName'])[2]")
//	@CacheLookup
//	public WebElement cashbusiness;
//	
//	@FindBy(xpath="(//input[@formcontrolname='accountName'])[3]")
//	@CacheLookup
//	public WebElement hdfcbusiness;
//	
//	@FindBy(xpath="(//input[@formcontrolname='accountName'])[4]")
//	@CacheLookup
//	public WebElement icicibusiness;
//	
//	@FindBy(xpath="(//input[@formcontrolname='accountName'])[5]")
//	@CacheLookup
//	public WebElement thripleeightbusiness;
//	
//	@FindBy(xpath="//span[@title='TRANSACTION ACCOUNT 1 (0000)']")
//	@CacheLookup
//	public WebElement transactionaccount1bank;
//	
//	@FindBy(xpath="//span[@title='Cash']")
//	@CacheLookup
//	public WebElement cashbank;
//	
//	@FindBy(xpath="(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[3]")
//	@CacheLookup
//	public WebElement hdfcbank;
//	
//	@FindBy(xpath="(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[4]")
//	@CacheLookup
//	public WebElement icicibank;
//	
//	@FindBy(xpath="(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[5]")
//	@CacheLookup
//	public WebElement thripleeightbank;
//	
//	@FindBy(xpath="//table[@aria-describedby='Bank Detail Table']/tbody/tr/td[1]")
//	@CacheLookup
//	public WebElement expectedbanknamecolumn;
//	
//	@FindBy(xpath="//div[@class='bank-details-listview']")
//	@CacheLookup
//	public WebElement actualbankwholescreen;
//	
//	@FindBy(xpath="//div[@class='d-flex gap-20']//div[1]")
//	@CacheLookup
//	public WebElement moneyinheader;
//	
//	@FindBy(xpath="//span[@class='add fw-normal font-size-13' and text()='Refresh Account']")
//	@CacheLookup
//	public WebElement refreshaccount;
//	
//	@FindBy(xpath="//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'][normalize-space()='search']")
//	@CacheLookup
//	public WebElement searchiconinexpandarrow;
//	
//	@FindBy(xpath="(//input[normalize-space(@placeholder)='Search'])[1]")
//	@CacheLookup
//	public WebElement searchTFinexpandarrow;
//	
//	@FindBy(xpath="//mat-icon[normalize-space()='highlight_off']")
//	@CacheLookup
//	public WebElement crossmarkinexpandarrow;
//}

package com.Capium365.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium365_BankTab_Locators {

	@FindBy(xpath="//span[text()='Bank']/ancestor::a")
	@CacheLookup
	public WebElement banktab;
	
	@FindBy(xpath="//mat-icon[text()='keyboard_arrow_right' and @data-mat-icon-type='font']")
	@CacheLookup
	public WebElement expandarrow;
	
	@FindBy(xpath="(//mat-icon[@fontset='material-icons-outlined'])[3]")
	@CacheLookup
	public WebElement bankaccounttab;
	
	@FindBy(xpath="//span[text()='Add Account']")
	@CacheLookup
	public WebElement addnewaccountbutn;
	
	@FindBy(xpath="//input[@type='search']")
	@CacheLookup
	public WebElement bankTF;
	
	@FindBy(xpath="//div[text()='Mock']")
	@CacheLookup
	public WebElement mockbankselection;
	
	@FindBy(xpath="//div[text()='Allow']")
	@CacheLookup
	public WebElement allowbutton;
	
	@FindBy(xpath="//input[@placeholder='User Name']")
	@CacheLookup
	public WebElement truelayerusername;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	public WebElement truelayerpassword;
	
	@FindBy(xpath="//div[text()='Proceed']")
	@CacheLookup
	public WebElement proceedbutton;
	
	@FindBy(xpath="(//input[@class='mdc-radio__native-control'])[1]")
	@CacheLookup
	public WebElement selectaccount;
	
	@FindBy(xpath="//span[text()=' Continue ']")
	@CacheLookup
	public WebElement continuebutton;
	
	//Delete
	@FindBy(xpath="//button[contains(@class, 'delete-button') and .//mat-icon[text()='delete_outline']]")
	@CacheLookup
	public WebElement deleteicon;
	
	@FindBy(xpath="//span[text()=' Yes ']")
	@CacheLookup
	public WebElement deletepopupyes;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTF;
	
//	@FindBy(xpath="//span[text()='No records found']")
//	@CacheLookup
//	public WebElement norecordsfound;
	
	//Date dropdown
	@FindBy(xpath="//div[@class='ng-value ng-star-inserted']")
	@CacheLookup
	public WebElement datedropdown;
	
	//Export menu 3 dots
	@FindBy(xpath="//mat-icon[@aria-hidden='true' and text()='more_vert']")
	@CacheLookup
	public WebElement exportthreedotmenu;
	
	@FindBy(xpath="//mat-icon[@aria-hidden='true' and text()='border_all']")
	//@FindBy(xpath="(//button[@tabindex='0'])[4]")
	@CacheLookup
	public WebElement exporttoexcel;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']//mat-icon[@role='img'][normalize-space()='description']")
	@CacheLookup
	public WebElement exporttocsv;
	
	@FindBy(xpath="//div[@class='cdk-overlay-container']//button[2]")
	@CacheLookup
	public WebElement exporttocsvonkebab;
	
	@FindBy(xpath="//mat-icon[text()='picture_as_pdf' and @fontset='material-icons-outlined'] ")
	@CacheLookup
	public WebElement exporttopdf;
	
	//Pagination
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c115-36']")
	@CacheLookup
	public WebElement pagintaiondd50;
	
	//@FindBy(xpath="//mat-checkbox[normalize-space(@class)='mat-checkbox mat-accent ng-valid ng-dirty ng-touched']")
	@FindBy(xpath="(//th[@style='top: 0px; z-index: 100;'])[1]")
	@CacheLookup
	public WebElement radiobutton;
	
	
	@FindBy(xpath="//mat-icon[normalize-space(text())='highlight_off']")
	@CacheLookup
	public WebElement crossmark;
	
	@FindBy(xpath="//span[@class='mat-option-text' and text()='10']")
	@CacheLookup
	public WebElement pagintaiondd10;
	
	@FindBy(xpath="//span[@class='mat-option-text' and text()='20']")
	@CacheLookup
	public WebElement pagintaiondd20;
	
	@FindBy(xpath="//span[@class='mat-option-text' and text()='100']")
	@CacheLookup
	public WebElement pagintaiondd100;
	
	//page numbers
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 2 ']")
	@CacheLookup
	public WebElement pagenumber2;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 3 ']")
	@CacheLookup
	public WebElement pagenumber3;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 4 ']")
	@CacheLookup
	public WebElement pagenumber4;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 5 ']")
	@CacheLookup
	public WebElement pagenumber5;
	
	//previous arrow
	@FindBy(xpath="//mat-icon[@aria-hidden='true' and text()='chevron_left']")
	@CacheLookup
	public WebElement previousarrow;
	
	//next arrow
	@FindBy(xpath="//mat-icon[@data-mat-icon-type='font' and text()='chevron_right']//parent::span")
	@CacheLookup
	public WebElement nextarrow;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' 9 ']")
	@CacheLookup
	public WebElement pagenumber9;
	
	//Go to text field
	@FindBy(xpath="//input[@formcontrolname='pageNumber']")
	@CacheLookup
	public WebElement gotoTF;
	
	//settings and business
	@FindBy(xpath="//a[@title='Settings']")
	@CacheLookup
	public WebElement settingsicon;
	
	@FindBy(xpath="(//div[@class='mat-ripple mat-menu-ripple'])[1]")
	@CacheLookup
	public WebElement mybussinessoption;
	
	@FindBy(xpath="//div[@class='mt-1']//a[@class='link'][normalize-space()='Add New Line']")
	@CacheLookup
	public WebElement Addnewline;
	
	@FindBy(xpath="//p[@class='mb-1 text-primary font-size-16 fw-bold']")
	@CacheLookup
	public WebElement bankdetails;
	
	@FindBy(xpath="(//input[@formcontrolname='accountName'])[1]")
	@CacheLookup
	public WebElement transactionaccount1business;
	
	@FindBy(xpath="(//input[@formcontrolname='accountName'])[2]")
	@CacheLookup
	public WebElement cashbusiness;
	
	@FindBy(xpath="(//input[@formcontrolname='accountName'])[3]")
	@CacheLookup
	public WebElement hdfcbusiness;
	
	@FindBy(xpath="(//input[@formcontrolname='accountName'])[4]")
	@CacheLookup
	public WebElement icicibusiness;
	
	@FindBy(xpath="(//input[@formcontrolname='accountName'])[5]")
	@CacheLookup
	public WebElement thripleeightbusiness;
	
	@FindBy(xpath="//span[@title='TRANSACTION ACCOUNT 1 (0000)']")
	@CacheLookup
	public WebElement transactionaccount1bank;
	
	@FindBy(xpath="//span[@title='Cash']")
	@CacheLookup
	public WebElement cashbank;
	
	@FindBy(xpath="(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[3]")
	@CacheLookup
	public WebElement hdfcbank;
	
	@FindBy(xpath="(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[4]")
	@CacheLookup
	public WebElement icicibank;
	
	@FindBy(xpath="(//div[@class='card-bank-icon d-flex gap-10 mb-5'])[5]")
	@CacheLookup
	public WebElement thripleeightbank;
	
	@FindBy(xpath="//table[@aria-describedby='Bank Detail Table']/tbody/tr/td[1]")
	@CacheLookup
	public WebElement expectedbanknamecolumn;
	
	@FindBy(xpath="//div[@class='bank-details-listview']")
	@CacheLookup
	public WebElement actualbankwholescreen;
	
	@FindBy(xpath="//div[@class='d-flex gap-20']//div[1]")
	@CacheLookup
	public WebElement moneyinheader;
	
	@FindBy(xpath="//span[@class='add fw-normal font-size-13 white-space-nowrap' and text()='Refresh Account']")
	@CacheLookup
	public WebElement refreshaccount;
	
	@FindBy(xpath="//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'][normalize-space()='search']")
	@CacheLookup
	public WebElement searchiconinexpandarrow;
	
	@FindBy(xpath="(//input[normalize-space(@placeholder)='Search'])[1]")
	@CacheLookup
	public WebElement searchTFinexpandarrow;
	
	@FindBy(xpath="//mat-icon[normalize-space()='highlight_off']")
	@CacheLookup
	public WebElement crossmarkinexpandarrow;
	
	@FindBy(xpath="//input[@formcontrolname='ruleName']")
	@CacheLookup
	public WebElement RuleNameTextBox;
	
	@FindBy(xpath="//input[@formcontrolname='value']")
	@CacheLookup
	public WebElement RuleValueBox;
	
	@FindBy(xpath="(//input[@formcontrolname='description'])[1]")
	@CacheLookup
	public WebElement RuleDescription;
	
	@FindBy(xpath="(//input[@formcontrolname='amount'])[1]")
	@CacheLookup
	public WebElement RuleAmount;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	@CacheLookup
	public WebElement SearchBar;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	@CacheLookup
	public WebElement BankMainGridSearchBar;
	
	@FindBy(xpath="(//input[@formcontrolname='description'])[2]")
	@CacheLookup
	public WebElement AddJournalDescription;
	
	@FindBy(xpath="(//input[@formcontrolname='description'])[3]")
	@CacheLookup
	public WebElement AddJournalDescriptionforCreateJournal;
	
	
	@FindBy(xpath="//input[@id='txtDateFrom']")
	@CacheLookup
	public WebElement Journalstartdate;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	@CacheLookup
	public WebElement TotalNet;
	
}

