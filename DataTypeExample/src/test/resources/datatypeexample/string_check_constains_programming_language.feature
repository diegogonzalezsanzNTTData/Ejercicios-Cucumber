Feature: Validate presence of programming languages in a list

  Scenario Outline: Check if specific languages are present
    Given a list of programming languages <languages>
    And the language introduce is "<language>"
    When I check for the presence of language
    Then it should be determined that the presence of language: <result>

    Examples:
      | languages                | language   | result |
      | [Python, Java, C]        | Java       | true   |
      | [Ruby, Go, Swift]        | C#         | false  |
      | [JavaScript, TypeScript] | TypeScript | true   |
      | [PHP, Perl]              | Rust       | false  |
      | [Kotlin, Scala]          | Kotlin     | true   |
      | [C, Python]              | C          | true   |
      | [HTML, CSS]              | Java       | false  |
