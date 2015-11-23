Feature: Searching the web

  In order to find results
  As a web searcher
  I want to see search results

  Scenario Outline: Animal image search
    Given I navigate to 'Google Images'
    When I search for '<text>' on 'Google Images'
    Then Number of <image_content> in results <operator> <count>
  Examples:
    | text                  | image_content                   | operator | count |
    | most colourful monkey | pink monkey                     | >=       | 3     |
    | boring zebra          | orange with red polka dot zebra | =        | 0     |

  Scenario: Search for UoM
    Given I navigate to 'Google Search'
    When I search for 'University of Malta' on 'Google Search'
    Then the Google stats tab is displayed
    And the Google Search results are displayed

  Scenario: Search for Malta
    Given I navigate to 'Google Search'
    When I search for 'Malta' on 'Google Search'
    Then the flag of 'Malta' is displayed

  Scenario Outline: Google calculator through Search
    Given I navigate to 'Google Search'
    When I search for '<searchText>' on 'Google Search'
    Then the Google Calculator component is displayed
    And the result on Google Calculator is '<calculationResult>'
  Examples:
    | searchText | calculationResult |
    | 5+7        | 12                |