@smoke @regression
Feature: As a user, I want to write the “Description” when I create a calendar event.
  AC1: users should be able to write messages in the Description field on the calendar event page.


  Scenario: Driver write a message in the Description field n the calendar event page
    Given user login as a driver
    When user go to "Activities" and open "Calendar Events"
    And user click on the Create Calendar Event
    And user write massage in the description field
    Then user should see the massage in the description field

  Scenario: Sales Manager write a message in the Description field n the calendar event page
    Given user login as a sales manager
    When user go to "Activities" and open "Calendar Events"
    And user click on the Create Calendar Event
    And user write massage in the description field
    Then user should see the massage in the description field

  Scenario: Store Manager write a message in the Description field n the calendar event page
    Given user login as a store manager
    When user go to "Activities" and open "Calendar Events"
    And user click on the Create Calendar Event
    And user write massage in the description field
    Then user should see the massage in the description field
