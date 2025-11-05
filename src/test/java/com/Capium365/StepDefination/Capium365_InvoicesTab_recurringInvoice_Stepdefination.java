package com.Capium365.StepDefination;

import java.awt.AWTException;
 
import java.io.IOException;

import org.openqa.selenium.TimeoutException;

import com.Capium.Utilites.StepTracker;
 
import com.Capium365.Actions.Capium365_InvoicesTab_recurringInvoice_Actions;

import io.cucumber.java.en.Given;
 
import io.cucumber.java.en.Then;
 
import io.cucumber.java.en.When;

public class Capium365_InvoicesTab_recurringInvoice_Stepdefination {
 
	Capium365_InvoicesTab_recurringInvoice_Actions RecurringInvoicepage=new Capium365_InvoicesTab_recurringInvoice_Actions();
 
	@Given("Click on invoices tab")
 
	public void click_on_invoices_tab() throws Exception {
 
		RecurringInvoicepage.invoicestab();
 
		StepTracker.setCurrentStep("Click on invoices tab");
 
	}
 
	@When("Click on arrow button in invoice tab")
 
	public void click_on_arrow_button_in_invoice_tab() throws Exception {
 
		RecurringInvoicepage.Arrowbutton();
 
		StepTracker.setCurrentStep("Click on arrow button in invoice tab");
 
	}
 
	@Then("Click on recurring invoice and verify page")
 
	public void click_on_recurring_invoice_and_verify_page() {
 
        RecurringInvoicepage.recurringinvoicetab();
 
        StepTracker.setCurrentStep("Click on recurring invoice and verify page");
 
	}
 
	@Then("Click on add recurring invoice button")
 
	public void click_on_add_recurring_invoice_button() {
 
		RecurringInvoicepage.addrecurringinvoicebutton();
 
		StepTracker.setCurrentStep("Click on add recurring invoice button");
 
	}
 
	@Then("Click on edit in company details")
 
	public void click_on_edit_in_company_details(){
 
	    RecurringInvoicepage.editbuttonincompanydetails();
 
	    StepTracker.setCurrentStep("Click on edit in company details");
 
	}
 
	@Then("Click on save without giving mandatory details in company details")
 
	public void click_on_save_without_giving_mandatory_details_in_company_details() throws InterruptedException, IOException {
 
	    RecurringInvoicepage.Clickonsavewithoutgivingmandatorydetailsincompanydetails();
 
	    StepTracker.setCurrentStep("Click on save without giving mandatory details in company details");
 
	}
 
	@Then("Click on save with giving mandatory details in comapany details")
 
	public void click_on_save_with_giving_mandatory_details_in_comapany_details() throws InterruptedException {
 
	    RecurringInvoicepage.Clickonsavewithgivingmandatorydetailsincomapanydetails();
 
	    StepTracker.setCurrentStep("Click on save with giving mandatory details in comapany details");
 
	}
 
@Then("Click on cancel button in company details")
 
	public void click_on_cancel_button_in_company_details() {
 
	    RecurringInvoicepage.cancelbuttonincompanydetails();
 
	    StepTracker.setCurrentStep("Click on cancel button in company details");
 
	}
 
	@Then("Click customer name add button")
 
	public void click_customer_name_add_button() {
 
	    RecurringInvoicepage.customernameaddbutton();
 
	    StepTracker.setCurrentStep("Click customer name add button");
 
	}
 
@Then("Fill the mandatory details and save")
 
	public void fill_the_mandatory_details_and_save(){
 
	    RecurringInvoicepage.Fillallmandatorydetailsinaddnewcustomer();
 
	    StepTracker.setCurrentStep("Fill the mandatory details and save");
 
	}
 
	@Then("Fill all the non mandatory details and save")
 
	public void fill_all_the_non_mandatory_details_and_save() throws AWTException, IOException  {
 
	    RecurringInvoicepage.Fillallnonmandatorydetailsinaddnewcustomer();
 
	    StepTracker.setCurrentStep("Fill all the non mandatory details and save");
 
	}
 
@Then("Click on add customer payment account dropdown")
	public void click_on_add_customer_payment_account_dropdown(){
		RecurringInvoicepage.paymnetaccountdropdowninaddcustomer();
	    StepTracker.setCurrentStep("Click on add customer payment account dropdown");
	}
	@Then("Select customer and verify")
	public void select_existing_customer_and_verify(){
        RecurringInvoicepage.selectcustomerandverify();
        StepTracker.setCurrentStep("Select customer and verify");
	}
	@Then("Click on add new line in contact details")
	public void click_on_add_new_line_in_contact_details() {
	    RecurringInvoicepage.addnewlineincontactdetails();
	    StepTracker.setCurrentStep("Click on add new line in contact details");
	}
	@Then("Click on add new line in address details")
	public void click_on_add_new_line_in_address_details(){
	    RecurringInvoicepage.addnewlineinaddressdetails();
	    StepTracker.setCurrentStep("Click on add new line in address details");
	}
	@Then("click on cancel changes in add new customer")
	public void click_on_cancel_changes_in_add_new_customer() {
	    RecurringInvoicepage.cancelchangesinaddnewcustomer();
	    StepTracker.setCurrentStep("click on cancel changes in add new customer");
	}
	@Then("click on settings and save and verify")
	public void click_on_settings_and_save_and_verify() throws InterruptedException {
	    RecurringInvoicepage.clickonsettingsandsaveandverify();
	    StepTracker.setCurrentStep("click on settings and save and verify");
	}
	@Then("select due date and verify in recurring invoices")
	public void select_due_date_and_verify_in_invoices(){
	    RecurringInvoicepage.selectduedateandverifyininvoices();
	    StepTracker.setCurrentStep("select due date and verify in recurring invoices");
	}
	@Then("check repeat invoice check box and verify in invoice")
	public void check_repeat_invoice_check_box_and_verify_in_invoice() {
		RecurringInvoicepage.checkrepeatinvoicecheckboxandverifyininvoice();
		 StepTracker.setCurrentStep("check repeat invoice check box and verify in invoice");
	}
	@Then("click on discount option and verify value")
	public void click_on_discount_option_and_verify_value(){
	    RecurringInvoicepage.clickondiscountoptionandverifyvalue();
	    StepTracker.setCurrentStep("click on discount option and verify value");
	}
	@Then("Add item and verify")
	public void add_item_and_verify(){
	    RecurringInvoicepage.additemandverify();
	    StepTracker.setCurrentStep("Add item and verify");
	}
	@Then("Select existing item")
	public void select_existing_item(){
		RecurringInvoicepage.selectexistingitem();
		 StepTracker.setCurrentStep("Select existing item");
	}
	@Then("Click on add bank and enter mandatory details")
	public void click_on_add_bank_and_enter_mandatory_details() {
		RecurringInvoicepage.clickonaddbankandentermandetails();
		StepTracker.setCurrentStep("Click on add bank and enter mandatory details");
	}
	@Then("Select repeat invoice status")
	public void Select_repeat_invoice_status() throws InterruptedException {
		RecurringInvoicepage.Selectrepeatinvoicestatus();
		 StepTracker.setCurrentStep("Select repeat invoice status");
	}
	@Then("Click on payment account dropdown in invoice")
	public void click_on_payment_account_dropdown_in_invoice(){
		RecurringInvoicepage.paymnetaccountdropdownininvoice();
		 StepTracker.setCurrentStep("Click on payment account dropdown in invoice");
	}
	@Then("Click on save and new and verify recurring invoice")
	public void click_on_save_and_new_and_verify_recurring_invoice(){
		RecurringInvoicepage.Clickonsaveandnewandverifyrecurringinvoice();
		 StepTracker.setCurrentStep("Click on save and new and verify recurring invoice");
	}
	@Then("Click on save and continue and verify recurring invoice")
	public void click_on_save_and_continue_and_verify_recurring_invoice(){
		RecurringInvoicepage.Clickonsaveandcontinueandverifyrecurringinvoice();
		 StepTracker.setCurrentStep("Click on save and continue and verify recurring invoice");
	}
	@Then("Click on save and exit and verify recurring invoice")
	public void click_on_save_and_exit_and_verify_recurring_invoice(){
		RecurringInvoicepage.Clickonsaveandexitandverifyrecurringinvoice();
		 StepTracker.setCurrentStep("Click on save and exit and verify recurring invoice");
	}
	@Then("Click on cancel changes and verify details")
	public void click_on_cancel_changes_and_verify_details() throws IOException {
		RecurringInvoicepage.Clickoncancelchangesandverifydetails();
		 StepTracker.setCurrentStep("Click on cancel changes and verify details");
	}
	@Then("Click on add new recurring invoice plus button and verify")
	public void click_on_add_new_recurring_invoice_plus_button_and_verify(){
		RecurringInvoicepage.clickonaddnewrecurringinvoiceplusbuttonandverify();
		 StepTracker.setCurrentStep("Click on add new recurring invoice plus button and verify");
	}
	@Then("Check the checkbox and verify options are enabling")
	public void check_the_checkbox_and_verify_options_are_enabling() throws InterruptedException {
	    RecurringInvoicepage.checkthecheckboxandverifyoptionsareenabling();
	    StepTracker.setCurrentStep("Check the checkbox and verify options are enabling");
	}
	@Then("Click export in add new recurring invoice")
	public void click_export_in_add_new_recurring_invoice(){
	    RecurringInvoicepage.clickexportinaddnewrecurringinvoice();
	    StepTracker.setCurrentStep("Click export in add new recurring invoice");
	}
	@Then("Click on search in recurring invoice")
	public void click_on_search_in_recurring_invoice() {
	    RecurringInvoicepage.recurringinvoicesearch();
	    StepTracker.setCurrentStep("Click on search in recurring invoice");
	}
	@Then("Select all status and validate")
	public void select_all_status_and_validate(){
	    RecurringInvoicepage.selectallstatusandvalidate();
	    StepTracker.setCurrentStep("Select all status and validate");
	}
    @Then ("Click on all time status and verify")
    public void click_on_all_time_status_and_verify() throws IOException {
	    RecurringInvoicepage.clickonalltimestatusandverify();
	    StepTracker.setCurrentStep("Click on all time status and verify");
    }
    @Then("Click on actions export")
    public void click_on_actions_export(){
    	RecurringInvoicepage.clickonactionsexport();
	    StepTracker.setCurrentStep("Click on actions export");
    }
    @When("Click on mousehover delete yes in recurring invoice")
    public void click_on_mousehover_delete_yes_in_recurring_invoice() {
    	RecurringInvoicepage.mousehoverdeleteyesbuttoninrecurringinvoice();
	    StepTracker.setCurrentStep("Click on mousehover delete yes in recurring invoice");
    }
    @Then("Click on mousehover delete no in recurring invoice")
    public void click_on_mousehover_delete_no_in_recurring_invoice() {
    	RecurringInvoicepage.mousehoverdeletenobuttoninrecurringinvoice();
	    StepTracker.setCurrentStep("Click on mousehover delete no in recurring invoice");
    }
    @When("Click on mousehover end in recurring invoice")
    public void click_on_mousehover_end_in_recurring_invoice() {
    	RecurringInvoicepage.mousehoverendinrecurringinvoice();
	    StepTracker.setCurrentStep("Click on mousehover end in recurring invoice");
    }
    @Then("Click on mousehover pause in recurring invoice")
    public void click_on_mousehover_pause_in_recurring_invoice() {
    	RecurringInvoicepage.mousehoverdeleteyesbuttoninrecurringinvoice();
    	RecurringInvoicepage.mousehoverpauseinrecurringinvoice();
	    StepTracker.setCurrentStep("Click on mousehover pause in recurring invoice");
    }
    @Then ("Click on recurring invoice check box and verify enabling options")
    public void click_on_recurring_invoice_checkbox_and_verify_enabling_options() throws InterruptedException {
	    RecurringInvoicepage.clickoninvoicecheckboxandverifyenablingoptions();
	    StepTracker.setCurrentStep("Click on recurring invoice check box and verify enabling option");
    }
    @When("Click on record cancel in recurring invoice")
    public void click_on_record_cancel_in_recurring_invoice() {
    	RecurringInvoicepage.recordcancelinrecurringinvoice();
	    StepTracker.setCurrentStep("Click on record cancel in recurring invoice");
    }
    @Then("Click on copy button in recurring invoice")
    public void click_on_copy_button_in_recurring_invoice() {
    	RecurringInvoicepage.copybuttoninrecurringinvoice();
	    StepTracker.setCurrentStep("Click on copy button in recurring invoice");
    }
    @Then("Click on delete yes button in recurring invoice")
    public void click_on_delete_yes_button_in_recurring_invoice() {
    	RecurringInvoicepage.deleteyesbuttoninrecurringinvoice();
	    StepTracker.setCurrentStep("Click on actions export");
    }
    @Then("Click on delete no button in recurring invoice")
    public void click_on_delete_no_button_in_recurring_invoice() {
    	RecurringInvoicepage.deletenobuttoninrecurringinvoice();
	    StepTracker.setCurrentStep("Click on actions export");
    }
    @When ("Click on export report")
    public void click_on_export_report(){
	    RecurringInvoicepage.clickonexportreport();
	    StepTracker.setCurrentStep("Click on export report");
    }
    @Then("Click on end yes button in recurring invoice")
    public void click_on_end_yes_button_in_recurring_invoice() {
    	RecurringInvoicepage.endyesbuttoninrecuringinvoice();
        StepTracker.setCurrentStep("Click on end yes button in recurring invoice");
    }
    @Then("Click on end no button in recurring invoice")
    public void click_on_end_no_button_in_recurring_invoice() {
    	RecurringInvoicepage.deleteyesbuttoninrecurringinvoice();
    	RecurringInvoicepage.endnobuttoninrecuringinvoice();
        StepTracker.setCurrentStep("Click on end no button in recurring invoice");
    }
    @Then("Click on pagination in recurring invoice")
    public void click_on_pagination_in_recurring_invoice(){
    	RecurringInvoicepage.ClickonPagiantionDropdownandValidteCount();
       StepTracker.setCurrentStep("Click on pagination in recurring invoice");
    }
    @Then("Click on next page in recurring invoice")
    public void click_on_next_page_in_recurring_invoice() {
    	RecurringInvoicepage.nextpageinrecurringinvoice();
       StepTracker.setCurrentStep("Click on next page recurring invoice");
    }
    @Then("Click on previous page in recurring invoice")
    public void click_on_previous_page_in_recurring_invoice() {
    	RecurringInvoicepage.previouspageinrecurringinvoice();
        StepTracker.setCurrentStep("Click on previous page in recurring invoice");
    }
    @Then("Click on goto in recurring invoice")
    public void click_on_goto_in_recurring_invoice() {
    	RecurringInvoicepage.VerifyGoTopageNumber();  
        StepTracker.setCurrentStep("Click on goto in recurring invoice");
    }
}
 
 