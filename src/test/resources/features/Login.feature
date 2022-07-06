Feature: This feature allows user to do login into the app
  Author - Chirag
  Reviewer - Anatolie

  @smoke @chirag
  Scenario: Verify user can able to login with valid credential
    Given user open website
    When user login with valid credentials
    Then verify user is on homepage

  @regression
   Scenario: Verify user cannot login with invalid credentials
     Given user open website
     When user login with invalid credentials
     Then verify invalid login error message


