 package com.Capium365.StepDefination;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_Receipts_CreditNotes_Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium365_Receipts_CreditNotes_Stepdefination {
	
	Capium365_Receipts_CreditNotes_Actions CRNActions=new Capium365_Receipts_CreditNotes_Actions();
	
	@Then("Click on CreditNotes Menu")
	public void click_on_credit_notes_menu() {
	    CRNActions.ClickonCreditNotesMenu();
	    StepTracker.setCurrentStep("Click on CreditNotes Menu");
	}
 
	@Then("verify CreditNotes Main Grid Should Display")
	public void verify_credit_notes_main_grid_should_display() {
	    CRNActions.VerifyCreditNotesMainGrid();
	    StepTracker.setCurrentStep("verify CreditNotes Main Grid Should Display");
	}
	
	@Then("validate No of suppliers")
	public void validate_no_of_suppliers() throws Throwable {
		CRNActions.validatenoofsuppliersCreditNotes();
		StepTracker.setCurrentStep("validate No of suppliers");
	}
	
	@Then("validate No of CrediNotes")
	public void validate_no_of_credi_notes() throws Throwable {
	    CRNActions.ValidatenoofCreditnotes();
	    StepTracker.setCurrentStep("validate No of CrediNotes");
	}
    
	@Then("validate No of TotalAmounts")
	public void validate_no_of_total_amounts() throws Throwable {
	    CRNActions.ValidatenoofTotalAmountCrediNotes();
	    StepTracker.setCurrentStep("validate No of TotalAmounts");
	}
	
 
	@Then("validate No of Processing")
	public void validate_no_of_processing() throws Throwable {
	    CRNActions.ValidatenoofProcessingCreditNotes();
	    StepTracker.setCurrentStep("validate No of Processing");
	}
 
	@Then("validate No of ToReview")
	public void validate_no_of_to_review() throws Throwable {
	  CRNActions.ValidatenoofToReviewCreditNotes();
	  StepTracker.setCurrentStep("validate No of ToReview");
	}
 
	@Then("validate No of Success")
	public void validate_no_of_success() throws Throwable {
	    CRNActions.ValidatenoofToSuccessCreditNotes();
	    StepTracker.setCurrentStep("validate No of Success");
	}
 
	@Then("validate No of Archived")
	public void validate_no_of_archived() throws Throwable {
	    CRNActions.ValidatenoofArchivedCreditNotes();
	    StepTracker.setCurrentStep("validate No of Archived");
	}
 
	@Then("validate No of Duplicate")
	public void validate_no_of_duplicate() throws Throwable {
	   CRNActions.ValidatenoofDuplicateCreditNotes();
	   StepTracker.setCurrentStep("validate No of Duplicate");
	}
	
	@When("Click on Upload CreditNotes button")
	public void click_on_upload_credit_notes_button() throws Throwable {
	    CRNActions.ClickonUploadCreditNotesButton();
	    StepTracker.setCurrentStep("Click on Upload CreditNotes button");
	}
 
	@Then("Click on uploadCreditNotes2Buttton")
	public void click_on_upload_credit_notes2buttton() throws Throwable {
		CRNActions.ClickonUploadCreditNotes2Button();
		StepTracker.setCurrentStep("Click on uploadCreditNotes2Buttton");
		
	}
	
	@Then("Click on Choose File button for CreditNotes")
	public void click_on_choose_file_button_for_credit_notes() throws Throwable {
	   CRNActions.uploadFileForCreditNotesWithRobot();
	   StepTracker.setCurrentStep("Click on Choose File button for CreditNotes");
	}
    
	@Then("Click on Cancel Button")
	public void click_on_cancel_button() throws Throwable {
	    CRNActions.ClickOnCancelButtonUploadPurchaseInvoice();
	    StepTracker.setCurrentStep("Click on Cancel Button");
	}
	
	@Then("Verify ChooseFile Page Should Display")
	public void verify_choose_file_page_should_display() {
	   CRNActions.ValidateChooseFilePage();
	   StepTracker.setCurrentStep("Verify ChooseFile Page Should Display");
	}
	
	@Then("Search and Verify CreditNote")
	public void search_and_verify_credit_note() {
	    CRNActions.SearchAndValidateCredinoteNumber();
	    StepTracker.setCurrentStep("Search and Verify CreditNote");
	}
	
	@Then("Click on Status Dropdown and Verify Each Status")
	public void click_on_status_dropdown_and_verify_each_status() throws Throwable {
	   CRNActions.SelectDropdownandVerify();
	   StepTracker.setCurrentStep("Click on Status Dropdown and Verify Each Status");
	}
	
	@Then("Validate uploadCrdditOteSuppliername should Display in the grid")
	public void validate_upload_crddit_ote_suppliername_should_display_in_the_grid() {
	    CRNActions.VerifySupplierNameInCreditNotesMainGrid();
	    StepTracker.setCurrentStep("Validate uploadCrdditOteSuppliername should Display in the grid");
	}
	
	//Need to write Code for Duplicate Logo Verification
	
	
	@Then("Valdiate DuplicateLogo in the CreditNote Main Grid")
	public void valdiate_duplicate_logo_in_the_credit_note_main_grid() {
		StepTracker.setCurrentStep("Valdiate DuplicateLogo in the CreditNote Main Grid");
	}
	
	@Then("Valdiate ID should Deasable")
	public void valdiate_id_should_deasable() {
	   CRNActions.validateLinkIsDisabled();
	   StepTracker.setCurrentStep("Valdiate ID should Deasable");
	}
    
	@Then("Click on Export To excel in Creditnote")
	public void click_on_export_to_excel_in_creditnote() {
	    CRNActions.ClickonExcelbutton();
	    StepTracker.setCurrentStep("Click on Export To excel in Creditnote");
	}
 
	@Then("Click on Export To CSV in CreditNote")
	public void click_on_export_to_csv_in_credit_note() {
	    CRNActions.ClickonCSVbutton();
	    StepTracker.setCurrentStep("Click on Export To CSV in CreditNote");
	}
 
	@Then("Click on Export To PDF in CreditNote")
	public void click_on_export_to_pdf_in_credit_note() throws Throwable {
	   CRNActions.ClickonPDFbutton();
	   StepTracker.setCurrentStep("Click on Export To PDF in CreditNote");
	}
	
	@Then("Click on Threedot")
	public void click_on_threedot() {
	   CRNActions.ClickonThreeDot();
	   StepTracker.setCurrentStep("Click on Threedot");
	}
	
//	@When("Click on Receipts Menuu")
//	public void click_on_receipts_menuu() throws Throwable {
//	    CRNActions.clickOnReceiptsMenu();
//	}
	
//	@Then("Click on Duplicate Logo")
//    public void click_on_duplicate_logo() {
//        PurcAct.ClickonDuplicateLogo();
//    }
	
	@Then("Click on Duplicate Logoo")
	public void click_on_duplicate_logoo() {
	    CRNActions.clickonDuplicatelogo();
	    StepTracker.setCurrentStep("Click on Duplicate Logoo");
	}
	
	@Then("Mousehover and ClickonEditIconn")
	public void mousehover_and_clickon_edit_iconn() {
		CRNActions.SelctToReviewOption();
	    CRNActions.MousehoverandclickonEditIcon();
	    StepTracker.setCurrentStep("Mousehover and ClickonEditIconn");
	}
	
	@Then("Click on CrossButton in EditPurchaseCreditNoteScreen")
	public void click_on_cross_button_in_edit_purchase_credit_note_screen() {
	    CRNActions.ClickonCrossButtonEditPurchaseCrditNoteScreen();
	    StepTracker.setCurrentStep("Click on CrossButton in EditPurchaseCreditNoteScreen");
	}
 
	@Then("Mousehover and ClickonDeleteIconn")
	public void mousehover_and_clickon_delete_iconn() {
	    CRNActions.MousehoverandclickonDeleteIcon();
	    StepTracker.setCurrentStep("Mousehover and ClickonDeleteIconn");
	}
	
	@Then("Select CheckBoxx")
	public void select_check_boxx() {
	    CRNActions.ClickDeleteCheckBox();
	    StepTracker.setCurrentStep("Select CheckBoxx");
	}
 
	@Then("Click on yes buttonn")
	public void click_on_yes_buttonn() {
	    CRNActions.ClickonyesButton();
	    StepTracker.setCurrentStep("Click on yes buttonn");
	}
	
	@Then("Click on No buttonn")
	public void click_on_no_buttonn() {
	    CRNActions.ClickonNoButon();
	    StepTracker.setCurrentStep("Click on No buttonn");
	}
	
	@Then("Mousehover and Clickon Archive Iconn")
	public void mousehover_and_clickon_archive_iconn() {
		CRNActions.SelctToReviewOption();
	   CRNActions.MousehoverandclickonArchiveIcon();
	   StepTracker.setCurrentStep("Mousehover and Clickon Archive Iconn");
	}
    
	@Then("verify Status should Display as Archived")
	public void verify_status_should_display_as_archived() throws Throwable {
	    CRNActions.ValdiateArchivedStatus();
	    StepTracker.setCurrentStep("verify Status should Display as Archived");
	    
	}
	
	@Then("Mousehover and Clickon Restore Iconn")
	public void mousehover_and_clickon_restore_iconn() {
		CRNActions.clickonArchivebutton();
	    CRNActions.MousehoverandclickonRestoreIcon();
	    StepTracker.setCurrentStep("Mousehover and Clickon Restore Iconn");
	}
 
	@Then("verify Status should Display as ToReview")
	public void verify_status_should_display_as_to_review() {
	    CRNActions.ValdiateToReviewStatus();
	    StepTracker.setCurrentStep("verify Status should Display as ToReview");
	}
	
	@Then("Mousehover and Click on ThreeDot")
	public void mousehover_and_click_on_three_dot() {
	   CRNActions.MousehoverandclickonThreeDotIcon();
	   StepTracker.setCurrentStep("Mousehover and Click on ThreeDot");
	}
 
	@Then("Validare Preview Purchase CteditNotes Page Should Display")
	public void validare_preview_purchase_ctedit_notes_page_should_display() {
	   CRNActions.ValidatePreviewPurchaseCreditNotes();
	   StepTracker.setCurrentStep("Validare Preview Purchase CteditNotes Page Should Display");
	}
	
	@Then("Click on Preview buttonn")
	public void click_on_preview_buttonn() {
	    CRNActions.ClickOnPreviewButton();
	    StepTracker.setCurrentStep("Click on Preview buttonn");
	}
	
	@Then("Click on History buttonn")
	public void click_on_history_buttonn() {
	   CRNActions.ClickOnHistoryButton();
	   StepTracker.setCurrentStep("Click on History buttonn");
	}
 
	@Then("Validare History popup Should Display")
	public void validare_history_popup_should_display() {
	    CRNActions.ValidateHistoryPopUp();
	    StepTracker.setCurrentStep("Validare History popup Should Display");
	}
	
	@Then("Click on HistoryClose button")
	public void click_on_history_close_button() {
	    CRNActions.clickonHstoryCloseButton();
	    StepTracker.setCurrentStep("Click on HistoryClose button");
	}
	
	@Then("Click on File Icon CreditNote MainGrid")
	public void click_on_file_icon_credit_note_main_grid() {
		CRNActions.SelctToReviewOption();
	   CRNActions.ClickonPDFIcon();
	   CRNActions.ClickonClosebutton();
	   StepTracker.setCurrentStep("Click on File Icon CreditNote MainGrid");
	}
 
	@Then("Validate File Icon Should Display")
	public void validate_file_icon_should_display() {
	   CRNActions.ValidateCreditNoteFile();
	   StepTracker.setCurrentStep("Validate File Icon Should Display");
	}
	
	@Then("Valdiate File Icon Should Enable")
	public void valdiate_file_icon_should_enable() {
	    CRNActions.validateFileIconIsEnableorNot();
	    StepTracker.setCurrentStep("Valdiate File Icon Should Enable");
	}
 
	@Then("Validate Purchase CreditNote Main Grid Should Display")
	public void validate_purchase_credit_note_main_grid_should_display() {
		StepTracker.setCurrentStep("Validate Purchase CreditNote Main Grid Should Display");
	}
	
	@Then("Click on KeyBoardErrorRightt")
	public void click_on_key_board_error_rightt() {
	    CRNActions.ClickonKEyBoardErrorRight();
	    StepTracker.setCurrentStep("Click on KeyBoardErrorRightt");
	}
	
	
	@Then("Validate Process Duplicate Upload Should Displayy")
	public void validate_process_duplicate_upload_should_displayy() {
	    CRNActions.ValidateProcessDuplicateUpload();
	    StepTracker.setCurrentStep("Validate Process Duplicate Upload Should Displayy");
	}
	
	@Then("Click on Recript ID")
	public void click_on_recript_id() {
	    CRNActions.clickonreciptID();
	    StepTracker.setCurrentStep("Click on Recript ID");
	}
 
	@Then("Valdate Edit Purchase CrditNOte Page Should Display")
	public void valdate_edit_purchase_crdit_n_ote_page_should_display() {
	   CRNActions.validateEditPurchaseCreditNotePage();
	   StepTracker.setCurrentStep("Valdate Edit Purchase CrditNOte Page Should Display");
	}
    
	@Then("Click on Date picker and Select Date")
	public void click_on_date_picker_and_select_date() {
	    CRNActions.ClickonCalendorButton();
	    StepTracker.setCurrentStep("Click on Date picker and Select Date");
	}
 
	@Then("Validate Upload CreditNote Page Should Display")
	public void validate_upload_credit_note_page_should_display() {
		StepTracker.setCurrentStep("Validate Upload CreditNote Page Should Display");
	}
	
	@Then("Validate Supplier Dropdown and Select Supplier")
	public void validate_supplier_dropdown_and_select_supplier() throws Throwable {
	    CRNActions.ValidateSuppplierDropdownEditPurchaseCreditNotePage();
	    StepTracker.setCurrentStep("Validate Supplier Dropdown and Select Supplier");
	}
	
	@Then("Click on Save and Exit button in Edit Purchase CreditNote")
	public void click_on_save_and_exit_button_in_edit_purchase_credit_note() {
	    CRNActions.ClickonSaveandExitbutton();
	    StepTracker.setCurrentStep("Click on Save and Exit button in Edit Purchase CreditNote");
	}
	
	@Then("Validate Supplier Name In the MainGrid")
	public void validate_supplier_name_in_the_main_grid() {
	    CRNActions.ValidateSupplierNameIntheMainGrid();
	    StepTracker.setCurrentStep("Calidate Supplier Name In the MainGrid");
	}
	
	@Then("Click on Settings Icon")
	public void click_on_settings_icon() {
	    CRNActions.ClickonSettingsIcon();
	    StepTracker.setCurrentStep("Click on Settings Icon");
	}
 
	@Then("Settings popup Should Display")
	public void settings_popup_should_display() {
	    CRNActions.ValidateSettingsPopUp();
	    CRNActions.ClickOnClosebuttonSettingsIcon();
	    StepTracker.setCurrentStep("Settings popup Should Display");
	}
	
	@Then("Click on VATRateDropDown")
	public void click_on_vat_rate_drop_down() throws Throwable {
	    CRNActions.ClickonVATRateDropdownSettingsIcon();
	    CRNActions.ClickonSaveButtonSettingspopup();
	    StepTracker.setCurrentStep("Click on VATRateDropDown");
	}
 
	@Then("Verify VAT Rate in products details")
	public void verify_vat_rate_in_products_details() throws Throwable {
	    CRNActions.ValidateVATrateDropdowninproductDetails();
	    StepTracker.setCurrentStep("Verify VAT Rate in products details");
	}
	
	@Then("Click on Supplier button")
	public void click_on_supplier_button() {
	    CRNActions.ClickonPlusbutton();
	    StepTracker.setCurrentStep("Click on Supplier button");
	}
 
	@Then("Add New Supplier Page Should Display")
	public void add_new_supplier_page_should_display() {
	    CRNActions.ValidateAddNewSupplierPage();
	    StepTracker.setCurrentStep("Add New Supplier Page Should Display");
	}
	
	@Then("Enter Supplier Namee")
	public void enter_supplier_namee() throws Throwable {
	    CRNActions.EnterSupplierField();
	    StepTracker.setCurrentStep("Enter Supplier Namee");
	   
	}
 
	@Then("Edit Supplier Page Should Displayy")
	public void edit_supplier_page_should_displayy() {
	    CRNActions.ValidateEditSupplierPage();
	    StepTracker.setCurrentStep("Edit Supplier Page Should Displayy");
	}
	
	@Then("Click on Save buttonn")
	public void click_on_save_buttonn() {
		CRNActions.ClickonSaveButtonn();
		StepTracker.setCurrentStep("Click on Save buttonn");
	}
	@Then("Click on EditSupplierIcon")
	public void click_on_edit_supplier_icon() throws Throwable {
	    CRNActions.ClickonEditButton();
	    StepTracker.setCurrentStep("Click on EditSupplierIcon");
	}
    
	@Then("Edit Supplier Page Should Displayed")
	public void edit_supplier_page_should_displayed() {
	    CRNActions.ValidateEditSupplierPageDiaplayed();
	    StepTracker.setCurrentStep("Edit Supplier Page Should Displayed");
	}
	
	@Then("Click on yes button process Duplicate uploadd")
    public void click_on_yes_button_process_duplicate_uploadd() {
        CRNActions.ClickonProcessDuplicateYesButton();
        StepTracker.setCurrentStep("Click on yes button process Duplicate uploadd");
    }
	
	@Then("Click on No button process Duplicate upload")
    public void click_on_no_button_process_duplicate_upload() {
        CRNActions.ClickonProcessDuplicateNoButton();
        StepTracker.setCurrentStep("Click on No button process Duplicate upload");
    }
	
	@Then("Validate ProcessDuplicate upload popup Should Not Display")
    public void validate_process_duplicate_upload_popup_should_not_display() {
        CRNActions.ValidateProcessDuplicateUploadd();
        StepTracker.setCurrentStep("Validate ProcessDuplicate upload popup Should Not Display");
    }
	
	@Then("Click on IDCheckBox For Particular CreditNote")
	public void click_on_id_check_box_for_particular_credit_note() {
		 CRNActions.ClickonCreditNoteCheckBox();
		 StepTracker.setCurrentStep("Click on IDCheckBox For Particular CreditNote");
	}
 
}