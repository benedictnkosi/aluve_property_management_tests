Feature: Confirm Home Page functionality

  Scenario: Validating Home Page functions are stable
    Given The user has logged in the website

    When User clicks on the next display arrow
    And User clicks on the previous display arrow
    And User clicks on the Book Now button

    Then User validates 'Book Now' page is visible
    And returns back to home page

    When User clicks on footer page reference with value 'Rooms'
    Then User validates 'Rooms' page is visible

    When User clicks on footer page reference with value 'Book Now'
    Then User validates 'Book Now' page is visible

    When User clicks footer icon with value 'phone'
    Then User validates that 'phone' option is visible

    When User clicks footer icon with value 'whatsapp'
    Then User validates that 'whatsapp' page option is visible

    When User clicks footer icon with value 'envelope'
    Then User validates if envelope page is open


