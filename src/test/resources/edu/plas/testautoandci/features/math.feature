Feature: Math.com Calculator

  In order to do maths
  As a junior school student
  I would like to have a simple calculator

  Scenario Outline: Simple calculations
    Given I navigate to 'http://www.math.com/students/calculators/source/basic.htm'
    When I input '<number_a> <operator> <number_b>'
    Then the calculation result is <result>
  Examples:
    | number_a | operator | number_b | result   |
    | 5        | +        | 2        | 7        |
    | 158      | *        | 22       | 3476     |
    | 10       | -        | 2        | 8        |
    | 12       | /        | 6        | 2        |
    | 5        | /        | 0        | Infinity |
