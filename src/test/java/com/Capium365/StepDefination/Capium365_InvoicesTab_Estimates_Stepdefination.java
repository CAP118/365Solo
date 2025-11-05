package com.Capium365.StepDefination;

import org.openqa.selenium.TimeoutException;

import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_InvoicesTab_Estimates_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium365_InvoicesTab_Estimates_Stepdefination {

	Capium365_InvoicesTab_Estimates_Actions estimateactions = new Capium365_InvoicesTab_Estimates_Actions();

	@Given("Click on invoice and side bar and estimate option and verify")
	public void click_on_invoice_and_side_bar_and_estimate_option_and_verify() throws InterruptedException {

		estimateactions.Clickoninvoiceandsidebarandestimateoptionandverify();

		StepTracker.setCurrentStep("Click on invoice and side bar and estimate option and verify");
		Log.info("Click on invoice and side bar and estimate option and verify");
	}

	@Then("click on add estimates and verify")
	public void click_on_add_estimates_and_verify() throws InterruptedException {

		estimateactions.clickonaddestimatesandverify();

		StepTracker.setCurrentStep("click on add estimates and verify");
		Log.info("click on add estimates and verify");
	}

	@Then("click on edit company details without giving mandatory details")
	public void click_on_edit_company_details_without_giving_mandatory_details() throws InterruptedException {
		estimateactions.clickoneditcompanydetailswithoutgivingmandatorydetails();
		StepTracker.setCurrentStep("click on edit company details without giving mandatory details");
		Log.info("click on edit company details without giving mandatory details");
	}

	@Then("click on edit company details with giving mandatory details")
	public void click_on_edit_company_details_with_giving_mandatory_details() throws InterruptedException {
		estimateactions.clickoneditcompanydetailswithgivingmandatorydetails();
		StepTracker.setCurrentStep("click on edit company details with giving mandatory details");
		Log.info("click on edit company details with giving mandatory details");
	}

	@Then("Click on add customer and verify the functionality")
	public void click_on_add_customer_and_verify_the_functionality() {
		estimateactions.Clickonaddcustomerandverifythefunctionality();
		StepTracker.setCurrentStep("Click on add customer and verify the functionality");
		Log.info("Click on add customer and verify the functionality");
	}

	@Then("select existing customer and verify details")
	public void select_existing_customer_and_verify_details() throws InterruptedException {
		estimateactions.selectexistingcustomerandverifydetails();
		StepTracker.setCurrentStep("select existing customer and verify details");
		Log.info("select existing customer and verify details");
	}

	@Then("select existing item and verify details")
	public void select_existing_item_and_verify_details() throws InterruptedException {
		estimateactions.selectexistingitemandverifydetails();
		StepTracker.setCurrentStep("select existing item and verify details");
		Log.info("select existing item and verify details");
	}

	@Then("select another item and verify details")
	public void select_another_item_and_verify_details() throws InterruptedException {
		estimateactions.selectanotheritemandverifydetails();
		StepTracker.setCurrentStep("select another item and verify details");
		Log.info("select another item and verify details");
	}

	@Then("click on save and new and verify estimate record in inside search")
	public void click_on_save_and_new_and_verify_estimate_record_in_inside_search() throws InterruptedException {
		estimateactions.clickonsaveandnewandverifyestimaterecordininsidesearch();
		StepTracker.setCurrentStep("click on save and new and verify estimate record in inside search");
		Log.info("click on save and new and verify estimate record in inside search");
	}

	@Then("click on save and contiinue and verify estimate record in inside search")
	public void click_on_save_and_contiinue_and_verify_estimate_record_in_inside_search() throws InterruptedException {
		estimateactions.clickonsaveandcontiinueandverifyestimaterecordininsidesearch();
		StepTracker.setCurrentStep("click on save and contiinue and verify estimate record in inside search");
		Log.info("click on save and contiinue and verify estimate record in inside search");
	}

	@Then("click on save and exit and verify estimate record in out search")
	public void click_on_save_and_exit_and_verify_estimate_record_in_out_search() throws InterruptedException {
		estimateactions.clickonsaveandexitandverifyestimaterecordinoutsearch();
		StepTracker.setCurrentStep("click on save and exit and verify estimate record in out search");
		Log.info("click on save and exit and verify estimate record in out search");
	}

	@Then("click on cancel changes and take screenshot")
	public void click_on_cancel_changes_and_take_screenshot() throws InterruptedException {
		estimateactions.clickoncancelchangesandtakescreenshot();
		StepTracker.setCurrentStep("click on cancel changes and take screenshot");
		Log.info("click on cancel changes and take screenshot");
	}

	@Then("click on search bar pass estimate value and verify")
	public void click_on_search_bar_pass_estimate_value_and_verify() throws InterruptedException {
		estimateactions.clickonsearchbarpassestimatevalueandverify();
		StepTracker.setCurrentStep("click on search bar pass estimate value and verify");
		Log.info("click on search bar pass estimate value and verify");
	}

	@Then("click on estimate record and verify export as excel")
	public void click_on_estimate_record_and_verify_export_as_excel() throws InterruptedException {
		estimateactions.clickonestimaterecordandverifyexportasexcel();
		StepTracker.setCurrentStep("click on estimate record and verify export as excel");
		Log.info("click on estimate record and verify export as excel");
	}

	@Then("click on estimate record and verify export as csv")
	public void click_on_estimate_record_and_verify_export_as_csv() throws InterruptedException {
		estimateactions.clickonestimaterecordandverifyexportascsv();
		StepTracker.setCurrentStep("click on estimate record and verify export as csv");
		Log.info("click on estimate record and verify export as csv");
	}

	@Then("click on estimate record and verify export as pdf")
	public void click_on_estimate_record_and_verify_export_as_pdf() throws InterruptedException {
		estimateactions.clickonestimaterecordandverifyexportaspdf();
		StepTracker.setCurrentStep("click on estimate record and verify export as pdf");
		Log.info("click on estimate record and verify export as pdf");
	}

	@Then("click on estimate record and verify export as print")
	public void click_on_estimate_record_and_verify_export_as_print() throws InterruptedException {
		estimateactions.clickonestimaterecordandverifyexportasprint();
		StepTracker.setCurrentStep("click on estimate record and verify export as print");
		Log.info("click on estimate record and verify export as print");
	}

	@Then("click on search and verify estimate record")
	public void click_on_search_and_verify_estimate_record() throws InterruptedException {
		estimateactions.clickonsearchandverifyestimaterecord();
		StepTracker.setCurrentStep("click on search and verify estimate record");
		Log.info("click on search and verify estimate record");
	}

	@Then("click on all satus dropdown and verify each status")
	public void click_on_all_satus_dropdown_and_verify_each_status() throws TimeoutException, InterruptedException {
		estimateactions.clickonallsatusdropdownandverifyeachstatus();
		StepTracker.setCurrentStep("click on all satus dropdown and verify each status");
		Log.info("click on all satus dropdown and verify each status");
	}

	@Then("click on all time dropdown and verify each status")
	public void click_on_all_time_dropdown_and_verify_each_status() throws TimeoutException, InterruptedException {
		estimateactions.clickonalltimedropdownandverifyeachstatus();
		StepTracker.setCurrentStep("click on all time dropdown and verify each status");
		Log.info("click on all time dropdown and verify each status");
	}

	@Given("verify export as excel main estimate dashboard")
	public void verify_export_as_excel_main_estimate_dashboard() throws InterruptedException {
		estimateactions.verifyexportasexcelmainestimatedashboard();
		StepTracker.setCurrentStep("verify export as excel main estimate dashboard");
		Log.info("verify export as excel main estimate dashboard");
	}

	@Given("verify export as csv main estimate dashboard")
	public void verify_export_as_csv_main_estimate_dashboard() throws InterruptedException {
		estimateactions.verifyexportascsvmainestimatedashboard();
		StepTracker.setCurrentStep("verify export as csv main estimate dashboard");
		Log.info("verify export as csv main estimate dashboard");
	}

	@Given("verify export as pdf main estimate dashboard")
	public void verify_export_as_pdf_main_estimate_dashboard() throws InterruptedException {

		estimateactions.verifyexportaspdfmainestimatedashboard();

		StepTracker.setCurrentStep("verify export as pdf main estimate dashboard");
		Log.info("verify export as pdf main estimate dashboard");
	}

	@Given("verify edit mouseaction main estimate dashboard")
	public void verify_edit_mouseaction_main_estimate_dashboard() throws InterruptedException {

		estimateactions.verifyeditmouseactionmainestimatedashboard();

		StepTracker.setCurrentStep("verify edit mouseaction main estimate dashboard");
		Log.info("verify edit mouseaction main estimate dashboard");
	}

	@Given("verify preview in main estimate dashboard")
	public void verify_preview_in_main_estimate_dashboard() throws InterruptedException {

		estimateactions.verifypreviewinmainestimatedashboard();

		StepTracker.setCurrentStep("verify preview in main estimate dashboard");
		Log.info("verify preview in main estimate dashboard");
	}

	@Given("verify send in main estimate dashboard")
	public void verify_send_in_main_estimate_dashboard() throws InterruptedException, TimeoutException {

		estimateactions.verifysendinmainestimatedashboard();

		StepTracker.setCurrentStep("verify send in main estimate dashboard");
		Log.info("verify send in main estimate dashboard");
	}

	@Given("verify markassent in main estimate dashboard")
	public void verify_markassent_in_main_estimate_dashboard() throws InterruptedException {

		estimateactions.verifymarkassentinmainestimatedashboard();

		StepTracker.setCurrentStep("verify markassent in main estimate dashboard");
		Log.info("verify markassent in main estimate dashboard");
	}

	@Given("verify markasdeciplaine in main estimate dashboard")
	public void verify_markasdeciplaine_in_main_estimate_dashboard() throws InterruptedException {

		estimateactions.verifymarkasdeciplaineinmainestimatedashboard();

		StepTracker.setCurrentStep("verify markasdeciplaine in main estimate dashboard");
		Log.info("verify markasdeciplaine in main estimate dashboard");
	}

	@Given("verify markasaccepted in main estimate dashboard")
	public void verify_markasaccepted_in_main_estimate_dashboard() throws InterruptedException {

		estimateactions.verifymarkasacceptedinmainestimatedashboard();

		StepTracker.setCurrentStep("verify markasaccepted in main estimate dashboard");
		Log.info("verify markasaccepted in main estimate dashboard");
	}

	@Given("verify duplicate in main estimate dashboard")
	public void verify_duplicate_in_main_estimate_dashboard() throws InterruptedException {

		estimateactions.verifyduplicateinmainestimatedashboard();

		StepTracker.setCurrentStep("verify duplicate in main estimate dashboard");
		Log.info("verify duplicate in main estimate dashboard");
	}

}
