Feature: Click on recurring invoice

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  @RecurringInvoiceTab
  Scenario: Verify recurring invoice tab
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page

  @RecurringInvoiceTab
  Scenario: Verify add recurring invoice button functionality
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button

  @RecurringInvoiceTab
  Scenario: Verify edit button in company details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Click on edit in company details

  @RecurringInvoiceTab
  Scenario: Verify edit company details without giving mandatory details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Click on edit in company details
    And Click on save without giving mandatory details in company details

  @RecurringInvoiceTab 
  Scenario: Verify edit company details with giving mandatory details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Click on edit in company details
    And Click on save with giving mandatory details in comapany details

  @RecurringInvoiceTab
  Scenario: Verify edit company details cancel button
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Click on edit in company details
    Then Click on cancel button in company details

  @RecurringInvoiceTab 
  Scenario: Verify add customer with mandatory fields
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    And Fill the mandatory details and save

  @RecurringInvoiceTab 
  Scenario: Verify add customer with non mandatory fields
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    Then Fill all the non mandatory details and save

  @RecurringInvoiceTab
  Scenario: Verify existing customer in add new recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify

  @RecurringInvoiceTab 
  Scenario: Verify Add new line functionality in contact details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    Then Click on add new line in contact details

  @RecurringInvoiceTab 
  Scenario: Verify Add new line cross button functionality in contact details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    Then Click on add new line in contact details
    Then Click on add new line cross button in contact details

  @RecurringInvoiceTab 
  Scenario: Verify Add new line functionality in address details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    Then Click on add new line in address details

  @RecurringInvoiceTab 
  Scenario: Verify Add new line cross button functionality in address details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    Then Click on add new line in address details
    Then Click on add new line cross button in address details

  @RecurringInvoiceTab 
  Scenario: Verify save button functionality in add new customer
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    And Fill the mandatory details and save

  @RecurringInvoiceTab 
  Scenario: Verify cancel changes button functionality in add new customer
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    Then Enter email in customer
    Then click on cancel changes in add new customer

  @RecurringInvoiceTab
  Scenario: Verify settings option of customer
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And click on settings and save and verify

  @RecurringInvoiceTab
  Scenario: Due date and verify in recurring invoices
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And select due date and verify in recurring invoices

  @RecurringInvoiceTab
  Scenario: Repeat invoice check box and verify in invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And check repeat invoice check box and verify in invoice

  @RecurringInvoiceTab
  Scenario: Discount option and verify value
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And click on discount option and verify value

  @RecurringInvoiceTab
  Scenario: Add item and verify
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Add item and verify

  @RecurringInvoiceTab 
  Scenario: Verify add bank functionality
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Select existing item
    And Click on add bank and enter mandatory details

  @RecurringInvoiceTab
  Scenario: Verify save and new recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Select repeat invoice status
    And Select existing item
    And Select existing bank account
    And Click on save and new and verify recurring invoice

  @RecurringInvoiceTab
  Scenario: Verify save and continue recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Select repeat invoice status
    And Select existing item
    And Select existing bank account
    And Click on save and continue and verify recurring invoice

  @RecurringInvoiceTab 
  Scenario: Verify save and exit recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Select repeat invoice status
    And Select existing item
    And Select existing bank account
    And Click on save and exit and verify recurring invoice

  @RecurringInvoiceTab
  Scenario: Verify cancel changes in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Select existing item
    And Select existing bank account
    And Click on cancel changes and verify details

  @RecurringInvoiceTab
  Scenario: Add new recurring invoice plus button and verify
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click on add new recurring invoice plus button and verify

  @RecurringInvoiceTab
  Scenario: Checkbox verification
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Check the checkbox and verify options are enabling

  @RecurringInvoiceTab
  Scenario: Export to excel
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Check the checkbox and verify options are enabling
    And Click export to excel

  @RecurringInvoiceTab
  Scenario: Export to csv
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Check the checkbox and verify options are enabling
    And Click export to csv

  @RecurringInvoiceTab
  Scenario: Export to pdf
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Check the checkbox and verify options are enabling
    And Click export to pdf

  @RecurringInvoiceTab
  Scenario: Search recurring invoice and verify in invoice dashboard
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Enter recurring invoice name and verify

  @RecurringInvoiceTab
  Scenario: Verify all status in invoice dashboard
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Select all status and validate

  @RecurringInvoiceTab 
  Scenario: verify all time recurring invoice dashboard
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on all time status and verify

  @RecurringInvoiceTab
  Scenario: verify check box for recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on recurring invoice check box and verify enabling options

  @RecurringInvoiceTab
  Scenario: export excel for recurring invoice main dashboard
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on recurring invoice check box and verify enabling options
    And Click on export report as excel

  @RecurringInvoiceTab
  Scenario: export csv recurring invoice main dashboard
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on recurring invoice check box and verify enabling options
    And Click on export report as csv

  @RecurringInvoiceTab
  Scenario: export pdf recurring invoice main dashboard
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on recurring invoice check box and verify enabling options
    And Click on export report as pdf

  @RecurringInvoiceTab
  Scenario: Verify actions export to excel
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on actions
    And Click on actions export excel

  @RecurringInvoiceTab
  Scenario: Verify actions export to csv
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on actions
    And Click on actions export csv

  @RecurringInvoiceTab
  Scenario: Verify actions export to pdf
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on actions
    And Click on actions export pdf
    
     Scenario: Validate Add RecurringInvoicePaymentAccountDropdown
    When Click on Invoice Tab
    Then Click on ExpandIcon
    Then Click on RecuringInvoiceTab
    Then Click on Add recurringInvoicemenu
    Then Click on Payment AccountDropdownandValidate
    
    Scenario: Validate Add Customer PaymentAccountDropdwoninRecurringInvoice
    When Click on Invoice Tab
    Then Click on ExpandIcon
    Then Click on RecuringInvoiceTab
    Then Click on Add recurringInvoicemenu
    Then Click on Add Customer button
    Then Click on Paymnet Account dropdown and Validate
