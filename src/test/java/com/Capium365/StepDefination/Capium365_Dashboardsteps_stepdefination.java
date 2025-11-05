package com.Capium365.StepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Capium.Utilites.HelperClass;
import com.Capium.Utilites.Log;
import com.Capium.Utilites.StepTracker;
import com.Capium365.Actions.Capium365_Dashboard_Actions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium365_Dashboardsteps_stepdefination {

	Capium365_Dashboard_Actions dashboardActions = new Capium365_Dashboard_Actions();
	private Scenario scenario;
	String selectedTimeFilter = "";
	String User = "Anwar";
	String Action = "Capium365_Dashboard";

	WebDriver driver = HelperClass.getDriver();

	@Before
	public void beforeScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	@When("the user selects This Year from the filter dropdown")
	public void the_user_selects_this_year_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectThisYear();
		Log.info("the user selects This Year from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Year from the filter dropdown");
	}

	@Then("the dashboard metrics should be visible")
	public void the_dashboard_metrics_should_be_visible() {
		Log.info("the dashboard metrics should be visible", User, Action);
		StepTracker.setCurrentStep("the dashboard metrics should be visible");
	}

	@Then("the chart should display month-wise labels")
	public void the_chart_should_display_month_wise_labels() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"the chart should display month-wise labels");
		Log.info("the chart should display month-wise labels", User, Action);
		StepTracker.setCurrentStep("the chart should display month-wise labels");
	}

	@When("the user selects This Month from the filter dropdown")
	public void the_user_selects_this_month_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectThisMonth();
		Log.info("the user selects This Month from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Month from the filter dropdown");
	}

	@Then("the chart should display day-wise labels")
	public void the_chart_should_display_day_wise_labels() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"the chart should display month-wise labels");
		Log.info("the chart should display day-wise labels", User, Action);
		StepTracker.setCurrentStep("the chart should display day-wise labels");
	}

	@When("the user selects This Week from the filter dropdown")
	public void the_user_selects_this_week_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectThisWeek();
		Log.info("the user selects This Week from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Week from the filter dropdown");
	}

	@When("the user selects Last Week from the filter dropdown")
	public void the_user_selects_last_week_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectLastWeek();
		Log.info("the user selects Last Week from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Week from the filter dropdown");
	}

	@When("the user selects Last Month from the filter dropdown")
	public void the_user_selects_last_month_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectLastMonth();
		Log.info("the user selects Last Month from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Month from the filter dropdown");
	}

	@When("the user selects This Quarter from the filter dropdown")
	public void the_user_selects_this_quarter_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectThisQuarter();
		Log.info("the user selects This Quarter from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Quarter from the filter dropdown");
	}

	@When("the user selects Last Quarter from the filter dropdown")
	public void the_user_selects_last_quarter_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectLastQuarter();
		Log.info("the user selects Last Quarter from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Quarter from the filter dropdown");
	}

	@When("the user selects Last Year from the filter dropdown")
	public void the_user_selects_last_year_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectLastYear();
		Log.info("the user selects Last Year from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Year from the filter dropdown");
	}

	@Then("the chart should display daily labels for that month")
	public void the_chart_should_display_daily_labels_for_that_month() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"the chart should display daily labels for that month");
		Log.info("the chart should display daily labels for that month", User, Action);
		StepTracker.setCurrentStep("the chart should display daily labels for that month");
	}

	@Then("the user should be prompted to select a date range")
	public void the_user_should_be_prompted_to_select_a_date_range() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"the user should be prompted to select a date range");
		StepTracker.setCurrentStep("the user should be prompted to select a date range");
	}

	@Then("the dashboard metrics should update after range selection")
	public void the_dashboard_metrics_should_update_after_range_selection() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"the dashboard metrics should update after range selection");
		StepTracker.setCurrentStep("the dashboard metrics should update after range selection");
	}

	@When("the user selects Custom from the filter dropdown")
	public void the_user_selects_custom_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectCustom();
		Log.info("the user selects Custom from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Custom from the filter dropdown");
	}

	@When("the user selects This Financial Year from the filter dropdown")
	public void the_user_selects_this_financial_year_from_the_filter_dropdown() {
		dashboardActions.ClickOnInvoiceDropdownandselectThisFinancialYear();
		Log.info("the user selects This Financial Year from the filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Financial Year from the filter dropdown");
	}

	@Then("the chart should display month-wise labels \\(Apr to Mar)")
	public void the_chart_should_display_month_wise_labels_apr_to_mar() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"the chart should display month-wise labels \\(Apr to Mar)");
		Log.info("the chart should display month-wise labels \\(Apr to Mar)", User, Action);
		StepTracker.setCurrentStep("the chart should display month-wise labels (Apr to Mar)");
	}

	// Transactions steps

	@When("the user selects This Year from the Transactions filter dropdown")
	public void the_user_selects_this_year_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("This Year");
		Log.info("the user selects This Year from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Year from the Transactions filter dropdown");
	}

	@When("the user selects This Month from the Transactions filter dropdown")
	public void the_user_selects_this_month_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("This Month");
		Log.info("the user selects This Month from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Month from the Transactions filter dropdown");
	}

	@When("the user selects This Week from the Transactions filter dropdown")
	public void the_user_selects_this_week_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("This Week");
		Log.info("the user selects This Week from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Week from the Transactions filter dropdown");
	}

	@When("the user selects Last Week from the Transactions filter dropdown")
	public void the_user_selects_last_week_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("Last Week");
		Log.info("the user selects Last Week from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Week from the Transactions filter dropdown");
	}

	@When("the user selects Last Month from the Transactions filter dropdown")
	public void the_user_selects_last_month_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("Last Month");
		Log.info("the user selects Last Month from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Month from the Transactions filter dropdown");
	}

	@When("the user selects This Quarter from the Transactions filter dropdown")
	public void the_user_selects_this_quarter_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("This Quarter");
		Log.info("the user selects This Quarter from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Quarter from the Transactions filter dropdown");
	}

	@When("the user selects Last Quarter from the Transactions filter dropdown")
	public void the_user_selects_last_quarter_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("Last Quarter");
		Log.info("the user selects Last Quarter from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Quarter from the Transactions filter dropdown");
	}

	@When("the user selects Last Year from the Transactions filter dropdown")
	public void the_user_selects_last_year_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("Last Year");
		Log.info("the user selects Last Year from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Last Year from the Transactions filter dropdown");
	}

	@When("the user selects Custom from the Transactions filter dropdown")
	public void the_user_selects_custom_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("Custom");
		Log.info("the user selects Custom from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects Custom from the Transactions filter dropdown");
	}

	@When("the user selects This Financial Year from the Transactions filter dropdown")
	public void the_user_selects_this_financial_year_from_the_transactions_filter_dropdown() {
		dashboardActions.ScrollToTransactionsDashboard();
		dashboardActions.clickAndSelectTransactionFilter("This Financial Year");
		Log.info("the user selects This Financial Year from the Transactions filter dropdown", User, Action);
		StepTracker.setCurrentStep("the user selects This Financial Year from the Transactions filter dropdown");
	}

	@Given("the user is logged in and navigates to the Transactions dashboard")
	public void the_user_is_logged_in_and_navigates_to_the_transactions_dashboard() {
		dashboardActions.ScrollToTransactionsDashboard();
		Log.info("Navigated to the Transactions dashboard", User, Action);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"Navigated to Transactions Dashboard");
		StepTracker.setCurrentStep("the user is logged in and navigates to the Transactions dashboard");
	}

	@When("the user opens the All Accounts dropdown")
	public void the_user_opens_the_all_accounts_dropdown() {
		dashboardActions.ClickOnAllAccountsDropdown();
		Log.info("Opened All Accounts dropdown", User, Action);
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Opened All Accounts Dropdown");
		StepTracker.setCurrentStep("the user opens the All Accounts dropdown");
	}

	@Then("the dropdown should display one or more account options dynamically")
	public void the_dropdown_should_display_one_or_more_account_options_dynamically() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(),
				"Account options loaded dynamically");
		StepTracker.setCurrentStep("the dropdown should display one or more account options dynamically");
	}

	@When("the user selects each account one by one from the dropdown")
	public void the_user_selects_each_account_one_by_one_from_the_dropdown() {
		dashboardActions.selectEachAccountAndCaptureScreenshot();
		Log.info("Selected each account and captured screenshots", User, Action);
		StepTracker.setCurrentStep("the user selects each account one by one from the dropdown");
	}

	@Then("the transaction chart should update accordingly for each selected account")
	public void the_transaction_chart_should_update_accordingly_for_each_selected_account() {
		Log.info("Transaction chart updates per account selection", User, Action);
		StepTracker.setCurrentStep("the transaction chart should update accordingly for each selected account");
	}

	@Then("the chart should show bars or No data available based on the selected account's transactions")
	public void the_chart_should_show_bars_or_no_data_available_based_on_the_selected_account_s_transactions() {
		Log.info("Chart shows bars or 'No data available' as expected", User, Action);
		StepTracker.setCurrentStep(
				"the chart should show bars or No data available based on the selected account's transactions");
	}

	@Given("user is on the Top Account Names dashboard")
	public void user_is_on_the_top_account_names_dashboard() {
		dashboardActions.scrollToTopAccountNamesChart();
		Log.info("user is on the Top Account Names dashboard", "Anwar", "Top Account Names dashboard");
		StepTracker.setCurrentStep("user is on the Top Account Names dashboard");
	}

	@When("user selects {string} from the filter dropdown")
	public void user_selects_from_the_filter_dropdown(String filterOption) {
		selectedTimeFilter = filterOption;
		dashboardActions.clickAndSelectTopAccountFilter(filterOption);
		Log.info("User selects " + filterOption + " from the Top Account Names filter dropdown", "Anwar",
				"Top Account Names dashboard");
		StepTracker.setCurrentStep("user selects " + filterOption + " from the filter dropdown");
		String screenshotName = "Donut_Chart_" + filterOption.replace(" ", "_");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), screenshotName);

	}

	@Then("donut chart should be displayed")
	public void donut_chart_should_be_displayed() {
		String screenshotName = "donut chart should be displayed" + selectedTimeFilter.replace(" ", "_");
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), screenshotName);
		Log.info("donut chart should be displayed", "Anwar", "Top Account Names dashboard");
		StepTracker.setCurrentStep(screenshotName);
	}

	@Then("donut chart should contain valid account categories and values")
	public void donut_chart_should_contain_valid_account_categories_and_values() throws IOException {
		Log.info("donut chart should contain valid account categories and values", "Anwar",
				"Top Account Names dashboard");
		StepTracker.setCurrentStep("donut chart should contain valid account categories and values");
	}

	// Expenses Flow Steps
	// ===========================================================================

	@Given("user is on the Expenses Flow dashboard")
	public void user_is_on_the_expenses_flow_dashboard() {
		dashboardActions.ScrollToExpensesFlow();
		Log.info("user is on the Expenses Flow dashboard", User, Action);
		StepTracker.setCurrentStep("user is on the Expenses Flow dashboard");
	}

	@When("user selects Expenses Flow {string} from the filter dropdown")
	public void user_selects_expenses_flow_from_the_filter_dropdown(String filterOption) {
		selectedTimeFilter = filterOption;
		dashboardActions.ClickOnExpensesDropdownandselectOptions(filterOption);
		Log.info("user selects " + selectedTimeFilter + " from the filter dropdown", "Anwar",
				"Expenses Flow dashboard");
		StepTracker.setCurrentStep("user selects Expenses Flow {string} from the filter dropdown");
	}

	// Top Earners Steps
	// ===================================================================================

	@Given("user is on the Top Earners dashboard")
	public void user_is_on_the_top_earners_dashboard() {
		dashboardActions.ScrollToTopEarners();
		Log.info("user is on the Top Earners dashboard", User, Action);
		StepTracker.setCurrentStep("user is on the Top Earners dashboard");
	}

	@When("user selects Top Earners {string} from the filter dropdown")
	public void user_selects_top_earners_from_the_filter_dropdown(String TopEarnerFilters) {
		selectedTimeFilter = TopEarnerFilters;
		dashboardActions.ClickOnTopEarnersDropdownAndselectOptions(TopEarnerFilters);
		Log.info("user selects " + selectedTimeFilter + " from the filter dropdown", "Anwar",
				"Expenses Flow dashboard");
		StepTracker.setCurrentStep("user selects Top Earners {string} from the filter dropdown");
	}

	// Sales Flow Steps
	// ====================================================================================

	@Given("user is on the Sales Flow dashboard")
	public void user_is_on_the_sales_flow_dashboard() {
		dashboardActions.ScrollToSalesFlowDashboard();
		Log.info("user is on the Sales Flow dashboard", User, Action);
		StepTracker.setCurrentStep("user is on the Sales Flow dashboard");
	}

	@When("user selects Sales Flow {string} from the filter dropdown")
	public void user_selects_sales_flow_from_the_filter_dropdown(String SalesFlowFilters) {
		selectedTimeFilter = SalesFlowFilters;
		dashboardActions.ClickOnSalesFlowDropdownAndselectOptions(SalesFlowFilters);
		Log.info("user selects " + selectedTimeFilter + " from the filter dropdown", "Anwar",
				"Expenses Flow dashboard");
		StepTracker.setCurrentStep("user selects Sales Flow {string} from the filter dropdown");
	}

	// Dashboard Plus + symbol options Steps
	// =======================================================================================

	@Given("the user is on the dashboard")
	public void the_user_is_on_the_dashboard() {
		dashboardActions.ClickOnPlusSymbol();
		Log.info("the user is on the dashboard", User, Action);
		StepTracker.setCurrentStep("the user is on the dashboard");
	}

	@When("the user clicks on the + icon and selects Estimates")
	public void the_user_clicks_on_the_icon_and_selects_estimates() {
		dashboardActions.selectFromPlusMenu("Estimates");
		Log.info("the user clicks on the + icon and selects Estimates", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Estimates");
	}

	@Then("the Create Estimate form should be displayed")
	public void the_create_estimate_form_should_be_displayed() {
		dashboardActions.VerifyEstimatesScreen();
		Log.info("the Create Estimate form should be displayed", User, Action);
		StepTracker.setCurrentStep("the Create Estimate form should be displayed");
	}

	@When("the user clicks on the + icon and selects Recurring Invoices")
	public void the_user_clicks_on_the_icon_and_selects_recurring_invoices() {
		dashboardActions.selectFromPlusMenu("Recurring Invoices");
		Log.info("the user clicks on the + icon and selects Recurring Invoices", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Recurring Invoices");
	}

	@Then("the Create New Recurring Invoice form should open")
	public void the_create_new_recurring_invoice_form_should_open() {
		dashboardActions.VerifyAddNewRecurringInvoiceScreen();
		Log.info("the Create New Recurring Invoice form should open", User, Action);
		StepTracker.setCurrentStep("the Create New Recurring Invoice form should open");
	}

	@When("the user clicks on the + icon and selects Invoices")
	public void the_user_clicks_on_the_icon_and_selects_invoices() {
		dashboardActions.selectFromPlusMenu("Invoices");
		Log.info("the user clicks on the + icon and selects Invoices", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Invoices");
	}

	@Then("the Create New Invoice page should be displayed")
	public void the_create_new_invoice_page_should_be_displayed() {
		dashboardActions.VerifyAddInvoiceScreen();
		Log.info("the Create New Invoice page should be displayed", User, Action);
		StepTracker.setCurrentStep("the Create New Invoice page should be displayed");
	}

	@When("the user clicks on the + icon and selects Purchase Invoices")
	public void the_user_clicks_on_the_icon_and_selects_purchase_invoices() {
		dashboardActions.selectFromPlusMenu("Purchase Invoices");
		Log.info("the user clicks on the + icon and selects Purchase Invoices", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Purchase Invoices");
	}

	@Then("the Create Purchase Invoice form should open")
	public void the_create_purchase_invoice_form_should_open() {
		dashboardActions.VerifyPurchaseInvoicesScreen();
		Log.info("the Create Purchase Invoice form should open", User, Action);
		StepTracker.setCurrentStep("the Create Purchase Invoice form should open");
	}

	@When("the user clicks on the + icon and selects Products")
	public void the_user_clicks_on_the_icon_and_selects_products() {
		dashboardActions.selectFromPlusMenu("Products");
		Log.info("the user clicks on the + icon and selects Products", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Products");
	}

	@Then("the Add New Product form should be displayed")
	public void the_add_new_product_form_should_be_displayed() {
		dashboardActions.VerifyAddNewProductScrenn();
		Log.info("the Add New Product form should be displayed", User, Action);
		StepTracker.setCurrentStep("the Add New Product form should be displayed");
	}

	@When("the user clicks on the + icon and selects Invoice Credit Notes")
	public void the_user_clicks_on_the_icon_and_selects_invoice_credit_notes() {
		dashboardActions.selectFromPlusMenu("Invoice Credit Notes");
		Log.info("the user clicks on the + icon and selects Invoice Credit Notes", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Invoice Credit Notes");
	}

	@Then("the Create Invoice Credit Note form should open")
	public void the_create_invoice_credit_note_form_should_open() {
		dashboardActions.VerifyAddNewInvoiceCreditNoteScreen();
		Log.info("the Create Invoice Credit Note form should open", User, Action);
		StepTracker.setCurrentStep("the Create Invoice Credit Note form should open");
	}

	@When("the user clicks on the + icon and selects Customers")
	public void the_user_clicks_on_the_icon_and_selects_customers() {
		dashboardActions.selectFromPlusMenu("Customers");
		Log.info("the user clicks on the + icon and selects Customers", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Customers");
	}

	@Then("the Add New Customer form should be displayed")
	public void the_add_new_customer_form_should_be_displayed() {
		dashboardActions.VerifyAddNewCustomerScreen();
		Log.info("the Add New Customer form should be displayed", User, Action);
		StepTracker.setCurrentStep("the Add New Customer form should be displayed");
	}

	@When("the user clicks on the + icon and selects Receipts")
	public void the_user_clicks_on_the_icon_and_selects_receipts() {
		dashboardActions.selectFromPlusMenu("Receipts");
		Log.info("the user clicks on the + icon and selects Receipts", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Receipts");
	}

	@Then("the Record Receipt screen should be displayed")
	public void the_record_receipt_screen_should_be_displayed() {
		dashboardActions.VerifyReceiptsScreen();
		Log.info("the Record Receipt screen should be displayed", User, Action);
		StepTracker.setCurrentStep("the Record Receipt screen should be displayed");
	}

	@When("the user clicks on the + icon and selects Suppliers")
	public void the_user_clicks_on_the_icon_and_selects_suppliers() {
		dashboardActions.selectFromPlusMenu("Suppliers");
		Log.info("the user clicks on the + icon and selects Suppliers", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Suppliers");
	}

	@Then("the Add Supplier form should open")
	public void the_add_supplier_form_should_open() {
		dashboardActions.VerifyAddNewSupplierScreen();
		Log.info("the Add Supplier form should open", User, Action);
		StepTracker.setCurrentStep("the Add Supplier form should open");
	}

	@When("the user clicks on the + icon and selects Purchase Credit Notes")
	public void the_user_clicks_on_the_icon_and_selects_purchase_credit_notes() {
		dashboardActions.selectFromPlusMenu("Purchase Credit Notes");
		Log.info("the user clicks on the + icon and selects Purchase Credit Notes", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Purchase Credit Notes");
	}

	@Then("the Create Purchase Credit Note page should open")
	public void the_create_purchase_credit_note_page_should_open() {
		dashboardActions.VerifyPurchaseCreditNotesScreen();
		Log.info("the Create Purchase Credit Note page should open", User, Action);
		StepTracker.setCurrentStep("the Create Purchase Credit Note page should open");
	}

	@When("the user clicks on the + icon and selects Users")
	public void the_user_clicks_on_the_icon_and_selects_users() {
		dashboardActions.selectFromPlusMenu("Users");
		Log.info("the user clicks on the + icon and selects Users", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Users");
	}

	@Then("the Add New User screen should be displayed")
	public void the_add_new_user_screen_should_be_displayed() {
		dashboardActions.VerifyAddNewUserScreen();
		Log.info("the Add New User screen should be displayed", User, Action);
		StepTracker.setCurrentStep("the Add New User screen should be displayed");
	}

	@When("the user clicks on the + icon and selects Bank Accounts")
	public void the_user_clicks_on_the_icon_and_selects_bank_accounts() {
		dashboardActions.selectFromPlusMenu("Bank Accounts");
		Log.info("the user clicks on the + icon and selects Bank Accounts", User, Action);
		StepTracker.setCurrentStep("the user clicks on the + icon and selects Bank Accounts");
	}

	@Then("the Add Bank Account form should be displayed")
	public void the_add_bank_account_form_should_be_displayed() {
		dashboardActions.VerifyBankAccountsScreen();
		Log.info("the Add Bank Account form should be displayed", User, Action);
		StepTracker.setCurrentStep("the Add Bank Account form should be displayed");
	}

	// Activity Steps
	// ===================================================================================================

	@Given("the user is on the Activity tab")
	public void the_user_is_on_the_activity_tab() throws InterruptedException {
		dashboardActions.the_user_is_on_the_activity_tab();
		Log.info("the user is on the Activity tab", User, Action);
		StepTracker.setCurrentStep("the user is on the Activity tab");
	}

	@Then("{string} should be selected by default in the category dropdown")
	public void should_be_selected_by_default_in_the_category_dropdown(String AllValues) {
		dashboardActions.ClickOnActivityAllDropdown(AllValues);
		Log.info(AllValues + "should be selected in the time filter dropdown", User, "Activity");
		StepTracker.setCurrentStep("" + AllValues + " should be selected by default in the category dropdown");
	}

	@Then("{string} should be selected in the time filter dropdown")
	public void should_be_selected_in_the_time_filter_dropdown(String Timefilter) {
		dashboardActions.ClickTimeFilerDropdownOnActivityTab(Timefilter);
		Log.info(Timefilter + "should be selected in the time filter dropdown", User, "Activity");
		StepTracker.setCurrentStep("" + Timefilter + " should be selected in the time filter dropdown");
	}

	@Then("all activity logs for this month should be visible")
	public void all_activity_logs_for_this_month_should_be_visible() {
		Hooks.captureScreenshotBase64(HelperClass.getDriver(), Hooks.getScenarioTest(), "Activity");
		Log.info("all activity logs for this month should be visible", User, "Activity");
		StepTracker.setCurrentStep("all activity logs for this month should be visible");
	}

	@When("the user selects {string} from the category dropdown")
	public void the_user_selects_from_the_category_dropdown(String AllValues) {
		selectedTimeFilter = AllValues;
		dashboardActions.ClickOnActivityAllDropdown(AllValues);
		Log.info(AllValues + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects " + AllValues + " from the category dropdown");
	}

	@Then("only activity logs related to invoices should be shown")
	public void only_activity_logs_related_to_invoices_should_be_shown() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("only activity logs related to invoices should be shown", User, "Activity");
		StepTracker.setCurrentStep("only activity logs related to invoices should be shown");
	}

	@When("the user selects All Receipts {string} from the category dropdown")
	public void the_user_selects_all_receipts_from_the_category_dropdown(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Receipts " + string + " from the category dropdown");
	}

	@Then("only receipt-related logs should be displayed")
	public void only_receipt_related_logs_should_be_displayed() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("only receipt-related logs should be displayed", User, "Activity");
		StepTracker.setCurrentStep("only receipt-related logs should be displayed");
	}

	@When("the user selects All Estimates {string} from the category dropdown")
	public void the_user_selects_all_estimates_from_the_category_dropdown(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Estimates " + string + " from the category dropdown");
	}

	@Then("the activity log should display only estimate-related actions")
	public void the_activity_log_should_display_only_estimate_related_actions() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("the activity log should display only estimate-related actions", User, "Activity");
		StepTracker.setCurrentStep("the activity log should display only estimate-related actions");
	}

	@When("the user selects All Products {string}")
	public void the_user_selects_all_products(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Products " + string + "");
	}

	@Then("activity logs related to product creation, update or delete should appear")
	public void activity_logs_related_to_product_creation_update_or_delete_should_appear() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("activity logs related to product creation, update or delete should appear", User, "Activity");
		StepTracker.setCurrentStep("activity logs related to product creation, update or delete should appear");
	}

	@When("the user selects All Customers {string}")
	public void the_user_selects_all_customers(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Customers " + string + "");
	}

	@Then("only logs showing customer actions e.g.add,edit,delete should be visible")
	public void only_logs_showing_customer_actions_e_g_add_edit_delete_should_be_visible() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("only logs showing customer actions e.g.add,edit,delete should be visible", User, "Activity");
		StepTracker.setCurrentStep("only logs showing customer actions e.g.add,edit,delete should be visible");
	}

	@When("the user selects All Suppliers {string}")
	public void the_user_selects_all_suppliers(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Suppliers " + string + "");
	}

	@Then("supplier-related log entries should be visible in the activity feed")
	public void supplier_related_log_entries_should_be_visible_in_the_activity_feed() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("supplier-related log entries should be visible in the activity feed", User, "Activity");
		StepTracker.setCurrentStep("supplier-related log entries should be visible in the activity feed");
	}

	@When("the user selects All Users {string}")
	public void the_user_selects_all_users(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Users " + string + "");
	}

	@Then("actions such as create, restore, archive users should be listed")
	public void actions_such_as_create_restore_archive_users_should_be_listed() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("actions such as create, restore, archive users should be listed", User, "Activity");
		StepTracker.setCurrentStep("actions such as create, restore, archive users should be listed");
	}

	@When("the user selects All Invoice Credit Notes {string}")
	public void the_user_selects_all_invoice_credit_notes(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "should be selected by default in the category dropdown", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Invoice Credit Notes " + string + "");
	}

	@Then("only related logs should be displayed")
	public void only_related_logs_should_be_displayed() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("only related logs should be displayed", User, "Activity");
		StepTracker.setCurrentStep("only related logs should be displayed");
	}

	@When("the user selects All Purchases {string}")
	public void the_user_selects_all_purchases(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "the user selects All Purchases", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Purchases " + string + "");
	}

	@Then("logs related to purchase invoices should be shown")
	public void logs_related_to_purchase_invoices_should_be_shown() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("logs related to purchase invoices should be shown", User, "Activity");
		StepTracker.setCurrentStep("logs related to purchase invoices should be shown");
	}

	@When("the user selects All Purchase Credit Notes {string}")
	public void the_user_selects_all_purchase_credit_notes(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "the user selects All Purchase Credit Notes {string}", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Purchase Credit Notes " + string + "");
	}

	@Then("display only relevant purchase credit note activity")
	public void display_only_relevant_purchase_credit_note_activity() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("display only relevant purchase credit note activity", User, "Activity");
		StepTracker.setCurrentStep("display only relevant purchase credit note activity");
	}

	@When("the user selects All Sources {string}")
	public void the_user_selects_all_sources(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "the user selects All Sources {string}", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Sources " + string + "");
	}

	@Then("display logs regarding external or internal source interactions \\(if applicable)")
	public void display_logs_regarding_external_or_internal_source_interactions_if_applicable() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("display logs regarding external or internal source interactions \\(if applicable)", User, "Activity");
		StepTracker.setCurrentStep("display logs regarding external or internal source interactions \\(if applicable)");
	}

	@When("the user selects All Book Bank Rules {string}")
	public void the_user_selects_all_book_bank_rules(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "the user selects All Book Bank Rules {string}", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Book Bank Rules " + string + "");
	}

	@Then("all logs related to book bank rules should be shown")
	public void all_logs_related_to_book_bank_rules_should_be_shown() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("all logs related to book bank rules should be shown", User, "Activity");
		StepTracker.setCurrentStep("all logs related to book bank rules should be shown");
	}

	@When("the user selects All Bankfeed Bank Rules {string}")
	public void the_user_selects_all_bankfeed_bank_rules(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "the user selects All Bankfeed Bank Rules {string}", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Bankfeed Bank Rules " + string + "");
	}

	@Then("only logs for bankfeed rule creation or updates should be displayed")
	public void only_logs_for_bankfeed_rule_creation_or_updates_should_be_displayed() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("only logs for bankfeed rule creation or updates should be displayed", User, "Activity");
		StepTracker.setCurrentStep("only logs for bankfeed rule creation or updates should be displayed");
	}

	@When("the user selects All Invoices and {string}")
	public void the_user_selects_all_invoices_and(String string) {
		dashboardActions.ClickOnActivityAllDropdown(string);
		Log.info(string + "the user selects All Invoices and {string}", User, "Activity");
		StepTracker.setCurrentStep("the user selects All Invoices and " + string + "");
	}

	@Then("only last month’s invoice-related logs should be visible")
	public void only_last_month_s_invoice_related_logs_should_be_visible() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("only last month’s invoice-related logs should be visible", User, "Activity");
		StepTracker.setCurrentStep("only last month’s invoice-related logs should be visible");
	}

	@When("the user types a keyword like {string} in the search bar")
	public void the_user_types_a_keyword_like_in_the_search_bar(String string) throws InterruptedException {
		dashboardActions.SearchClientinActivityTab(string);
		Log.info("the user types a keyword like {string} in the search bar", User, "Activity");
		StepTracker.setCurrentStep("the user types a keyword like " + string + " in the search bar");
	}

	@Then("all logs containing that keyword in user\\/action should be shown")
	public void all_logs_containing_that_keyword_in_user_action_should_be_shown() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Activity");
		Log.info("all logs containing that keyword in user\\/action should be shown", User, "Activity");
		StepTracker.setCurrentStep("all logs containing that keyword in user\\/action should be shown");
	}

	@When("the user selects a category\\/time filter combination with no data")
	public void the_user_selects_a_category_time_filter_combination_with_no_data() {
		StepTracker.setCurrentStep("the user selects a category\\/time filter combination with no data");
	}

	@Then("an empty state message like {string} should be displayed")
	public void an_empty_state_message_like_should_be_displayed(String string) {
		StepTracker.setCurrentStep("an empty state message like " + string + " should be displayed");
	}

	@When("user selects {string} from the Activity time filter dropdown")
	public void user_selects_from_the_activity_time_filter_dropdown(String ActivityTimefilter) {
		selectedTimeFilter = ActivityTimefilter;
		dashboardActions.ClickTimeFilerDropdownOnActivityTab(selectedTimeFilter);
		Log.info("user selects" + ActivityTimefilter + "from the Activity time filter dropdown", User,
				ActivityTimefilter);
		StepTracker.setCurrentStep("user selects " + ActivityTimefilter + " from the Activity time filter dropdown");
	}

	@Then("activity logs should be displayed for {string}")
	public void activity_logs_should_be_displayed_for(String string) {
		Log.info("activity logs should be displayed for" + string, User, string);
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), string);
		StepTracker.setCurrentStep("activity logs should be displayed for " + string + "");
	}

	// Setting steps
	// ================================================================================

	@When("the user clicks on the Settings icon")
	public void the_user_clicks_on_the_settings_icon() {
		dashboardActions.ClickOnSettingsInDashboard();
		Log.info("the user clicks on the Settings icon", User, "Settings Tab");
		StepTracker.setCurrentStep("the user clicks on the Settings icon");
	}

	@When("the user selects {string} from the Settings dropdown")
	public void the_user_selects_from_the_settings_dropdown(String option) {
		if (option.equalsIgnoreCase("My Business")) {
			dashboardActions.ClickOnMyBusiness();
		} else if (option.equalsIgnoreCase("Integrations")) {
			dashboardActions.ClockOnIntegration();
		}
		Log.info("the user selects" + option + "from the Settings dropdown", User, "Settings Tab");
		StepTracker.setCurrentStep("the user selects " + option + " from the Settings dropdown");
	}

	@When("the user clicks {string} under Bank Details")
	public void the_user_clicks_under_bank_details(String string) {
		dashboardActions.clickOnAddNewLineUnderBankDetails(string);
		Log.info("the user clicks \\\"Add New Line\\\" under Bank Details", User, "Settings Tab");
		StepTracker.setCurrentStep("the user clicks " + string + " under Bank Details");
	}

	@When("the user fills in the new bank details")
	public void the_user_fills_in_the_new_bank_details() {
		dashboardActions.fillLastEmptyBankDetails();
		Log.info("the user fills in the new bank details", User, "Settings Tab");
		StepTracker.setCurrentStep("the user fills in the new bank details");
	}

	@Then("the new bank details should be saved successfully")
	public void the_new_bank_details_should_be_saved_successfully() {
		dashboardActions.ClickOnSaveButton();
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Settings Tab");
		Log.info("the new bank details should be saved successfully", User, "Settings Tab");
		StepTracker.setCurrentStep("the new bank details should be saved successfully");
	}

	// Announcement Steps
	// ===============================================================================================

	@Given("User on dashboard and selects Announcement tab")
	public void user_on_dashboard_and_selects_announcement_tab() {
		dashboardActions.ClickOnAnnouncementTab();
		StepTracker.setCurrentStep("User on dashboard and selects Announcement tab");
		Log.info("User on dashboard and selects Announcement tab", User, "Announcement Tab");
		StepTracker.setCurrentStep("User on dashboard and selects Announcement tab");
	}

	@When("user redirect to Announcement tab and verify any announcements is avilaible")
	public void user_redirect_to_announcement_tab_and_verify_any_announcements_is_avilaible() {
		StepTracker.setCurrentStep("user redirect to Announcement tab and verify any announcements is avilaible");
		Log.info("user redirect to Announcement tab and verify any announcements is avilaible", User,
				"Announcement Tab");
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Announcement Tab");
		StepTracker.setCurrentStep("user redirect to Announcement tab and verify any announcements is avilaible");
	}

	// Tickets Tab Steps
	// =================================================================================================
	@Given("the user is on the Support Ticket tab")
	public void the_user_is_on_the_support_ticket_tab() {
		dashboardActions.ClickOnTicketsTab();
		StepTracker.setCurrentStep("the user is on the Support Ticket tab");
		Log.info("the user is on the Support Ticket tab", User, "Tickets Tab");
		StepTracker.setCurrentStep("the user is on the Support Ticket tab");
	}

	@Then("the {string} button should be visible")
	public void the_button_should_be_visible(String string) {
		dashboardActions.VerifyAddSupportTicketButtonVisibleorNot(string);
		StepTracker.setCurrentStep("the " + string + " button should be visible");
		Log.info("the " + string + " button should be visible", User, "Tickets Tab");
		StepTracker.setCurrentStep("the " + string + " button should be visible");
	}

	@Then("the {string} bar should be visible")
	public void the_bar_should_be_visible(String string) {
		dashboardActions.VerifySearchBarinTicketsDashboard(string);
		StepTracker.setCurrentStep("the " + string + " bar should be visible");
		Log.info("the " + string + " bar should be visible", User, "Tickets Tab");
		StepTracker.setCurrentStep("the " + string + " bar should be visible");
	}

	@Then("the {string} filter dropdown should be visible")
	public void the_filter_dropdown_should_be_visible(String string) {
		dashboardActions.VerifyStatusdropdownShouldbeVisible(string);
		StepTracker.setCurrentStep("the " + string + " filter dropdown should be visible");
		Log.info("the " + string + " filter dropdown should be visible", User, "Tickets Tab");
		StepTracker.setCurrentStep("the " + string + " filter dropdown should be visible");
	}

	@Then("the ticket table should display the columns {string}, {string}, {string}, {string}, and {string}")
	public void the_ticket_table_should_display_the_columns_and(String string, String string2, String string3,
			String string4, String string5) {
		dashboardActions.VerifyAllTablesValues(string, string2, string3, string4, string5);
		StepTracker.setCurrentStep("the ticket table should display the columns " + string + ", " + string2 + ", "
				+ string3 + ", " + string4 + ", and " + string5 + "");
		Log.info("the ticket table should display the columns " + string + ", " + string2 + ", " + string3 + ", "
				+ string4 + ", and " + string5 + "", User, "Tickets Tab");
		StepTracker.setCurrentStep("the ticket table should display the columns " + string + ", " + string2 + ", "
				+ string3 + ", " + string4 + ", and " + string5 + "");
	}

	@Given("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) {
		dashboardActions.ClickOnAddSupportTicketButton(string);
		StepTracker.setCurrentStep("the user clicks on the " + string + " button");
		Log.info("the user clicks on the " + string + " button", User, "Tickets Tab");
		StepTracker.setCurrentStep("the user clicks on the " + string + " button");
	}

	@When("the user enters valid ticket details")
	public void the_user_enters_valid_ticket_details() throws IOException {
		dashboardActions.EnetrValidTicketDetails();
		StepTracker.setCurrentStep("the user enters valid ticket details");
		Log.info("the user enters valid ticket details", User, "Tickets Tab");
		StepTracker.setCurrentStep("the user enters valid ticket details");
	}

	@When("clicks the {string} button")
	public void clicks_the_button(String string) {
		StepTracker.setCurrentStep("clicks the " + string + " button");
	}

	@Then("a new ticket should be created")
	public void a_new_ticket_should_be_created() {
		StepTracker.setCurrentStep("a new ticket should be created");
	}

	@Then("it should appear in the list under the {string} status")
	public void it_should_appear_in_the_list_under_the_status(String string) {
		StepTracker.setCurrentStep("it should appear in the list under the " + string + " status");
	}

	// Help Tab Steps
	// ============================================================================================
	@Given("User on the dashboard and selects help tab")
	public void user_on_the_dashboard_and_selects_help_tab() {
		dashboardActions.ClickOnHelpTabinDashboard();
		StepTracker.setCurrentStep("User on the dashboard and selects help tab");
		Log.info("User on the dashboard and selects help tab", User, "Tickets Tab");
	}

	@When("user should redirect to help information page")
	public void user_should_redirect_to_help_information_page() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Help Tab");
		StepTracker.setCurrentStep("user should redirect to help information page");
		Log.info("user should redirect to help information page", User, "Tickets Tab");
	}

	// Profile Page Steps
	// ===========================================================================================

	@Given("the user is in Dashboard page")
	public void the_user_is_in_dashboard_page() {
		StepTracker.setCurrentStep("the user is in Dashboard page");
		Log.info("the user is in Dashboard page", User, "Profile Tab");

	}

	@When("the user clicks the profile icon at the top-right corner")
	public void the_user_clicks_the_profile_icon_at_the_top_right_corner() {
		dashboardActions.ClickOnProfileTab();
		StepTracker.setCurrentStep("the user clicks the profile icon at the top-right corner");
		Log.info("the user clicks the profile icon at the top-right corner", User, "Profile Tab");
	}

	@Then("a profile popup should be displayed")
	public void a_profile_popup_should_be_displayed() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Profile Tab");
		StepTracker.setCurrentStep("a profile popup should be displayed");
		Log.info("a profile popup should be displayed", User, "Profile Tab");
	}

	@Then("it should contain user initials, location, user ID, and email")
	public void it_should_contain_user_initials_location_user_id_and_email() {
		dashboardActions.VerifyUserIDandEmail();
		StepTracker.setCurrentStep("it should contain user initials, location, user ID, and email");
		Log.info("it should contain user initials, location, user ID, and email", User, "Profile Tab");
	}

	@Then("it should display a {string} button")
	public void it_should_display_a_button(String string) {
		dashboardActions.verifyLogoutbutton(string);
		StepTracker.setCurrentStep("it should display a " + string + " button");
		Log.info("it should display a " + string + " button", User, "Profile Tab");
	}

	@Then("it should display a color palette for theme selection")
	public void it_should_display_a_color_palette_for_theme_selection() {
		dashboardActions.VerifyColorsInProfile();
		StepTracker.setCurrentStep("it should display a color palette for theme selection");
		Log.info("it should display a color palette for theme selection", User, "Profile Tab");
	}

	@Given("the profile popup is open")
	public void the_profile_popup_is_open() {
		dashboardActions.ClickOnProfileTab();
		StepTracker.setCurrentStep("the profile popup is open");
		Log.info("the profile popup is open", User, "Profile Tab");
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		dashboardActions.clickSignOut(string);
		StepTracker.setCurrentStep("the user clicks the " + string + " button");
		Log.info("the user clicks the " + string + " button", User, "Profile Tab");
	}

	@Then("the user should be logged out")
	public void the_user_should_be_logged_out() {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "the user should be logged out");
		StepTracker.setCurrentStep("the user should be logged out");
		Log.info("the user should be logged out", User, "Profile Tab");
	}

	@Then("the login page should be displayed")
	public void the_login_page_should_be_displayed() {
		dashboardActions.verifyLoginPageVisible();
		StepTracker.setCurrentStep("the login page should be displayed");
		Log.info("the login page should be displayed", User, "Profile Tab");
	}

	@When("the user selects the {string} from the palette")
	public void the_user_selects_the_from_the_palette(String themeColor) {
		String index = getThemeValue(themeColor);
		WebElement colorOption = driver.findElement(themeRadioButtonByValue(index));
		colorOption.click();
		StepTracker.setCurrentStep("the user selects the " + themeColor + " from the palette");
	}

	By themeRadioButtonByValue(String colorHex) {
		return By.xpath("//input[@type='radio' and @value='" + colorHex + "']/ancestor::mat-radio-button");
	}

	private String getThemeValue(String themeColor) {
		switch (themeColor.toLowerCase()) {
		case "purple":
			return "#6d41a1";
		case "dark blue":
			return "#6661b8";
		case "sky blue":
			return "#4461d7";
		case "blue":
			return "#14539a";
		case "teal":
			return "#4461d7";
		case "yellow":
			return "#a76f05";
		case "red":
			return "#a0144f";
		case "black":
			return "#000000";
		case "green":
			return "#045b62";

		default:
			throw new IllegalArgumentException("Unknown theme color: " + themeColor);
		}
	}

	@Then("the application theme should change to {string}")
	public void the_application_theme_should_change_to(String string) {
		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(),
				"the application theme should change to" + string + "");
		StepTracker.setCurrentStep("the application theme should change to " + string + "");
		Log.info("the application theme should change to " + string + "", User, "Profile Tab");
	}

	@Then("the selected theme color should be highlighted")
	public void the_selected_theme_color_should_be_highlighted() {
		StepTracker.setCurrentStep("the selected theme color should be highlighted");
		Log.info("the selected theme color should be highlighted", User, "Profile Tab");
	}

	@When("the user clicks outside the popup")
	public void the_user_clicks_outside_the_popup() {
		dashboardActions.ClickOnProfileTab();
		StepTracker.setCurrentStep("the user clicks outside the popup");
		Log.info("the user clicks outside the popup", User, "Profile Tab");
	}

	@Then("the profile popup should be closed")
	public void the_profile_popup_should_be_closed() {
		dashboardActions.Verifypopup();
		StepTracker.setCurrentStep("the profile popup should be closed");
		Log.info("the profile popup should be closed", User, "Profile Tab");
	}

	@When("the user selects a new theme color")
	public void the_user_selects_a_new_theme_color() {
		dashboardActions.storePreviouslySelectedTheme();
		HelperClass.sleep1(3000);
		dashboardActions.selectNewThemeColor();
		StepTracker.setCurrentStep("the user selects a new theme color");
		Log.info("the user selects a new theme color", User, "Profile Tab");
	}

	@Then("the previously selected color should be deselected")
	public void the_previously_selected_color_should_be_deselected() {
		dashboardActions.verifyPreviousThemeDeselected();
		StepTracker.setCurrentStep("the previously selected color should be deselected");
		Log.info("the previously selected color should be deselected", User, "Profile Tab");
	}

	@Then("the newly selected color should be highlighted")
	public void the_newly_selected_color_should_be_highlighted() {
		dashboardActions.verifyNewThemeHighlighted();
		StepTracker.setCurrentStep("the newly selected color should be highlighted");
		Log.info("the newly selected color should be highlighted", User, "Profile Tab");
	}

}
