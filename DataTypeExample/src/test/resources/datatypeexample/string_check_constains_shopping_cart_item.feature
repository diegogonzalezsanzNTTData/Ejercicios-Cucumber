Feature: Validate presence of items in a shopping cart

  Scenario Outline: Check if specific items are present
    Given a list of items in the cart <items>
    And the item introduce is "<item>"
    When I check for the presence of item
    Then it should be determined that the presence of item: <result>

    Examples:
      | items                        | item        | result |
      | [milk, bread, eggs]          | eggs        | true   |
      | [apples, oranges]            | bananas     | false  |
      | [chocolate, chips]           | chips       | true   |
      | [soap, shampoo]              | conditioner | false  |
      | [detergent, fabric softener] | detergent   | true   |
      | [soda, juice]                | water       | false  |
      | [meat, fish]                 | chicken     | false  |
