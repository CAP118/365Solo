package com.Capium365.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Capium365_Dashboard_Locators {

	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	public WebElement ClickOnFilterInvoiceDropdown;
	
	@FindBy(xpath="(//mat-select[@panelclass='myPanelClass'])[1]")
	public WebElement ClickOnInvoicesDropdown;
	
	@FindBy(xpath="//div[@role='listbox']/mat-option")
	public WebElement SelecteachoptionFromDropdown;
	
	@FindBy(xpath = "//mat-option//span[@class='mat-option-text']/span")
	public List<WebElement> SelectAllOptionsOnAcountsDropdownWebElemt;
	
	@FindBy(xpath="//button[normalize-space(text())='My Business']")
	public WebElement SelectMyBuBusinessUnderSettings;
	
	
	public static By filterDropdown = By.xpath("//ng-select//div[contains(@class,'ng-select-container')]");
    public static By dropdownOptions = By.xpath("//ng-dropdown-panel//div[@role='option']");

    public static By totalRaised = By.xpath("//div[contains(text(),'Total Raised')]/following-sibling::div");
    public static By totalReceived = By.xpath("//div[contains(text(),'Total Received')]/following-sibling::div");
    public static By totalDue = By.xpath("//div[contains(text(),'Total Due')]/following-sibling::div");
    public static By totalOverdue = By.xpath("//div[contains(text(),'Total Overdue')]/following-sibling::div");
    public static By totalOwed = By.xpath("//div[contains(text(),'Total Owed')]/following-sibling::div");

    public static By xAxisLabels = By.xpath("//div[@class='apexcharts-xaxis']//text");
}
