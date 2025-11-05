Feature: Verify Invoices in InvoiceTab
 
  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client
 
  @InvoicePage
  Scenario: verify invoice screen
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
 
  @InvoicePage
  Scenario: verify number of customers
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then get customers count and validate
 
  @InvoicePage
  Scenario: verify number of invoices
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then get invoice count and validate

  @InvoicePage
  Scenario: verify Total raised received due
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Verify total raised count
    And Verify total received count
    And Verify total due count

  @InvoicePage
  Scenario: verify add invoice screen
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page

  @InvoicePage
  Scenario: verify edit company details without giving mandatory details
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And Click on edit company details without giving mandatory details and verify

  @InvoicePage
  Scenario: verify edit company details with giving mandatory details
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And Click on edit company details with giving mandatory details and verify

  @InvoicePage
  Scenario: verify add customer
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And click on add customer and verify page
    And Fill the mandatory fields details and save

  @InvoicePage
  Scenario: verify add customer with add row
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And click on add customer and verify page
    And Fill the mandatory details and click add row and save

  @InvoicePage
  Scenario: verify search and select customer
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details

  @InvoicePage
  Scenario: verify settings option of customer
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And click on settings then save and verify

  @InvoicePage
  Scenario: due date and verify in invoices
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And select due date and verify in invoices

  @InvoicePage
  Scenario: repeat invoice check box and verify invoice
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And check repeat invoice check box and verify invoice

  @InvoicePage
  Scenario: Discount option and verify value
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And click on discount option and verify value  

  @InvoicePage
  Scenario: add item and verify
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And add item and verify

  @InvoicePage
  Scenario: verify add bank functionality
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And select existing item
    And click on add bank and enter mandatory details

  @InvoicePage
  Scenario: verify save and new invoice
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And select existing item
    And select existing bank account
    And Click on save and new and verify invoice

  @InvoicePage
  Scenario: verify save and continue invoice
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And select existing item
    And select existing bank account
    And Click on save and continue and verify invoice

  @InvoicePage
  Scenario: verify save and exit invoice
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And select existing item
    And select existing bank account
    And Click on save and exit and verify invoice

  @InvoicePage
  Scenario: verify cancel changes in invoice
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And select the customer and verify details
    And select existing item
    And select existing bank account
    And Click on cancel changes and verify the details

  @InvoicePage
  Scenario: add new invoice plus button and verify
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And click on add new invoice plus button and verify

  @InvoicePage
  Scenario: checkbox verification
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And check the checkbox and verify options are enabling

  @InvoicePage
  Scenario: Verify export in add invoice
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then Click on add invoice and verify page
    And verify export in add invoice

  @InvoicePage
  Scenario: search invoice and verify in invoice dashboard
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then enter invoice name and verify

  @InvoicePage
  Scenario: verify all status in invoice dashboard
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then click on all status and verify

  @InvoicePage
  Scenario: verify all time invoice dashboard
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then click on all time status and verify

  @InvoicePage
  Scenario: verify check box for invoice
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then click on invoice check box and verify enabling options

  @InvoicePage
  Scenario: export excel for invoice main dashboard
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    And click on export report

  @InvoicePage
  Scenario: verify pagination
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then click and select page number

  @InvoicePage
  Scenario: verify previous button
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then click and verify previous button

  @InvoicePage
  Scenario: verify next button
    Given Click on invoice and verify page
    Then Click on KeyBoardErrorRight
    Then click and verify next button

  @InvoicePage
  Scenario: Validate Add Invoice Payment Account Dropdown
    When Click on Invoice Tab
    Then Click on Add Invoice button
    Then Validate Payment Account Dropdown

  @InvoicePage
  Scenario: Validate Add Customer Payment Account Dropdown
    When Click on Invoice Tab
    Then Click on Add Invoice button
    Then Click on Add Customer button
    Then Click on Payment Account dropdown and Validate

  @InvoicePage
  Scenario: Verify UploadInvoice button MainGrid ICN
    When Click on Invoice Tab
    When Upload the Invoice
    Then Validate uploadInvoice customer name should Display in the grid ICN
