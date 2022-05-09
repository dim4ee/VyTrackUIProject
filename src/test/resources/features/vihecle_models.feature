@smoke @regression
Feature: As a user, I want to view columns on the Vehicle models page
  AC #1: The store manager and sales manager should see 10 columns on the Vehicle Model page.
  Expected Column names:
  MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
  TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS

  AC #2: Drivers should not able to access the Vehicle Model page, users should see
  “You do not have permission to perform this action.”

  @vehicleModel
  Scenario: Driver click on Fleet-> vehicle models, Then user should see
  “You do not have permission to perform this action.”
    Given user login as a driver
    When user go to "Fleet" and open "Vehicles Model"
    Then user should see alert "You do not have permission to perform this action."

  @vehicleModel
  Scenario: Sales Manager click on Fleet-> vehicle models, Then user should see a web table with 10 column names
    Given user login as a sales manager
    When user go to "Fleet" and open "Vehicles Model"
    Then user should see web table with following column names:
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

  @vehicleModel
  Scenario: Store Manager click on Fleet-> vehicle models, Then user should see a web table with 10 column names
    Given user login as a store manager
    When user go to "Fleet" and open "Vehicles Model"
    Then user should see web table with following column names:
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

