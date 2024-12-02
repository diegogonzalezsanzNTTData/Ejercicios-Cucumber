Feature: Calculate the sum of a list of integer numbers

  Scenario Outline: Calculate the sum of a list of integer numbers
    Given a list of integer numbers to calculate a sum:
      | numbers   |
      | <number1> |
      | <number2> |
      | <number3> |
    When I calculate the sum of the list of integers
    Then the result of the list of integers numbers should be <sum>

    Examples:
      | number1 | number2 | number3 | sum |
      | 1       | 2       | 3       | 6   |
      | 10      | 20      | 30      | 60  |
      | 5       | 5       | 5       | 15  |
      | 0       | 0       | 0       | 0   |
