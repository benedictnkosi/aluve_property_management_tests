Feature: Validating Rooms are displayed when date is input

  Scenario Outline: The rooms are visible when user inputs date
    Given The user is on the home page
    When The user clicks on the "Rooms" top menu
    And The user clicks on the *Click to Select Dates* date picker
    Then User validates calendar is visible

    When User selects the check-in date "<start_date>" and check out date "<end_date>"

    And The user clicks the calendar button 'Apply'
    Then User validates the dates on the date picker are check-in and check-out date

    When The user clicks on the *Click to Select Dates* date picker
    And User clicks on invalid date
    Then User validates invalid cannot be selected
    When The user clicks the calendar button 'Apply'


    Examples:
      | start_date | end_date |
      | 5          | 10       |
