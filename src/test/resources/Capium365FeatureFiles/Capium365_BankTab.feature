Feature: Validate bank tab

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  @BankTab 
  Scenario: Validate bank tab
    Given Click on bank tab
    Then Verify bank tab

  @BankTab
  Scenario: Validate bank accounts tab
    Given Click on bank tab
    And Click on expand icon
    Then Validate bank accounts

  @BankTab 
  Scenario: Validate add new account
    Given Click on bank tab
    And Click on add new account
    Then Continue with the following steps

  @BankTab
  Scenario: Validate search bar
    Given Click on bank tab
    Then Enter text in the search text field and Verify data

  @BankTab
  Scenario: Validate date dropdown
    Given Click on bank tab
    And Click on date dropdown

  @BankTab
  Scenario: Validate Export to excel
    Given Click on bank tab
    And Click on three dot menu
    Then click on export to excel
    And Click on three dot menu
    Then click on export to pdf
    And Click on three dot menu
    Then click on export to csv

  @BankTab
  Scenario: Validate pagination
    Given Click on bank tab
    And Click on pagination dropdown and verify the records based on dropdown value

  @BankTab
  Scenario: Validate page numbers
    Given Click on bank tab
    Then Click on each page number

  @BankTab
  Scenario: Validate previous arrow
    Given Click on bank tab
    Then verify previous button is disabled whenever the first page number is highlighted

  @BankTab
  Scenario: Validate next arrow
    Given Click on bank tab
    Then verify next button is disabled whenever the last page number is highlighted

  @BankTab
  Scenario: Validate goto page
    Given Click on bank tab
    And click on goto TF and change the page

  @BankTab
  Scenario: Validate bank accounts from business tab
    Given go to settings and click on business
    Then Compare the bank accounts in bank tab and business tab

  @BankTab
  Scenario: Verify headers in bank tab
    Given Click on bank tab
    Then verify headers

  @BankTab
  Scenario: Verify refresh account
    Given Click on bank tab
    And click on refresh account

  @BankTab
  Scenario: Validate export excel option in the down
    Given Click on bank tab
    Then Click on check box for id and export to excel
    Then Click on check box for id and export to pdf
    Then Click on check box for id and export to csv

  @BankTab
  Scenario: Verify cross mark on down right side after clicking on ID check box
    Given Click on bank tab
    Then Click on check box and click on cross mark

  @BankTab
  Scenario: Verify search bar in expand arrow
    Given Click on bank tab
    And Click on expand icon
    Then enter text in search text field and verify
    Then Click on cross mark in search text field and verify the data is cleared

  @BankTab
  Scenario: Validate delete bank account
    Given Click on bank tab
    And Click on expand icon
    And Delete account
