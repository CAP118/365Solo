Feature: Products functionality verification
 
Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

@Products  
Scenario: verify products screen
    Given Click on invoice and side bar
    Then click on products and verify products page

@Products  
Scenario: verify add products screen
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on add product and verify page

@Products 
Scenario: verify save button before giving man.details
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on add product and verify page
    Then verify save button is displaying or not before entering man.details

@Products 
Scenario: verify save for product
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on add product and verify page
    Then enter mandatory details and save and verify

@Products
Scenario: verify save&exit for product
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on add product and verify page
    Then enter mandatory details and save exit and verify

@Products 
Scenario: verify cancel changes for product
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on add product and verify page
    Then enter mandatory details and save&cancel and verify

@Products 
Scenario: verify pus button for add product
    Given Click on invoice and side bar
    Then click on products and verify products page
    Then click on plus button and verify page

@Products 
Scenario: verify search inside the add product
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on add product and verify page
    Then click on search enter product name and verify

@Products 
Scenario: verify search in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And enter product name and verify

@Products 
Scenario: verify allstatus dropdown in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on dropdown and verify status

@Products 
Scenario: verify alltime status dropdown in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on dropdown and verify alltime status

@Products 
Scenario: verify export reports as excel in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on excel and download

@Products 
Scenario: verify export reports as csv in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on csv and download

@Products  
Scenario: verify export reports as pdf in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And click on pdf and download

@Products  
Scenario: verify edit mouseover in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And verify edit mouseover for particular product

@Products 
Scenario: verify delete mouseover in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And verify delete mouseover for particular product

@Products 
Scenario: verify archive mouseover in main products dashboard
    Given Click on invoice and side bar
    Then click on products and verify products page
    And verify archive mouseover for particular product
