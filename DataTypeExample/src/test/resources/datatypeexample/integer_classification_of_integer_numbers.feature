Feature: Classification of integer numbers

  Scenario Outline: Classify an integer number as positive, negative, or zero
    Given the integer number requested is <number>
    When I classify the integer number
    Then the result of classifying the integer number should be "<result>"

    Examples:
      | number | result   |
      | 0      | zero     |
      | 7      | positive |
      | -3     | negative |
      | 15     | positive |
      | -9     | negative |
      | 4      | positive |
      | -12    | negative |
