Feature: Validating Purchase Invoice under Receipts tab

  Background: Login into Capium Application
    Given Launch the browser
    And User need to enter the Application Url
    And Click on Capium365 Client login
    When User Enter username
    Then User Click on next button
    And User enter OTP
    And Click on verify account
    And Redirect to365 client

  @PurchaseInvoice
  Scenario: Verify PurchaseInvoice MainGrid
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    Then Verify UploadReceiptsSuppliername should Display in the grid

  @PurchaseInvoice
  Scenario: Validate Duplicate buttom in the main Grid
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    Then Valdiate DuplicateLogo in the Main Grid

  @PurchaseInvoice
  Scenario: Valdidate Duplicate popup
    When Click on Receipts Menu
   And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    
    Then Click on uploadPurchaseInvoice2Buttton
    Then Click on Duplicate Logo in purchases
    Then Validate Process Duplicate Upload Should Display

  @PurchaseInvoice
  Scenario: Validate Process Duplicate Upload popup with Yes button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    Then Click on Duplicate Logo in purchases
    Then Click on yes button process Duplicate upload

  @PurchaseInvoice
  Scenario: Validate Process Duplicate Upload popup with No button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    When Click on Upload PurchaseInvoice button
    Then Click on Choose File button
    Then Click on uploadPurchaseInvoice2Buttton
    Then Click on Duplicate Logo in purchases
    Then Click on No button process upload Duplicate
    Then Validate ProcessDuplicate upload po-pup Should Not Display

  @PurchaseInvoice
  Scenario: Validate search bar
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    And Click on search bar and enter data and Verify

  @PurchaseInvoice
  Scenario: Validate Date Dropdown
    When Click on Receipts Menu
   And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Verify AllDropdown

  @PurchaseInvoice
  Scenario: Validate Export to Excel Functionlity
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    When Click on three dot
    Then Click on Export to Excel button
    When Click on three dot
    Then Click on Export to Csv button
    When Click on three dot
    Then Click on Export to Pdf button

  @PurchaseInvoice
  Scenario: Validate NoofSuppliers
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then validateno of suppliers
    Then Validate no of purchaseInvoices
    Then Validate no of Total Amount

  @PurchaseInvoice
  Scenario: Validate MousehoverEditIcon
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on CrossButton in EditPurchaseInvoiceScreen and PurchaseInvoice Maingrid Should Display

  @PurchaseInvoice
  Scenario: Validate Confirm Delete button in Purchase Invoice
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonDeleteIcon
    Then Select CheckBox
    Then Click on yes button

  @PurchaseInvoice
  Scenario: Validate Confirm Archive button in PurchaseInvoice
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and Click on Archive Icon
    Then Click on Confirm Archive Popup Yes button

  @PurchaseInvoice
  Scenario: Validate Mousehover Three dot in purchaseInvoice
    When Click on Receipts Menu
   And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and Click on Threedot
    Then Click on Preview button
    Then Click on Close button
    Then Mousehover and Click on Threedot
    Then Click on History button
    Then Click on Close button

  @PurchaseInvoice
  Scenario: Validate Pagination
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Select pagination dropdown in Purchase tab and Validate

  @PurchaseInvoice
  Scenario: Validate File Icon
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on File Icon
    Then Click on Close button

  @PurchaseInvoice
  Scenario: Validate File Icon Donwload Logo
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on File Icon
    Then Click on File Donwload Icon
    Then Click on Close button

  @PurchaseInvoice
  Scenario: Validate File without Change any data and Save
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on File Icon
    Then Click on Save button

  @PurchaseInvoice
  Scenario: Valdiate Footer Options
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on CheckBox
    Then Validate Footer Options Should Display

  @PurchaseInvoice
  Scenario: Valdiate Edit Purchase Invoice Page Through ID
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Purchase invoice Id
    Then Validate Edit Purhase Invoice Should Display

  @PurchaseInvoice
  Scenario: Valdiate Discount type Edit Purchase Invoice Page
    When Click on Receipts Menu
   And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Purchase invoice Id
    Then Select Discount type dropdown
    Then Click in Currency Dropdown
    Then Click on Save and Exit button

  @PurchaseInvoice
  Scenario: Validate Currency dropdown EditPurchaseInvoice Page using save button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Purchase invoice Id
    Then Click in Currency Dropdown

  @PurchaseInvoice
  Scenario: Validate settings icon in Edit purchase Invoices page
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click in settings Icon
    Then Validate Settings popup should Display

  @PurchaseInvoice
  Scenario: Validate Add Suplier EditPurchaseInvoicePage
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Add Supplier button
    Then Enter Supplier Name
    Then CLick on Save button

  @PurchaseInvoice
  Scenario: Validate Add Suplier EditPurchaseInvoicePage cancel changes
    When Click on Receipts Menu
   And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Add Supplier button
    Then Enter Supplier Name
    Then Click on Cancel Changes button

  @PurchaseInvoice
  Scenario: Validate Back to Purchase Invoice Link
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Add Supplier button
    Then Click on Back to Purchase Invoice Link
    Then Validate Edit Edit Purchase Invoice Page Should Display

  @PurchaseInvoice
  Scenario: Validate Cross button in Add new Supplier in Edit Purchase Invoice Screen
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Add Supplier button
    Then Click on Close button
    Then Validate Supplier Main grid Should Display

  @PurchaseInvoice
  Scenario: Validate Edit Supplier button in Edit Purchase Invoice Page
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Edit Icon
    Then Edit Supplier Page Should Display

  @PurchaseInvoice
  Scenario: Validate Close Supplier button in Edit Purchase Invoice Page
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Edit Icon
    Then Click on Close button
    Then Validate Supplier Main grid Should Display

  @PurchaseInvoice
  Scenario: Validate Back to Purchase Invoices link Edit Supplier Page
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Edit Icon
    Then Click on Back to Purchase Invoice Link
    Then Validate Edit Edit Purchase Invoice Page Should Display

  @PurchaseInvoice
  Scenario: Validate History button in Edit Supplier Page
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Edit Icon
    Then Click on History Tab
    Then Validate History Page Should Display

  @PurchaseInvoice
  Scenario: Validate HisroryTab Close button in Edit supplier Page
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Edit Icon
    Then Click on History Tab
    Then Click on Close button
    Then Validate Supplier Main grid Should Display

  @PurchaseInvoice
  Scenario: Validate Add AnotherItem without product and Sercice Name in Edit Purchase Invoices
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Mousehover and ClickonEditIcon
    Then Click on Add another Item
    Then Enter All the Details
    Then Click on Save and Exit button

  @PurchaseInvoice
  Scenario: Validate Statusdropdown and Verify Column
    When Click on Receipts Menu
   And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Status dropdown and verify

  @PurchaseInvoice
  Scenario: Validate Footer Cancel button
    When Click on Receipts Menu
   And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Footer Cancel Link Should Display
    Then Click on Cancel Link
    Then Checkbox sould Unchecked

  @PurchaseInvoice
  Scenario: Validate BukEdit in Footer Options
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Bulk Edit
    Then Validate Bulk Edit popup Should Display

  @PurchaseInvoice
  Scenario: Validate Supplier dropdown bulkEdit popup with save Button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Bulk Edit
    Then Validate Supplier Dropdown
    Then Click on Save1 Button
    Then Validate Supplier should Display in the Grid

  @PurchaseInvoice
  Scenario: Validate VAT Rate Dropdown bulkEdit popup with Save button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Bulk Edit
    Then Clik on VAT Rate Dropdown
    Then Click on Save1 Button

  @PurchaseInvoice
  Scenario: Validate CrossButton in Bulk Edit popup
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Bulk Edit
    Then Click on Close Button in BulkEditPopup
    Then Validate Purchase Invoice main grid should Display

  @PurchaseInvoice
  Scenario: Validate Footer Delete button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Footer Delete Button
    Then ConfirmDelete Popup Should Display

  @PurchaseInvoice
  Scenario: Validate Confirm Delete Popup
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Footer Delete Button
    Then Select CheckBox
    Then Click on yes button
    Then Validate Purchase Invoice main grid should Display

  @PurchaseInvoice
  Scenario: Validate Confirm Delete No button in Popup
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Footer Delete Button
    Then Click on No Button
    Then Confirm delete popup Should not Display

  @PurchaseInvoice
  Scenario: Validate Footer Excel button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Excel buttton
    Then Click on CSV buttton
    Then Click on PDF buttton

  @PurchaseInvoice
  Scenario: Validate Archive button in Footer
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Archive  button footer
    Then Valdiate Archive popup Should Display

  @PurchaseInvoice
  Scenario: Validate CofirmaArchiveButton with yes button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Archive  button footer
    Then Valdiate Archive popup Should Display
    Then Click on yes button
    Then Validate Record should Display as Archived

  @PurchaseInvoice
  Scenario: Validate Restore button in Footer
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Restore  button footer
    Then Valdiate Restore popup Should Display

  @PurchaseInvoice
  Scenario: Validate Restore button in Footer with Yes button
    When Click on Receipts Menu
    And Validate Side menu bar
    When Click on PurchaseInvoieInsideSidebar
    Then Click on Particular Check box
    Then Click on Restore  button footer
    Then Click on yes button
    Then Status Should Display as ToReview

  
