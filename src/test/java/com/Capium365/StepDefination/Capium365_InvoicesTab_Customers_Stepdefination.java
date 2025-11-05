package com.Capium365.StepDefination;

import java.awt.AWTException;
 
import java.io.IOException;

import com.Capium.Utilites.StepTracker;
 
import com.Capium365.Actions.Capium365_InvoicesTab_Customers_Actions;

import io.cucumber.java.en.Given;
 
import io.cucumber.java.en.Then;
 
import io.cucumber.java.en.When;

public class Capium365_InvoicesTab_Customers_Stepdefination {

	Capium365_InvoicesTab_Customers_Actions Customerspage=new Capium365_InvoicesTab_Customers_Actions();
 
 
	@Given("Click on invoices")
 
	public void click_on_invoices(){
 
		Customerspage.invoicestab();
 
		StepTracker.setCurrentStep("Click on invoices");
 
	}
 
	@When("Click on arrow button")
 
	public void click_on_arrow_button(){
 
	    Customerspage.Arrowbutton();
 
	    StepTracker.setCurrentStep("Click on arrow button");
 
	}
 
	@When("Click on customers")
 
	public void click_on_customers(){
 
	    Customerspage.customerstab();
 
	    StepTracker.setCurrentStep("Click on customers");
 
	}
 
	@When("Click on add customer button")
 
	public void click_on_add_customer_button(){
 
	    Customerspage.addcustomerbutton();
 
	    StepTracker.setCurrentStep("Click on add customer button");
 
	}
 
	@When("Fill the mandatory details in add customer and save")
 
	public void fill_the_mandatory_details_in_add_customer_save(){
 
	    Customerspage.Fillthemandatorydetailsandsave();
 
	    StepTracker.setCurrentStep("Fill the mandatory details in add customer and save");
 
	}
 
	@Then("Search and edit customer")
 
	public void search_and_edit_customer(){
 
		Customerspage.searchandeditcustomer();
 
		 StepTracker.setCurrentStep("Search and edit customer");
 
	}
 
	@Then("Fill the non mandatory details in add customer and save and exit")
 
	public void fill_the_non_mandatory_details_in_add_customer_and_save_and_exit() throws AWTException, IOException{
 
	    Customerspage.Fillthenonmandatorydetailsinaddcustomerandsaveandexit();
 
	    StepTracker.setCurrentStep("Fill the non mandatory details in add customer and save and exit");
 
	}
 
	@Then("Click on cancel changes")
 
	public void click_on_cancel_changes(){
 
		Customerspage.cancelchangesbutton();
 
		 StepTracker.setCurrentStep("Click on cancel changes");
 
	}
 
	@Then("Click on contact details new line")
 
	public void click_on_contact_details_new_line() {
 
	   Customerspage.Entercontactdetails();
 
	   StepTracker.setCurrentStep("Click on contact details new line");
 
	}
 
	 @Then("Click on address details new line")
 
	 public void click_on_address_details_new_line() {
 
	      Customerspage.Enteraddressdetails();
 
	      StepTracker.setCurrentStep("Click on address details new line");
 
	}
 
    @Then("Click on cross button")
 
	public void click_on_cross_button() {
 
	    Customerspage.addnewcustomercrossbutton();
 
	    StepTracker.setCurrentStep("Click on cross button");
 
	}
 
    @Then("Click on search button in add new customer")
 
    public void click_on_search_button_in_add_new_customer(){
 
       Customerspage.addnewcustomersearch();
 
       StepTracker.setCurrentStep("Click on search button in add new customer");
 
    }
 
    @Then("Click on customer add button")
 
    public void click_on_customer_add_button(){
 
        Customerspage.customeraddbutton();
 
        StepTracker.setCurrentStep("Click on customer add button");
 
    }
 
    @When("Click the checkbox and verify options are enabling")
 
    public void click_the_checkbox_and_verify_options_are_enabling() throws InterruptedException {
 
    	Customerspage.Clickthecheckboxandverifyoptionsareenabling();
 
    	StepTracker.setCurrentStep("Click the checkbox and verify options are enabling");
 
    }
 
    @Then ("Click on copy button in add new customer")
 
    public void click_on_copy_button_in_add_new_customer() {
 
    	Customerspage.Clickoncopybuttoninaddnewcustomer();
 
    	StepTracker.setCurrentStep("Click on copy button in add new customer");
 
    }
 
    @Then("Click on delete yes button in add new customer")
 
    public void click_on_delete_yes_button_in_add_new_customer() {
 
    	Customerspage.Clickondeleteyesbuttoninaddnewcustomer();
 
    	StepTracker.setCurrentStep("Click on delete yes button in add new customer");
 
    }
 
    @Then("Click on delete no button in add new customer")
 
    public void click_on_delete_no_button_in_add_new_customer(){
 
    	Customerspage.Clickondeletenobuttoninaddnewcustomer();
 
    	StepTracker.setCurrentStep("Click on delete no button in add new customer");
 
    }
 
    @Then("Click on export in add new customer")
 
    public void click_on_export_in_add_new_customer() {
 
        Customerspage.exportinaddnewcustomer();
 
        StepTracker.setCurrentStep("Click on export in add new customer");
 
    }
 
    @Then("Click on archive yes button in add new customer")
 
    public void click_on_archive_yes_button_in_add_new_customer(){
 
    	Customerspage.Clickonarchiveyesbuttoninaddnewcustomer();
 
    	StepTracker.setCurrentStep("Click on archive yes button in add new customer");
 
    }
 
@Then("Click on archive no button in add new customer")
 
    public void click_on_archive_no_button_in_add_new_customer(){
 
    	Customerspage.Clickonarchivenobuttoninaddnewcustomer();
 
    	StepTracker.setCurrentStep("Click on archive no button in add new customer");
 
    }
 
    @Then("Click on cross button in add new customer")
 
    public void click_on_cross_button_in_add_new_customer() {
 
       Customerspage.cross();
 
       StepTracker.setCurrentStep("Click on cross button in add new customer");
 
    }
 
    @When("Enter customer name and search")
 
    public void enter_customer_name() {
 
        Customerspage.customername();
 
        StepTracker.setCurrentStep("Enter customer name and search");
 
    }
 
    @Then("validate all status dropdown")
 
    public void validate_all_status_dropdown(){
 
        Customerspage.selectallstatusandvalidate();
 
        StepTracker.setCurrentStep("validate all status dropdown");
 
    }
 
    @Then("Click on actions and export")
 
    public void click_on_actions_and_export() {
 
        Customerspage.actionsexport();
 
        StepTracker.setCurrentStep("Click on actions and export");
 
    }
 
    @When("Click on customer checkbox verify options are enabling")
 
    public void click_on_customer_checkbox_verify_options_are_enabling() throws InterruptedException {
 
        Customerspage.customercheckboxes();
 
        StepTracker.setCurrentStep("Click on customer checkbox verify options are enabling");
 
    }  
 
    @Then("Click on record cancel")
 
    public void click_on_record_cancel(){
 
        Customerspage.recordcancel();
 
        StepTracker.setCurrentStep("Click on record cancel");
 
    }
 
    @Then ("Click on selected items copy button")
 
    public void click_on_selected_items_copy_button(){
 
    	Customerspage.Clickonselecteditemscopybutton();
 
    	StepTracker.setCurrentStep("Click on selected items copy button");
 
    }
 
@Then("Click on selected items delete yes button")
    public void click_on_selected_items_delete_yes_button(){
    	Customerspage.Clickonselecteditemsdeleteyesbutton();
    	StepTracker.setCurrentStep("Click on selected items delete yes button");
    }
    @Then("Click on selected item export")
    public void click_on_selected_item_export() {
        Customerspage.exportinselecteditem();
        StepTracker.setCurrentStep("Click on selected item export");
    }
    @Then("Click on selected items delete no button")
    public void click_on_selected_items_delete_no_button() throws InterruptedException {
    	Customerspage.Clickonselecteditemsdeletenobutton();
    	StepTracker.setCurrentStep("Click on selected items delete no button");
    }
    @Then ("Click on selected items restore yes button")
    public void click_on_selected_items_restore_yes_button() throws InterruptedException {
    	Customerspage.selecteditemsrestoreyesbutton();
    	StepTracker.setCurrentStep("Click on selected items restore yes button");
    }
    @Then ("Click on selected items restore no button")
    public void click_on_selected_items_restore_no_button() throws InterruptedException {
    	Customerspage.selecteditemsrestorenobutton();
    	StepTracker.setCurrentStep("Click on selected items restore no button");
    }
    @Then("Click on selected items archive yes button")
    public void click_on_selected_items_archive_yes_button() throws InterruptedException {
        Customerspage.selecteditemsarchiveyesbutton();
        StepTracker.setCurrentStep("Click on selected items archive yes button");
    }
 
    @Then("Click on selected items archive no button")
    public void click_on_selected_items_archive_no_button() throws InterruptedException {
        Customerspage.selecteditemsarchivenobutton();
        StepTracker.setCurrentStep("Click on selected items archive no button");
    }
    @Then("Click on selected item cross button")
    public void click_on_selected_item_cross_button() {
        Customerspage.selecteditemcrossbutton();
        StepTracker.setCurrentStep("Click on selected item cross button");
    }
    @Then("Click on add customer arrow")
    public void click_on_add_customer_arrow() {
        Customerspage.addcustomerarrow();
        StepTracker.setCurrentStep("Click on add customer arrow");
    }
    @Then("Click on mousehover edit")
    public void click_on_mousehover_edit(){
    	Customerspage.selecteditemsrestoreyesbutton();
        Customerspage.mousehoveredit();
        StepTracker.setCurrentStep("Click on mousehover edit");
    }
    @Then("Click on mousehover delete yes button")
    public void click_on_mousehover_delete_yes_button(){
        Customerspage.mousehoverdeleteyesbutton();
        StepTracker.setCurrentStep("Click on mousehover delete yes button");
    }
    @Then("Click on mousehover delete no button")
    public void click_on_mousehover_delete_no_button(){
        Customerspage.mousehoverdeletenobutton();
        StepTracker.setCurrentStep("Click on mousehover delete no button");
    }
    @Then("Click on mousehover archive yes button")
    public void click_on_mousehover_archive_yes_button() {
    	Customerspage.selecteditemsrestoreyesbutton();
        Customerspage.mousehoverarchiveyesbutton();
        StepTracker.setCurrentStep("Click on mousehover archive yes button");
    }
    @Then("Click on mousehover archive no button")
    public void click_on_mousehover_archive_no_button() {
        Customerspage.mousehoverarchivenobutton();
        StepTracker.setCurrentStep("Click on mousehover archive no button");
    }
    @Then("Select pagination dropdown and Validate")
    public void select_pagination_dropdown_and_validate(){
       Customerspage.ClickonPagiantionDropdownandValidteCount();
       StepTracker.setCurrentStep("Select pagination dropdown and Validate");
    }
    @Then("Click on next page in customer")
    public void click_on_next_page_in_customer() {
       Customerspage.nextpageincustomer();
       StepTracker.setCurrentStep("Click on next page in customer");
    }
    @Then("Click on previous page in customer")
    public void click_on_previous_page_in_customer() {
        Customerspage.previouspageincustomer();
        StepTracker.setCurrentStep("Click on previous page in customer");
    }
    @Then("Click on goto in customer")
    public void click_on_goto_in_customer() {
        Customerspage.VerifyGoTopageNumber();  
        StepTracker.setCurrentStep("Click on goto in customer");
    }
    
    
}
 