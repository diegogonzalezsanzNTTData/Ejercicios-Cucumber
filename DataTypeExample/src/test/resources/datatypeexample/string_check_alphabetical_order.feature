Feature: Verify the alphabetical order of a list of words

  Scenario Outline: Check if the list is in alphabetical order
    Given a list of words:
      | words   |
      | <word1> |
      | <word2> |
      | <word3> |
    When I check if the list is in alphabetical order
    Then it should be determined that the list is in alphabetical order: "<result>"


    Examples:
      | word1  | word2  | word3    | result    |
      | apple  | banana | cherry   | ordered   |
      | banana | apple  | cherry   | unordered |
      | cat    | dog    | elephant | ordered   |
      | dog    | cat    | elephant | unordered |
