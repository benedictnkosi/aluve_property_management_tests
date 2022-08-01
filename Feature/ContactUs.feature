Feature: Contact Us Page

  Scenario: Validating Contact Us Page
    Given The user has logged in the website

    When The user clicks on the 'Contact Us' top column
    And User clicks on the contact icons with value 'number'
    And User clicks on the contact icons with value 'email'

    And User inputs guest information 'Name'
    And User inputs guest information on the selected tab name

    And User inputs guest information 'Email'
    And User inputs guest information on the selected tab email

    And User inputs guest information 'Phone Number'
    And User inputs guest information on the selected tab phone

    And User inputs guest information 'Message'
    And User inputs a message

    And The user clicks on 'Send Message' button
    Then User validates if inputs were successfully sent





