Feature: Check the length of a list

  Scenario Outline: Verify the length of the list
    Given the list of items <items>
    When I check the length of the list
    Then the length of the list should be <length>

    Examples:
      | items                      | length |
      | [apple, banana]            | 2      |
      | [dog, cat, mouse]          | 3      |
      | [red, blue, green, yellow] | 4      |
