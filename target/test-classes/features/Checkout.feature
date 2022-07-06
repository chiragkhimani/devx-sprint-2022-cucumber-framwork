Feature: This feature allows user to enter checkout details

  @smoke
  Scenario: User can see shipping address section on checkout page
    Given user open website
    When user login with valid credentials
    Then verify user is on homepage
    When user search with TV
    Then verify list of search results are displayed
    When user click on first result
    Then verify product details page is displayed
    When user click on add to cart button
    Then verify product added into the cart
    And click on cart icon
    Then verify cart page is displayed
    When user click on checkout button
    Then verify checkout page is displayed
    And verify shipping address section is displayed