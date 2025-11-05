Feature: Validate users tab

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  @UserTab 
  Scenario: Validate users tab
    Given Click on users tab and verify

  @UserTab
  Scenario: Validate add user button with mandatory fields
    Given Click on users tab
    And click on add user button
    Then go with the following steps to add the user

  @UserTab
  Scenario: Validate add user button with unmandatory fields
    Given Click on users tab
    And click on add user button
    Then go with the following steps with unmandatory fields to add the user

  @UserTab
  Scenario: Validate search bar
    Given Click on users tab
    Then Click on search bar and enter data and verify

  @UserTab
  Scenario: Validate status dropdown
    Given Click on users tab
    And Click on all options in status dropdown and verify

  @UserTab 
  Scenario: Validate Export to excel
    Given Click on users tab
    And Click on kebab menu
    Then click on export to excel user
    And Click on kebab menu
    Then click on export to csv user
    And Click on kebab menu
    Then click on export to pdf user
    
  @UserTab
  Scenario: Validate Ckeck box
    Given Click on users tab
    And click on checkbox in top row

  @UserTab
  Scenario: Validate edit icon in the row
    Given Click on users tab
    Then click on edit icon and verify

  @UserTab 
  Scenario: Validate the edit user page
    Given Click on users tab
    And click on user id
    Then Edit the details and save

  @UserTab
  Scenario: Validate the excel export by clicking the check box
    Given Click on users tab
    And click on checkbox in top row
    Then click on excel option on the down
    Then click on csv option on the down
    Then click on pdf option on the down

 
    
