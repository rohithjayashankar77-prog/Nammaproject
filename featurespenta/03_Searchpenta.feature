Feature: Search functionality

  Scenario: To verify Search functionality by entering product name
    Given User should be logged in and  be in the homepage 
    When user enter "laptop" in the search bar
    And user enter thr search button
    Then user should be see results related to "laptop"