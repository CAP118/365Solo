Feature: Verify InvoicesCredit Notes tab

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  @CreditNotes_Invoice
  Scenario: verify invoice credit note screen ICN
    Given Click on invoice credit note and verify page ICN

  @CreditNotes_Invoice
  Scenario: verify nunber of customers ICN
    Given Click on invoice credit note and verify page ICN
    Then get customers count and validate ICN

  @CreditNotes_Invoice
  Scenario: verify number of invoices ICN
    Given Click on invoice credit note and verify page ICN
    Then get invoice count and validate ICN

  @CreditNotes_Invoice 
  Scenario: verify Total raised recieved due ICN
    Given Click on invoice credit note and verify page ICN
    Then Verify total raised count ICN

  @CreditNotes_Invoice
  Scenario: verify add invoice credit note sreen ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN

  @CreditNotes_Invoice
  Scenario: verify edit company details without giving man.details ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And Click on edit company details without giving man.details and verify ICN

  @CreditNotes_Invoice 
  Scenario: verify edit company details with giving man.details ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And Click on edit company details with giving man.details and verify ICN

  @CreditNotes_Invoice
  Scenario: verify add customer ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And click on add customer and verify page ICN
    And Fill the mandatory details and save ICN

  @CreditNotes_Invoice
  Scenario: verify add customer with add row ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And click on add customer and verify page ICN
    And Fill the mandatory details and click add row and save ICN

  @CreditNotes_Invoice
  Scenario: verify search and select customer ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And select the customer and verify details ICN

  @CreditNotes_Invoice 
  Scenario: verify settings option of customer ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And select the customer and verify details ICN
    And click on settings and save and verify ICN

  @CreditNotes_Invoice
  Scenario: due date and verify in invoices ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And select the customer and verify details ICN
    And select due date and verify in invoices ICN

  @CreditNotes_Invoice
  Scenario: add item and verify ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And select the customer and verify details ICN
    And add item and verify ICN

  @CreditNotes_Invoice
  Scenario: add new invoice plus button and verify ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And click on add new invoice plus button and verify ICN

  @CreditNotes_Invoice
  Scenario: checkbox verification ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And check the checkbox and verify options are enabling ICN

  @CreditNotes_Invoice
  Scenario: export to excel ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And check the checkbox and verify options are enabling ICN
    And verify export to excel ICN
    And verify export to csv ICN
    And verify export to pdf ICN

  @CreditNotes_Invoice
  Scenario: search invoice and verify in invoice dashboard ICN
    Given Click on invoice credit note and verify page ICN
    Then enter invoice name and verify ICN

  @CreditNotes_Invoice
  Scenario: verify all status in invoice dashboard ICN
    Given Click on invoice credit note and verify page ICN
    Then click on all status and verify ICN

  @CreditNotes_Invoice
  Scenario: verify all time invoice dashboard ICN
    Given Click on invoice credit note and verify page ICN
    Then click on all time status and verify ICN

  @CreditNotes_Invoice
  Scenario: verify check box for invoice ICN
    Given Click on invoice credit note and verify page ICN
    Then click on invoice check box and verify enabling options ICN

  @CreditNotes_Invoice
  Scenario: export excel for invoice main dashboard ICN
    Given Click on invoice credit note and verify page ICN
    Then click on invoice check box and verify enabling options ICN
    And click on export report as excel ICN
    And click on export report as pdf ICN
    And click on export report as csv ICN

  @CreditNotes_Invoice
  Scenario: verify pagenation ICN
    Given Click on invoice credit note and verify page ICN
    Then click and select page number ICN

  @CreditNotes_Invoice
  Scenario: verify previous button ICN
    Given Click on invoice credit note and verify page ICN
    Then click and verify previous button ICN

  @CreditNotes_Invoice
  Scenario: verify next button ICN
    Given Click on invoice credit note and verify page ICN
    Then click and verify next button ICN

  @CreditNotes_Invoice
  Scenario: Verify export to excel in kebab ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on kebeb menu ICN
    And Click on export to excel ICN
    Then Click on kebeb menu ICN
    And Click on export to pdf ICN
    Then Click on kebeb menu ICN
    And Click on export to csv ICN

  @CreditNotes_Invoice
  Scenario: Verify enbling options in edit credit note page ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on add invoice credit note and verify page ICN
    And check the checkbox and verify options are enabling ICN

  @CreditNotes_Invoice
  Scenario: Verify the preview in kebab menu ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on preview in kebab ICN

  @CreditNotes_Invoice
  Scenario: Verify the sent in kebab menu ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on sent in kebab ICN

  @CreditNotes_Invoice
  Scenario: Verify the duplicate in kebab menu ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on duplicate in kebab ICN

  @CreditNotes_Invoice
  Scenario: Verify the History in kebab menu ICN
    Given Click on invoice credit note and verify page ICN
    Then Click on history in kebab ICN

  @CreditNotes_Invoice
  Scenario: Verify UploadCreditNotes button MainGrid ICN
    Given Click on invoice credit note and verify page ICN
    When Upload the credit note ICN
    Then Validate uploadCreditnotecustomername should Display in the grid ICN

  @CreditNotes_Invoice
  Scenario: Verify go to text field ICN
    Given Click on invoice credit note and verify page ICN
    Then click on goto textfiled and verify ICN

  @CreditNotes_Invoice
  Scenario: Validate pagination dropdown in ICN ICN
    Given Click on invoice credit note and verify page ICN
    Then verify the records according to dropdown ICN
