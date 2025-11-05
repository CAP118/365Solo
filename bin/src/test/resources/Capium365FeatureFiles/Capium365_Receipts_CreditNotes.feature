Feature: Capium365 Receipts under Credit Notes

Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client
    @CreditNotes_Receipts 
    Scenario: Validate CreditNotes Main Grid
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRightt
     And Click on CreditNotes Menu
     Then verify CreditNotes Main Grid Should Display  
    @CreditNotes_Receipts  
    Scenario: Validate No of Suppliers in CreditNotes
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then validate No of suppliers
    Then validate No of CrediNotes
    Then validate No of TotalAmounts
     @CreditNotes_Receipts  
    Scenario: Validate search bar
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Search and Verify CreditNote
    @CreditNotes_Receipts  
    Scenario: Verify All Status Dropdown
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Click on Status Dropdown and Verify Each Status
     @CreditNotes_Receipts  
    Scenario: Verify Date Dropdown
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Click on Status Dropdown and Verify Each Status
     @CreditNotes_Receipts  
    Scenario: Validate Export to Excel
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Click on Threedot
    Then Click on Export To excel in Creditnote
     Then Click on Threedot
    Then Click on Export To CSV in CreditNote
     Then Click on Threedot
    Then Click on Export To PDF in CreditNote
 @CreditNotes_Receipts 
    Scenario: Validate Mousehover EditIcon
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and ClickonEditIconn
    Then Click on CrossButton in EditPurchaseCreditNoteScreen
    Then Validate Purchase CreditNote Main Grid Should Display
    Then verify CreditNotes Main Grid Should Display  
    @CreditNotes_Receipts  
    Scenario: Validate Confirm Delete button in CreditNote
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and ClickonDeleteIconn
    Then Select CheckBoxx
    Then Click on yes buttonn
     @CreditNotes_Receipts
    Scenario: Validate Confirm Delete button in CreditNote
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and ClickonDeleteIconn
    Then Select CheckBoxx
    Then Click on No buttonn
    Then verify CreditNotes Main Grid Should Display  
     @CreditNotes_Receipts 
    Scenario: Validate Confirm Archive button in CreditNote
   When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and Clickon Archive Iconn
    Then Click on yes buttonn
    Then verify Status should Display as Archived
    @CreditNotes_Receipts  
    Scenario: Validate Confirm Restore button in CreditNote
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and Clickon Restore Iconn
    Then Click on yes buttonn
    Then verify Status should Display as ToReview    
    @CreditNotes_Receipts 
    Scenario: Validate Three dot in CreditNote MainGrid
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and Click on ThreeDot
    Then Click on Preview buttonn
    Then Validare Preview Purchase CteditNotes Page Should Display
    @CreditNotes_Receipts
    Scenario: Validate Three dot in CreditNote MainGrid History Button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and Click on ThreeDot
    Then Click on History buttonn
    Then Validare History popup Should Display
      @CreditNotes_Receipts  
    Scenario: Validate History popup Closed button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and Click on ThreeDot
    Then Click on History buttonn
    Then Click on HistoryClose button
    Then verify CreditNotes Main Grid Should Display
    @CreditNotes_Receipts
    Scenario: Validate File Icon In CreditNote Main Grid
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Click on File Icon CreditNote MainGrid
    Then Validate File Icon Should Display
     @CreditNotes_Receipts  
    Scenario: Valiate Edit CreditNote Page
   When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    And Click on Recript ID
    Then Valdate Edit Purchase CrditNOte Page Should Display
     @CreditNotes_Receipts 
    Scenario: Validate Suplier Dropdown in Edit Purchase CreditNote Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    And Click on Recript ID
    Then Validate Supplier Dropdown and Select Supplier
    Then Click on Save and Exit button in Edit Purchase CreditNote
    Then Calidate Supplier Name In the MainGrid
    @CreditNotes_Receipts 
    Scenario: Validate SettingsIcon in Edit Purchase CreditNote Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    And Click on Recript ID
    Then Click on Settings Icon
    Then Settings popup Should Display
     @CreditNotes_Receipts 
    Scenario: Validate VATRate Dropdown in Settings popup
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    And Click on Recript ID
    Then Click on Settings Icon
    Then Click on VATRateDropDown
    Then Verify VAT Rate in products details
    @CreditNotes_Receipts 
    Scenario: Validate plus Icon Edit Purchase CreditNote Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    And Click on Recript ID
    Then Click on Supplier button
    Then Add New Supplier Page Should Display
     @CreditNotes_Receipts  
    Scenario: Validate plus Icon Edit Purchase CreditNote Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and ClickonEditIconn
    Then Click on Supplier button
    Then Enter Supplier Namee
    Then Click on Save buttonn
    Then Edit Supplier Page Should Displayy
    @CreditNotes_Receipts  
    Scenario: Validate EditSupplier button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Mousehover and ClickonEditIconn
    Then Click on EditSupplierIcon
    Then Edit Supplier Page Should Displayed
    @CreditNotes_Receipts  
    Scenario: Verify UploadCreditNotes button MainGrid
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    Then Validate uploadCrdditOteSuppliername should Display in the grid
     @CreditNotes_Receipts
    Scenario: Validate Duplicate buttom in the main Grid
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    Then Valdiate DuplicateLogo in the CreditNote Main Grid
    Then Valdiate ID should Deasable
    @CreditNotes_Receipts  
    Scenario: Valdidate Duplicate popup
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    Then Click on Duplicate Logoo
    Then Validate Process Duplicate Upload Should Displayy
     @CreditNotes_Receipts  
    Scenario: Validate Process Duplicate Upload popup with Yes button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    Then Click on Duplicate Logoo
    Then Click on yes button process Duplicate uploadd
     @CreditNotes_Receipts  
    Scenario: Validate Process Duplicate Upload popup with No button
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on uploadCreditNotes2Buttton
    Then Click on Duplicate Logoo
    Then Click on No button process Duplicate upload
    Then Validate ProcessDuplicate upload popup Should Not Display
    
    @CreditNotes_Receipts  
    Scenario: Validate cancel button in Upload CreditNotes Page
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    When Click on Upload CreditNotes button
    Then Click on Choose File button for CreditNotes
    Then Click on Cancel Button
    Then Verify ChooseFile Page Should Display
    
     @CreditNotes_Receipts 
    Scenario: Validate NextButton Purchase CreditNote Menu
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Validate Next button
     @CreditNotes_Receipts 
    Scenario: Validate PreviousButton Purchase CreditNote Menu
    When Click on Receipts Menu
    Then Click on KeyBoardErrorRightt
    And Click on CreditNotes Menu
    Then Validate Next button
    Then Validate Previous button
    
    @CreditNotes_Receipts
    Scenario: Validate GotoPage Purchase CreditNote Screen
     When Click on Receipts Menu
     Then Click on KeyBoardErrorRightt
     And Click on CreditNotes Menu
     Then Validate Goto Page
    @CreditNotes_Receipts 
    Scenario: Validating Export from Footer
    When Click on Receipts Menu
     Then Click on KeyBoardErrorRightt
     And Click on CreditNotes Menu
    Then Click on IDCheckBox For Particular CreditNote
    Then Click on Footer Excel button
    Then Click on Footer Csv button
    Then Click on Footer Pdf button
    Then Click on Footer Cross button