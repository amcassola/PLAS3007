@googleimages @search
Feature: Google Image Search

  Background:
    Given I navigate to https://www.google.com/imghp

  Scenario Outline: Image search
    When I search for '<searchText>' on Google Images
    Then there are '10 or more' images
  Examples:
    | searchText |
    | most colourful monkey in the world |
    | boring zebra |