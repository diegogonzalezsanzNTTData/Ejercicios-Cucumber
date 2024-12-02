package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCheckEvenOddNumbersStep {

    private Integer number;
    private String result;

    @Given("the decimal number to identify is even or odd {int}")
    public void the_decimal_number_to_identify_is_even_or_odd(Integer number) {
        this.number = number;
    }

    @When("I check if the decimal number is even or odd")
    public void i_check_if_the_decimal_number_is_even_or_odd() {
        if (number % 2 == 0) {
            this.result = Constants.PARITY_STATUS.get(1);
        } else {
            this.result = Constants.PARITY_STATUS.get(0);
        }
    }

    @Then("the result of the decimal number is even or odd should be {string}")
    public void the_result_of_the_decimal_number_is_even_or_odd_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
