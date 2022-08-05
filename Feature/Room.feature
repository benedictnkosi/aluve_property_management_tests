Feature: Validating Rooms are displayed when date is input

  Scenario Outline: The rooms are visible when user inputs date
    Given The user is at the home page
    When The user clicks on the "Rooms" top menu
    And The user clicks on the Click to Select Dates tab
    Then User validates calendar is present

    When User selects the "<start_date>" and "<end_date>"

    And The user clicks the 'Apply' button
    Then User validates the dates on input tab are start date and end date

    When The user clicks on the Click to Select Dates tab
    And User clicks on invalid date
    And The user clicks the 'Apply' button
    Then User validates invalid cannot be selected

    Examples:
      | start_date | end_date |
      | 5          | 10       |
