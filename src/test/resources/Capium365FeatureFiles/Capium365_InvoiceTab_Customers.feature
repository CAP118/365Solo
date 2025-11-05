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
    Then Search and edit customer
    Then Fill the non mandatory details in add customer and save and exit
    Then Click on cancel changes
 
  @CustomerTab
  Scenario: Verify contact details new line functionality
    Given Click on invoices
    When Click on arrow button
    And Click on customers
    Then Search and edit customer
    Then Click on contact details new line
    
  @CustomerTab
  Scenario: Verify address details new line functionality
    Given Click on invoices
    When Click on arrow button
    And Click on customers
    Then Search and edit customer
    Then Click on address details new line
    Then Click on cross button
    
  @CustomerTab
  Scenario: Verify search and add button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on search button in add new customer
    
  @CustomerTab
  Scenario: Verify add button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on customer add button
 
  @CustomerTab
  Scenario: Verify customer checkbox functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    And Click the checkbox and verify options are enabling
 
  @CustomerTab
  Scenario: Verify copy and delete button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on copy button in add new customer
    Then Click on delete yes button in add new customer
    Then Click on delete no button in add new customer
 
  @CustomerTab
  Scenario: Verify export functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on export in add new customer
    
  @CustomerTab
  Scenario: Verify archive and cross button functionality in add new customer
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer button
    Then Click on archive yes button in add new customer
    Then Click on archive no button in add new customer
    Then Click on cross button in add new customer
 
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
  Scenario: Verify export functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on actions and export
 
  @CustomerTab
  Scenario: Verify customer checkbox and restore functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    And Click on customer checkbox verify options are enabling
    Then Click on record cancel
    Then Click on selected items restore yes button
    Then Click on selected items restore no button
 
  @CustomerTab
  Scenario: Verify selected items copy and delete button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on selected items copy button
    Then Click on selected items delete yes button
    Then Click on selected items delete no button
 
  @CustomerTab
  Scenario: Verify selected item export functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on selected item export
    
  @CustomerTab
  Scenario: Verify selected item archive and cross button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on selected items archive yes button
    Then Click on selected items archive no button
    Then Click on selected item cross button
 
  @CustomerTab
  Scenario: Verify add customer arrow and mousehover edit functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on add customer arrow
    Then Click on mousehover edit
 
  @CustomerTab
  Scenario: Verify mousehover delete button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover delete yes button
    Then Click on mousehover delete no button
 
  @CustomerTab
  Scenario: Verify mousehover archive button functionality
    Given Click on invoices
    When Click on arrow button
    When Click on customers
    Then Click on mousehover archive yes button
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