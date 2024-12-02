Feature: Verify if a HashMap contains a specific value

  Scenario Outline: Check if the map contains the value
    Given a key-value pair map with the following entries:
      | key    | value    |
      | <key1> | <value1> |
      | <key2> | <value2> |
    When I search for the value "<searched_value>"
    Then it should be <result> that the value "<searched_value>" exists in the map

    Examples:
      | key1 | value1 | key2 | value2 | searched_value | result |
      | 1    | one    | 2    | two    | two            | true   |
      | a    | alpha  | b    | beta   | gamma          | false  |
      | x    | 10     | y    | 20     | 20             | true   |
      | red  | red    | blue | blue   | green          | false  |
