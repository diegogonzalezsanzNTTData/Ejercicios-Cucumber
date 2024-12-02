Feature: Calculate the size of a list

  Scenario Outline: Calculate the size of the list
    Given a list of objects elements:
      | elements   |
      | <element1> |
      | <element2> |
      | <element3> |
    When I calculate the size of the list
    Then the result of the size should be <size>

    Examples:
      | element1 | element2 | element3 | size |
      | a        | b        | c        | 3    |
      | 1        | 2        |          | 2    |
      | red      | green    | blue     | 3    |
      | cat      |          |          | 1    |
