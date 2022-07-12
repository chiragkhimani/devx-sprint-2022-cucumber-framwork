Feature: This file contains scenario for passing data from feature file

  Scenario: Login and Logout
    Given user open website
    When user login with username "admin" and password "admin123"

  @wip
  Scenario: Validating data tables
    Given user open website
    When user eat one packet of Biscuit
      | Job Title         |
      | Employment Status |
      | Pay Grades        |
      | Job Categories    |
      | WorkShifts        |
    When user eats collections of Biscuit
      | Job Title         | Falguni | Falguni@gmail.com | 243  |
      | Employment Status | Chirag  | test@gmail.com    | 100  |
      | Pay Grades        | Sana    | Sana@gmail.com    | 455  |
      | Job Categories    | Brian   | Brian@gmail.com   | 4435 |
      | WorkShifts        | Becky   | Becky@gmail.com   | 234  |