Feature: Using the BBC News website

  In order to read daily news
  As a person who must be up to date with current affairs
  I want to be able to find all news updates on the BBC News website

  Scenario: Visiting BBC News website
    Given that I am using the BBC News website
    When I enter the site
    Then I must see the Home page

  Scenario: Accessing the Home page
    Given that I am using the BBC website
    When I am viewing the Home page
    Then I must see the Main Menu
    Then I must see the latest and recently most viewed news items
    And I want to know how long ago the article was posted
    Then I must see the Watch/Listen section
    Then I must see the Featured & Analysis section
    Then I must see the latest market updates

  Scenario: Categorisation of news items
    Given that I am using the BBC News website
    When I want to view news items
    Then I expect to be able to select a category of news items to view from the main menu
    And I expect to be able to return to the Home page from other pages using the 'Home' menu item

  Scenario Outline: Accessing different categories of news items
    Given that I am using the BBC News website
    When I select '<menu_item>' from the main menu
    Then I want to view news items classified under the '<category>' category
  Examples:
    | menu_item            | category               |
    | Video                | video                  |
    | World                | world                  |
    | UK                   | uk                     |
    | Business             | business               |
    | Tech                 | technology             |
    | Science              | science                |
    | Magazine             | magazine               |
    | Entertainment & Arts | entertainment_and_arts |
    | Health               | health                 |
    | In Pictures          | pictures               |

  Scenario: Watch/Listen Section
    Given that I am using the BBC News website
    Then I want to see top 6 viewed video news items under the Watch/Listen section at all times
    Then I want to be able to watch the video I selected
    And I want to see a description of the video

  Scenario: Markets Section
    Given that I am using the BBC News website
    When I am viewing the Markets section in the Home page
    Then I want to see the latest equity indices
    And I want to know how old the information I am viewing is
    Then I want to view more detail on the indices when I select them

  Scenario: Features & Analysis Section
    Given that I am using the BBC News website
    When I am viewing the Features & Analysis section in the Home page
    Then I want to see the featured articles
    And I want to know how long ago the article was posted
    Then I want to read the article select one
    And I want to see pictures related to the article
    And I want to see videos related to the article

