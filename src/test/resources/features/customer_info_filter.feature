@regression
Feature: As a user, I want to filter customers’ info on the Account page.
  AC1: users should see 8 filter items on the Accounts page
  Expected filter names: Account Name, Contact Name, Contact Email, Contact Phone,
  Owner, Business Unit, Created At, Updated At


  Scenario: Driver can filter customers info on the Account page
    Given user login as a driver
    When user go to "Customers" and open "Accounts"
    And click on filters
    Then assert filters:
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |


  @wip
  Scenario: Sales Manager can filter customers info on the Account page
    Given user login as a sales manager
    When user go to "Customers" and open "Accounts"
    And click on filters
    Then assert filters:
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |

  @wip
  Scenario: Store Manager can filter customers info on the Account page
    Given user login as a store manager
    When user go to "Customers" and open "Accounts"
    And click on filters
    Then assert filters:
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |