Feature: This feature allows user to do login into the app
  Author - Chirag
  Reviewer - Anatolie

  Background:
    Given user open website

  @smoke @chirag
  Scenario Outline: Verify user can able to login with valid credential
    When user login with username "<username>" and password "<password>"
    Then verify user is on homepage

    Examples:
      | username | password |
      | admin    | admin123 |
      | chirag   | admin123 |
      | becky    | becky123 |
      | vlad     | vlad123  |
      | sweta    | sweta123 |


  @regression
  Scenario Outline: Verify user cannot login with invalid credentials
    When user login with username "<username>" and password "<password>"
    Then verify invalid login error message

    Examples:
      | username | password |
      | admin    | adm123   |
      | invalid  | admin123 |
      |          | becky123 |
      | vlad     |          |
      |          |          |
