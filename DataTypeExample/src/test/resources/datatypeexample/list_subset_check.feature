Feature: Verify if one list is a subset of another

  Scenario Outline: Check if list A is a subset of list B
    Given a list of objects to list A:
      | elements              |
      | <element1_first_list> |
      | <element2_first_list> |
      | <element3_first_list> |
    And a list of objects to list B:
      | elements               |
      | <element1_second_list> |
      | <element2_second_list> |
    When I check if list A is a subset of list B
    Then the result if list A is an subset of list B should be <result>

    Examples:
      | element1_first_list | element2_first_list | element3_first_list | element1_second_list | element2_second_list | result |
      | 1                   | 2                   | 3                   | 1                    | 2                    | true   |
      | apple               | orange              | banana              | apple                | orange               | true   |
      | dog                 | cat                 | cow                 | fish                 | bird                 | false  |
      | red                 | blue                | green               | red                  | blue                 | true   |
