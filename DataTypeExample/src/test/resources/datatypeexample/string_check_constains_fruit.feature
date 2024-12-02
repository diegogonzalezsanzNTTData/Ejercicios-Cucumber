Feature: Validate presence of fruits in a list

  Scenario Outline: Check if specific fruits are present
    Given a list of fruits <fruits>
    And the fruit introduce is "<fruit>"
    When I check for the presence of fruit
    Then it should be determined that the presence of fruit: <result>

    Examples:
      | fruits                  | fruit     | result |
      | [apple, banana, cherry] | banana    | true   |
      | [kiwi, mango]           | apple     | false  |
      | [grape, orange, lemon]  | grape     | true   |
      | [pear, peach]           | pineapple | false  |
      | [fig, date]             | date      | true   |
      | [coconut, papaya]       | mango     | false  |
      | [watermelon]            | melon     | false  |
