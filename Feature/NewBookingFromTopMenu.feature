Feature: New booking from the home page top menu

  Scenario Outline: Making A New Booking from Home Page
    Given The user is on the home page
    When The user clicks on the 'BOOK NOW' top menu
    Then User validates booking form is displayed

    When The user clicks the input grid for guest information with value'<name>' and enters guest information '<guestName>'
    And The user clicks the input grid for guest information with value'<phoneNumber>' and enters guest information '<guestNumber>'
    And The user clicks the input grid for guest information with value'<email>' and enters guest information '<guestEmail>'

    And The user clicks on the date picker
    Then User validates calendar is displayed

    When User selects the check-in date '<start_date>' and check out date '<end_date>'
    And The user clicks the calendar button 'Apply'
    Then User validates that rooms tiles are displayed

    When User clicks on the room select Add button
    Then User validates room has been added

    When The user checks the Terms & Conditions checkbox
    Then User validates Terms & Conditions checkbox is selected

    When The user clicks on the book now button on the booking form page
    Then User validates booking is successful


    Examples:
      | name      | phoneNumber  | email | guestName | guestNumber | guestEmail           | start_date | end_date |
      | Your Name | Phone Number | Email | Mluleki   | 0834889077  | mlu78nkosi@gmail.com | 5          | 10       |