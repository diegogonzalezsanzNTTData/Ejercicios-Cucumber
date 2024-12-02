Feature: Validate presence of books in a library

  Scenario Outline: Check if specific books are present
    Given a list of books <books>
    And the book introduce is "<book>"
    When I check for the presence of book
    Then it should be determined that the presence of book: <result>

    Examples:
      | books                                 | book                    | result |
      | [1984, Brave New World]               | Brave New World         | true   |
      | [To Kill a Mockingbird, Moby Dick]    | The Great Gatsby        | false  |
      | [War and Peace, Crime and Punishment] | War and Peace           | true   |
      | [Pride and Prejudice, Emma]           | Sense and Sensibility   | false  |
      | [The Hobbit, The Lord of the Rings]   | The Hobbit              | true   |
      | [The Catcher in the Rye]              | The Old Man and the Sea | false  |
      | [The Alchemist, The Da Vinci Code]    | The Alchemist           | true   |
