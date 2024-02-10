Feature: validate devlab application

  Scenario: validate Devlab home page header navigation
    Given user Launch Devlab application
    Then user validate the home page title
    And user validate Devlab logo
    When user click on login button
    Then login popup screen displays
    When user gives input as user name and password
    Then user close the login pop up
    Then user close the application



