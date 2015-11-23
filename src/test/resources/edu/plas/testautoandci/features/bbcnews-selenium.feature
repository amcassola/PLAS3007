Feature: BBC News website

  Test scenarios for PLAS3007 Lecture 5

  Background:
    Given I navigate to http://www.bbc.com/news

  @mainMenuItems
  Scenario: Main menu items
    Then there are 17 main menu items

  @watchListenListItems
  Scenario: Watch/Listen menu contains 6 items
    Then the Watch/Listen menu contains 6 items

  @watchListenListFeature
  Scenario Outline: Watch/Listen menu items all have a title, image and associated index
    Then all the Watch/Listen menu items have a '<feature>'
  Examples:
    | feature |
    | title   |
    | image   |
    | index   |

  @exhangePoints
  Scenario: Markets menu contains 4 stock exchange points
    Then the Markets menu contains 4 items
    And the Markets menu items are: FTSE 100, Dow Jones, Nasdaq, Nikkei 225