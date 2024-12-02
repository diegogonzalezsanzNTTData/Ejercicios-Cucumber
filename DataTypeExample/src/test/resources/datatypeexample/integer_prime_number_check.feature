Feature: Verify if a number is prime

  Scenario Outline: Check if the number is prime
    Given I enter the number <number>
    When I check if the number is prime
    Then I should see the result as <result>

    Examples:
      | number | result |
      | 2      | true   |
      | 4      | false  |
      | 7      | true   |
      | 9      | false  |
