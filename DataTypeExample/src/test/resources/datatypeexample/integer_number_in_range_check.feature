Feature: Verify if a number is within a range

  Scenario Outline: Check if the number is in the range
    Given the range is between <min> and <max>
    And the number introduced is <number>
    When I check if the number is within the range
    Then the number <number> should be within the range <min> and <max>: <result>

    Examples:
      | number | min | max | result |
      | 5      | 1   | 10  | true   |
      | 15     | 10  | 20  | true   |
      | 25     | 30  | 50  | false  |
      | 7      | 0   | 5   | false  |
