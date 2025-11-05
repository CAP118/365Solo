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
  Scenario: Verify edit company details without giving mandatory details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Click on edit in company details
    And Click on save without giving mandatory details in company details
    Then Click on cancel button in company details
 
  @RecurringInvoiceTab
  Scenario: Verify edit company details with giving mandatory details
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Click on edit in company details
    And Click on save with giving mandatory details in comapany details
 
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
  Scenario: Validate add customer payment account dropdown
    Given Click on invoices tab
    And Click on add recurring invoice button
    And Click customer name add button
    Then Click on add customer payment account dropdown
    
  @RecurringInvoiceTab
  Scenario: Verify existing customer in add new recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
 
  @RecurringInvoiceTab
  Scenario: Verify Add new line functionality
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click customer name add button
    Then Click on add new line in contact details
    Then Click on add new line in address details
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
  Scenario: Validate add invoice payment account dropdown
    Given Click on invoices tab
    Then Click on payment account dropdown in invoice
    
  @RecurringInvoiceTab
  Scenario: Verify save and new recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Select repeat invoice status
    And Select existing item
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
    And Click on save and exit and verify recurring invoice
 
  @RecurringInvoiceTab
  Scenario: Verify cancel changes in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    Then Select customer and verify
    And Select existing item
    And Click on cancel changes and verify details
 
  @RecurringInvoiceTab
  Scenario: Add new recurring invoice plus button and verify
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click on add new recurring invoice plus button and verify
 
  @RecurringInvoiceTab
  Scenario: Verify checkbox functionality in add new recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Check the checkbox and verify options are enabling
    
  @RecurringInvoiceTab
  Scenario: Verify export functionality in add new recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on add recurring invoice button
    And Click export in add new recurring invoice
 
  @RecurringInvoiceTab
  Scenario: Search recurring invoice and verify in invoice dashboard
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on search in recurring invoice
 
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
  Scenario: Verify actions export
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on actions export
 
  @RecurringInvoiceTab
  Scenario: Verify mousehover delete in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    When Click on mousehover delete yes in recurring invoice
    Then Click on mousehover delete no in recurring invoice
 
  @RecurringInvoiceTab
  Scenario: Verify mousehover actions in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    When Click on mousehover end in recurring invoice
    Then Click on mousehover pause in recurring invoice
    
  @RecurringInvoiceTab
  Scenario: verify checkbox and record cancel in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on recurring invoice check box and verify enabling options
    When Click on record cancel in recurring invoice
 
  @RecurringInvoiceTab
  Scenario: verify copy button in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on copy button in recurring invoice
 
  @RecurringInvoiceTab
  Scenario: verify delete button in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on delete yes button in recurring invoice
    Then Click on delete no button in recurring invoice
    
  @RecurringInvoiceTab
  Scenario: verify export in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on export report
 
  @RecurringInvoiceTab
  Scenario: verify end button in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    And Click on end yes button in recurring invoice
    Then Click on end no button in recurring invoice
    
  @RecurringInvoiceTab
  Scenario: Verify pagination functionality in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on pagination in recurring invoice
 
  @RecurringInvoiceTab
  Scenario: Verify previous and next page functionality in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on next page in recurring invoice
    Then Click on previous page in recurring invoice
 
  @RecurringInvoiceTab
  Scenario: Verify Go to functionality in recurring invoice
    Given Click on invoices tab
    When Click on arrow button in invoice tab
    Then Click on recurring invoice and verify page
    Then Click on goto in recurring invoice