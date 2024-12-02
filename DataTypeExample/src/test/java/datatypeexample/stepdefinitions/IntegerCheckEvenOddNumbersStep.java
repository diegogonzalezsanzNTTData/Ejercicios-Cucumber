package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCheckEvenOddNumbersStep {

    private int number;
    private String result;

    @Given("the integer number {int}")
    public void the_integer_number(Integer number) {
        this.number = number;
    }

    @When("I check if the integer number is even or odd")
    public void i_check_if_the_integer_number_is_even_or_odd() {
        if (number % 2 == 0) {
            this.result = Constants.PARITY_STATUS.get(1);
        } else {
            this.result = Constants.PARITY_STATUS.get(0);
        }
    }

    @Then("the result of the integer number is even or odd should be {string}")
    public void the_result_of_the_integer_number_is_even_or_odd_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
