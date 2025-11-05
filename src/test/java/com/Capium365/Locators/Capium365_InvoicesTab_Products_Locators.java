package com.Capium365.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium365_InvoicesTab_Products_Locators {

	@FindBy(xpath = "//input[normalize-space(@placeholder)='Search']")
	@CacheLookup
	public WebElement search;
	
	
	@FindBy(xpath = "//tr[1]//td//mat-icon[normalize-space()='edit']")
	@CacheLookup
	public WebElement EditProduct;
	
	
	@FindBy(xpath = "//tr[1]//td//mat-icon[normalize-space()='delete_outline']")
	@CacheLookup
	public WebElement DeleteProduct;
	
	@FindBy(xpath = "//tr[1]//td//mat-icon[normalize-space()='archive']")
	@CacheLookup
	public WebElement Archivebutton;
	
	
}
