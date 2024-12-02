Feature: Date Format Validation

  Scenario Outline: Validate date format
    Given the date "<date>"
    When I check the date format
    Then the date format should be "<result>"

    Examples:
      | date       | result  |
      | 2024-09-17 | valid   |
      | 17-09-2024 | invalid |
      | 2024/09/17 | invalid |
      | 2023-12-25 | valid   |
      | 25-12-2023 | invalid |
      | 12-25-2023 | invalid |

# Válido: Formato YYYY-MM-DD (año-mes-día), que es estándar ISO 8601.
# Inválido: Formatos como DD-MM-YYYY, YYYY/MM/DD o MM-DD-YYYY.