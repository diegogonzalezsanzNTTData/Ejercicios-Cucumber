Feature: Verification of integer numbers

  Scenario Outline: Check if a integer number is even or odd
    Given the integer number <number>
    When I check if the integer number is even or odd
    Then the result of the integer number is even or odd should be "<result>"

    Examples:
      | number | result |
      | 1      | odd    |
      | 2      | even   |
      | 3      | odd    |
      | 4      | even   |
      | 5      | odd    |
      | 10     | even   |
