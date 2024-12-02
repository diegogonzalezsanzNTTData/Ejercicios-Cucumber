Feature: Verification of positive elements in a list of decimal numbers

  Scenario Outline: Determine if all elements in a list of decimal numbers are positive
    Given I have the list of decimal numbers <numbers>
    When I evaluate whether all elements in the list are positive
    Then I should see that the result of all elements being positive is <result>

    Examples:
      | numbers            | result |
      | [1.1, 2.2, 3.3]    | true   |
      | [4.4, 5.5, -6.6]   | false  |
      | [7.7, 8.8, 9.9]    | true   |
      | [-1.1, -2.2, -3.3] | false  |
      | [0.0, 1.1, 2.2]    | true   |
      | [10.1, 20.2, 30.3] | true   |
