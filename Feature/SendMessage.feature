Feature: Send Message

  Scenario Outline: Sending guest message to the property
    Given The user is on the home page
    Then User validates Home page is displayed

    When The user clicks on the 'Contact Us' top menu
    Then User validates that Contact Us page is open

    When User clicks on input field 'Name' and enters '<guestName>'
    When User clicks on input field 'Email' and enters '<guestEmail>'
    When User clicks on input field 'Phone Number' and enters '<guestNumber>'
    When User clicks on input field 'Message' and enters '<guestMessage>'

    When The user clicks on the send message button
    Then User validates message is successfully sent


    Examples:
      | guestName | guestNumber | guestEmail           | guestMessage             |
      | Mluleki   | 0834889077  | mlu78nkosi@gmail.com | Are you available today? |