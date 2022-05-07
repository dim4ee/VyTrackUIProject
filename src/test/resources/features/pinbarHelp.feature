@regression
Feature: As a user, I want to learn how to use the pinbar.

  AC1: when users click click the “Learn how to use this space” link on the homepage, users should see:
  “How To Use Pinbar”  and
  “Use pin icon on the right top corner of the page to create fast access link in the pinbar.”

  AC2: users should see an image on the page.
  [in automation testing,  just verify the image source.]
  Expected source:
  /bundles/oronavigation/images/pinbar-location.jpg


  Scenario: When Driver click on the pinbar help should see:
  “How To Use Pinbar”,
  “Use pin icon on the right top corner of the page to create fast access link in the pinbar.”,
   image is displayed and src = "/bundles/oronavigation/images/pinbar-location.jpg"
    Given user login as a driver
    When user click on learn how to user this space link
    Then user should see header "How To Use Pinbar"
    And  user should see paragraph "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    And  user should see a picture displayed with src = "/bundles/oronavigation/images/pinbar-location.jpg"

  Scenario: When Sales Manager click on the pinbar help should see:
  “How To Use Pinbar”,
  “Use pin icon on the right top corner of the page to create fast access link in the pinbar.”,
  image is displayed and src = "/bundles/oronavigation/images/pinbar-location.jpg"
    Given user login as a sales manager
    When user click on learn how to user this space link
    Then user should see header "How To Use Pinbar"
    And  user should see paragraph "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    And  user should see a picture displayed with src = "/bundles/oronavigation/images/pinbar-location.jpg"

  Scenario: When Store Manager click on the pinbar help should see:
  “How To Use Pinbar”,
  “Use pin icon on the right top corner of the page to create fast access link in the pinbar.”,
  image is displayed and src = "/bundles/oronavigation/images/pinbar-location.jpg"
    Given user login as a store manager
    When user click on learn how to user this space link
    Then user should see header "How To Use Pinbar"
    And  user should see paragraph "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    And  user should see a picture displayed with src = "/bundles/oronavigation/images/pinbar-location.jpg"
