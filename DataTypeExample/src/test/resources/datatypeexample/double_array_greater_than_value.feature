Feature: Check if all numbers in an array of decimals are greater than a value

  Scenario Outline: Verify if all numbers in the array of decimals are greater than a value
    Given an array of decimal numbers <numbers>
    When I check if all decimal numbers are greater than <value>
    Then the result of whether all decimal numbers are greater than the provided value should be <result>

    Examples:
      | numbers           | value | result |
      | [5.5, 10.1, 15.2] | 4.4   | true   |
      | [3.3, 2.2, 1.1]   | 2.0   | false  |
      | [8.8, 9.9, 10.0]  | 7.7   | true   |
      | [0.5, 5.1, 10.2]  | 1.5   | false  |
