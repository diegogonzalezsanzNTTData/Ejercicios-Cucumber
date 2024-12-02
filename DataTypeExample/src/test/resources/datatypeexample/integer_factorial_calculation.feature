Feature: Calculate the factorial of a number

  Scenario Outline: Calculate the factorial of an integer
    Given the number to calculate the factorial is <number>
    When I calculate the factorial
    Then the factorial of <number> should be <result>

    Examples:
      | number | result |
      | 3      | 6      |
      | 5      | 120    |
      | 0      | 1      |
      | 7      | 5040   |
