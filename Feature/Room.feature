@Room_Functionality
Feature: Confirming the functionality of the room top column

  Scenario: Validating the functionality of 'Room' column
    Given The user has logged in the website
    When The user clicks on the "Rooms" top column
    And The user clicks on the Click to Select Dates tab
    Then User validates calendar is present

    When User selects the start date and end date

    And The user clicks the 'Apply' button
    Then User validates the dates on input tab are start date and end date

    When User clicks footer icon with value 'phone'
    Then User validates that 'phone' option is visible

    When User clicks footer icon with value 'whatsapp'
    Then User validates that 'whatsapp' page option is visible

    When User clicks footer icon with value 'envelope'
    Then User validates if envelope page is open

    When User clicks on footer page reference with value 'Rooms'
    Then User validates 'Rooms' page is visible

    When User clicks on footer page reference with value 'Book Now'
    Then User validates 'Book Now' page is visible








