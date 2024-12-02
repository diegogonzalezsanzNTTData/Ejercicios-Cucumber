Feature: Calculate the average of a list of decimal numbers

  Scenario: Calculate the average of a list of decimal numbers
    Given a list of decimal numbers:
      | grades           | average |
      | [1.5, 2.5, 3.5]  | 2.5     |
      | [10.2, 5.3, 8.4] | 7.97    |
      | [0.0, 0.0, 0.0 ] | 0.0     |
      | [4.0, 6.0, 8.0]  | 6.0     |
    When I calculate the average of the list of decimal numbers
    Then the result of the average of the list of decimal numbers should be correct

