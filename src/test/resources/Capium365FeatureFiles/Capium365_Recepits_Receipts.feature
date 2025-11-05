Feature: Receipts

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client
#Receipts All Status dropdown ==============================================================================
  @Receipts 
  Scenario: Verify All Status dropdown under receipts
    Given Validate click on Receipts
    Then Validate All status dropdown
    #Receipts TimeFilter dropdown ==========================================================================
  @Receipts 
  Scenario: Verify Receipts Tab data displays correct data for selected "<Time Filter>"
    Given Validate click on Receipts
    When user selects Receipts "This Week" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "Last Week" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "This Month" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "Last Month" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "This Quarter" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "Last Quarter" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "This Year" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "Last Year" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "Custom" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "This Financial Year" from the filter dropdown
    Then Table data should be displayed
    When user selects Receipts "All Time" from the filter dropdown
    Then Table data should be displayed

#Receipts Status dropdown ==============================================================================
  @Receipts 
  Scenario: Validate invoices filtered by "<Status>" match the displayed count
    Given Validate click on Receipts
    When user selects "All Status" from the Status dropdown
    Then invoices listed in the table should show status "All Status"
    And the count in the summary bar should match the total filtered invoices
    When user selects "Processing" from the Status dropdown
    Then invoices listed in the table should show status "Processing"
    And the count in the summary bar should match the total filtered invoices
    When user selects "To Review" from the Status dropdown
    Then invoices listed in the table should show status "To Review"
    And the count in the summary bar should match the total filtered invoices
    When user selects "Success" from the Status dropdown
    Then invoices listed in the table should show status "Success"
    And the count in the summary bar should match the total filtered invoices
    When user selects "Archived" from the Status dropdown
    Then invoices listed in the table should show status "Archived"
    And the count in the summary bar should match the total filtered invoices
    When user selects "Duplicate" from the Status dropdown
    Then invoices listed in the table should show status "Duplicate"
    And the count in the summary bar should match the total filtered invoices

#Receipts Export Functionality =======================================================================
  @Receipts
  Scenario: Validate Export functionality in Receipts Tab
    Given Validate click on Receipts
    When Click on the Three dots it will dsiaplay popup
    Then user selects Export to Excel, Excel file should download
    When Click on the Three dots it will dsiaplay popup
    Then user selects Export to CSV, CSV file should download
    When Click on the Three dots it will dsiaplay popup
    Then user selects Export to PDF, PDF file should download
#Receipts Ulpoad Functionality =======================================================================
  @Receipts   
  Scenario: Validate Upload Receipts functionality in Receipts tab
    Given Validate click on Receipts
    And Validate Add Upload receipts button
    When user should redirect to choose a file page and click on choose a file, upload receipte
    And user select upload receipt button
    Then user should redirect to receipts dashboard page
    And Verify the uploaded receipt displaying in dashboard or not
#Receipt Checkbox options =========================================================================
 @Receipts 
  Scenario: Action panel should appear on selecting a row checkbox
    Given Validate click on Receipts
    And Validate Side menu bar
    When Click on Receipts
    When user selects a checkbox of a purchase invoice
    Then action panel should be displayed at the bottom
    And it should show bulk action options like Edit, Copy, Delete, Export, Archive, Restore
#Receipts Edit fundtionality =========================================================================
  @Receipts 
  Scenario: Edit selected invoice using Bulk Edit
    Given Validate click on Receipts
    And user selects one or more invoice checkboxes
    When user clicks on the BULK EDIT button
    Then the Bulk Edit popup or page should appear
    And user should be able to edit fields and save changes

  @Receipts 
  Scenario: Copy selected invoice using Copy action
  Given Validate click on Receipts
  And user selects an invoice checkbox
  When user clicks the COPY button
  Then a new invoice should be created with the same data
  And status or ID should indicate it is a duplicate
   #Receipts Delete Functionality ============================================================
  @Receipts 
  Scenario: Delete selected invoice using Delete action
    Given Validate click on Receipts
    And user selects one or more invoice checkboxes
    When user clicks the DELETE button
    And confirms deletion
    Then the selected invoices should be removed from the list

  @Receipts 
  Scenario: Export selected invoice data to "<Format>"
    Given Validate click on Receipts
    And user selects one or more invoice checkboxes
    When user clicks on the "Excel" export option
    Then a file in "Excel" should be downloaded containing invoice data
    When user clicks on the "CSV" export option
    Then a file in "CSV" should be downloaded containing invoice data
    When user clicks on the "PDF" export option
    Then a file in "PDF" should be downloaded containing invoice data

  @Receipts 
  Scenario: Archive selected invoice
    Given Validate click on Receipts
    And user selects one or more invoice checkboxes
    When user clicks the ARCHIVE button
    Then the status of selected invoices should change to "Archived"

@Receipts 
  Scenario: Restore an archived invoice
    Given Validate click on Receipts
    And user selects an archived invoice checkbox
    When user clicks the RESTORE button
    Then the invoice should be restored to its previous status

  @Receipts 
  Scenario: Action buttons appear on row hover
    Given Validate click on Receipts
    When the user hovers over a receipt row
    Then the action buttons should become visible for that row

  @Receipts 
  Scenario: User clicks the Edit button for a receipt
    Given Validate click on Receipts
    When the user hovers over a receipt row
    When the user clicks the Edit button
    Then the Edit Receipt popup should be displayed

  @Receipts
  Scenario: User clicks the Delete button for a receipt
    Given Validate click on Receipts
    When the user hovers over a receipt row
    When the user clicks the Delete button
    Then a confirmation dialog should appear

  @Receipts 
  Scenario: User clicks the View button for a receipt
    Given Validate click on Receipts
    When the user hovers over a receipt row
    When the user clicks the Archive button
    Then the archive confirmation pop-up should open and verify

  @Receipts  
  Scenario: User clicks on three dots for a receipt and selects Preview option
    Given Validate click on Receipts
    When the user hovers over a receipt row
    And click on three dots on a receipt
    Then select preview option and validate the preview receipt page

  @Receipts
  Scenario: User clicks on three dots for a receipt and selects history option
    Given Validate click on Receipts
    And Validate Side menu bar
    When Click on Receipts
    When the user hovers over a receipt row
    And click on three dots on a receipt
    Then select history option and validate the  receipt page
    
    @Receipts
    Scenario: Validate PayementAccount Edit Receipt MainGrid
    When Click on Receipts Menu
    Then Mousehover and Click on Editreceipt
    Then Click on Payment Account Dropdown and validate
    
