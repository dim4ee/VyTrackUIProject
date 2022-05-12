@smoke @regression
Feature: As a user, I want to view car odometer info on the Vehicles Odometers page.
  AC1: Store and Sales managers should see an error message “You do not have permission to perform this action.”
  when they click the “Vehicle Odometer” module.

  AC2: Drivers should see the default page as 1.

  AC3: Divers should see the View Per Page is 25 by default.


  Scenario: Driver open the vehicle odometer module
    Given user login as a driver
    When user go to "Fleet" and open "Vehicle Odometer"
    Then assert default page is "1"
    And assert default view per page is "25"


  Scenario: Sales Manager open the vehicle odometer module
    Given user login as a sales manager
    When user go to "Fleet" and open "Vehicle Odometer"
    Then assert error message "You do not have permission to perform this action." is displayed

  Scenario: Store Manager open the vehicle odometer module
    Given user login as a store manager
    When user go to "Fleet" and open "Vehicle Odometer"
    Then assert error message "You do not have permission to perform this action." is displayed
