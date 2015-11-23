Feature: Searching the Amazon

  In order to buy stuff
  As an Amazon user
  I would like to see what is available and buy stuff from the website

  Background:
    Given I navigate to 'Amazon UK'

  Scenario: Amazon UK search and basket functionality
    Given I navigate to http://www.amazon.co.uk/
    When I search for 'catch 22'
    Then a number of results are returned
    When I select the first result
    And I add the current item to the Basket
    Then a message confirming item is added to Basket is shown
    When I access the Basket
    Then the Basket contains '1' items
    And the current item is displayed inside the Basket
    When I delete the current item from the Basket
    Then the Basket contains '0' items

  Scenario: Emptying my basket
    When I empty my shopping basket
    Then the number of items in my basket is 0