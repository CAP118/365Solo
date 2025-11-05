Feature: Click on invoice and verify customers page

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  @CustomerTab
  Scenario: Verify customer tab
    Given Click on invoices
    When Click on arrow button
    And Click on customers

  @CustomerTab
  Scenario: Verify add customer with mandatory fields
    Given Click on invoices
    When Click on arrow button
    And Click on customers
    Then Click on add customer button
    Then Fill the mandatory details in add customer and save

  @CustomerTab
  Scenario: Verify add customer with non mandatory fields
    Given Click on invoices
    When Click on arrow button
    And Click on customers
    Then Click on add customer button
    Then Fill the non mandatory details in add customer and save and exit

  @CustomerTab
  Scenario: Verify cancel changes button functionality
    Given Click on invoices
    When Click on arrow button
    And Click on customers
    Then Click on add customer button
    Then Enter email
    Then Click on cancel changes

  @CustomerTab
  Scenario: Verify contact details new line functionality
    Given Click on invoices
    When Click on arrow button
    And Click on customers
    Then Click on add customer button
    Then Enter contact details
    Then Click on contact details cross button

  @CustomerTab
  Scenario: Verify address details new line functionality
    Given Click on invoices
    When Click on arrow button
    And Click on customers
    Then Click on add customer button
    Then Enter address details
    Then Click on address details cross button

  @CustomerTab
  Scenario: Verify file uploading functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click on choose a file

  @CustomerTab
  Scenario: Verify delete file functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click on choose a file
    Then Click on delete file

  @CustomerTab
  Scenario: Verify add new customer cross button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on cross button

  @CustomerTab
  Scenario: Verify search functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on search button in add new customer
    When Enter customer name in search textbox
    Then Click on search cross button

  @CustomerTab
  Scenario: Verify customer add button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on customer add button

  @CustomerTab
  Scenario: Customer checkbox verification
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click the checkbox and verify options are enabling

  @CustomerTab 
  Scenario: Verify record cancel functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    When Click the checkbox and verify options are enabling
    Then Click on cancel record

  @CustomerTab
  Scenario: Verify copy button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click on customer checkbox in add new customer
    Then Click on copy button in add new customer

  @CustomerTab
  Scenario: Verify delete yes button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click on customer checkbox in add new customer
    Then Click on delete yes button in add new customer

  @CustomerTab
  Scenario: Verify delete no button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click on customer checkbox in add new customer
    Then Click on delete no button in add new customer

  @CustomerTab
  Scenario: Verify export functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    When Click the checkbox and verify options are enabling
    Then Click on export to excel in add new customer
    Then Click on export to csv in add new customer
    Then Click on export to pdf in add new customer

  @CustomerTab
  Scenario: Verify archive yes button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click on customer checkbox in add new customer
    Then Click on archive yes button in add new customer

  @CustomerTab
  Scenario: Verify archive no button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click on customer checkbox in add new customer
    Then Click on archive no button in add new customer

  @CustomerTab
  Scenario: Verify search functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Enter customer name and search

  @CustomerTab
  Scenario: Verify customers all status dropdown functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then validate all status dropdown

  @CustomerTab
  Scenario: Verify export to functionality in main
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on export to excel
    When Click on customers
    Then Click on export to csv
    When Click on customers
    Then Click on export to pdf

  @CustomerTab
  Scenario: Verify customer checkbox functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox verify options are enabling

  @CustomerTab
  Scenario: Verify selected items copy button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox in customer
    Then Click on selected items copy button

  @CustomerTab
  Scenario: Verify selected items delete yes button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox in customer
    Then Click on selected items delete yes button

  @CustomerTab
  Scenario: Verify selected items delete no button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox in customer
    Then Click on selected items delete no button

  @CustomerTab
  Scenario: Verify record cancel functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox verify options are enabling
    Then Click on record cancel

  @CustomerTab
  Scenario: Verify selected item export functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox verify options are enabling
    Then Click on export excel
    And Click on customer checkbox verify options are enabling
    Then Click on export csv
    And Click on customer checkbox verify options are enabling
    Then Click on export pdf

  @CustomerTab
  Scenario: Verify selected items archive yes button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox
    Then Click on selected items archive yes button

  @CustomerTab
  Scenario: Verify selected items archive no button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox
    Then Click on selected items archive no button

  @CustomerTab
  Scenario: Verify selected items restore yes button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox
    Then Click on selected items restore yes button

  @CustomerTab
  Scenario: Verify selected items restore no button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox
    Then Click on selected items restore no button

  @CustomerTab 
  Scenario: Verify selected item cross button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox
    Then Click on selected item cross button

  @CustomerTab
  Scenario: Verify add customer arrow functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer arrow

  @CustomerTab 
  Scenario: Verify mousehover edit functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover edit

  @CustomerTab 
  Scenario: Verify mousehover delete yes button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover delete yes button

  @CustomerTab
  Scenario: Verify mousehover delete no button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover delete no button

  @CustomerTab 
  Scenario: Verify mousehover archive functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover archive

  @CustomerTab 
  Scenario: Verify mousehover archive yes button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover archive
    Then Click on mousehover archive yes button

  @CustomerTab 
  Scenario: Verify mousehover archive no button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover archive
    Then Click on mousehover archive no button

  @CustomerTab
  Scenario: Verify pagination functionality in customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Select pagination dropdown and Validate

  @CustomerTab 
  Scenario: Verify previous and next page functionality in customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on next page in customer
    Then Click on previous page in customer

  @CustomerTab
  Scenario: Verify Go to functionality in customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on goto in customer
