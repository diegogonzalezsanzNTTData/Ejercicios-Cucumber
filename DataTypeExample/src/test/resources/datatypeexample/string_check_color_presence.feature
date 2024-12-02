Feature: Validate presence of colors in a list

  Scenario Outline: Check if specific colors are present
    Given a list of colors <colors>
    And the color introduce is "<color>"
    When I check for the presence of color
    Then it should be determined that the presence of color: <result>


    Examples:
      | colors                | color  | result |
      | [red, green, blue]    | green  | true   |
      | [yellow, purple]      | red    | false  |
      | [cyan, magenta]       | cyan   | true   |
      | [orange, pink, brown] | purple | false  |
      | [black, white]        | black  | true   |
      | [gray, silver, gold]  | gold   | true   |
      | [beige, maroon]       | navy   | false  |
