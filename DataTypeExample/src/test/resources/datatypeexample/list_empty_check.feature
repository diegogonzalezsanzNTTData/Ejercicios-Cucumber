Feature: Verify if a list is empty

  Scenario Outline: Check if the list is empty
    Given a list of elements:
      | elements   |
      | <element1> |
      | <element2> |
    When I check if the list is empty
    Then the result if the list is empty should be <result>

    Examples:
      | element1 | element2 | result |
      |          |          | true   |
      | a        | b        | false  |
      | 1        | 2        | false  |
      | red      |          | false  |
