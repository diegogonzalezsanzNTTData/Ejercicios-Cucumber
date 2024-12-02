Feature: Retrieve the value associated with a key in a HashMap

  Scenario Outline: Retrieve the value from the key
    Given a set of entries in the map as follows:
      | key    | value    |
      | <key1> | <value1> |
      | <key2> | <value2> |
    When I search for the value of the key "<searched_key>"
    Then the value should be "<value>"

    Examples:
      | key1 | value1 | key2 | value2 | searched_key | value |
      | a    | alpha  | b    | beta   | a            | alpha |
      | 1    | one    | 2    | two    | 2            | two   |
      | x    | 100    | y    | 200    | y            | 200   |
      | red  | red    | blue | blue   | green        | null  |
