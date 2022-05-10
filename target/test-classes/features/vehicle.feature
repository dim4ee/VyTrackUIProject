@regression
Feature: As a user, I want to see edit car info icons from the Vehicle page.
  AC #1:  users should see “view, edit, delete” when they hover the mouse to the 3 dots “…”

 @wip
  Scenario: As a Driver i want to go to Vehicle page, hover over 3 dots.. and see "view, edit, delete"
    Given user login as a driver
    When user go to "Fleet" and open "Vehicles"
    And user hover the three dots ... on the first roll
    Then user should see dropdown menu with options:
      | View   |
      | Edit   |
      | Delete |


  Scenario: As a Sales Manager i want to go to Vehicle page, hover over 3 dots.. and see "view, edit, delete"
    Given user login as a sales manager
    When user go to "Fleet" and open "Vehicles"
    And user hover the three dots ... on the first roll
    Then user should see dropdown menu with options:
      | View   |
      | Edit   |
      | Delete |


  Scenario: As a Store Manager i want to go to Vehicle page, hover over 3 dots.. and see "view, edit, delete"
    Given user login as a store manager
    When user go to "Fleet" and open "Vehicles"
    And user hover the three dots ... on the first roll
    Then user should see dropdown menu with options:
      | View   |
      | Edit   |
      | Delete |




