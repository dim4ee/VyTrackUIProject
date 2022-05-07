@smoke @regression
Feature: As a user, I should be access to the Oroinc Documentation page.


  Scenario: Driver click on the help link and assert that user has been directed to oro documentation page
    Given user login as a driver
    When user click on get help link
    Then assert user has been directed to "https://doc.oroinc.com/" and title contains "Oro Documentation"

  Scenario: Driver click on the help link and assert that user has been directed to oro documentation page
    Given user login as a sales manager
    When user click on get help link
    Then assert user has been directed to "https://doc.oroinc.com/" and title contains "Oro Documentation"

  Scenario: Driver click on the help link and assert that user has been directed to oro documentation page
    Given user login as a store manager
    When user click on get help link
    Then assert user has been directed to "https://doc.oroinc.com/" and title contains "Oro Documentation"