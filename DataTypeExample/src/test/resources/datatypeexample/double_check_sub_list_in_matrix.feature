Feature: Check if a matrix of decimal numbers contains a specific sublist

  Scenario Outline: Verify if the matrix contains a specific sublist
    Given the matrix with doubles <matrix>
    When I check if the matrix with doubles contains the sublist <sublist>
    Then it should be <result> that the matrix with doubles contains the sublist <sublist>

    Examples:
      | matrix                                     | sublist      | result |
      | [[1.1, 2.2], [3.3, 4.4], [5.5, 6.6]]       | [3.3, 4.4]   | true   |
      | [[10.1, 20.2], [30.3, 40.4], [50.5, 60.6]] | [20.2, 30.3] | false  |
