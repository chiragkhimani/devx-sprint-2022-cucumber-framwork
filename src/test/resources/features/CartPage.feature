Feature: Cart Page Scenarios

  Background:
    Given user open website
    When user login with valid credentials
    Then verify user is on homepage
    When user search with TV
    Then verify list of search results are displayed
    When user click on first result
    Then verify product details page is displayed
    When user click on add to cart button
    Then verify product added into the cart

  Scenario: Verify Items on Cart Page
    And verify item details on cart page

  Scenario: Verify User Can Remove Items from Cart
    When user click on remove button
    Then verify cart is empty

  Scenario: Verify User Can Change Quantity Of Item
    When user increase quantity of item to 5
    Then verify total price is updated with the quantity

  Scenario: Verify User Can Add More than One Item to the Cart
    When user click on continue shopping button
    Then verify user is on homepage
    When user search with Laptop
    Then verify list of search results are displayed
    When user click on first result
    Then verify product details page is displayed
    When user click on add to cart button
    Then verify cart page has more than one item in cart