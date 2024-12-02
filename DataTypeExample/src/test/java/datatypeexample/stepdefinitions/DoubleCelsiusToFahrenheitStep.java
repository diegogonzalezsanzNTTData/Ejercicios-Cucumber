package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCelsiusToFahrenheitStep {

    private Double degreesCelsius;
    private Double degreesFahrenheit;

    @Given("the temperature in degrees Celsius is {double}")
    public void the_temperature_in_degrees_celsius_is(Double degreesCelsius) {
        this.degreesCelsius = degreesCelsius;
    }

    @When("I convert to Fahrenheit")
    public void i_convert_to_fahrenheit() {
        this.degreesFahrenheit = this.degreesCelsius * 9 / 5 + 32;
    }

    @Then("the result of converting degrees Celsius to Fahrenheit should be {double}")
    public void the_result_of_converting_degrees_celsius_to_fahrenheit_should_be(Double expectedResult) {
        assertEquals(degreesFahrenheit, expectedResult);
    }

}
