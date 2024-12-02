Feature: Verify if a word contains a specific letter

  Scenario Outline: Check if the word contains the letter
    Given the word introduce is "<word>"
    When I search for the letter "<letter>"
    Then the result to search for the letter "<letter>" should be <result>

    Examples:
      | word     | letter | result |
      | apple    | a      | true   |
      | banana   | z      | false  |
      | cherry   | r      | true   |
      | cucumber | k      | false  |
