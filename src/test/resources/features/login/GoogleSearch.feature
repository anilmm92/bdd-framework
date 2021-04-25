Feature: Google search test feature functionality

  @SmokeScenario
  Scenario: verify google search is working
    Given browser is open
    When user is on google search page
    And user enters a text
    Then user is navigated to search results
