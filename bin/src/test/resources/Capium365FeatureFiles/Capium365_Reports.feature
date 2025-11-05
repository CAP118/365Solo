Feature: Capium365_ReportsPage

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  Scenario: Default load of Expense Report by Supplier tab
    Given user is logged in and on the Expense Report tab
    Then "All Time" should be selected in the filter dropdown
    And a donut chart should be displayed with supplier segments
    And total values like Total Net, Total Discount, Total VAT, and Total Gross should be shown

  Scenario Outline: Filter report based on time range selection
    Given user is on the Expense Report tab
    When user selects "<Time Filter>" from the dropdown
    Then the report data should be refreshed
    And the report header should reflect the selected date range
    And the chart and table should show filtered data

    Examples: 
      | Time Filter         |
      | This Week           |
      | Last Week           |
      | This Month          |
      | Last Month          |
      | This Quarter        |
      | Last Quarter        |
      | This Year           |
      | Last Year           |
      | Custom              |
      | This Financial Year |
      | All Time            |

  Scenario: Verify donut chart reflects supplier-wise breakdown
    Given user is on the Expense Report tab
    When the chart is loaded
    Then each supplier shown in the chart legend should match the supplier sections below
    And the amounts next to each supplier in the legend should match the Total Gross in the table

  Scenario: View receipt details for a supplier
    Given user is on the Expense Report tab
    When user expands a supplier section
    Then receipt numbers, dates, and descriptions should be displayed
    And each receipt should show Total Net, Discount, VAT, and Gross values

  Scenario: Validate supplier total aggregation
    Given user is viewing receipt details under a supplier
    Then the Total Net, Discount, VAT, and Gross for the supplier should be the sum of individual receipts

  Scenario: Receipt number should be clickable
    Given user is on the Expense Report tab
    When user clicks on a receipt number link
    Then user should be redirected to the corresponding receipt detail page

    Scenario: Open filters and view the list of suppliers
  Given user is on the Expense Report tab
  When user clicks the Filters icon
  Then the filter panel should be displayed
  And the "Suppliers List" dropdown should show a list of supplier names
    
    Scenario: Select one supplier from the filter and apply
  Given user opens the filter panel
  When user selects "EDF ENERGY" from the Suppliers List
  And clicks "Save Filter"
  Then the expense report should show data only for "EDF ENERGY"
  And the chart and table should be updated accordingly
    
    Scenario: Select multiple suppliers and apply the filter
  Given user opens the filter panel
  When user selects "EDF ENERGY" and "E.ON NEXT" from the Suppliers List
  And clicks "Save Filter"
  Then the report should display data for both selected suppliers
    
    Scenario: Select all suppliers using the "Select All" option
  Given user opens the filter panel
  When user checks "Select All" in the Suppliers List
  And clicks "Save Filter"
  Then the report should show data for all suppliers
    
    Scenario: Search and select a supplier from the filter dropdown
  Given user opens the filter panel
  When user types "Amazon" in the Suppliers search box
  Then only "AMAZON PLC" should be displayed in the list
  When user selects "AMAZON PLC" and clicks "Save Filter"
  Then the report should show data for "AMAZON PLC" only
  
  Scenario: Clear the selected suppliers from the filter
  Given user has selected one or more suppliers
  When user clicks the "Clear Filter" button
  Then all selected suppliers should be deselected
  And the report should return to the default unfiltered state
  
  Scenario: Change the grouping of expense report
  Given user opens the filter panel
  When user changes "Expense-Group By" to another available option "Account Names" if available
  And clicks "Save Filter"
  Then the report should regroup expense data accordingly
  
  
  Scenario: Display account names list in filter when "Account Names" is selected
  Given user is on the Expense Report tab
  When user opens the Filters panel
  And selects "Account Names" from the "Expense-Group By" dropdown
  Then a list of account names should be displayed under "Account Name List"
  
  
  Scenario: Filter report by selecting a single account name
  Given user selects "Account Names" from the grouping dropdown
  When user selects "4171 - Computer Equipment Leased - Additions - Cost"
  And clicks "Save Filter"
  Then the report should display expense data only for that account
  
  
  Scenario: Filter report by selecting multiple account names
  Given user selects "Account Names" from the grouping dropdown
  When user selects "4170 - Computer Equipment Leased - Cost B/Fwd" and "Depreciation Charges"
  And clicks "Save Filter"
  Then the report should display expenses for both selected account categories
  
  Scenario: Select all account names using "Select All"
  Given user selects "Account Names" in the Expense-Group By dropdown
  When user checks the "Select All" checkbox
  And clicks "Save Filter"
  Then the report should display data for all account names
  
  Scenario: Search and select a specific account name
  Given user opens the Account Name List filter
  When user types "Depreciation" in the search box
  Then only matching account names should be displayed
  When user selects "8511 - Depreciation Charge - Investment In Properties"
  And clicks "Save Filter"
  Then the report should display data for the selected account
  
  Scenario: Clear applied account name filters
  Given user has applied a filter with selected account names
  When user clicks the "Clear Filter" button
  Then all selected account names should be deselected
  And the report should return to the default unfiltered state
  
  Scenario: Grouped data should reflect selected account names
  Given user has applied account name filters
  Then the donut chart should show segments based on selected account names
  And the table below should list receipts under each selected account
  
    