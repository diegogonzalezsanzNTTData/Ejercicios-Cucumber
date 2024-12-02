Feature: Classification of decimal numbers

  Scenario Outline: Classify a decimal number as positive, negative, or zero
    Given the decimal number <number>
    When I classify the decimal number
    Then the result of classify the decimal number should be "<result>"

    Examples:
      | number  | result   |
      | 0.0     | zero     |
      | 1.5     | positive |
      | -2.3    | negative |
      | 3.14    | positive |
      | -0.5    | negative |
      | 0.0001  | positive |
      | -0.0001 | negative |
