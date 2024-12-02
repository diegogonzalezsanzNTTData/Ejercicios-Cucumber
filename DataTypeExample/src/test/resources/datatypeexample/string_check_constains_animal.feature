Feature: Validate presence of animals in a list

  Scenario Outline: Check if specific animals are present
    Given a list of animals <animals>
    And the animal introduce is "<animal>"
    When I check for the presence of animal
    Then it should be determined that the presence of animal: <result>

    Examples:
      | animals             | animal  | result |
      | [dog, cat, rabbit]  | cat     | true   |
      | [lion, tiger]       | bear    | false  |
      | [elephant, giraffe] | giraffe | true   |
      | [mouse, hamster]    | rat     | false  |
      | [shark, dolphin]    | dolphin | true   |
      | [parrot, crow]      | pigeon  | false  |
      | [eagle, hawk]       | eagle   | true   |
