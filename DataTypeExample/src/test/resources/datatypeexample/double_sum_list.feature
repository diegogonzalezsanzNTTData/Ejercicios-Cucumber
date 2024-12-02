Feature: Calculate the sum of a list of decimal numbers

  Scenario Outline: Calculate the sum of a list of decimal numbers
    Given a list of decimal numbers to calculate a sum:
      | numbers   |
      | <number1> |
      | <number2> |
      | <number3> |
    When I calculate the sum of the list of decimal numbers
    Then the result of the list of decimal numbers should be <sum>

    Examples:
      | number1 | number2 | number3 | sum  |
      | 1.1     | 2.2     | 3.3     | 6.6  |
      | 10.5    | 20.1    | 30.4    | 61.0 |
      | 5.0     | 5.5     | 5.5     | 16.0 |
      | 0.0     | 0.0     | 0.0     | 0.0  |
