package com.Capium365.StepDefination;

import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_Receipts_Supplier_Actions;

import io.cucumber.java.en.Then;

public class Capium365_Receipts_Supplier_StepDefination {

	Capium365_Receipts_Supplier_Actions SuppActions = new Capium365_Receipts_Supplier_Actions();

	@Then("Click on KeyBoardErrorRight")
	public void click_on_key_board_error_right() {
		SuppActions.ClickonKeyBoardErrowRight();
		StepTracker.setCurrentStep("Click on KeyBoardErrorRight");
	}

	@Then("Click on Suppliers Menu")
	public void click_on_suppliers_menu() throws Throwable {
		SuppActions.ClickonSupplersMenu();
		StepTracker.setCurrentStep("Click on Suppliers Menu");
	}

	@Then("Click on Add Supplier")
	public void click_on_add_supplier() {
		SuppActions.clickonAddsupplierButton();
		StepTracker.setCurrentStep("Click on Add Supplier");
	}

	@Then("Validate Add New Supplier Page Should Display")
	public void validate_add_new_supplier_page_should_display() {
		SuppActions.ValidateAddNewSupplierPage();
		StepTracker.setCurrentStep("Validate Add New Supplier Page Should Display");
	}

	@Then("Enter All Mandatory Details")
	public void enter_all_mandatory_details() throws InterruptedException {
		SuppActions.EnterSupplierField();
		StepTracker.setCurrentStep("Enter All Mandatory Details");
	}

	@Then("Validate Filelds data is Earased or not")
	public void validate_filelds_data_is_earased_or_not() {
		System.out.println("Data is Earased");
		StepTracker.setCurrentStep("Validate Filelds data is Earased or not");
	}

	@Then("Validate Payment Account dropdown")
	public void validate_payment_account_dropdown() throws Throwable {
		SuppActions.ValidatePaymentAccountDropdown();
		StepTracker.setCurrentStep("Validate Payment Account dropdown");
	}

	@Then("Validate VAT Rate Dropdown")
	public void validate_vat_rate_dropdown() throws Throwable {
		SuppActions.ValidateVATRateDropdown();
		StepTracker.setCurrentStep("Validate VAT Rate Dropdown");
	}

	@Then("Validate date dropdown")
	public void validate_date_dropdown() throws Throwable {
		SuppActions.ValidateDateDropdownInAddSupplierPage();
		StepTracker.setCurrentStep("Validate date dropdown");
	}

	// searchBar Functionality
	@Then("SearchAndVerifydata")
	public void search_and_verifydata() {
		SuppActions.SearchAndVerifydata();
		StepTracker.setCurrentStep("SearchAndVerifydata");
	}

	@Then("Mousehover and ClickonEditIcon supplier page")
	public void mousehover_and_clickon_edit_icon_supplier_page() {
		SuppActions.mousehoverandPerformActions(1, "Edit");
		StepTracker.setCurrentStep("Mousehover and ClickonEditIcon supplier page");
	}

	@Then("Click on CrossButton in EditSupplierScreen")
	public void click_on_cross_button_in_edit_supplier_screen() {
		SuppActions.ClickonCrossButtonEditsupplierScreen();
		StepTracker.setCurrentStep("Click on CrossButton in EditSupplierScreen");
	}

	@Then("Mousehover and ClickonDeleteIcon supplier page")
	public void mousehover_and_clickon_delete_icon_supplier_page() {
//		SuppActions.mousehoverandPerformActions(1, "Delete");
		SuppActions.MousehoverandclickDeleteIcon();
		StepTracker.setCurrentStep("Mousehover and ClickonDeleteIcon supplier page");
	}

	@Then("Click on Yes button")
	public void click_on_yes_button() {
		SuppActions.ClickonYesButton();
		StepTracker.setCurrentStep("Click on Yes button");
	}

	@Then("Click on No button")
	public void click_on_no_button() {
		SuppActions.ClickonNoButton();
		StepTracker.setCurrentStep("Click on No button");
	}

	@Then("Valdiate Pagination dropdown and Verify")
	public void valdiate_pagination_dropdown_and_verify() throws Throwable {
		SuppActions.ClickonPagiantionDropdownandValidteCount();
		StepTracker.setCurrentStep("Valdiate Pagination dropdown and Verify");
	}

	@Then("Validate Next button")
	public void validate_next_button() {
		SuppActions.ValidateNextButton();
		StepTracker.setCurrentStep("Validate Next button");
	}

	@Then("Validate Previous button")
	public void validate_previous_button() {
		SuppActions.ValidatePreviousButton();
		StepTracker.setCurrentStep("Validate Previous button");
	}

	@Then("Click on IDCheckBox")
	public void click_on_id_check_box() {
		SuppActions.ClickonIDCheckBox();
		StepTracker.setCurrentStep("Click on IDCheckBox");
	}

	@Then("Click on Cancel button")
	public void click_on_cancel_button() {
		SuppActions.ClickonCancelbutton();
		StepTracker.setCurrentStep("Click on Cancel button");
	}

	@Then("Click on IDCheckBox For Particular Supplier")
	public void click_on_id_check_box_for_particular_supplier() {
		SuppActions.ClickonSupplierIDCheck();
		StepTracker.setCurrentStep("Click on IDCheckBox For Particular Supplier");
	}

	@Then("Click on Delete button")
	public void click_on_delete_button() {
		SuppActions.ClickonFooterDeleteButton();
		StepTracker.setCurrentStep("Click on Delete button");
	}

	@Then("Validate Confirm Delere popup Should Display")
	public void validate_confirm_delere_popup_should_display() {
		SuppActions.ValidateConfirmDeletepopup();
		StepTracker.setCurrentStep("Validate Confirm Delere popup Should Display");
	}

	@Then("Click on Footer Excel button")
	public void click_on_footer_excel_button() {
		SuppActions.ClickonFooterExcelButton();
		StepTracker.setCurrentStep("Click on Footer Excel button");
	}

	@Then("Click on Footer Csv button")
	public void click_on_footer_csv_button() {
		SuppActions.ClickonFooterCsvButton();
		StepTracker.setCurrentStep("Click on Footer Csv button");
	}

	@Then("Click on Footer Pdf button")
	public void click_on_footer_pdf_button() {
		SuppActions.ClickonFooterPdfButton();
		StepTracker.setCurrentStep("Click on Footer Pdf button");
	}

	@Then("Click on Footer Cross button")
	public void click_on_footer_cross_button() {
		SuppActions.ClickonFooterCrossBtton();
		StepTracker.setCurrentStep("Click on Footer Cross button");
	}

	@Then("Click on Search bar and Click on Edit Icon")
	public void click_on_search_bar_and_click_on_edit_icon() {
		SuppActions.clickEditForPurchaseInvoice();
		StepTracker.setCurrentStep("Click on Search bar and Click on Edit Icon");
	}

	@Then("Click on Suppliers ID")
	public void click_on_suppliers_id() {
		SuppActions.ClickonSupplierID();
		StepTracker.setCurrentStep("Click on Suppliers ID");
	}

	@Then("Click on Check Box")
	public void click_on_check_box() {
		SuppActions.ClickonInsideSupplierCheckBox();
		StepTracker.setCurrentStep("Click on Check Box");
	}

	@Then("Validate the Supplier Count")
	public void validate_the_supplier_count() {
		SuppActions.ValidateSupplierCountCheckBoxRecords();
		StepTracker.setCurrentStep("Validate the Supplier Count");
	}

	@Then("History should be Display")
	public void history_should_be_display() {
		SuppActions.ValidateHistoryTabLogo();
		StepTracker.setCurrentStep("History should be Display");
	}
	
	@Then("Validate Goto Page")
	public void validate_goto_page() throws Throwable {
	    SuppActions.VerifyGoTopageNumber();
	    StepTracker.setCurrentStep("Validate Goto Page");
	}
	
	@Then("Click on Close button In History Tab")
	public void click_on_close_button_in_history_tab() {
	    SuppActions.ClickonHistoryTabCloseButton();
	    StepTracker.setCurrentStep("Click on Close button In History Tab");
	}
	
	@Then("Validate Delete Supplier SuccessMessage")
	public void validate_delete_supplier_success_message() {
	    StepTracker.setCurrentStep("Validate Delete Supplier SuccessMessage");
	}

}
