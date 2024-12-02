Feature: Check if two words are anagrams

  Scenario Outline: Verify if the two words are anagrams
    Given the first word is "<word1>"
    And the second word is "<word2>"
    When I check if they are anagrams
    Then it should be determined that the words are anagrams: <result>


    Examples:
      | word1     | word2      | result |
      | listen    | silent     | true   |
      | apple     | pplea      | true   |
      | dormitory | dirty room | true   |
      | note      | tone       | true   |
      | hello     | world      | false  |
