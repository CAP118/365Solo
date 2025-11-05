package com.Capium365.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Utilites.HelperClass;

public class Capium365_ReportsPage_Actions {

	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	HelperClass helper;
	
	@FindBy(xpath="//a[@href='/reports/expense']/span[normalize-space()='Reports']")
	private WebElement ClickOnPeropts;
	
	@FindBy(xpath="//ng-select[@panelclass='myPanelClass' and contains(@class,'w-170')]")
	private WebElement ClickOnReportsTimeFilter;
	
	@FindBy(xpath="//button/span/mat-icon[normalize-space()='filter_list']")
	private WebElement ClickOnFilterOption;
	
	
	
	
}
