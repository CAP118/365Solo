package com.Capium365.StepDefination;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_Receipts_Receipts_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium365_Receipts_Receipts_Stepdefination {

	Capium365_Receipts_Receipts_Actions receiptsActions = new Capium365_Receipts_Receipts_Actions();
	WebDriverWait wait = HelperClass.getWait();

	String User = "Anwar";
	String Action = "ReceiptsTab";

	@Given("Validate click on Receipts")
	public void validate_click_on_receipts() {
		receiptsActions.ClickOnReceipts();
		StepTracker.setCurrentStep("Validate click on Receipts");
		Log.info("Validate click on Receipts", "Receipts Tab");
	}

	@Given("Validate Side menu bar")
	public void validate_side_menu_bar() {
		receiptsActions.clickSidebarExpandArrow();
		StepTracker.setCurrentStep("Validate Side menu bar");
		Log.info("Validate Side menu bar", "Side bar inside Receipts");
	}

	@When("Click on Receipts")
	public void click_on_receipts() {
		receiptsActions.ClickOnReceiptsInsideSidebar();
		StepTracker.setCurrentStep("Click on Receipts");
		Log.info("Click on Receipts", "Receipts page");
	}

	@When("Validate Add Upload receipts button")
	public void validate_add_upload_receipts_button() {
		receiptsActions.ClickOnUploadPurchaseInvoices();
		StepTracker.setCurrentStep("Validate Add Upload receipts button");
		Log.info("Validate Add Upload receipts button", "Upload button");
	}

	@When("redirect to Receipts dashboard")
	public void redirect_to_receipts_dashboard() {
		receiptsActions.ClickOnReceiptsInsideSidebar();
		StepTracker.setCurrentStep("redirect to Receipts dashboard");
		Log.info("redirect to Receipts dashboard", "Upload button");
	}

	@Then("Validate search bar")
	public void validate_search_bar() {
		receiptsActions.SearchBar();
		StepTracker.setCurrentStep("Validate search bar");
		Log.info("Validate search bar", "Upload button");
	}

	@Then("Validate All status dropdown")
	public void validate_all_status_dropdown() {
		receiptsActions.selectAllStatusOptions();
		StepTracker.setCurrentStep("Validate All status dropdown");
		Log.info("Validate All status dropdown", "All status dropdown");
	}

	@Then("Validate All Time dropdown values one by one")
	public void validate_all_time_dropdown_values_one_by_one() {
		receiptsActions.selectAllTimeDropdownOptionsAndReset(null);
		StepTracker.setCurrentStep("Validate All Time dropdown values one by one");
		Log.info("Validate All Time dropdown values one by one", "All status dropdown");
	}

	@Given("user is on the Purchase Invoices page")
	public void user_is_on_the_purchase_invoices_page() {
		receiptsActions.ClickOn_PurchaseInvoices();
		StepTracker.setCurrentStep("user is on the Purchase Invoices page");
		Log.info("user is on the Purchase Invoices page", "All status dropdown");
		System.out.println("user is on the Purchase Invoices page");
	}

	@When("user selects {string} from the Status dropdown")
	public void user_selects_from_the_status_dropdown(String Status) {
		HelperClass.selectStatusFromDropdown(
				By.xpath("//ng-select[@formcontrolname='statusChange' and contains(@class, 'w-130')]"),
				By.xpath(
						"//ng-dropdown-panel[@class='ng-dropdown-panel ng-star-inserted ng-select-bottom']//div[@role='option']"),
				Status);
		HelperClass.waitForTableToLoad();
		StepTracker.setCurrentStep("user selects " + Status + " from the Status dropdown");
	}

	@Then("invoices listed in the table should show status {string}")
	public void invoices_listed_in_the_table_should_show_status(String Status) {
		StepTracker.setCurrentStep("invoices listed in the table should show status " + Status + "");
	}

	@Then("the count in the summary bar should match the total filtered invoices")
	public void the_count_in_the_summary_bar_should_match_the_total_filtered_invoices() throws IOException {
		StepTracker.setCurrentStep("the count in the summary bar should match the total filtered invoices");
	}

	@When("user selects Receipts {string} from the filter dropdown")
	public void user_selects_receipts_from_the_filter_dropdown(String string) {
		receiptsActions.ClickTimeFilerDropdownOnReceiptsTab(string);
		Log.info("user selects Receipts" + string + "from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("user selects Receipts" + string + "from the filter dropdown");
	}

	@Then("Table data should be displayed")
	public void table_data_should_be_displayed() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), Action);
		Log.info("Table data should be displayed", User, Action);
		StepTracker.setCurrentStep("Table data should be displayed");
	}

	@When("Click on the Three dots it will dsiaplay popup")
	public void click_on_the_three_dots_it_will_dsiaplay_popup() {
		receiptsActions.ClickonThreeDots();
		StepTracker.setCurrentStep("Click on the Three dots it will dsiaplay popup");
		Log.info("Click on the Three dots it will dsiaplay popup", "Export");
	}

	@Then("user selects Export to Excel, Excel file should download")
	public void user_selects_export_to_excel_excel_file_should_download() {
		receiptsActions.ClickOnExportToExcel();
		StepTracker.setCurrentStep("user selects Export to Excel, Excel file should download");
		Log.info("user selects Export to Excel, Excel file should download", "Export");
	}

	@Then("user selects Export to CSV, CSV file should download")
	public void user_selects_export_to_csv_csv_file_should_download() {
		receiptsActions.ClickOnExportToCSV();
		StepTracker.setCurrentStep("user selects Export to CSV, CSV file should download");
		Log.info("user selects Export to CSV, CSV file should download", "Export");
	}

	@Then("user selects Export to PDF, PDF file should download")
	public void user_selects_export_to_pdf_pdf_file_should_download() {
		receiptsActions.ClickOnExportToPDF();
		StepTracker.setCurrentStep("user selects Export to PDF, PDF file should download");
		Log.info("user selects Export to PDF, PDF file should download", "Export");
	}

	@When("user should redirect to choose a file page and click on choose a file, upload receipte")
	public void user_should_redirect_to_choose_a_file_page_and_click_on_choose_a_file_upload_receipte()
			throws IOException, AWTException {
		receiptsActions.ClickOnChoseAfile();
		StepTracker.setCurrentStep(
				"user should redirect to choose a file page and click on choose a file, upload receipte");
		Log.info("user should redirect to choose a file page and click on choose a file, upload receipte",
				"Receipt Upload");
	}

	@When("user select upload receipt button")
	public void user_select_upload_receipt_button() {
		receiptsActions.ClickOnUploadReceiptsbutton();
		StepTracker.setCurrentStep("user select upload receipt button");
		Log.info("user select upload receipt button", "Receipt Upload");
	}

	@Then("user should redirect to receipts dashboard page")
	public void user_should_redirect_to_receipts_dashboard_page() {
		receiptsActions.RedirectToReceiptDashboard();
		StepTracker.setCurrentStep("user should redirect to receipts dashboard page");
		Log.info("user should redirect to receipts dashboard page", "Receipt Upload");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"user should redirect to receipts dashboard page");
	}

	@Then("Verify the uploaded receipt displaying in dashboard or not")
	public void verify_the_uploaded_receipt_displaying_in_dashboard_or_not() {
		receiptsActions.ValidateSupplierCreatedorNot();
		StepTracker.setCurrentStep("Verify the uploaded receipt displaying in dashboard or not");
		Log.info("Verify the uploaded receipt displaying in dashboard or not", "Receipt Upload");

	}

	@When("user selects a checkbox of a purchase invoice")
	public void user_selects_a_checkbox_of_a_purchase_invoice() {
		receiptsActions.ClickOnFirstCheckbox();
		StepTracker.setCurrentStep("user selects a checkbox of a purchase invoice");
		Log.info("user selects a checkbox of a purchase invoice", "Invoice Checkbox");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Invoice Checkbox");
	}

	@Then("action panel should be displayed at the bottom")
	public void action_panel_should_be_displayed_at_the_bottom() {
		receiptsActions.validateAllOptionsAfterClickingOnCheckbox();
		StepTracker.setCurrentStep("action panel should be displayed at the bottom");
		Log.info("action panel should be displayed at the bottom", "Invoice Checkbox");

	}

	@Then("it should show bulk action options like Edit, Copy, Delete, Export, Archive, Restore")
	public void it_should_show_bulk_action_options_like_edit_copy_delete_export_archive_restore() {
		StepTracker
				.setCurrentStep("it should show bulk action options like Edit, Copy, Delete, Export, Archive, Restore");
		Log.info("it should show bulk action options like Edit, Copy, Delete, Export, Archive, Restore",
				"Invoice Checkbox");
	}

	@When("user selects one or more invoice checkboxes")
	public void user_selects_one_or_more_invoice_checkboxes() {
		// receiptsActions.SelctToReviewOption();
		receiptsActions.ClickOnFirstCheckbox();
		StepTracker.setCurrentStep("user selects one or more invoice checkboxes");
		Log.info("user selects one or more invoice checkboxes", "Invoice Checkbox");
	}

	@When("user clicks on the BULK EDIT button")
	public void user_clicks_on_the_bulk_edit_button() {
		receiptsActions.ClickOnBulkEdit();
		StepTracker.setCurrentStep("user clicks on the BULK EDIT button");
		Log.info("user clicks on the BULK EDIT button", "Invoice Checkbox");
	}

	@Then("the Bulk Edit popup or page should appear")
	public void the_bulk_edit_popup_or_page_should_appear() {
		receiptsActions.VerifyBulkEditPopUpAppearOrNot();
		StepTracker.setCurrentStep("the Bulk Edit popup or page should appear");
		Log.info("the Bulk Edit popup or page should appear", "Invoice Checkbox");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Invoice Checkbox");
	}

	@Then("user should be able to edit fields and save changes")
	public void user_should_be_able_to_edit_fields_and_save_changes() {
		receiptsActions.selecSupplerDropdownValueinBulkEdit("Your Company Name");
		StepTracker.setCurrentStep("user should be able to edit fields and save changes");
		Log.info("user should be able to edit fields and save changes", "Invoice Checkbox");
	}

	@When("user selects an invoice checkbox")
	public void user_selects_an_invoice_checkbox() {
		// receiptsActions.SelctToReviewOption();
		receiptsActions.ClickOnFirstCheckbox();
		StepTracker.setCurrentStep("user selects an invoice checkbox");
		Log.info("user selects an invoice checkbox", "Invoice Checkbox");
	}

	@When("user clicks the COPY button")
	public void user_clicks_the_copy_button() {
		receiptsActions.VerifyBeforeClickingOnCopyOption();
		receiptsActions.ClickOnCopyOption();
		StepTracker.setCurrentStep("user clicks the COPY button");
		Log.info("user clicks the COPY button", "Invoice Checkbox");
	}

	@Then("a new invoice should be created with the same data")
	public void a_new_invoice_should_be_created_with_the_same_data() {
		receiptsActions.VerifyAfterClickingOnCopyOption();
		StepTracker.setCurrentStep("a new invoice should be created with the same data");
		Log.info("a new invoice should be created with the same data", "Invoice Checkbox");
	}

	@Then("status or ID should indicate it is a duplicate")
	public void status_or_id_should_indicate_it_is_a_duplicate() {
		By copiedRowLocator = By.xpath("//table[@aria-describedby='Purchase Table']/tbody/tr[3]/td[3]/div/div/a");
		wait.until(ExpectedConditions.visibilityOfElementLocated(copiedRowLocator));
		String copiedRowText = HelperClass.getText(copiedRowLocator);
		System.out.println("Copied Row Text: " + copiedRowText);
		if (copiedRowText.toLowerCase().contains("duplicate") || copiedRowText.toLowerCase().contains("copy")) {
			System.out.println("Row indicates it is a duplicate.");
		} else {
			Assert.fail("Copied row does not indicate duplication in status or ID.");
		}
		StepTracker.setCurrentStep("status or ID should indicate it is a duplicate");
		Log.info("status or ID should indicate it is a duplicate", "Invoice Checkbox");
	}

	@When("user clicks the DELETE button")
	public void user_clicks_the_delete_button() {
		receiptsActions.ClickOnDeleteOption();
		StepTracker.setCurrentStep("user clicks the DELETE button");
		Log.info("user clicks the DELETE button", "Invoice Checkbox");
	}

	@When("confirms deletion")
	public void confirms_deletion() {
		receiptsActions.ConfirmDeletepopUp();
		StepTracker.setCurrentStep("confirms deletion");
		Log.info("confirms deletion", "Invoice Checkbox");
	}

	@Then("the selected invoices should be removed from the list")
	public void the_selected_invoices_should_be_removed_from_the_list() {
		receiptsActions.VerifyAfterDeletionofInvoice();
		StepTracker.setCurrentStep("the selected invoices should be removed from the list");
		Log.info("the selected invoices should be removed from the list", "Invoice Checkbox");
	}

	@When("user clicks on the {string} export option")
	public void user_clicks_on_the_export_option(String string) {
		receiptsActions.ClickOnExportOptions(string);
		StepTracker.setCurrentStep("user clicks on the " + string + " export option");
		Log.info("user clicks on the " + string + " export option", "Invoice Checkbox");

	}

	@Then("a file in {string} should be downloaded containing invoice data")
	public void a_file_in_should_be_downloaded_containing_invoice_data(String string) {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"a file in " + string + " should be downloaded containing invoice data");
		Log.info("a file in " + string + " should be downloaded containing invoice data", "Invoice Checkbox");
	}

	@When("user clicks the ARCHIVE button")
	public void user_clicks_the_archive_button() {
		receiptsActions.ClickonArchived();
		StepTracker.setCurrentStep("user clicks the ARCHIVE button");
		Log.info("user clicks the ARCHIVE button", "Invoice Checkbox");
	}

	@Then("the status of selected invoices should change to {string}")
	public void the_status_of_selected_invoices_should_change_to(String string) {
		receiptsActions.VerifyArchivedPopup(string);
		StepTracker.setCurrentStep("the status of selected invoices should change to " + string + "");
		Log.info("the status of selected invoices should change to " + string + "", "Invoice Checkbox");
	}

	@When("user selects an archived invoice checkbox")
	public void user_selects_an_archived_invoice_checkbox() {
		receiptsActions.SelectArchivedInvoice();
		receiptsActions.ClickOnFirstCheckbox();
		StepTracker.setCurrentStep("user selects an archived invoice checkbox");
		Log.info("user selects an archived invoice checkbox", "Invoice Checkbox");
	}

	@When("user clicks the RESTORE button")
	public void user_clicks_the_restore_button() {
		receiptsActions.ClickOnRestoreOption();
		StepTracker.setCurrentStep("user clicks the RESTORE button");
		Log.info("user clicks the RESTORE button", "Invoice Checkbox");
	}

	@Then("the invoice should be restored to its previous status")
	public void the_invoice_should_be_restored_to_its_previous_status() {
		receiptsActions.VerifyConfirmRestore();
		StepTracker.setCurrentStep("the invoice should be restored to its previous status");
		Log.info("the invoice should be restored to its previous status", "Invoice Checkbox");
	}

	@When("the user hovers over a receipt row")
	public void the_user_hovers_over_a_receipt_row() {
		// receiptsActions.SelctToReviewOption();
		receiptsActions.MouseHovertheElement();
		StepTracker.setCurrentStep("the user hovers over a receipt row");
		Log.info("the user hovers over a receipt row", "Mouse Hover");
	}

	@Then("the action buttons should become visible for that row")
	public void the_action_buttons_should_become_visible_for_that_row() {
		receiptsActions.VerifyElements();
		StepTracker.setCurrentStep("the action buttons should become visible for that row");
		Log.info("the action buttons should become visible for that row", "Mouse Hover");
	}

	@When("the user clicks the Edit button")
	public void the_user_clicks_the_edit_button() {
		receiptsActions.ClickOnEditbutton();
		StepTracker.setCurrentStep("the user clicks the Edit button");
		Log.info("the user clicks the Edit button", "Mouse Hover");
	}

	@Then("the Edit Receipt popup should be displayed")
	public void the_edit_receipt_popup_should_be_displayed() {
		receiptsActions.VerifyEditPage();
		StepTracker.setCurrentStep("the Edit Receipt popup should be displayed");
		Log.info("the Edit Receipt popup should be displayed", "Mouse Hover");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Mouse Hover");
	}

	@When("the user clicks the Delete button")
	public void the_user_clicks_the_delete_button() {
		receiptsActions.ClickOnDeletebutton();
		Log.info("the user clicks the Delete button", "Mouse Hover");
		StepTracker.setCurrentStep("the user clicks the Delete button");
	}

	@Then("a confirmation dialog should appear")
	public void a_confirmation_dialog_should_appear() {
		receiptsActions.VerifyDeletepopUp();
		Log.info("a confirmation dialog should appear", "Mouse Hover");
		StepTracker.setCurrentStep("a confirmation dialog should appear");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Mouse Hover");
	}

	@When("the user clicks the Archive button")
	public void the_user_clicks_the_archive_button() {
		receiptsActions.ClickOnArchivebutton();
		Log.info("the user clicks the Archive button", "Mouse Hover");
		StepTracker.setCurrentStep("the user clicks the Archive button");
	}

	@Then("the archive confirmation pop-up should open and verify")
	public void the_receipt_document_preview_should_open() {
		receiptsActions.VerifyArchivepopUp();
		Log.info("the archive confirmation pop-up should open and verify", "Mouse Hover");
		StepTracker.setCurrentStep("the archive confirmation pop-up should open and verify");
	}

	@When("click on three dots on a receipt")
	public void click_on_three_dots_on_a_receipt() {
		receiptsActions.ClickOnThreedots();
		Log.info("click on three dots on a receipt", "Mouse Hover");
		StepTracker.setCurrentStep("click on three dots on a receipt");
	}

	@Then("select preview option and validate the preview receipt page")
	public void select_preview_option_and_validate_the_preview_receipt_page() {
		receiptsActions.verifyPreviewpage();
		Log.info("select preview option and validate the preview receipt page", "Mouse Hover");
		StepTracker.setCurrentStep("select preview option and validate the preview receipt page");
	}

	@Then("select history option and validate the  receipt page")
	public void select_history_option_and_validate_the_receipt_page() {
		receiptsActions.ClickOnHistoryandVerify();
		Log.info("select history option and validate the  receipt page", "Mouse Hover");
		StepTracker.setCurrentStep("select history option and validate the  receipt page");
	}

	@Then("Mousehover and Click on Editreceipt")
	public void mousehover_and_click_on_editreceipt() {
		receiptsActions.EditReceipt();
	}

	@Then("Click on Payment Account Dropdown and validate")
	public void click_on_payment_account_dropdown_and_validate() {
		receiptsActions.VerifyPayment();
	}

}
