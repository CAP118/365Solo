Feature: Estimates functionality verification

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  @Estimates
  Scenario: verify Estimate page
    Given Click on invoice and side bar and estimate option and verify

  @Estimates
  Scenario: verify ADD Estimate page
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify

  @Estimates
  Scenario: verify edit company details with and without
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And click on edit company details without giving mandatory details
    And click on edit company details with giving mandatory details

  @Estimates
  Scenario: verify ADD customer functionality
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And Click on add customer and verify the functionality

  @Estimates
  Scenario: verify existing customer functionality
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And select existing customer and verify details

  @Estimates
  Scenario: verify selecting existing item functionality
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And select existing customer and verify details
    And select existing item and verify details
    And select another item and verify details

  @Estimates
  Scenario: verify save and new estimate functionality
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And select existing customer and verify details
    And select existing item and verify details
    And click on save and new and verify estimate record in inside search

  @Estimates
  Scenario: verify save and continue estimate functionality
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And select existing customer and verify details
    And select existing item and verify details
    And click on save and contiinue and verify estimate record in inside search

  @Estimates
  Scenario: verify save and exit functionality
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And select existing customer and verify details
    And select existing item and verify details
    And click on save and exit and verify estimate record in out search

  @Estimates
  Scenario: verify cancel changes functionality
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And select existing customer and verify details
    And select existing item and verify details
    And click on cancel changes and take screenshot

  @Estimates
  Scenario: verify search functionality inside add estimate
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And click on search bar pass estimate value and verify

  @Estimates
  Scenario: verify export as excel inside add estimate
    Given Click on invoice and side bar and estimate option and verify
    Then click on add estimates and verify
    And click on estimate record and verify export as excel
    And click on estimate record and verify export as pdf
    And click on estimate record and verify export as csv
    And click on estimate record and verify export as print

  @Estimates
  Scenario: verify search in main dashboard of estimate
    Given Click on invoice and side bar and estimate option and verify
    Then click on search and verify estimate record

  @Estimates
  Scenario: verify all status dropdown in estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    Then click on all satus dropdown and verify each status

  @Estimates
  Scenario: verify all time dropdown in estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    Then click on all time dropdown and verify each status

  @Estimates 
  Scenario: verify export as excel in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify export as excel main estimate dashboard
    And verify export as pdf main estimate dashboard
    And verify export as csv main estimate dashboard

  @Estimates
  Scenario: verify edit mouseaction in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify edit mouseaction main estimate dashboard

  @Estimates
  Scenario: verify preview in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify preview in main estimate dashboard

  @Estimates
  Scenario: verify send in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify send in main estimate dashboard

  @Estimates
  Scenario: verify markassent in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify markassent in main estimate dashboard

  @Estimates
  Scenario: verify markasdeciplaine in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify markasdeciplaine in main estimate dashboard

  @Estimates
  Scenario: verify markasaccepted in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify markasaccepted in main estimate dashboard

  @Estimates
  Scenario: verify duplicate in main estimate dashboard
    Given Click on invoice and side bar and estimate option and verify
    And verify duplicate in main estimate dashboard
