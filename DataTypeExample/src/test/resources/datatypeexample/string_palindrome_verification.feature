Feature: Palindrome Verification

  Scenario Outline: Determine if a word is a palindrome
    Given the word "<word>"
    When I check if the word is a palindrome
    Then the result of whether the word is a palindrome should be <result>

    Examples:
      | word   | result |
      | radar  | true   |
      | hello  | false  |
      | madam  | true   |
      | world  | false  |
      | level  | true   |
      | openai | false  |
