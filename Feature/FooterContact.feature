Feature: Footer Contact Icons Select

  Scenario: Validating functionality of the footer contact icons
    Given The user is on the home page
    Then User validates Home page is displayed

    When User clicks on the footer icon with value 'phone'

    And User clicks on the footer icon with value 'whatsapp'
    Then User validates WhatsApp page is open and displayed

    And User clicks on the footer icon with value 'envelope'