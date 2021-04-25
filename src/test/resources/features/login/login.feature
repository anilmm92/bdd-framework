@SmokeTest
Feature: Test login functionality
  
  Verify that user login is working as expected

  Scenario Outline: check that user is able to login with valid credentials
    Given Browser is open
    And user is on login page
    When user enters <username> and <password>
    Then user is navigating to home page

    Examples: 
      | username | password |
      | anil     |    12345 |
      | rakesh   |    12345 |
