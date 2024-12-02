Feature: Time Format Validation

  Scenario Outline: Validate time format
    Given the time "<time>"
    When I check the time format
    Then the time format should be "<result>"

    Examples:
      | time  | result  |
      | 14:30 | valid   |
      | 23:59 | valid   |
      | 25:00 | invalid |
      | 12:60 | invalid |
      | 09:15 | valid   |
      | 9:15  | valid   |
      | 9:75  | invalid |
      | 24:00 | invalid |

# Válido: hh:mm:ss
# Inválido: Horas fuera del rango permitido 25:00:00