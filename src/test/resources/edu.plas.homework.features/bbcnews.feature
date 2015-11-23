Feature: Using the BBC News website

  In order to read daily news
  As a person who must be up to date with current affairs
  I want to be able to find all news updates on the BBC News website

  Background:
    Given I navigate to 'BBC News'

  Scenario: Visiting BBC News website
    Then the BBC News Home page must be displayed

  Scenario: Main menu items are visible
    Then the BBC News main menu is visible with the following items:
      | Home                 |
      | Video                |
      | World                |
      | UK                   |
      | Business             |
      | Tech                 |
      | Science              |
      | Magazine             |
      | Entertainment & Arts |
      | Health               |
      | In Pictures          |

  Scenario Outline: Main menu items open a separate index
    When I click on the menu item '<menuItem>' in the BBC News website
    Then the '<menuItem>' index is displayed on the BBC News website
  Examples:
    | menuItem             |
    | Home                 |
    | Video                |
    | World                |
    | UK                   |
    | Business             |
    | Tech                 |
    | Science              |
    | Magazine             |
    | Entertainment & Arts |
    | Health               |
    | In Pictures          |

  Scenario: Watch/Listen menu shows the World Service Radio link
    Then the World Service Radio link is visible in the Watch/Listen menu

  Scenario: Watch/Listen menu contains 6 items
    Then the Watch/Listen menu contains 6 items

  Scenario Outline: Watch/Listen menu items all have a title, image and associated index
    Then all the Watch/Listen menu items have a '<feature>'
  Examples:
    | feature |
    | title   |
    | image   |
    | index   |

  Scenario: Markets menu contains 4 stock exchange points
    Then the Markets section contains the latest 4 indices
    And the Markets section shows how old the information I am viewing is

  Scenario: Each Markets menu item contains the index, arrow and percentage
    Then each item in the Markets menu contains the 'index'
    And each item in the Markets menu contains the 'arrow'
    And each item in the Markets menu contains the 'percentage'

  Scenario: Features and Analysis menu contains 6 items
    Then the Features and Analysis menu contains 6 items

  Scenario Outline: Features and Analysis items all have the required features
    Then all the Features and Analysis menu items have a '<feature>'
  Examples:
    | feature |
    | title   |
    | summary |
    | image   |
    | date    |
    | index   |

  Scenario Outline: All Features and Analysis items link to the correct story
    Then when I click the '<section>' the correct story is loaded
  Examples:
    | section |
    | image   |
    | title   |
