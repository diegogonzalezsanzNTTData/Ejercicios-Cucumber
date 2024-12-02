package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleClassificationOfDecimalNumbersStep {

    private double number;
    private String result;

    @Given("the decimal number {double}")
    public void the_decimal_number(double number) {
        this.number = number;
    }

    @When("I classify the decimal number")
    public void i_classify_the_decimal_number() {
        if (number == 0) {
            this.result = Constants.CLASSIFY_NUMBERS.get(0);
        } else if (number > 0) {
            this.result = Constants.CLASSIFY_NUMBERS.get(1);
        } else {
            this.result = Constants.CLASSIFY_NUMBERS.get(2);
        }
    }

    @Then("the result of classify the decimal number should be {string}")
    public void the_result_of_classify_the_decimal_number_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
