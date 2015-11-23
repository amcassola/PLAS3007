@google @search
Feature: Google Search

  Background:
    Given I navigate to https://www.google.com/ncr

  @logo @feelingLucky
  Scenario: Google Search logo appears
    Then the Google logo is displayed
    And the I'm Feeling Lucky button is displayed

  Scenario: Google Search returns stats and results
    When I search for 'University of Malta' on Google Search
    Then the Google stats tab is displayed
    And the Google search results are displayed

  Scenario: Google Search for country returns flag
    When I search for 'Malta' on Google Search
    Then the flag of 'Malta' is displayed

  Scenario: Google Search returns stats and results
    When I search for 'University of Malta' on Google Search
    Then the Google stats tab is displayed
    And the Google search results are displayed