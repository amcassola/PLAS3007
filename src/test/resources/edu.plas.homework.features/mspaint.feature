Feature: Drawing images

  In order to create images
  As a designer
  I would like to draw images electronically

  Scenario: Colour picking
    Given I am using MS Paint
    When I want to change the current colour
    Then I pick a new colour from the palette

  Scenario: Drawing a mustard seed
    Given I am using MS Paint
    When I want to draw a mustard seed
    Then I pick a mustard colour from the palette
    And I select the airbrush tool
    Then I draw a mustard seed on the canvas

  Scenario: Searching for mustard seed images
    Given I have drawn a mustard seed using MS Paint
    And I am using Google images as my search engine
    When I search for 'mustard seed'
    Then The mustard seed I drew must look like images returned
