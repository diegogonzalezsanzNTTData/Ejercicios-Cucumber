Feature: Check if a list contains unique elements

  Scenario Outline: Verify if all elements in the list are unique
    Given the list of elements <elements>
    When I check if the list has all unique elements
    Then the list uniqueness result should be <result>

    Examples:
      | elements               | result |
      | [apple, banana, apple] | false  |
      | [cat, dog, mouse]      | true   |
      | [red, blue, red]       | false  |
