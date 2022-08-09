Feature: Selecting A Room

  Scenario Outline: The User Selects a room
    Given The user is on the home page
    When The user clicks on the 'Rooms' top menu
    Then User validates that Rooms page is open

    When The user clicks on the *Click to Select Dates* date picker
    Then User validates calendar is visible

    When User selects the check-in date "<start_date>" and check out date "<end_date>"
    And The user clicks the calendar button 'Apply'
    Then User validates that rooms are displayed

    When The User selects an available room with description '<room1>'
    Then User validates that the selected room is open with description '<room1>'

    Examples:
      | start_date | end_date | room1                    |
      | 5          | 10       | 2 Bedroom Family Cottage |

