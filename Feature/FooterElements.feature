Feature: Footer Elements Select

  Scenario: Validating functionality of the footer elements
    Given The user is on the home page
    Then User validates Home page is displayed

    And User clicks on the footer icon with value 'whatsapp'
    Then User validates WhatsApp page is open and displayed

    When User clicks footer link with value 'Rooms'
    Then User validates that Rooms page is open

    When User clicks footer link with value 'Book Now'
    Then User validates booking form is displayed

    When User clicks footer link with value 'Terms & Conditions'
    Then User validates Terms and Conditions page is displayed

    When The user is on the home page
    Then User validates Home page is displayed

