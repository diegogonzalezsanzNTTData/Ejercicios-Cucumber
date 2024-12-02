Feature: Verify access based on user role

  Scenario Outline: Check access based on role
    Given the user has the role "<role>"
    When I attempt to access the protected resource
    Then the access should be "<result>"

    Examples:
      | role   | result  |
      | admin  | allowed |
      | editor | allowed |
      | viewer | denied  |
      | guest  | denied  |
