Feature: Login Action

  Background:
    Given User is on Login Page

  Scenario Outline: Successful Login with Valid Credentials
    When User enters the email '<email>'
    When User logs in with "<password>"
    Then User is redirected to the calendar page
    Examples:
      | password | email              |
      | 3782     | info@aluvegh.co.za |