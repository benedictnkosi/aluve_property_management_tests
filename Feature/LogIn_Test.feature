@login_feature
Feature: Login Action

  Background:
    Given User is on Login Page

  Scenario Outline: Successful Login with Valid Credentials
    When User logs in with "<password>"
    Then User is redirected to the Dashboard page
    Examples:
      | password |
      | 1234     |