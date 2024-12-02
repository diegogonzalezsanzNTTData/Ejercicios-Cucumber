Feature: Check if a list of decimal numbers is sorted

  Scenario Outline: Verify if the list of decimal numbers is sorted in ascending order
    Given the list of decimal numbers <numbers> to check if sorted
    When I check if the list of decimal numbers is sorted in ascending order
    Then the sorter result with decimal numbers should be <result>

    Examples:
      | numbers                 | result |
      | [1.1, 2.2, 3.3, 4.4]    | true   |
      | [5.5, 4.4, 3.3, 2.2]    | false  |
      | [10.1, 20.2, 30.3]      | true   |
      | [10.5, 5.5, 20.5, 15.5] | false  |
      | [1.1, 1.1, 1.1, 1.1]    | true   |
