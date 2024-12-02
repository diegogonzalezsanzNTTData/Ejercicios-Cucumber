Feature: Validate if a number is a palindrome

  Scenario Outline: Check if the number is a palindrome
    Given the number is <number>
    When I check if the number is a palindrome
    Then the result should be <result>

    Examples:
      | number | result |
      | 121    | true   |
      | 123    | false  |
      | 4444   | true   |
      | 567    | false  |
      | 1001   | true   |
