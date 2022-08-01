@Room_Functionality
Feature: Confirming the functionality of the room top column

  Scenario Outline: Validating the functionality of 'Room' menu
    Given The user has logged in the website
    When The user clicks on the "Rooms" top menu
    And The user clicks on the *Click to Select Dates* tab
    Then User validates that the calendar is present

    When User selects the "<start_date>" and "<end_date>"

    And The user clicks the 'Apply' button
    Then User validates rooms available

    When The user clicks on the *Click to Select Dates* tab
    And The user selects an "<invalid_date>"
    Then User validates invalid date cannot be selected

    Examples:
      | start_date | end_date | invalid_date |
      | 15         | 16       | 15           |








