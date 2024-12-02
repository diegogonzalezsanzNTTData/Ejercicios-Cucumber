Feature: Check if a list of decimal numbers contains an element

  Scenario Outline: Verify if the list of decimal numbers contains a specific element
    Given the list of decimal numbers <numbers>
    When I check if the list contains this decimal number <element>
    Then the list contains element result should be <result>

    Examples:
      | numbers                   | element | result |
      | [1.1, 2.2, 3.3, 4.4, 5.5] | 3.3     | true   |
      | [10.1, 20.2, 30.3, 40.4]  | 25.5    | false  |
      | [100.5, 200.6, 300.7]     | 100.5   | true   |
      | [5.5, 15.5, 25.5, 35.5]   | 50.5    | false  |
