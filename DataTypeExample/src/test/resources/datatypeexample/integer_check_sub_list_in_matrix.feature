Feature: Check if a matrix contains a specific sublist

  Scenario Outline: Verify if the matrix contains a specific sublist
    Given the matrix with integers <matrix>
    When I check if the matrix with integers contains the sublist <sublist>
    Then it should be <result> that the matrix with integers contains the sublist <sublist>


    Examples:
      | matrix                         | sublist  | result |
      | [[1, 2], [3, 4], [5, 6]]       | [3, 4]   | true   |
      | [[10, 20], [30, 40], [50, 60]] | [20, 30] | false  |
