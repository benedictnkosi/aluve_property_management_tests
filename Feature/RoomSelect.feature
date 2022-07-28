Feature: Selecting a Room

  Scenario Outline: Selecting a Room
    Given The user has logged in the website
    When The user clicks on the 'Rooms' top menu
    And The user clicks on the *Click to Select Dates* tab
    And User selects the "<start_date>" and "<end_date>"
    And The user clicks the 'Apply' button

    And The User selects an available room '1'
    Then User validates Book Now consent page is visible
    And Returns to previous page

    When The User selects an available room with description 'Spacious Double Room'
    And User clicks on the inner Book Now button
    Then User validates Book Now consent page is visible

    Examples:
      | start_date | end_date | invalid_date |
      | 2          | 3        | 15           |