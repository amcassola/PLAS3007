Feature: Searching the web

  In order to find results
  As a web searcher
  I want to see search results

  Scenario Outline: Animal image search
    Given that I am using Google Images
    When I search for '<text>'
    Then <image_content> <operator> <count>
  Examples:
    | text                  | image_content                   | operator | count |
    | most colourful monkey | pink monkey                     | >=       | 3     |
    | boring zebra          | orange with red polka dot zebra | =        | 0     |

  Scenario: Search for UoM
    Given that I am using Google Web
    When I search for 'University of Malta'
    Then the stats tab is displayed on the right
    And results are displayed on the left

  Scenario: Search for Malta
    Given that I am using Google Web
    When I search for 'Malta'
    Then a component displaying the Maltese flag is available in the search results

  Scenario Outline: Search for mathematical result
    Given that I am using Google Web
    When I search for '<number_a><operator><number_b>'
    Then Google calculator is displayed
    And the result displayed is <result>
  Examples:
    | number_a | operator | number_b | result |
    | 5        | +        | 7        | 12     |
    | 10       | +        | -1       | 9      |
    | -1       | +        | -1       | -2     |
    | -1       | +        | 2        | 1      |
    | 10       | -        | 2        | 8      |
    | 10       | -        | -1       | 11     |
    | -1       | -        | -1       | 0      |
    | -1       | -        | 2        | -3     |
    | 10       | *        | 2        | 20     |
    | 10       | *        | -1       | -10    |
    | -1       | *        | -1       | 1      |
    | -1       | *        | 2        | -2     |
    | 10       | /        | 2        | 5      |
    | 10       | /        | -1       | -10    |
    | -1       | /        | -1       | 1      |
    | -1       | /        | 2        | -0.5   |