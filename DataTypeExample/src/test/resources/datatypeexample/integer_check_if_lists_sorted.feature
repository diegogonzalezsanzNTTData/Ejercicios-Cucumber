Feature: Check if a list is sorted

  Scenario Outline: Verify if the list is sorted in ascending order
    Given the list of numbers <numbers> to check if sorted
    When I check if the list is sorted in ascending order
    Then the sorter result should be <result>

    Examples:
      | numbers         | result |
      | [1, 2, 3, 4, 5] | true   |
      | [5, 4, 3, 2, 1] | false  |
      | [10, 20, 30]    | true   |
      | [10, 5, 20, 15] | false  |
      | [1, 1, 1, 1]    | true   |
