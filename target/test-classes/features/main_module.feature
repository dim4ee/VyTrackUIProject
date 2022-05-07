@smoke @regression
Feature: As a user, I should be accessing all the main modules of the app
  AC #1: store and sales managers should view 8 module names.
  AC #2: drivers should view 4 module names


  Scenario: login as a driver and assert there is 4 module
    When user login as a driver
    Then assert module names:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: login as a sales manager and assert there is 8 module
    When user login as a sales manager
    Then assert module names:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  @wip
  Scenario: login as a store manager and assert there is 8 module
    When user login as a store manager
    Then assert module names:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

