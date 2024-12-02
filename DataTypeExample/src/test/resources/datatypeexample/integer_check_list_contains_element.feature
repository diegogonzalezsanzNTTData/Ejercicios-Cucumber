Feature: Check if a list contains an element

  Scenario Outline: Verify if the list contains a specific element
    Given the list of values <numbers>
    When I check if the list contains this integer number <element>
    Then the list contains elements result should be <result>

    Examples:
      | numbers          | element | result |
      | [1, 2, 3, 4, 5]  | 3       | true   |
      | [10, 20, 30, 40] | 25      | false  |
      | [100, 200, 300]  | 100     | true   |
      | [5, 15, 25, 35]  | 50      | false  |
