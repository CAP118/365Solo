package com.Capium365.StepDefination;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.CacheLookup;
 
import org.openqa.selenium.support.FindBy;

import com.Capium.Utilites.Log;
 
import com.Capium.Utilites.StepTracker;
 
import com.Capium365.Actions.Capium365_InvoicesTab_Invoices_Actions;

import io.cucumber.java.en.Given;
 
import io.cucumber.java.en.Then;
 
import io.cucumber.java.en.When;

public class Capium365_InvoicesTab_Invoices_Stepdefination {

	Capium365_InvoicesTab_Invoices_Actions InvoiceActions=new Capium365_InvoicesTab_Invoices_Actions();
 
	@Given("Click on invoice and verify page")
 
	public void click_on_invoice_and_verify_page() {
 
		InvoiceActions.Clickoninvoiceandverifypage();
 
		StepTracker.setCurrentStep("Click on invoice and verify page");
 
		Log.info("Click on invoice and verify page");		
 
	}
 
	@Then("get customers count and validate")
 
	public void get_customers_count_and_validate(){
 
      InvoiceActions.getcustomerscountandvalidate();
 
		StepTracker.setCurrentStep("get customers count and validate");
 
		Log.info("get customers count and validate");		
 
	}
 
	@Then("get invoice count and validate")
 
	public void get_invoice_count_and_validate() {
 
      InvoiceActions.getinvoicecountandvalidate();
 
		StepTracker.setCurrentStep("get invoice count and validate");
 
		Log.info("get invoice count and validate");	
 
	}
 
	@Then("Verify total raised count")
 
	public void verify_total_raised_count() {
 
      InvoiceActions.Verifytotalraisedcount();
 
		StepTracker.setCurrentStep("Verify total raised count");
 
		Log.info("Verify total raised count");			
 
	}
 
	@Then("Verify total recieved count")
 
	public void verify_total_recieved_count()  {
 
      InvoiceActions.Verifytotalrecievedcount();
 
		StepTracker.setCurrentStep("Verify total recieved count");
 
		Log.info("Verify total recieved count");	
 
	}
 
	@Then("Verify total due count")
 
	public void verify_total_due_count(){
 
     InvoiceActions.Verifytotalduecount();
 
		StepTracker.setCurrentStep("Verify total due count");
 
		Log.info("Verify total due count");	
 
	}
 
	@Then("Click on add invoice and verify page")
 
	public void click_on_add_invoice_and_verify_page() {
 
     InvoiceActions.Clickonaddinvoiceandverifypage();
 
		StepTracker.setCurrentStep("Click on add invoice and verify page");
 
		Log.info("Click on add invoice and verify page");	
 
	}
 
	@Then("Click on edit company details without giving man.details and verify")
 
	public void click_on_edit_company_details_without_giving_man_details_and_verify() throws InterruptedException, IOException {
 
     InvoiceActions.Clickoneditcompanydetailswithoutgivingmandetailsandverify();
 
		StepTracker.setCurrentStep("Click on edit company details without giving man.details and verify");
 
		Log.info("Click on edit company details without giving man.details and verify");	
 
	}
 
	@Then("Click on edit company details with giving man.details and verify")
 
	public void click_on_edit_company_details_with_giving_man_details_and_verify() throws InterruptedException {
 
        InvoiceActions.Clickoneditcompanydetailswithgivingmandetailsandverify();
 
		StepTracker.setCurrentStep("Click on edit company details with giving man.details and verify");
 
		Log.info("Click on edit company details with giving man.details and verify");		
 
	}
 
	@Then("click on add customer and verify page")
 
	public void click_on_add_customer_and_verify_page(){
 
      InvoiceActions.clickonaddcustomerandverifypage();
 
		StepTracker.setCurrentStep("click on add customer and verify page");
 
		Log.info("click on add customer and verify page");			
 
	}
 
	@Then("Fill the mandatory fields details and save")
 
	public void fill_the_mandatory_details_and_save(){
 
      InvoiceActions.Fillthemandatorydetailsandsave();
 
		StepTracker.setCurrentStep("Fill the mandatory details and save");
 
		Log.info("Fill the mandatory details and save");	
 
	}
 
	@Then("Fill the mandatory details and click add row and save")
 
	public void fill_the_mandatory_details_and_click_add_row_and_save() {
 
       InvoiceActions.Fillthemandatorydetailsandclickaddrowandsave();
 
		StepTracker.setCurrentStep("Fill the mandatory details and click add row and save");
 
		Log.info("Fill the mandatory details and click add row and save");	
 
	}
 
@Then("select the customer and verify details")
 
	public void select_the_customer_and_verify_details() {
 
        InvoiceActions.selectthecustomerandverifydetails();
 
		StepTracker.setCurrentStep("select the customer and verify details");
 
		Log.info("select the customer and verify details");	
 
	}
 
 
@Then("click on settings then save and verify")
	public void click_on_settings_then_save_and_verify(){
 
       InvoiceActions.clickonsettingsandsaveandverify();
		
		StepTracker.setCurrentStep("click on settings and save and verify");
		Log.info("click on settings and save and verify");	
	}
 
	@Then("select due date and verify in invoices")
	public void select_due_date_and_verify_in_invoices() throws TimeoutException, IOException, InterruptedException {
 
       InvoiceActions.selectduedateandverifyininvoices();
		
		StepTracker.setCurrentStep("select due date and verify in invoices");
		Log.info("select due date and verify in invoices");	
		
	}
 
	@Then("check repeat invoice check box and verify invoice")
	public void check_repeat_invoice_check_box_and_verify_invoice(){
 
		InvoiceActions.checkrepeatinvoicecheckboxandverifyinvoice();
 
		StepTracker.setCurrentStep("check repeat invoice check box and verify invoice");
		Log.info("check repeat invoice check box and verify invoice");	
		
	}
 
	@Then("click on discount option and verify the value")
	public void click_on_discount_option_and_verify_the_value() throws TimeoutException, InterruptedException {
 
		InvoiceActions.clickondiscountoptionandverifyvalue();
 
		StepTracker.setCurrentStep("click on discount option and verify value");
		Log.info("click on discount option and verify value");		
		
	}
 
	@Then("add item and verify")
	public void add_item_and_verify() throws TimeoutException, InterruptedException {
 
 
		InvoiceActions.additemandverify();
		
		StepTracker.setCurrentStep("add item and verify");
		Log.info("add item and verify");		
		
	}
 
	@Then("select existing item")
	public void select_existing_item() throws TimeoutException {
 
 
		InvoiceActions.selectexistingitem();
		
		StepTracker.setCurrentStep("select existing item");
		Log.info("select existing item");		
	}
 
	@Then("click on add bank and enter man.details")
	public void click_on_add_bank_and_enter_man_details() throws InterruptedException, TimeoutException {
 
         InvoiceActions.clickonaddbankandentermandetails();
		
		
		StepTracker.setCurrentStep("click on add bank and enter man.details");
		Log.info("click on add bank and enter man.details");			
	}
 
	@Then("select existing bank account")
	public void select_existing_bank_account() throws TimeoutException, InterruptedException {
 
       InvoiceActions.selectexistingbankaccount();
		
		
		StepTracker.setCurrentStep("click on add bank and enter man.details");
		Log.info("click on add bank and enter man.details");	
		
	}
 
	@Then("Click on save and new and verify invoice")
	public void click_on_save_and_new_and_verify_invoice() {
 
          InvoiceActions.Clickonsaveandnewandverifyinvoice();
		
		StepTracker.setCurrentStep("Click on save and new and verify invoice");
		Log.info("Click on save and new and verify invoice");		
		
	}
 
	@Then("Click on save and continue and verify invoice")
	public void click_on_save_and_continue_and_verify_invoice() {
 
       InvoiceActions.Clickonsaveandcontinueandverifyinvoice();
		
		StepTracker.setCurrentStep("Click on save and continue and verify invoice");
		Log.info("Click on save and continue and verify invoice");		
	}
 
	@Then("Click on save and exit and verify invoice")
	public void click_on_save_and_exit_and_verify_invoice() throws InterruptedException{
 
       InvoiceActions.Clickonsaveandexitandverifyinvoice();
		
		StepTracker.setCurrentStep("Click on save and exit and verify invoice");
		Log.info("Click on save and exit and verify invoice");		
	}
 
	@Then("Click on cancel changes and verify the details")
	public void click_on_cancel_changes_and_verify_the_details(){
 
       InvoiceActions.Clickoncancelchangesandverifydetails();
		
		StepTracker.setCurrentStep("Click on cancel changes and verify details");
		Log.info("Click on cancel changes and verify details");	
	}
 
 
	@Then("click on add new invoice plus button and verify")
	public void click_on_add_new_invoice_plus_button_and_verify(){
 
      InvoiceActions.clickonaddnewinvoiceplusbuttonandverify();
		
		StepTracker.setCurrentStep("click on add new invoice plus button and verify");
		Log.info("click on add new invoice plus button and verify");	
		
	}
 
	@Then("check the checkbox and verify options are enabling")
	public void check_the_checkbox_and_verify_options_are_enabling() throws InterruptedException{
 
 
		InvoiceActions.checkthecheckboxandverifyoptionsareenabling();
		
		StepTracker.setCurrentStep("check the checkbox and verify options are enabling");
		Log.info("check the checkbox and verify options are enabling");	
		
	}
 
	@Then("verify export in add invoice")
	public void verify_export_in_add_invoice(){
 
 
		InvoiceActions.verifyexportinaddinvoice();
		
		StepTracker.setCurrentStep("verify export in add invoice");
		Log.info("verify export in add invoice");	
	}
 
	@Then("enter invoice name and verify")
	public void enter_invoice_name_and_verify(){
 
     InvoiceActions.enterinvoicenameandverify();
		
		StepTracker.setCurrentStep("enter invoice name and verify");
		Log.info("enter invoice name and verify");
	}
 
	@Then("click click on all status and verify")
	public void click_click_on_all_status_and_verify() {
 
      InvoiceActions.clickclickonallstatusandverify();
		
		StepTracker.setCurrentStep("click click on all status and verify");
		Log.info("click click on all status and verify");	
	}
 
	@Then("click on all time status and verify")
	public void click_on_all_time_status_and_verify() throws IOException{
 
     InvoiceActions.clickonalltimestatusandverify();
		
		
		StepTracker.setCurrentStep("click on all time status and verify");
		Log.info("click on all time status and verify");	
		
	}
 
	@Then("click on invoice check box and verify enabling options")
	public void click_on_invoice_check_box_and_verify_enabling_options(){
 
     InvoiceActions.clickoninvoicecheckboxandverifyenablingoptions();
		
		StepTracker.setCurrentStep("click on invoice check box and verify enabling options");
		Log.info("click on invoice check box and verify enabling options");	
	}
 
	@Then("click on export report")
	public void click_on_export_report(){
 
     InvoiceActions.clickonexportreport();
		
		StepTracker.setCurrentStep("click on export report");
		Log.info("click on export report");	
	}
	@Then("click and select page number")
	public void click_and_select_page_number() throws TimeoutException, InterruptedException {
 
 
		InvoiceActions.clickandselectpagenumber();
		
		StepTracker.setCurrentStep("click and select page number");
		Log.info("click and select page number");	
	}
 
	@Then("click and verify previous button")
	public void click_and_verify_previous_button() throws InterruptedException {
 
    InvoiceActions.clickandverifypreviousbutton();
		
		StepTracker.setCurrentStep("click and verify previous button");
		Log.info("click and verify previous button");	
	}
 
	@Then("click and verify next button")
	public void click_and_verify_next_button() throws InterruptedException {
 
 
		InvoiceActions.clickandverifynextbutton();
		
		
		StepTracker.setCurrentStep("click and verify next button");
		Log.info("click and verify next button");	
		
	}
	@When("Click on Invoice Tab")
	public void click_on_invoice_tab() throws Throwable {
		InvoiceActions.ClickonInvoiceTab();
	}
 
	@Then("Click on Add Invoice button")
	public void click_on_add_invoice_button() throws Throwable {
	    InvoiceActions.ClickonAddInvoicebutton();
	}
 
	@Then("Validate Payment Account Dropdown")
	public void validate_payment_account_dropdown() throws Throwable {
	   InvoiceActions.ClickonPaymnetAccountDropdownandValidate();
	}
	
	
	@Then("Click on Add Customer button")
	public void click_on_add_customer_button() throws Throwable {
	   InvoiceActions.ClickonAddCustomer();
	}
	
	@Then("Click on Paymnet Account dropdown and Validate")
	public void click_on_paymnet_account_dropdown_and_validate() throws Throwable {
	    InvoiceActions.ClickonPaymnetAccountDropdownandValidateAddCustomer();
	}
	
	@When("Upload the Invoice")
	public void upload_the_invoice() throws Throwable {
	    InvoiceActions.UploadtheInvoice();
	}
 
	@Then("Validate uploadInvoicecustomername should Display in the grid ICN")
	public void validate_upload_invoicecustomername_should_display_in_the_grid_icn() {
	    InvoiceActions.ValidateuploadInvoicecustomernameshouldDisplayinthegrid();
	}
	
}
 
 
 