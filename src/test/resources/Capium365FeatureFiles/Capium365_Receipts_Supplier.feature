Feature: Verify Suppliers in Receipts tab

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client
    
@Suppliers
 Scenario: Validate KeyBoard ErrowRight
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   
@Suppliers 
Scenario: Validate Add Supplier MainGrid
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Validate Supplier Main grid Should Display
   
 @Suppliers 
Scenario: Validate Add Supplier Page
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Click on Add Supplier
   Then Validate Add New Supplier Page Should Display
   
   @Suppliers 
   Scenario: Validate Add New Supplier Page with Mandatory Details with save button
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Click on Add Supplier
   Then Enter All Mandatory Details
   Then Click on Save button
   
   @Suppliers 
   Scenario: Validate Add New Supplier Page with Mandatory Details with save and Exit button
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Click on Add Supplier
   Then Enter All Mandatory Details
   Then Click on Save and Exit button
    
   @Suppliers 
   Scenario: Validate CancelChanges button Add new Supplier button
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Click on Add Supplier
   Then Enter All Mandatory Details
   Then Click on Cancel Changes button
   Then Validate Filelds data is Earased or not
   
   @Suppliers 
   Scenario: Validate PaymentAccountDropdown In Add New Supplier Page
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Click on Add Supplier
   Then Enter All Mandatory Details
   Then Validate Payment Account dropdown
   Then Click on Save and Exit button
   
   @Suppliers 
   Scenario: Validate VAT Rate Dropdown Add New Supplier Page
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Click on Add Supplier
   Then Enter All Mandatory Details
   Then Validate VAT Rate Dropdown
   Then Click on Save and Exit button
   
   @Suppliers 
   Scenario: Validate Cross button in Add New Supplier Page
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Click on Add Supplier
   Then Click on Close button
   Then Validate Supplier Main grid Should Display
   
   @Suppliers 
   Scenario: Validate DateDropdown in Suppliers Main Grid
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then Validate date dropdown
   
   @Suppliers 
   Scenario: Validate Export Functionlity in the Main Grid
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRight
     Then Click on Suppliers Menu
     When Click on three dot
     Then Click on Export to Excel button
     When Click on three dot
     Then Click on Export to Csv button
     When Click on three dot
     Then Click on Export to Pdf button
     
   @Suppliers
   Scenario: Validate search bar
   When Click on Receipts Menu
   Then Click on KeyBoardErrorRight
   Then Click on Suppliers Menu
   Then SearchAndVerifydata
   
    @Suppliers 
    Scenario: Validate MousehoverEditIcon
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Mousehover and ClickonEditIcon supplier page
    Then Click on CrossButton in EditSupplierScreen
    Then Validate Supplier Main grid Should Display
    
    @Suppliers 
    Scenario: Validate MousehoverDeleteIcon
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Mousehover and ClickonDeleteIcon supplier page
    Then Click on Yes button
    Then Validate Delete Supplier SuccessMessage
    
    @Suppliers 
    Scenario: Validate MousehoverEditIcon with No button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Mousehover and ClickonDeleteIcon supplier page
    Then Click on No button
    Then Validate Supplier Main grid Should Display
    
    @Suppliers 
    Scenario: Validate Paginationdropdownandvaldate
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Valdiate Pagination dropdown and Verify
    
    @Suppliers 
    Scenario: Validate NextButton Supplier Menu
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Validate Next button
    
    @Suppliers 
    Scenario: Validate PreviousButton Supplier Menu
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Validate Next button
    Then Validate Previous button
    
    @Suppliers 
    Scenario: Validating Footer Cancel button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on IDCheckBox
    Then Click on Cancel button
    
    @Suppliers 
    Scenario: Validating Delete Option in Footer
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on IDCheckBox For Particular Supplier
    Then Click on Delete button
    Then Validate Confirm Delere popup Should Display
    
    @Suppliers 
    Scenario: Validating Delete Option in Footer with Yes button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on IDCheckBox For Particular Supplier
    Then Click on Delete button
    Then Click on Yes button
    @Suppliers 
    Scenario: Validating Export from Footer
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on IDCheckBox For Particular Supplier
    Then Click on Footer Excel button
    Then Click on Footer Csv button
    Then Click on Footer Pdf button
    
 
    @Suppliers 
    Scenario: Validating Search and Click on Edit Icon
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on Search bar and Click on Edit Icon
    @Suppliers
    Scenario: Validate History Tab in Edit Supplier Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on Suppliers ID
    Then Click on History Tab
    Then History should be Display
    @Suppliers 
    Scenario: Validate  CrossButton in Edit Supplier History Tab
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on Suppliers ID
    Then Click on History Tab
    Then Click on Close button In History Tab
    Then Validate Supplier Main grid Should Display
    @Suppliers  
    Scenario: Validate Payment Account Dropdown in Edit Supplier Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on Suppliers ID
    Then Validate Payment Account dropdown
    Then Click on Save and Exit button
    @Suppliers 
    Scenario: Validate VAT Rate Dropdown Edit Supplier Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRight
    Then Click on Suppliers Menu
    Then Click on Suppliers ID
    Then Validate VAT Rate Dropdown
    Then Click on Save and Exit button
    @Suppliers 
    Scenario: Validate Payment Account Dropdown in Edit Supplier Page
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRight
     Then Click on Suppliers Menu
     Then Click on Suppliers ID
     Then Validate Payment Account dropdown
     Then Click on Save button
    @Suppliers 
    Scenario: Validate VAT Rate Dropdown Edit Supplier Page
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRight
     Then Click on Suppliers Menu
     Then Click on Suppliers ID
     Then Validate VAT Rate Dropdown
     Then Click on Save button
     @Suppliers 
     Scenario: Validate Edit Supplier with Supplier Name with save and Exit button
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRight
     Then Click on Suppliers Menu
     Then Click on Suppliers ID
     Then Enter All Mandatory Details
     Then Click on Save and Exit button
   
      @Suppliers 
    Scenario: Validate Edit Supplier with Supplier Name with save button
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRight
     Then Click on Suppliers Menu
     Then Click on Suppliers ID
     Then Enter All Mandatory Details
     Then Click on Save button
      @Suppliers 
     Scenario: Validate Cancel Changes button in Edit Supplier Page
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRight
     Then Click on Suppliers Menu
     Then Click on Suppliers ID
     Then Enter All Mandatory Details
     Then Click on Cancel Changes button
      @Suppliers 
     Scenario: Validate GotoPage inSupplier Screen
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRight
     Then Click on Suppliers Menu
     #Then Validate Goto Page