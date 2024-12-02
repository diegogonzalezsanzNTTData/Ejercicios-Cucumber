Feature: Verification of positive elements in a list

  Scenario Outline: Determine if all elements in a list are positive
    Given the list of numbers <numbers>
    When I check if all elements in the list are positive
    Then the result of all elements are positive should be <result>

    Examples:
      | numbers      | result |
      | [1, 2, 3]    | true   |
      | [4, 5, -6]   | false  |
      | [7, 8, 9]    | true   |
      | [-1, -2, -3] | false  |
      | [0, 1, 2]    | true   |
      | [10, 20, 30] | true   |
