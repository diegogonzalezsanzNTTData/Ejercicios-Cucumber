Feature: Verify if a list is in descending order

  Scenario Outline: Check the descending order of a list of numbers
    Given a list of numbers:
      | numbers   |
      | <number1> |
      | <number2> |
      | <number3> |
    When I check if the list is in descending order
    Then the result if the list is in descending order should be <result>

    Examples:
      | number1 | number2 | number3 | result |
      | 9       | 5       | 2       | true   |
      | 3       | 4       | 5       | false  |
      | 100     | 50      | 25      | true   |
      | 1       | 2       | 3       | false  |
