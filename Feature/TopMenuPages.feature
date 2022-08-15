Feature: Menu Functions

  Scenario: Menu Pages Visibility
    Given The user is on the home page
    When The user clicks on the 'BOOK NOW' top menu
    Then User validates booking form is displayed

    When The user clicks on the 'Rooms' top menu
    Then User validates that Rooms page is open

    When The user clicks on the 'Contact Us' top menu
    Then User validates that Contact Us page is open


