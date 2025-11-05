package com.Capium365.StepDefination;

import java.io.IOException;

import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_InvoicesTab_CreditNotes_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium365_InvoicesTab_CreditNotes_Stepdefination {

	Capium365_InvoicesTab_CreditNotes_Actions CreditNotesActions=new Capium365_InvoicesTab_CreditNotes_Actions();
	
	@Given("Click on invoice credit note and verify page ICN")
	public void click_on_invoice_credit_note_and_verify_page() throws Exception {
	    CreditNotesActions.Clickoninvoicecreditnoteandverifypage();
	    StepTracker.setCurrentStep("Click on invoice credit note and verify page ICN");
	}
 
	@Then("get customers count and validate ICN")
	public void get_customers_count_and_validate() throws InterruptedException {
	    CreditNotesActions.getcustomerscountandvalidate();
	    StepTracker.setCurrentStep("get customers count and validate ICN");
	}
 
	@Then("get invoice count and validate ICN")
	public void get_invoice_count_and_validate() throws InterruptedException {
	    CreditNotesActions.getinvoicecountandvalidate();
	    StepTracker.setCurrentStep("get invoice count and validate ICN");
	}
 
	@Then("Verify total raised count ICN")
	public void verify_total_raised_count() throws InterruptedException {
	    CreditNotesActions.Verifytotalraisedcount();
	    StepTracker.setCurrentStep("Verify total raised count ICN");
	}
 
	@Then("Click on add invoice credit note and verify page ICN")
	public void click_on_add_invoice_credit_note_and_verify_page() throws Exception {
	    CreditNotesActions.Clickonaddinvoicecreditnoteandverifypage();
	    StepTracker.setCurrentStep("Click on add invoice credit note and verify page ICN");
	}
 
	@Then("Click on edit company details without giving man.details and verify ICN")
	public void click_on_edit_company_details_without_giving_man_details_and_verify() throws InterruptedException, IOException {
	    CreditNotesActions.Clickoneditcompanydetailswithoutgivingmandetailsandverify();
	    StepTracker.setCurrentStep("Click on edit company details without giving man.details and verify ICN");
	}
 
	@Then("Click on edit company details with giving man.details and verify ICN")
	public void click_on_edit_company_details_with_giving_man_details_and_verify() throws InterruptedException {
	    CreditNotesActions.Clickoneditcompanydetailswithgivingmandetailsandverify();
	    StepTracker.setCurrentStep("Click on edit company details with giving man.details and verify ICN");
	}
 
	@Then("click on add customer and verify page ICN")
	public void click_on_add_customer_and_verify_page() throws InterruptedException {
	    CreditNotesActions.clickonaddcustomerandverifypage();
	    StepTracker.setCurrentStep("click on add customer and verify page ICN");
	}
 
	@Then("Fill the mandatory details and save ICN")
	public void fill_the_mandatory_details_and_save() throws InterruptedException {
	    CreditNotesActions.Fillthemandatorydetailsandsave();
	    StepTracker.setCurrentStep("Fill the mandatory details and save ICN");
	}
 
	@Then("Fill the mandatory details and click add row and save ICN")
	public void fill_the_mandatory_details_and_click_add_row_and_save() throws InterruptedException {
	    CreditNotesActions.Fillthemandatorydetailsandclickaddrowandsave();
	    StepTracker.setCurrentStep("Fill the mandatory details and click add row and save ICN");
	}
 
	@Then("select the customer and verify details ICN")
	public void select_the_customer_and_verify_details() throws InterruptedException {
	   CreditNotesActions.selectthecustomerandverifydetails();
	   StepTracker.setCurrentStep("select the customer and verify details ICN");
	}
 
	@Then("click on settings and save and verify ICN")
	public void click_on_settings_and_save_and_verify() throws InterruptedException {
	    CreditNotesActions.clickonsettingsandsaveandverify();
	    StepTracker.setCurrentStep("click on settings and save and verify ICN");
	}
 
	@Then("select due date and verify in invoices ICN")
	public void select_due_date_and_verify_in_invoices() throws Exception{
	    CreditNotesActions.selectduedateandverifyininvoices();
	    StepTracker.setCurrentStep("select due date and verify in invoices ICN");
	}
 
	@Then("click on discount option and verify value ICN")
	public void click_on_discount_option_and_verify_value() throws InterruptedException {
	    CreditNotesActions.clickondiscountoptionandverifyvalue();
	    StepTracker.setCurrentStep("click on discount option and verify value ICN");
	}
	
	@Then("add item and verify ICN")
	public void add_item_and_verify() throws InterruptedException {
	    CreditNotesActions.additemandverify();
	    StepTracker.setCurrentStep("add item and verify ICN");
	}
 
	@Then("click on add new invoice plus button and verify ICN")
	public void click_on_add_new_invoice_plus_button_and_verify() throws InterruptedException {
	    CreditNotesActions.clickonaddnewinvoiceplusbuttonandverify();
	    StepTracker.setCurrentStep("click on add new invoice plus button and verify ICN");
	}
 
	@Then("check the checkbox and verify options are enabling ICN")
	public void check_the_checkbox_and_verify_options_are_enabling() throws InterruptedException {
	    CreditNotesActions.checkthecheckboxandverifyoptionsareenabling();
	    StepTracker.setCurrentStep("check the checkbox and verify options are enabling ICN");
	}
 
	@Then("verify export to excel ICN")
	public void verify_export_to_excel() throws InterruptedException {
	    CreditNotesActions.verifyexporttoexcel();
	    StepTracker.setCurrentStep("verify export to excel ICN");
	}
	@Then("selectcheckbox")
	public void selectcheckbox() {
		CreditNotesActions.ClickonSelectCheckBox();;
	    StepTracker.setCurrentStep("verify export to excel ICN");
	}

 
	@Then("verify export to csv ICN")
	public void verify_export_to_csv() throws InterruptedException {
		CreditNotesActions.verifyexporttocsv();
		 StepTracker.setCurrentStep("verify export to csv ICN");
	}
 
	@Then("verify export to pdf ICN")
	public void verify_export_to_pdf() throws InterruptedException {
		CreditNotesActions.exporttopdf();
		 StepTracker.setCurrentStep("verify export to pdf ICN");
	}
 
	@Then("enter invoice name and verify ICN")
	public void enter_invoice_name_and_verify() throws InterruptedException {
	    CreditNotesActions.enterinvoicenameandverify();
	    StepTracker.setCurrentStep("enter invoice name and verify ICN");
	}
 
	@Then("click on all status and verify ICN")
	public void click_click_on_all_status_and_verify() throws Exception{
		CreditNotesActions.clickonallstatusandverify();
		StepTracker.setCurrentStep("click on all status and verify ICN");
	}
 
	@Then("click on all time status and verify ICN")
	public void click_on_all_time_status_and_verify() throws Exception {
	    CreditNotesActions.clickonalltimestatusandverify();
	    StepTracker.setCurrentStep("click on all time status and verify ICN");
	}
 
	@Then("click on invoice check box and verify enabling options ICN")
	public void click_on_invoice_check_box_and_verify_enabling_options() throws InterruptedException {
	   CreditNotesActions.clickoninvoicecheckboxandverifyenablingoptions();
	   StepTracker.setCurrentStep("click on invoice check box and verify enabling options ICN");
	}
 
	@Then("click on export report as excel ICN")
	public void click_on_export_report_as_excel() throws InterruptedException {
	    CreditNotesActions.clickonexportreportasexcel();
	    StepTracker.setCurrentStep("click on export report as excel ICN");
	}
 
	@Then("click on export report as csv ICN")
	public void click_on_export_report_as_csv() throws InterruptedException {
	   CreditNotesActions.clickonexportreportascsv();
	   StepTracker.setCurrentStep("click on export report as csv ICN");
	}
 
	@Then("click on export report as pdf ICN")
	public void click_on_export_report_as_pdf() throws InterruptedException {
	    CreditNotesActions.clickonexportreportaspdf();
	    StepTracker.setCurrentStep("click on export report as pdf ICN");
	}
 
	@Then("click and select page number ICN")
	public void click_and_select_page_number() throws InterruptedException {
	    CreditNotesActions.clickandselectpagenumber();
	    StepTracker.setCurrentStep("click and select page number ICN");
	}
 
	@Then("click and verify previous button ICN")
	public void click_and_verify_previous_button() throws InterruptedException {
	    CreditNotesActions.clickandverifypreviousbutton();
	    StepTracker.setCurrentStep("click and verify previous button ICN");
	}
 
	@Then("click and verify next button ICN")
	public void click_and_verify_next_button() throws InterruptedException {
	   CreditNotesActions.clickandverifynextbutton();
	   StepTracker.setCurrentStep("click and verify next button ICN");
	}
	
	@Then("Click on kebeb menu ICN")
	public void click_on_kebeb_menu() {
		CreditNotesActions.Clickonkebebmenu();
		StepTracker.setCurrentStep("Click on kebeb menu ICN");
	}
 
	@Then("Click on export to excel ICN")
	public void click_on_export_to_excel() throws InterruptedException {
		CreditNotesActions.Clickonexporttoexcel();
		StepTracker.setCurrentStep("Click on export to excel ICN");
	}
 
	@Then("Click on export to pdf ICN")
	public void click_on_export_to_pdf() throws InterruptedException {
		CreditNotesActions.Clickonexporttocsv();
		StepTracker.setCurrentStep("Click on export to pdf ICN");
	}
 
	@Then("Click on export to csv ICN")
	public void click_on_export_to_csv() throws InterruptedException {
		CreditNotesActions.Clickonexporttopdf();
		StepTracker.setCurrentStep("Click on export to csv ICN");
	}
 
	@Then("Click on preview in kebab ICN")
	public void click_on_preview_in_kebab() throws InterruptedException {
	    CreditNotesActions.Clickonpreviewinkebab();
	    StepTracker.setCurrentStep("Click on preview in kebab ICN");
	}
	
	@Then("Click on sent in kebab ICN")
	public void click_on_sent_in_kebab() throws InterruptedException {
		CreditNotesActions.Clickonsentinkebab();
		StepTracker.setCurrentStep("Click on sent in kebab ICN");
	}
 
	@Then("Click on duplicate in kebab ICN")
	public void click_on_duplicate_in_kebab() throws InterruptedException {
		CreditNotesActions.Clickonduplicateinkebab();
		StepTracker.setCurrentStep("Click on duplicate in kebab ICN");
	}
 
	@Then("Click on history in kebab ICN")
	public void click_on_history_in_kebab() throws InterruptedException {
		CreditNotesActions.Clickonhistoryinkebab();
		StepTracker.setCurrentStep("Click on history in kebab ICN");
	}
 
	@When("Upload the credit note ICN")
	public void upload_the_redit_note() throws Exception {
	    CreditNotesActions.Uploadthecreditnote();
	    StepTracker.setCurrentStep("Upload the credit note ICN");
	}
	
	@Then("Validate uploadCreditnotecustomername should Display in the grid ICN")
	public void validate_upload_creditnote_suppliername_should_display_in_the_grid() {
	    CreditNotesActions.ValidateuploadCreditnotecustomernameshouldDisplayinthegrid();
	    StepTracker.setCurrentStep("Validate uploadCreditnotecustomername should Display in the grid ICN");
	}
	
	@Then("click on goto textfiled and verify ICN")
	public void click_on_goto_textfiled_and_verify() throws InterruptedException {
	    CreditNotesActions.clickongototextfiledandverify();
	    StepTracker.setCurrentStep("click on goto textfiled and verify ICN");
	}
 
	@Then("verify the records according to dropdown ICN")
	public void verify_the_records_according_to_dropdown() throws InterruptedException {
	    CreditNotesActions.verifytherecordsaccordingtodropdown();
	    StepTracker.setCurrentStep("verify the records according to dropdown ICN");
	}
	
	
 
}
