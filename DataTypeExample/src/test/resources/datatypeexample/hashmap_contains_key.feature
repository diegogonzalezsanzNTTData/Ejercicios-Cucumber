Feature: Verify if a HashMap contains a specific key

  Scenario Outline: Check if the map contains the key
    Given a map containing the following key-value pairs:
      | key    | value    |
      | <key1> | <value1> |
      | <key2> | <value2> |
    When I search for the key "<searched_key>"
    Then the result of searching for "<searched_key>" should be <result>

    Examples:
      | key1 | value1 | key2 | value2 | searched_key | result |
      | 1    | one    | 2    | two    | 1            | true   |
      | a    | alpha  | b    | beta   | c            | false  |
      | x    | 10     | y    | 20     | y            | true   |
      | red  | red    | blue | blue   | green        | false  |
