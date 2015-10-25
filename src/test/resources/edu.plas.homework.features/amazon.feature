Feature: Searching the Amazon

  In order to buy stuff
  As an Amazon user
  I would like to see what is available and buy stuff from the website


  Scenario: Finding a book
    Given that I am using the Amazon website
    When I search for 'book'
    Then a list of books for sale is returned

  Scenario Outline: Adding an item to my basket
    Given that I am using the Amazon website
    And I have searched for an item
    And a list of results was returned
    When I select an item from the results
    And I add it to my basket
    Then a confirmation message is displayed
    Then my basket contains <previous_count> + 1=<new_count> items
    And the item I just added is present in my basket
  Examples:
    | previous_count | new_count |
    | 0              | 1         |
    | 1              | 2         |
    | 23             | 24        |

  Scenario: Emptying my basket
    Given that I am using the Amazon website
    When I empty my basket
    Then the number of items in my basket is 0