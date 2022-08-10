Feature: Book Now Consent Form from Top Menu Home Page

  Scenario Outline: User Is Making Booking From Home Page
    Given The user is on the home page
    When The user clicks on the 'BOOK NOW' top menu
    Then User validates content form is displayed


    Examples:
      | start_date | end_date |
      | 5          | 10       |