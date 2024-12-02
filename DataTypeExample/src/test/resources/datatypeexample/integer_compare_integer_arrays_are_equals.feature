Feature: Compare two arrays of integers

  Scenario Outline: Verify if two arrays of integers are equal
    Given the first array of numbers:
      | numbers               |
      | <number1_first_array> |
      | <number2_first_array> |
      | <number3_first_array> |
    And the second array of numbers:
      | numbers                |
      | <number1_second_array> |
      | <number2_second_array> |
      | <number3_second_array> |
    When I compare the arrays
    Then the result verify two arrays of integers are equal should be <result>

    Examples:
      | number1_first_array | number2_first_array | number3_first_array | number1_second_array | number2_second_array | number3_second_array | result |
      | 1                   | 2                   | 3                   | 1                    | 2                    | 3                    | true   |
      | 5                   | 6                   | 7                   | 5                    | 7                    | 6                    | false  |
      | 10                  | 20                  | 30                  | 10                   | 20                   | 30                   | true   |
      | 0                   | 0                   | 0                   | 1                    | 0                    | 0                    | false  |
