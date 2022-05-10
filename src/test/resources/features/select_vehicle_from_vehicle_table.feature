@smoke @regression
Feature: As a user, I should be to select any vehicle from the Vehicle page(web-table)
  AC #1: once the users launch on the Vehicle page, all the checkboxes should be unchecked.
  AC #2: user check the first checkbox to check all the cars
  AC #3: users can select any car
  

  Scenario: Driver select vehicle from the vehicle table
    Given user login as a driver
    When user go to "Fleet" and open "Vehicles"
    Then assert all vehicle checkboxes are not selected
    When user click on select all checkbox
    Then assert all vehicle checkboxes are selected
    When deselect all checkboxes
    And select a random checkbox
    Then assert checkbox is selected



  Scenario: Sales manager select vehicle from the vehicle table
    Given user login as a sales manager
    When user go to "Fleet" and open "Vehicles"
    Then assert all vehicle checkboxes are not selected
    When user click on select all checkbox
    Then assert all vehicle checkboxes are selected
    When deselect all checkboxes
    And select a random checkbox
    Then assert checkbox is selected


  Scenario: Store manager select vehicle from the vehicle table
    Given user login as a store manager
    When user go to "Fleet" and open "Vehicles"
    Then assert all vehicle checkboxes are not selected
    When user click on select all checkbox
    Then assert all vehicle checkboxes are selected
    When deselect all checkboxes
    And select a random checkbox
    Then assert checkbox is selected