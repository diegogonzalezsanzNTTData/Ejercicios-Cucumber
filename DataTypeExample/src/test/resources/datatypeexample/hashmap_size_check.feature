Feature: Count the number of elements in a HashMap

  Scenario Outline: Count the elements of the HashMap
    Given a collection of key-value pairs in a map:
      | key    | value    |
      | <key1> | <value1> |
      | <key2> | <value2> |
    When I count the elements in the map
    Then the size should be <size>

    Examples:
      | key1 | value1 | key2 | value2 | size |
      | a    | alpha  | b    | beta   | 2    |
      | 1    | one    | 2    | two    | 2    |
      | x    | 100    |      |        | 1    |
      | red  | red    | blue | blue   | 2    |
