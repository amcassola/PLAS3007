Feature: Calculator

  In order to do maths
  As a student
  I would like to have a calculator

  Scenario: Divide by 0
    Given I am using a calculator
    When I input '1/0'
    Then show an error

  Scenario Outline: Simple maths
    Given I am using a calculator
    When I input '<number_a><operator><number_b>'
    Then result is <result>
  Examples:
    | number_a | operator | number_b | result |
    | 10       | +        | 2        | 12     |
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
