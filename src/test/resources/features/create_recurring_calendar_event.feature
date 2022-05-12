@smoke @regression
Feature: As a user, I want to create a recurring(repetitive) calendar event.
  AC #1: user should see the number “1” by default in the Repeat Every input.
  AC #2: user should see an error message “This value should not be blank.” when
  the Calendar event repeat field is cleared(delete the number 1).


  Scenario:Driver create a recurring(repetitive) calendar event
    Given user login as a driver
    When user go to "Activities" and open "Calendar Events"
    And user click on the Create Calendar Event
    And user select repeat checkbox
    Then user should see 1 by default in the repeat entry input
    When user leave blank repeat entry input
    Then user should see alert message "This value should not be blank."
    When user enter "-1" in repeat entry input
    Then user should see alert message "The value have not to be less than 1."
    When user enter "100" in repeat entry input
    Then user should see alert message "The value have not to be more than 99."


  Scenario:Sales Manager create a recurring(repetitive) calendar event
    Given user login as a sales manager
    When user go to "Activities" and open "Calendar Events"
    And user click on the Create Calendar Event
    And user select repeat checkbox
    Then user should see 1 by default in the repeat entry input
    When user leave blank repeat entry input
    Then user should see alert message "This value should not be blank."
    When user enter "-1" in repeat entry input
    Then user should see alert message "The value have not to be less than 1."
    When user enter "100" in repeat entry input
    Then user should see alert message "The value have not to be more than 99."


  Scenario:Store Manager create a recurring(repetitive) calendar event
    Given user login as a store manager
    When user go to "Activities" and open "Calendar Events"
    And user click on the Create Calendar Event
    And user select repeat checkbox
    Then user should see 1 by default in the repeat entry input
    When user leave blank repeat entry input
    Then user should see alert message "This value should not be blank."
    When user enter "-1" in repeat entry input
    Then user should see alert message "The value have not to be less than 1."
    When user enter "100" in repeat entry input
    Then user should see alert message "The value have not to be more than 99."
