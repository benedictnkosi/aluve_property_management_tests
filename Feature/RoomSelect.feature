Feature: Selecting a Room

  Scenario Outline: Selecting a Room
    Given The user has logged in the website
    When The user clicks on the 'Rooms' top menu
    And The user clicks on the *Click to Select Dates* tab
    And User selects the "<start_date>" and "<end_date>"
    And The user clicks the 'Apply' button

    And The User selects an available with description '1 Bedroom Cottage'
    And The user clicks the 'Book Now' button


    Examples:
      | start_date | end_date | invalid_date |
      | 10         | 11       | 15           |