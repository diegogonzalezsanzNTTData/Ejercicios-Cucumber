Feature: Calculate the average of a list of integers

  Scenario: Calculate the average of a list of integers
    Given a list of integers:
      | grades        | average |
      | [1, 2, 3, 4]  | 2.5     |
      | [7, 8, 9, 8]  | 8       |
      | [1, 2, 3]     | 2       |
      | [10, 5, 2, 3] | 5       |
      | [0 , 0, 0]    | 0       |
      | [4, 6, 8]     | 6       |
    When I calculate the average of the list of integers
    Then the result of the average of the list of integers should be correct
