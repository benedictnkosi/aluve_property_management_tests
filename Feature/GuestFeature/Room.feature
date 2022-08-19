Feature: Validating Rooms are displayed when date is input

  Scenario Outline: The rooms are visible when user inputs date
    Given The user is on the home page
    When The user clicks on the "Rooms" top menu
    Then User validates that Rooms page is open

    When The user clicks on the date picker
    Then User validates calendar is displayed

    When User selects the check-in date "<start_date>" and check out date "<end_date>"
    And The user clicks the calendar button 'Apply'
    Then User validates that rooms are displayed



    Examples:
      | start_date | end_date |
      | 5          | 10       |
