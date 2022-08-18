Feature: Send Message

  Scenario Outline: Sending guest message to the property
    Given The user is on the home page
    Then User validates Home page is displayed

    When The user clicks on the 'Contact Us' top menu
    Then User validates that Contact Us page is open

    When User enters '<guestName>' on input field 'Name'
    When User enters '<guestEmail>' on input field 'Email'
    When User enters '<guestNumber>' on input field 'Phone Number'
    When User enters '<guestMessage>' on input field 'Message'

    When The user clicks on the send message button
    Then User validates message is successfully sent


    Examples:
      | guestName | guestNumber | guestEmail           | guestMessage             |
      | Mluleki   | 0834889077  | mlu78nkosi@gmail.com | Are you available today? |