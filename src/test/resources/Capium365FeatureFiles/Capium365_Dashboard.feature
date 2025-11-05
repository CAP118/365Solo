Feature: Dashboard Chart Validation

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  #Invoices Chart-------------------------------------------------
  @Dashboard
  Scenario: Validate Invoice dashboard chart for 'Time Filter'
    When the user selects This Year from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels
    When the user selects This Month from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects This Week from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects Last Week from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects Last Month from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects This Quarter from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels
    When the user selects Last Quarter from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels
    When the user selects Last Year from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display daily labels for that month
    When the user selects Custom from the filter dropdown
    Then the user should be prompted to select a date range
    And the dashboard metrics should update after range selection
    When the user selects This Financial Year from the filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels (Apr to Mar)

  #Transactions Chart---------------------------------------------------------
  @Dashboard
  Scenario: Validate Transactions dashboard chart for 'This Year'
    When the user selects This Year from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels
    When the user selects This Month from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects This Week from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects Last Week from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects Last Month from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display day-wise labels
    When the user selects This Quarter from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels
    When the user selects Last Quarter from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels
    When the user selects Last Year from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display daily labels for that month
    When the user selects Custom from the Transactions filter dropdown
    Then the user should be prompted to select a date range
    And the dashboard metrics should update after range selection
    When the user selects This Financial Year from the Transactions filter dropdown
    Then the dashboard metrics should be visible
    And the chart should display month-wise labels (Apr to Mar)

  @Dashboard
  Scenario: User selects each account from the dropdown and verifies transaction data
    Given the user is logged in and navigates to the Transactions dashboard
    When the user opens the All Accounts dropdown
    Then the dropdown should display one or more account options dynamically
    When the user selects each account one by one from the dropdown
    Then the transaction chart should update accordingly for each selected account
    And the chart should show bars or No data available based on the selected account's transactions

  #TopAccountNames================================================================================
  @Dashboard
  Scenario: Verify Top Account Names "<Time Filter>" donut chart displays correct data for selected time filter
    Given user is on the Top Account Names dashboard
    When user selects "This Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "Last Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "This Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "Last Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "This Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "Last Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "This Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "Last Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "Custom" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "This Financial Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects "All Time" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values

  #ExpensesFlow==========================================================================================
  @Dashboard
  Scenario: Verify Expenses "<Time Filter>" Flow donut chart displays correct data for selected time filter
    Given user is on the Expenses Flow dashboard
    When user selects Expenses Flow "This Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "Last Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "This Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "Last Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "This Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "Last Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "This Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "Last Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "Custom" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "This Financial Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Expenses Flow "All Time" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values

  #TopEarners==============================================================================
  @Dashboard
  Scenario: Verify Top Earners "<Time Filter>" donut chart displays correct data for selected time filter
    Given user is on the Top Earners dashboard
    When user selects Top Earners "This Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "Last Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "This Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "Last Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "This Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "Last Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "This Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "Last Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "Custom" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "This Financial Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Top Earners "All Time" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values

  #SalesFlow================================================================================
  @Dashboard
  Scenario: Verify Sales Flow "<Time Filter>" donut chart displays correct data for selected time filter
    Given user is on the Sales Flow dashboard
    When user selects Sales Flow "This Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "Last Week" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "This Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "Last Month" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "This Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "Last Quarter" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "This Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "Last Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "Custom" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "This Financial Year" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values
    When user selects Sales Flow "All Time" from the filter dropdown
    Then donut chart should be displayed
    And donut chart should contain valid account categories and values

  @Dashboard
  Scenario: Click + and Select "Invoices"
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Invoices
    Then the Create New Invoice page should be displayed
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Recurring Invoices
    Then the Create New Recurring Invoice form should open
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Invoice Credit Notes
    Then the Create Invoice Credit Note form should open
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Estimates
    Then the Create Estimate form should be displayed
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Products
    Then the Add New Product form should be displayed
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Customers
    Then the Add New Customer form should be displayed
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Receipts
    Then the Record Receipt screen should be displayed
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Purchase Invoices
    Then the Create Purchase Invoice form should open
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Purchase Credit Notes
    Then the Create Purchase Credit Note page should open
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Suppliers
    Then the Add Supplier form should open
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Users
    Then the Add New User screen should be displayed
    Given the user is on the dashboard
    When the user clicks on the + icon and selects Bank Accounts
    Then the Add Bank Account form should be displayed

  #Activity Screen Scenarios =======================================================================
 @Dashboard
  Scenario: Default filter selection on Activity tab
    Given the user is on the Activity tab
    Then "All" should be selected by default in the category dropdown
    And "This Month" should be selected in the time filter dropdown
    And all activity logs for this month should be visible

  @Dashboard
  Scenario: Filter Activity by "All Invoices"
    Given the user is on the Activity tab
    When the user selects "All Invoices" from the category dropdown
    Then only activity logs related to invoices should be shown
    When the user selects All Receipts "All Receipts" from the category dropdown
    Then only receipt-related logs should be displayed
    When the user selects All Estimates "All Estimates" from the category dropdown
    Then the activity log should display only estimate-related actions
    When the user selects All Products "All Products"
    Then activity logs related to product creation, update or delete should appear
    When the user selects All Customers "All Customers"
    Then only logs showing customer actions e.g.add,edit,delete should be visible
    When the user selects All Suppliers "All Suppliers"
    Then supplier-related log entries should be visible in the activity feed
    When the user selects All Users "All Users"
    Then actions such as create, restore, archive users should be listed
    When the user selects All Invoice Credit Notes "All Invoice Credit Notes"
    Then only related logs should be displayed
    When the user selects All Purchases "All Purchases"
    Then logs related to purchase invoices should be shown
    When the user selects All Purchase Credit Notes "All Purchase Credit Notes"
    Then display only relevant purchase credit note activity
    When the user selects All Sources "All Sources"
    Then display logs regarding external or internal source interactions (if applicable)
    When the user selects All Book Bank Rules "All Book Bank Rules"
    Then all logs related to book bank rules should be shown
    When the user selects All Bankfeed Bank Rules "All Bankfeed Bank Rules"
    Then only logs for bankfeed rule creation or updates should be displayed
    When the user types a keyword like "user1" in the search bar
    Then all logs containing that keyword in user/action should be shown
    When the user selects a category/time filter combination with no data
    Then an empty state message like "No activity found" should be displayed

  @Dashboard
  Scenario: Verify activity logs are filtered correctly by time range
    Given the user is on the Activity tab
    When user selects "This Week" from the Activity time filter dropdown
    Then activity logs should be displayed for "This Week"
    When user selects "Last Week" from the Activity time filter dropdown
    Then activity logs should be displayed for "Last Week"
    When user selects "This Month" from the Activity time filter dropdown
    Then activity logs should be displayed for "This Month"
    When user selects "Last Month" from the Activity time filter dropdown
    Then activity logs should be displayed for "Last Month"
    When user selects "This Quarter" from the Activity time filter dropdown
    Then activity logs should be displayed for "This Quarter"
    When user selects "Last Quarter" from the Activity time filter dropdown
    Then activity logs should be displayed for "Last Quarter"
    When user selects "This Year" from the Activity time filter dropdown
    Then activity logs should be displayed for "This Year"
    When user selects "Last Year" from the Activity time filter dropdown
    Then activity logs should be displayed for "Last Year"
    When user selects "Custom" from the Activity time filter dropdown
    Then activity logs should be displayed for "Custom"
    When user selects "This Financial Year" from the Activity time filter dropdown
    Then activity logs should be displayed for "This Financial Year"
    When user selects "All Time" from the Activity time filter dropdown
    Then activity logs should be displayed for "All Time"

  #Settings Scenarios: =========================================================================================
  @Dashboard
  Scenario: Add a new bank under My Business settings
    When the user clicks on the Settings icon
    And the user selects "My Business" from the Settings dropdown
    And the user clicks "Add New Line" under Bank Details
    And the user fills in the new bank details
    Then the new bank details should be saved successfully

  #Announcement Scenarios=======================================================================================
  @Dashboard
  Scenario: Verify Announcement tab in dashborad
    Given User on dashboard and selects Announcement tab
    When user redirect to Announcement tab and verify any announcements is avilaible

  #Tickets Tab Scenarios :===============================================================================
  @Dashboard
  Scenario: Verify essential UI elements are present
    Given the user is on the Support Ticket tab
    Then the "Add Support Ticket" button should be visible
    And the "search" bar should be visible
    And the "Open" filter dropdown should be visible
    And the ticket table should display the columns "Ticket No.", "Subject", "Created on", "Status", and "Department"

  @Dashboard
  Scenario: Add a new support ticket
    Given the user is on the Support Ticket tab
    Given the user clicks on the "Add Support Ticket" button
    When the user enters valid ticket details
    And clicks the "Submit" button
    Then a new ticket should be created
    And it should appear in the list under the "Open" status

 
  #Help Tab Scenario =====================================================================================
  @Dashboard
  Scenario: Verify Help tab in dashboard
    Given User on the dashboard and selects help tab
    When user should redirect to help information page

  #Profile Scenarios =====================================================================================
  @Dashboard
  Scenario: Open profile popup
    Given the user is in Dashboard page
    When the user clicks the profile icon at the top-right corner
    Then a profile popup should be displayed
    And it should contain user initials, location, user ID, and email
    And it should display a "Sign Out" button
    And it should display a color palette for theme selection
    When the user clicks the profile icon at the top-right corner

  @Dashboard
  Scenario: Sign out using the profile popup
    Given the profile popup is open
    When the user clicks the "Sign Out" button
    Then the user should be logged out
    And the login page should be displayed
    
  @Dashboard
  Scenario Outline: Select a different theme color "<Theme Color>"
    Given the profile popup is open
    When the user selects the "<Theme Color>" from the palette
    Then the application theme should change to "<Theme Color>"
    And the selected theme color should be highlighted

    Examples: 
      | Theme Color |
      | Purple      |
      | Dark Blue   |
      | Sky Blue    |
      | Blue        |
      | Teal        |
      | Yellow      |
      | Red         |
      | Black       |
      | Green       |

  @Dashboard
  Scenario: Close profile popup by clicking outside
    Given the profile popup is open
    When the user clicks outside the popup
    Then the profile popup should be closed
 
