Feature: Clicking Book Now Button From Room Page

  Scenario Outline: Booking Form from Room Page
    Given The user is on the home page
    When The user clicks on the 'Rooms' top menu
    Then User validates that Rooms page is open

    When The user clicks on the date picker
    Then User validates calendar is displayed

    When User selects the check-in date "<start_date>" and check out date "<end_date>"
    And The user clicks the calendar button 'Apply'
    Then User validates that rooms are displayed

    When The user clicks on the Book Now button
    Then User validates booking form is displayed

    Examples:
      | start_date | end_date |
      | 5          | 10       |

