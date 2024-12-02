Feature: Verify if a HashMap is empty

  Scenario Outline: Check if the HashMap is empty
    Given a hashmap that includes these key-value pairs:
      | key    | value    |
      | <key1> | <value1> |
      | <key2> | <value2> |
    When I check if the map is empty
    Then it should be <result> that the hashmap is empty

    Examples:
      | key1 | value1 | key2 | value2 | result |
      |      |        |      |        | true   |
      | a    | alpha  |      |        | false  |
      | 1    | one    | 2    | two    | false  |
      | red  | red    | blue | blue   | false  |
