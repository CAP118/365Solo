package com.Capium365.StepDefination;

import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_Users_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Capium365_Users_Stepdefination {

	Capium365_Users_Actions userspage=new Capium365_Users_Actions();
	
	@Given("Click on users tab and verify")
	public void click_on_users_tab_and_verify() throws Exception {
		userspage.Clickonuserstabandverify();
		StepTracker.setCurrentStep("Click on users tab and verify");
	}
 
	@Given("Click on users tab")
	public void click_on_users_tab() throws Exception {
		userspage.Clickonuserstab();
		StepTracker.setCurrentStep("Click on users tab");
	}
 
	@Given("click on add user button")
	public void click_on_add_user_button() {
	    userspage.clickonadduserbutton();
	    StepTracker.setCurrentStep("click on add user button");
	}
 
	@Then("go with the following steps to add the user")
	public void go_with_the_following_steps_to_add_the_user() throws Exception {
	    userspage.gowiththefollowingstepstoaddtheuser();
	    StepTracker.setCurrentStep("go with the following steps to add the user");
	}  
	
	@Then("go with the following steps with unmandatory fields to add the user")
	public void go_with_the_following_steps_with_unmandatory_fields_to_add_the_user() throws Exception {
	     userspage.gowiththefollowingstepswithunmandatoryfieldstoaddtheuser();
	     StepTracker.setCurrentStep("go with the following steps with unmandatory fields to add the user");
	}
 
	@Then("delete the user")
	public void delete_the_user() throws Exception {
	    userspage.deletetheuser();
	    StepTracker.setCurrentStep("delete the user");
	}
 
	@Then("Click on search bar and enter data and verify")
	public void click_on_search_bar_and_enter_data_and_verify() throws Exception {
	    userspage.Clickonsearchbarandenterdataandverify();
	    StepTracker.setCurrentStep("Click on search bar and enter data and verify");
	}
 
	@Given("Click on all options in status dropdown and verify")
	public void click_on_all_options_in_status_dropdown_and_verify() throws Exception {
	    userspage.Clickonalloptionsinstatusdropdownandverify();
	    StepTracker.setCurrentStep("Click on all options in status dropdown and verify");
	}
 
	@Given("Click on kebab menu")
	public void click_on_kebab_menu() throws Exception {
	    userspage.Clickonkebabmenu();
	    StepTracker.setCurrentStep("Click on kebab menu");
	}
	
	@Then("click on export to csv user")
	public void click_on_export_to_csv() throws Exception {
		userspage.clickonexporttocsvuser();
		 StepTracker.setCurrentStep("click on export to csv user");
	}
	
	@Then("click on export to pdf user")
	public void click_on_export_to_pdf() throws Exception {
		userspage.clickonexporttopdfuser();
		 StepTracker.setCurrentStep("click on export to pdf user");
	}
	
	@Then("click on export to excel user")
	public void click_on_export_to_excel() throws Exception {
		userspage.clickonexporttoexceluser();
		 StepTracker.setCurrentStep("click on export to excel user");
	}
 
	@Given("click on checkbox in top row")
	public void click_on_checkbox_in_top_row() throws Exception {
	    userspage.clickoncheckboxintoprow();
	    StepTracker.setCurrentStep("click on checkbox in top row");
	}
 
	@Then("click on edit icon and verify")
	public void click_on_edit_icon_and_verify() throws Exception {
	    userspage.clickonediticonandverify();
	    StepTracker.setCurrentStep("click on edit icon and verify");
	}
 
@Given("click on user id")
	public void click_on_user_id() throws Exception {
	    userspage.clickonuserid();
	    StepTracker.setCurrentStep("click on user id");
	}
 
	@Then("Edit the details and save")
	public void edit_the_details_and_save() throws Exception {
	    userspage.Editthedetailsandsave();
	    StepTracker.setCurrentStep("Edit the details and save");
	}
 
 
	@Then("click on excel option on the down")
	public void click_on_excel_option_on_the_down() throws InterruptedException {
	    userspage.clickonexceloptiononthedown();
	    StepTracker.setCurrentStep("click on excel option on the down");
	}
 
	@Then("click on csv option on the down")
	public void click_on_csv_option_on_the_down() throws InterruptedException {
		userspage.clickoncsvoptiononthedown();
		 StepTracker.setCurrentStep("click on csv option on the down");
	}
 
	@Then("click on pdf option on the down")
	public void click_on_pdf_option_on_the_down() throws InterruptedException {
		userspage.clickonpdfoptiononthedown();
		 StepTracker.setCurrentStep("click on pdf option on the down");
	}
}
