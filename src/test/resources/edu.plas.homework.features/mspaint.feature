Feature: Drawing images

  In order to create images
  As a designer
  I would like to draw images electronically

  Scenario: Colour picking
    Given I launch the Microsoft Paint program
    When I want to change the current colour
    Then I pick a new colour from the palette

  Scenario: Paint picture and search for it on Google Images
    Given I launch the Microsoft Paint program
    When I select the 'Airbrush' tool
    And I select the 'Mustard' colour
    And I draw a 'mustard seed'
    Then the 'mustard seed' appears on the canvas
    Given I navigate to Google Images
    When I search for 'mustard seed'
    Then my drawing of 'mustard seed' is similar to the first image on Google Images
