Feature: Check if a string starts with a specific prefix

  Scenario Outline: Verify if the string starts with the given prefix
    Given the word is "<word>"
    When I check if it starts with "<prefix>"
    Then the result if it starts with "<prefix>" should be <result>

    Examples:
      | word           | prefix | result |
      | hello world    | hello  | true   |
      | cucumber tests | test   | false  |
      | programming    | pro    | true   |
      | openai         | AI     | false  |
      | javascript     | java   | true   |
