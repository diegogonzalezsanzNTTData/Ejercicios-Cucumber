Feature: Check if a list of strings contains a specific word

  Scenario Outline: Verify if the list contains a specific word
    Given the list of strings <strings>
    When I check if the list contains the word "<word>"
    Then it should be <result> that the list contains the word "<word>"

    Examples:
      | strings                    | word   | result |
      | [apple, banana, cherry]    | banana | true   |
      | [dog, cat, mouse]          | horse  | false  |
      | [red, green, blue, yellow] | green  | true   |
      | [car, bike, bus]           | plane  | false  |
