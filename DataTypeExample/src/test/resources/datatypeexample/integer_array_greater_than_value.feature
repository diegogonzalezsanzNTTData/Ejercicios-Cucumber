Feature: Verify if all numbers in an array are greater than a value

  Scenario Outline: Check if all numbers in the array are greater than a value
    Given an array of numbers:
      | numbers   |
      | <number1> |
      | <number2> |
      | <number3> |
    When I check if all integer numbers are greater than <value>
    Then the result of whether all integer numbers are greater than the provided value should be <result>

    Examples:
      | number1 | number2 | number3 | value | result |
      | 5       | 10      | 15      | 4     | true   |
      | 3       | 2       | 1       | 2     | false  |
      | 8       | 9       | 10      | 7     | true   |
      | 0       | 5       | 10      | 1     | false  |
