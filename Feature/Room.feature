Feature: Validating Rooms are displayed when date is input

  Scenario Outline: The rooms are visible when user inputs date
    Given The user is on the home page
    When The user clicks on the "Rooms" top menu
    And The user clicks on the *Click to Select Dates* date picker
    Then User validates calendar is visible

    When User selects the check-in date "<start_date>" and check out date "<end_date>"
    And The user clicks the calendar button 'Apply'
    Then User checks if rooms are displayed



    Examples:
      | start_date | end_date |
      | 5          | 10       |
