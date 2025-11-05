package com.Capium365.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_Receipts_PurchaseInvoice_Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium365_Receipts_PurchaseInvoice_Stepdefination {
	 
	Capium365_Receipts_PurchaseInvoice_Actions purchaseActions=new Capium365_Receipts_PurchaseInvoice_Actions();
	
	@When("Click on Receipts Menu")
    public void click_on_receipts_menu() throws Throwable {
		purchaseActions.clickOnReceiptsMenu();
		StepTracker.setCurrentStep("Click on Receipts Menu");
    }
 
    @Then("Verify PurchaseInvoice Page")
    public void verify_purchase_invoice_page() {
    	try {
			By arrowButton = By.xpath(
					"//div[contains(@class,'toggle-menu')]/mat-icon[normalize-space(text())='keyboard_arrow_right']");
			WebElement element = HelperClass.waitUntilClickable(arrowButton);
			HelperClass.scrollToElement(element);
			((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].click();", element);
			Log.info("Clicked sidebar expand arrow.");
 
		} catch (Exception e) {
			Log.error("Failed to click sidebar expand arrow: ");
			e.printStackTrace();
		}
    	StepTracker.setCurrentStep("Verify PurchaseInvoice Page");
    	
    }
    @When("Click on Upload PurchaseInvoice button")
    public void click_on_upload_purchase_invoice_button() throws Throwable {
        purchaseActions.ClickonUploadPurchaseInvoiceButton();
        StepTracker.setCurrentStep("Click on Upload PurchaseInvoice button");
    }
    @Then("Click on Choose File button")
    public void click_on_choose_file_button() throws Throwable {
//        PurcAct.chooseFileToUpload("C:\\Automation Project\\CorporationTax_5.0 (1)\\CorporationTax_5.0\\src\\test\\resources\\PurchsaseInvoiceReceipts\\776548925_638695940063382419.pdf");
    	  purchaseActions.uploadFileWithRobot();
    	  StepTracker.setCurrentStep("Click on Choose File button");
    }
    @Then("Click on uploadPurchaseInvoice2Buttton")
    public void click_on_upload_purchase_invoice2buttton() throws InterruptedException {
        purchaseActions.ClickonUploadpurchaseInvoice2Button();
        StepTracker.setCurrentStep("Click on uploadPurchaseInvoice2Buttton");
    }
    //searchBar Functionality
    @When("Click on search bar and enter data and Verify")
    public void click_on_search_bar_and_enter_data_and_verify() {
    	purchaseActions.Verifydata();
    	StepTracker.setCurrentStep("Click on search bar and enter data and Verify");
    }
//    @When("Click on Receiptd Menu")
//    public void click_on_receiptd_menu() throws Throwable {
//    	PurcAct.StatusDropdwonActions();
//        
//    }
 
 
    @Then("Verify AllStatus")
    public void verify_all_status() throws Throwable {
    	purchaseActions.Clickonstatusdropdown();
    	StepTracker.setCurrentStep("Verify AllStatus");
    }
    @Then("Verify AllDropdown")
    public void verify_all_dropdown() throws Throwable {
        purchaseActions.ClickonDateDropdown();
        StepTracker.setCurrentStep("Verify AllDropdown");
    }
 
    
    // Code for Export Functionlity
    @When("Click on three dot")
    public void click_on_three_dot() {
       purchaseActions.CLickonThreedot();
       StepTracker.setCurrentStep("Click on three dot");
    }
 
    @Then("Click on Export to Excel button")
    public void click_on_export_to_excel_button() {
        purchaseActions.ExporttoExcel();
        StepTracker.setCurrentStep("Click on Export to Excel button");
    }
    @Then("Click on Export to Csv button")
    public void click_on_export_to_csv_button() {
    	purchaseActions.ExporttoCSV();
    	StepTracker.setCurrentStep("Click on Export to Csv button");
    }
 
    @Then("Click on Export to Pdf button")
    public void click_on_export_to_pdf_button() throws Throwable {
    	purchaseActions.ExporttoPDF();
    	StepTracker.setCurrentStep("Click on Export to Pdf button");
    }
 
    //Delete Icon
    @Then("Click on delete Icon")
    public void click_on_delete_icon() throws Throwable {
 
       // purchaseActions.selectOneStatus(purInv.AllStatus);
        purchaseActions.clickDeleteButton();
 
      //  purchaseActions.selectOneStatus(purInv.Processing);
        purchaseActions.clickDeleteButton();
 
       // purchaseActions.selectOneStatus(purInv.ToReview);
        purchaseActions.clickDeleteButton();
        StepTracker.setCurrentStep("Click on delete Icon");
    }
    
    @Then("validateno of suppliers")
    public void validateno_of_suppliers() throws Throwable {
        purchaseActions.validatenoofsuppliers();
        StepTracker.setCurrentStep("validateno of suppliers");
    }
    
    @Then("Validate no of purchaseInvoices")
    public void validate_no_of_purchase_invoices() throws Throwable {
        purchaseActions.ValidatenoofpurchaseInvoices();
        StepTracker.setCurrentStep("Validate no of purchaseInvoices");
    }
    
    @Then("Validate no of Total Amount")
    public void validate_no_of_total_amount() throws Throwable {
    	purchaseActions.ValidatenoofTotalAmount();
    	StepTracker.setCurrentStep("Validate no of Total Amount");
    }
    
    
    //Mouse hover and CLick on Archive Button
    @Then("Mousehover Archive button and Click on ArchiveButton")
    public void mousehover_archive_button_and_click_on_archive_button() throws Throwable {
    	StepTracker.setCurrentStep("Mousehover Archive button and Click on ArchiveButton");
    	Thread.sleep(2000);
//    	PurcAct.MousehoverAndClickonArchiveButton();
    	
    }
   
    @Then("Click on yes button")
    public void click_on_yes_button() {
        purchaseActions.ClickonYesButton();
        StepTracker.setCurrentStep("Click on yes button");
    }
    
//    @Then("Click on No  button")
//    public void click_on_no_button() {
//        PurcAct.ClickonNoButton();
    
//    }
    
    @Then("Validate Status is Archived or not")
    public void validate_status_is_archived_or_not() throws Throwable {
        purchaseActions.ArchivedStatus();
        StepTracker.setCurrentStep("Validate Status is Archived or not");
    }
    
    //Helperclass code for mouse hover and click on perfrom Action
    @Then("Mousehover and ClickonDeleteIcon")
    public void mousehover_and_ClickonDeleteIcon() {
    	purchaseActions.SelctToReviewOption();
        purchaseActions.mousehoverandClickonDeleteIcon();
        StepTracker.setCurrentStep("Mousehover and ClickonDeleteIcon");
    }
    
    //Select CheckBox for Delete
    @Then("Select CheckBox")
    public void select_check_box() {
        purchaseActions.ClickonCheckBoxxx();
        StepTracker.setCurrentStep("Select CheckBox");
    }
    
    @Then("Select pagination dropdown in Purchase tab and Validate")
    public void select_pagination_dropdown_in_purchase_tab_and_validate() throws Throwable {
        purchaseActions.ClickonPagiantionDropdownandValidteCount();
        StepTracker.setCurrentStep("Select pagination dropdown in Purchase tab and Validate");
    }
    
    
    @Then("Mousehover and ClickonEditIcon")
    public void mousehover_and_clickon_edit_icon() {
//    	purchaseActions.SelctToReviewOption();
        purchaseActions.MousehoverandclickonEditIcon();
        StepTracker.setCurrentStep("Mousehover and ClickonEditIcon");
    }
    
    @Then("Validate Purchase Invoice Main Grid Should Display")
    public void validate_purchase_invoice_main_grid_should_display() {
        purchaseActions.validatepurchaseInvoiceMainGrid();
    }
    
    
    @Then("Click on CrossButton in EditPurchaseInvoiceScreen and PurchaseInvoice Maingrid Should Display")
    public void click_on_cross_button_in_edit_purchase_invoice_screen_and_purchase_invoice_maingrid_should_display() {
    	purchaseActions.ClickonCrossButtonEditPurchaseInvoiceCrossScreen();
    	StepTracker.setCurrentStep("Click on CrossButton in EditPurchaseInvoiceScreen and PurchaseInvoice Maingrid Should Display");
    }
    
    @Then("Mousehover and Click on Archive Icon")
    public void mousehover_and_click_on_archive_icon() {
    	purchaseActions.SelctToReviewOption();
    	purchaseActions.MousehoverandclickonArchivebutton();
//    	PurcAct.MousehoverandClickonRestorebutton();
    	StepTracker.setCurrentStep("Mousehover and Click on Archive Icon");
        
    }
 
    @Then("Click on Confirm Archive Popup Yes button")
    public void click_on_confirm_archive_popup_yes_button() {
         purchaseActions.ClickonArchiveYesButton();  
         StepTracker.setCurrentStep("Click on Confirm Archive Popup Yes button");
    }
    
    @Then("Mousehover and Click on Threedot")
    public void mousehover_and_click_on_threedot() {
    	purchaseActions.SelctToReviewOption();
        purchaseActions.MousehoverandClickonMorevertbutton();
        StepTracker.setCurrentStep("Mousehover and Click on Threedot");
    }
    
    @Then("Click on Preview button")
    public void click_on_preview_button() {
        purchaseActions.ClickonPreviewButton();
        StepTracker.setCurrentStep("Click on Preview button");
    }
    
    @Then("Click on Close button")
    public void click_on_close_button() {
       purchaseActions.clickonClosebuttonPreviewpage();
       StepTracker.setCurrentStep("Click on Close button");
    }
    
    @Then("Click on History button")
    public void click_on_history_button() {
       purchaseActions.clickonHistoryButton();
       StepTracker.setCurrentStep("Click on History button");
    }
    
    @Then("Click on File Icon")
    public void click_on_file_icon() {
        purchaseActions.ClickonFileIcon();
        StepTracker.setCurrentStep("Click on File Icon");
    }
    
    @Then("Click on File Donwload Icon")
    public void click_on_file_donwload_icon() {
       purchaseActions.ClickonDownloadFileIcon();
       StepTracker.setCurrentStep("Click on File Donwload Icon");
    }
    
    @Then("Click on Save button")
    public void click_on_save_button() {
        purchaseActions.ClickonSaveButton();
        StepTracker.setCurrentStep("Click on Save button");
    }
    
    @Then("Click on CheckBox")
    public void click_on_check_box() {
        purchaseActions.ClickonSelectCheckBox();
        StepTracker.setCurrentStep("Click on CheckBox");
    }
 
    @Then("Validate Footer Options Should Display")
    public void validate_footer_options_should_display() {
    	System.out.println("All Options Verified");
        Log.info("Validate Footer Options Should Display", "Puechase Invoice");
        StepTracker.setCurrentStep("Validate Footer Options Should Display");
        
    }
    
    @Then("Click on Purchase invoice Id")
    public void click_on_purchase_invoice_id() {
       purchaseActions.ClickonID();
       Log.info("Click on Purchase invoice Id", "Puechase Invoice");
       StepTracker.setCurrentStep("Click on Purchase invoice Id");
    }
 
    @Then("Validate Edit Purhase Invoice Should Display")
    public void validate_edit_purhase_invoice_should_display() {
       purchaseActions.ValidateEditPurchaseInvoicepage();
       StepTracker.setCurrentStep("Validate Edit Purhase Invoice Should Display");
    }
    
    @Then("Click on PurchaseInvoiceCloseButton")
    public void click_on_purchase_invoice_close_button() {
        purchaseActions.ClickonEditpurchaseInvoiceCloseButton();
        StepTracker.setCurrentStep("Click on PurchaseInvoiceCloseButton");
    }
 
    @Then("Click on Save and Exit button")
    public void click_on_save_and_exit_button() throws Throwable {
    	purchaseActions.clickonsaveandExitbutton();
    	StepTracker.setCurrentStep("Click on Save and Exit button");
    }
    
    @Then("Click in Currency Dropdown")
    public void click_in_currency_dropdown() throws Throwable {
       purchaseActions.ClickonCurrencyDropdown();
       StepTracker.setCurrentStep("Click in Currency Dropdown");
    }
    
    @Then("Click on save button1")
    public void click_on_save_button1() {
    	purchaseActions.cickonsavebuttonineditpurchaseinvoicepeg();
    	StepTracker.setCurrentStep("Click on save button1");
    }
    
    @Then("Click in settings Icon")
    public void click_in_settings_icon() {
        purchaseActions.clickonsettingsIcon();
        StepTracker.setCurrentStep("Click in settings Icon");
    }
 
    @Then("Validate Settings popup should Display")
    public void validate_settings_popup_should_display() {
       purchaseActions.validatesettingspopup();
       StepTracker.setCurrentStep("Validate Settings popup should Display");
    }
    
    @Then("Verify Processing Status Should Display in the main Grid")
    public void verify_processing_status_should_display_in_the_main_grid() {
        purchaseActions.ValidateUploadProcessingStatus();
        StepTracker.setCurrentStep("Verify Processing Status Should Display in the main Grid");
    }
    
    @Then("CLick on Account Name Dropdown")
    public void c_lick_on_account_name_dropdown() throws Throwable {
        purchaseActions.AccountNameDropdown();	
        StepTracker.setCurrentStep("CLick on Account Name Dropdown");
    }
    @Then("Click on Add Supplier button")
    public void click_on_add_supplier_button() {
    	purchaseActions.ClickonAddSupplierButton();
    	StepTracker.setCurrentStep("Click on Add Supplier button");
    }
    
    @Then("Enter Supplier Name")
    public void enter_supplier_name() throws Throwable {
    	purchaseActions.EnterSupplierName();
    	StepTracker.setCurrentStep("Enter Supplier Name");
       
    }
    
    @When("Click on PurchaseInvoieInsideSidebar")
    public void click_on_purchase_invoie_inside_sidebar() {
        purchaseActions.ClickOnPurchaseInvoiceInsideSidebar();
    }
 
    @Then("CLick on Save button")
    public void c_lick_on_save_button() {
        purchaseActions.ClickonSaveButtoninAddSuppplierPage();
        StepTracker.setCurrentStep("CLick on Save button");
    }
    
    @Then("Click on Cancel Changes button")
    public void click_on_cancel_changes_button() throws Throwable {
       purchaseActions.clickonCancelchangesbutton();
       StepTracker.setCurrentStep("Click on Cancel Changes button");
    }
    
    @Then("Click on Back to Purchase Invoice Link")
    public void click_on_back_to_purchase_invoice_link() {
       purchaseActions.ClickonBackToPurchaseInvocesLink();
       StepTracker.setCurrentStep("Click on Back to Purchase Invoice Link");
    }
 
    @Then("Validate Edit Edit Purchase Invoice Page Should Display")
    public void validate_edit_edit_purchase_invoice_page_should_display() {
        purchaseActions.ValdateEditPurchaseInvoicePage();
        StepTracker.setCurrentStep("Validate Edit Edit Purchase Invoice Page Should Display");
    }
    
    @Then("Validate Supplier Main grid Should Display")
    public void validate_supplier_main_grid_should_display() {
        purchaseActions.ValdateAddSupplierPage();
        StepTracker.setCurrentStep("Validate Supplier Main grid Should Display");
    }
    
    @Then("Click on Edit Icon")
    public void click_on_edit_icon() throws InterruptedException {
       purchaseActions.ClickonEditSupplierButton();
       StepTracker.setCurrentStep("Click on Edit Icon");
    }
 
    @Then("Edit Supplier Page Should Display")
    public void edit_supplier_page_should_display() {
       purchaseActions.ValdateEditSupplierPage();
       StepTracker.setCurrentStep("Edit Supplier Page Should Display");
    }
 
    @Then("Click on History Tab")
    public void click_on_history_tab() {
       purchaseActions.ClickonHistoryTab();
       StepTracker.setCurrentStep("Click on History Tab");
    }
 
   
    @Then("Validate History Page Should Display")
    public void validate_history_page_should_display() {
        purchaseActions.validateHistoryPage();
        StepTracker.setCurrentStep("Validate History Page Should Display");
        		
    }
    
    @Then("Click on Add another Item")
    public void click_on_add_another_item() {
       purchaseActions.ClickonAddanotherItem();
       StepTracker.setCurrentStep("Click on Add another Item");
    }
 
    @Then("Enter All the Details")
    public void enter_all_the_details() {
    	StepTracker.setCurrentStep("Enter All the Details");
    }
    
    
    @Then("Click on Status dropdown and verify")
    public void click_on_status_dropdown_and_verify() throws Throwable {
    	//purchaseActions.SelectDropdownandVerify();
    	StepTracker.setCurrentStep("Click on Status dropdown and verify");
    }
    
    @Then("Click on Particular Check box")
    public void click_on_particular_check_box() {
    	purchaseActions.SelctToReviewOption();
        purchaseActions.ClickonSelectCheckBox();
        StepTracker.setCurrentStep("Click on Particular Check box");
    }
 
    @Then("Footer Cancel Link Should Display")
    public void footer_cancel_link_should_display() {
       purchaseActions.ValidateCancelLinkInFooter();
       StepTracker.setCurrentStep("Footer Cancel Link Should Display");
    }
 
    @Then("Click on Cancel Link")
    public void click_on_cancel_link() {
        purchaseActions.ClickonCancelLinkInFooter();
        StepTracker.setCurrentStep("Click on Cancel Link");
    }
 
    @Then("Checkbox sould Unchecked")
    public void checkbox_sould_unchecked() {
    	//purchaseActions.validatecheckboxischeckedornot();
    	StepTracker.setCurrentStep("Checkbox sould Unchecked");
    }
    
    @Then("Click on Bulk Edit")
    public void click_on_bulk_edit() {
        purchaseActions.ClickonBulkEditButton();
        StepTracker.setCurrentStep("Click on Bulk Edit");
    }
 
    @Then("Validate Bulk Edit popup Should Display")
    public void validate_bulk_edit_popup_should_display() {
       purchaseActions.ValidateBulkEdit();
       StepTracker.setCurrentStep("Validate Bulk Edit popup Should Display");
    }
    
    @Then("Validate Supplier Dropdown")
    public void validate_supplier_dropdown() throws Throwable {
        purchaseActions.ValidateSupplierDropdown();
        StepTracker.setCurrentStep("Validate Supplier Dropdown");
    }
    
    @Then("Click on Save1 Button")
    public void click_on_save1_button() throws Throwable {
       purchaseActions.ClickonBulkEditPopupSaveButton();
       StepTracker.setCurrentStep("Click on Save1 Button");
    }
    
    @Then("Validate Supplier should Display in the Grid")
    public void validate_supplier_should_display_in_the_grid() {
        purchaseActions.ValidateSupplierNameMainGrid();
        StepTracker.setCurrentStep("Validate Supplier should Display in the Grid");
    }
    
    @Then("Clik on VAT Rate Dropdown")
    public void clik_on_vat_rate_dropdown() throws Throwable {
        purchaseActions.ValidateVATRateDropdownBulkEdit();
        StepTracker.setCurrentStep("Clik on VAT Rate Dropdown");
    }
    
    @Then("Click on Close Button in BulkEditPopup")
    public void click_on_close_button_in_bulk_edit_popup() {
        purchaseActions.ClickonCloseButtoninBulkEditPopup();
        StepTracker.setCurrentStep("Click on Close Button in BulkEditPopup");
    }
    
    @Then("Validate Bulk Edit Popup Shoould not Display")
    public void validate_bulk_edit_popup_shoould_not_display() {
    	purchaseActions.ValidateBulkEdit();
    	StepTracker.setCurrentStep("Validate Bulk Edit Popup Shoould not Display");
    }
    
    
    
    @Then("Click on Footer Delete Button")
    public void click_on_footer_delete_button() {
        purchaseActions.ClickonFooterDeleteButton();
        StepTracker.setCurrentStep("Click on Footer Delete Button");
    }
 
    @Then("ConfirmDelete Popup Should Display")
    public void confirm_delete_popup_should_display() {
        purchaseActions.ValidateDeletepopup();
        StepTracker.setCurrentStep("ConfirmDelete Popup Should Display");
    }
    
    @Then("Click on No Button")
    public void click_on_no_button() {
    	 purchaseActions.ClickonNoButton();
    	 StepTracker.setCurrentStep("Click on No Button");
    }
    
 
    @Then("Confirm delete popup Should not Display")
    public void confirm_delete_popup_should_not_display() {
        purchaseActions.ValidateDeletepopup();
        StepTracker.setCurrentStep("Confirm delete popup Should not Display");
    }
    
    @Then("Click on Excel buttton")
    public void click_on_excel_buttton() {
        purchaseActions.ClickonFooterExcelButton();
        StepTracker.setCurrentStep("Click on Excel buttton");
    }
 
    @Then("Click on CSV buttton")
    public void click_on_csv_buttton() {
        purchaseActions.ClickonFooterCSVButton();
        StepTracker.setCurrentStep("Click on CSV buttton");
    }
 
    @Then("Click on PDF buttton")
    public void click_on_pdf_buttton() {
        purchaseActions.ClickonFooterPDFButton();
        StepTracker.setCurrentStep("Click on PDF buttton");
    }
    
    @Then("Click on Archive  button footer")
    public void click_on_archive_button_footer() {
        purchaseActions.CliconFooterArcivebutton();
        StepTracker.setCurrentStep("Click on Archive  button footer");
    }
 
    @Then("Valdiate Archive popup Should Display")
    public void valdiate_archive_popup_should_display() {
    	purchaseActions.ValidateConfirmArchivepopup();
    	StepTracker.setCurrentStep("Valdiate Archive popup Should Display");
    }
    
    @Then("Validate Record should Display as Archived")
    public void validate_record_should_display_as_archived() {
        purchaseActions.ValidateArchivedStatus();
        StepTracker.setCurrentStep("Validate Record should Display as Archived");
    }
    
    @Then("Click on Restore  button footer")
    public void click_on_restore_button_footer() {
    	purchaseActions.ClickonFooterRestoreButton();
    	StepTracker.setCurrentStep("Click on Restore  button footer");
    }
 
    @Then("Valdiate Restore popup Should Display")
    public void valdiate_restore_popup_should_display() {
        purchaseActions.ValidateConfirmRestorepopup();
        StepTracker.setCurrentStep("Valdiate Restore popup Should Display");
    }
    
    @Then("Status Should Display as ToReview")
    public void status_should_display_as_to_review() {
        purchaseActions.FooterStatusToReviewForFooter();
        StepTracker.setCurrentStep("Status Should Display as ToReview");
    }
    
    @Then("Verify UploadReceiptsSuppliername should Display in the grid")
    public void verify_upload_receipts_suppliername_should_display_in_the_grid() {
        purchaseActions.ValidateSupplierNameMainGrid();
        StepTracker.setCurrentStep("Verify UploadReceiptsSuppliername should Display in the grid");
    }
    
    @Then("Valdiate DuplicateLogo in the Main Grid")
    public void valdiate_duplicate_logo_in_the_main_grid() {
       purchaseActions.validateDuplicateLogo();
       StepTracker.setCurrentStep("Valdiate DuplicateLogo in the Main Grid");
    }
 
    @Then("Click on Duplicate Logo in purchases")
    public void click_on_duplicate_logo() {
        purchaseActions.ClickonDuplicateLogo();
        StepTracker.setCurrentStep("Click on Duplicate Logo in purchases");
    }
 
    @Then("Validate Process Duplicate Upload Should Display")
    public void validate_process_duplicate_upload_should_display() {
        purchaseActions.ValidateProcessDuplicateUpload();
        StepTracker.setCurrentStep("Validate Process Duplicate Upload Should Display");
    }
    
    @Then("Click on yes button process Duplicate upload")
    public void click_on_yes_button_process_duplicate_upload() throws Throwable {
        purchaseActions.ClickonProcessDuplicateYesButton();
        StepTracker.setCurrentStep("Click on yes button process Duplicate upload");
    }
    
    @Then("Click on No button process upload Duplicate")
    public void click_on_no_button_process_duplicate_upload() {
        purchaseActions.ClickonProcessDuplicateNoButton();
        StepTracker.setCurrentStep("Click on No button process upload Duplicate");
    }
 
    @Then("Validate ProcessDuplicate upload po-pup Should Not Display")
    public void validate_process_duplicate_upload_popup_should_not_display() {
        purchaseActions.ValidateProcessDuplicateUpload();
        StepTracker.setCurrentStep("Validate ProcessDuplicate upload po-pup Should Not Display");
    }
    
    @Then("Select Discount type dropdown")
    public void select_discount_type_dropdown() {
    	StepTracker.setCurrentStep("Select Discount type dropdown");
    }
    
    @Then("Validate Duplicate Success Message")
    public void validate_duplicate_success_message() {
        purchaseActions.ValidateuplicateSuccessMessage();
    }
    
    @Then("Click on CrossButton in EditPurchaseInvoiceScreen")
    public void click_on_cross_button_in_edit_purchase_invoice_screen() throws Throwable {
        purchaseActions.ClickonCrossButonIneditPurchaseInvoiceScreen();
    }
    
    @Then("Click on Expand Erroww")
    public void click_on_expand_erroww() {
        purchaseActions.CLikonExpandErrorw();
    }

    
}