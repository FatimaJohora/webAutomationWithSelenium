Feature: This is the DemoCamp Cart feature file

 @Cart 
  Scenario: Verify after adding the item, items display on the Cart page
    Given Launch the application<"URL">
    When Click on an item
    When Click on add to Cart button
    When Click on the Cart link
    Then Verify after adding the item, items displayed on the Cart page

  @Cart
  Scenario: Verify the user can able to purchase
    Given Launch the application<"URL">
    When Click on an item
    When Click on add to Cart button
    When Click on the Cart link
    When Click on the place order button
    When Fill up the place order form
    When Click on the purchase button
    Then Verify the purchase message
