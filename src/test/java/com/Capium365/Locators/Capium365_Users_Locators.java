package com.Capium365.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium365_Users_Locators {

	@FindBy(xpath="//mat-icon[@role='img' and text()='group']")
	@CacheLookup
	public WebElement userstab;
	
	@FindBy(xpath="//mat-icon[@role='img' and text()='add']")
	@CacheLookup
	public WebElement adduserbutton;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	@CacheLookup
	public WebElement firstnametextfield;
	
	@FindBy(xpath="//input[@formcontrolname='email' and @type='email']")
	@CacheLookup
	public WebElement emailtextfield;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' Save and Exit ']")
	@CacheLookup
	public WebElement saveandexitbutton;
	
	@FindBy(xpath="//input[@formcontrolname='middleName']")
	@CacheLookup
	public WebElement middlenametextfield;
	
	@FindBy(xpath="//input[@maxlength='50' and @formcontrolname='lastName']")
	@CacheLookup
	public WebElement lastnametextfield;
	
	@FindBy(xpath="//input[@type='tel' and @formcontrolname='phone']")
	@CacheLookup
	public WebElement phonenumbertextfield;
	
	@FindBy(xpath="//input[@formcontrolname='address']")
	@CacheLookup
	public WebElement addresstextfield;
	
	@FindBy(xpath="//input[@formcontrolname='city']")
	@CacheLookup
	public WebElement citytextfield;
	
	@FindBy(xpath="//input[@formcontrolname='county']")
	@CacheLookup
	public WebElement countytextfield;
	
	@FindBy(xpath="//input[@formcontrolname='postalCode']")
	@CacheLookup
	public WebElement zipcodetextfield;
	
	@FindBy(xpath="//mat-icon[@role='img'and text()='delete_outline']")
	@CacheLookup
	public WebElement deleteicon;
	
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']")
	@CacheLookup
	public WebElement deletebyselectingcheckbox;
	
	@FindBy(xpath="//span[normalize-space()='Yes']")
	@CacheLookup
	public WebElement yesindeletepopup;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTF;
	
	@FindBy(xpath="//mat-icon[text()='more_vert']")
	@CacheLookup
	public WebElement kebabmenu;
	
	@FindBy(xpath="(//div[@class='mat-ripple mat-menu-ripple'])[1]")
	@CacheLookup
	public WebElement exporttoexcel;
 
	@FindBy(xpath="(//div[@class='mat-ripple mat-menu-ripple'])[2]")
	@CacheLookup
	public WebElement exporttocsv;
 
	@FindBy(xpath="(//div[@class='mat-ripple mat-menu-ripple'])[3]")
	@CacheLookup
	public WebElement exporttopdf;
	
	@FindBy(xpath="//label[@for='mat-checkbox-1-input']//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	@CacheLookup
	public WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Edit User (U007)']")
	@CacheLookup
	public WebElement edituserelement;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator action-button secondary-button mr-1 mat-button mat-button-base']")
	@CacheLookup
	public WebElement archivepopupyes;
 
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[7]")
	@CacheLookup
	public WebElement userid;
	
	@FindBy(xpath="//mat-icon[normalize-space()='border_all']")
	@CacheLookup
	public WebElement exportexcelindown;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	@CacheLookup
	public WebElement exportcsvindown;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	@CacheLookup
	public WebElement exportpdfindown;
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	@CacheLookup
	public WebElement archiveindown;
	
	@FindBy(xpath="//mat-icon[@data-mat-icon-type='font' and text()='unarchive']")
	@CacheLookup
	public WebElement restoreindown;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' Yes ']")
	@CacheLookup
	public WebElement restorepopupyes;
	
	@FindBy(xpath="//a[normalize-space()='Cancel']")
	@CacheLookup
	public WebElement cancelindown;
	
	@FindBy(xpath="//mat-icon[normalize-space()='highlight_off']")
	@CacheLookup
	public WebElement crossmarkindown;
	
	@FindBy(xpath="//mat-icon[normalize-space()='close']")
	@CacheLookup
	public WebElement crossmarkineditpage;
	
	@FindBy(xpath="//mat-icon[normalize-space()='keyboard_arrow_right']")
	@CacheLookup
	public WebElement expandarrow;
	
	@FindBy(xpath="//span[@class='onelineclamp side-list-header-text']")
	@CacheLookup
	public WebElement usereleinexpandarrow;
	
	@FindBy(xpath="//mat-icon[normalize-space()='add_circle']")
	@CacheLookup
	public WebElement plusymbolinedituserpage;
	
	@FindBy(xpath="//span[normalize-space()='Add New User']")
	@CacheLookup
	public WebElement addnewuserele;
	
	@FindBy(xpath="//mat-icon[normalize-space()='search']")
	@CacheLookup
	public WebElement searchiconinexpandarrow;
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[4]")
	@CacheLookup
	public WebElement checkboxinexpandarrow;
	
	@FindBy(xpath="//div[@class='mt-2']//button[1]")
	@CacheLookup
	public WebElement exportexcelinexpandarrow;
	
	@FindBy(xpath="//div[@class='mt-2']//button[2]")
	@CacheLookup
	public WebElement exportcsvinexpandarrow;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	@CacheLookup
	public WebElement exportpdfinexpandarrow;
	
	@FindBy(xpath="//div[@class='ng-star-inserted']//button[2]")
	@CacheLookup
	public WebElement archiveinexpandarrow;
	
	@FindBy(xpath="//div[@class='mt-1']//button[@type='button']")
	@CacheLookup
	public WebElement deleteinexpandarrow;
	
	@FindBy(xpath="(//mat-icon[text()='delete_outline'])[6]")
	@CacheLookup
	public WebElement deleteinthedown;
	
	@FindBy(xpath="//mat-icon[text()='delete_outline']")
	@CacheLookup
	public WebElement deleteinedituser;
}
