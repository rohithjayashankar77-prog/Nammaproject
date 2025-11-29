Feature: Login functionality

  Scenario: To verify login functionality by entering valid credentials
    Given User has launched the browser and application
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should be in homepage