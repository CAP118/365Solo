package com.Capium365.StepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_InvoicesTab_Products_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium365_InvoicesTab_Products_Stepdefination {

	Capium365_InvoicesTab_Products_Actions productactions = new Capium365_InvoicesTab_Products_Actions();

	@Given("Click on invoice and side bar")
	public void click_on_invoice_and_side_bar() throws InterruptedException {

		productactions.Clickoninvoiceandsidebar();

		StepTracker.setCurrentStep("Click on invoice and side bar");
		Log.info("Click on invoice and side bar");

	}

	@Then("click on products and verify products page")
	public void click_on_products_and_verify_products_page() throws InterruptedException {

		productactions.clickonproductsandverifyproductspage();

		StepTracker.setCurrentStep("click on products and verify products page");
		Log.info("click on products and verify products page");
	}

	@Then("click on add product and verify page")
	public void click_on_add_product_and_verify_page() throws InterruptedException {

		productactions.clickonaddproductandverifypage();

		StepTracker.setCurrentStep("click on add product and verify page");
		Log.info("click on add product and verify page");
	}

	@Then("verify save button is displaying or not before entering man.details")
	public void verify_save_button_is_displaying_or_not_before_entering_man_details()
			throws InterruptedException, IOException {

		productactions.verifysavebuttonisdisplayingornotbeforeenteringmandetails();

		StepTracker.setCurrentStep("verify save button is displaying or not before entering man.details");
		Log.info("verify save button is displaying or not before entering man.details");
	}

	@Then("enter mandatory details and save and verify")
	public void enter_mandatory_details_and_save_and_verify() throws InterruptedException {

		productactions.entermandatorydetailsandsaveandverify();

		StepTracker.setCurrentStep("enter mandatory details and save and verify");
		Log.info("enter mandatory details and save and verify");
	}

	@Then("enter mandatory details and save exit and verify")
	public void enter_mandatory_details_and_save_exit_and_verify() throws InterruptedException {
		productactions.entermandatorydetailsandsaveexitandverify();
		StepTracker.setCurrentStep("enter mandatory details and save exit and verify");
		Log.info("enter mandatory details and save exit and verify");
	}

	@Then("enter mandatory details and save&cancel and verify")
	public void enter_mandatory_details_and_save_cancel_and_verify() throws InterruptedException {

		productactions.entermandatorydetailsandsavecancelandverify();

		StepTracker.setCurrentStep("enter mandatory details and save&cancel and verify");
		Log.info("enter mandatory details and save&cancel and verify");
	}

	@Then("click on plus button and verify page")
	public void click_on_plus_button_and_verify_page() throws InterruptedException {

		productactions.clickonplusbuttonandverifypage();

		StepTracker.setCurrentStep("click on plus button and verify page");
		Log.info("click on plus button and verify page");
	}

	@Then("click on search enter product name and verify")
	public void click_on_search_enter_product_name_and_verify() throws InterruptedException {

		productactions.clickonsearchenterproductnameandverify();

		StepTracker.setCurrentStep("click on search enter product name and verify");
		Log.info("click on search enter product name and verify");
	}

	@Then("enter product name and verify")
	public void enter_product_name_and_verify() throws InterruptedException {

		productactions.enterproductnameandverify();

		StepTracker.setCurrentStep("enter product name and verify");
		Log.info("enter product name and verify");
	}

	@Then("click on dropdown and verify status")
	public void click_on_dropdown_and_verify_status() throws TimeoutException, InterruptedException {

		productactions.clickondropdownandverifystatus();

		StepTracker.setCurrentStep("click on dropdown and verify status");
		Log.info("click on dropdown and verify status");
	}

	@Then("click on dropdown and verify alltime status")
	public void click_on_dropdown_and_verify_alltime_status() throws TimeoutException, InterruptedException {

		productactions.clickondropdownandverifyalltimestatus();

		StepTracker.setCurrentStep("click on dropdown and verify alltime status");
		Log.info("click on dropdown and verify alltime status");
	}

	@Then("click on excel and download")
	public void click_on_excel_and_download() throws InterruptedException {

		productactions.clickonexcelanddownload();

		StepTracker.setCurrentStep("click on excel and download");
		Log.info("click on excel and download");
	}

	@Then("click on csv and download")
	public void click_on_csv_and_download() throws InterruptedException {

		productactions.clickoncsvanddownload();

		StepTracker.setCurrentStep("click on csv and download");
		Log.info("click on csv and download");
	}

	@Then("click on pdf and download")
	public void click_on_pdf_and_download() throws InterruptedException {

		productactions.clickonpdfanddownload();

		StepTracker.setCurrentStep("click on pdf and download");
		Log.info("click on pdf and download");
	}

	@Then("verify edit mouseover for particular product")
	public void verify_edit_mouseover_for_particular_product() {

		productactions.verifyeditmouseoverforparticularproduct();

		StepTracker.setCurrentStep("verify edit mouseover for particular product");
		Log.info("verify edit mouseover for particular product");
	}

	@Then("verify delete mouseover for particular product")
	public void verify_delete_mouseover_for_particular_product() {

		productactions.verifydeletemouseoverforparticularproduct();
		

		StepTracker.setCurrentStep("verify delete mouseover for particular product");
		Log.info("verify delete mouseover for particular product");
	}

	@Then("verify archive mouseover for particular product")
	public void verify_archive_mouseover_for_particular_product() {

		productactions.verifyarchivemouseoverforparticularproduct();

		StepTracker.setCurrentStep("verify archive mouseover for particular product");
		Log.info("verify archive mouseover for particular product");
	}
	
	@Then("Click on Yes buttonnn")
	public void click_on_yes_buttonnn() {
	    productactions.ClikonDeleteYesButton();
		StepTracker.setCurrentStep("Product Deleted Succesfully");
		Log.info("Product Deleted Successfully");
	}
	
	@Then("Click on Yes button and Verify")
	public void click_on_yes_button_and_verify() {
	    productactions.CLickonArchiveYesbuttonandVerify();
	    StepTracker.setCurrentStep("Product Archived Succesfully");
		Log.info("Product Archived Successfully");
	}


}
