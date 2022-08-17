Feature: Selected Room Book Now Button

  Scenario Outline: Clicking the Selected Room Book Now Button
    Given The user is on the home page
    When The user clicks on the 'Rooms' top menu
    Then User validates that Rooms page is open

    When The user clicks on the date picker
    Then User validates calendar is displayed

    When User selects the check-in date "<start_date>" and check out date "<end_date>"
    And The user clicks the calendar button 'Apply'
    Then User validates that rooms are displayed

    When The User selects an available room with description '<favouriteRoom>'
    Then User validates that the selected room is open with description '<favouriteRoom>'

    When The user clicks on the book now button
    Then User validates booking form is displayed

    Examples:
      | start_date | end_date | favouriteRoom            |
      | 5          | 10       | 2 Bedroom Family Cottage |

