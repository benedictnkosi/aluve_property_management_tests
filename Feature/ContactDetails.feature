Feature: Contact Details

  Scenario: Clicking contact details elements
    Given The user is on the home page
    Then User validates Home page is displayed

    When The user clicks on the 'Contact Us' top menu
    Then User validates that Contact Us page is open

    When The user clicks on the contact number
    When The user clicks on the contact email

  #Contact number cannot not display pop-up on automated browser and email opens Outlook window
  #Validating these steps is a challenge

