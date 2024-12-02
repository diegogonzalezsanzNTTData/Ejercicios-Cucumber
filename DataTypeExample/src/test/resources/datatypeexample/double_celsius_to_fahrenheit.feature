Feature: Convert temperature from Celsius to Fahrenheit

  Scenario Outline: Convert degrees Celsius to Fahrenheit
    Given the temperature in degrees Celsius is <celsius>
    When I convert to Fahrenheit
    Then the result of converting degrees Celsius to Fahrenheit should be <fahrenheit>

    Examples:
      | celsius | fahrenheit |
      | 0.0     | 32.0       |
      | 25.0    | 77.0       |
      | 100.0   | 212.0      |
      | -40.0   | -40.0      |
