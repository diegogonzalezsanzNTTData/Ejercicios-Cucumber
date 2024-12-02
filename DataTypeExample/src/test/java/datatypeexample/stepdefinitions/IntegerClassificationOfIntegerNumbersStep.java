package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerClassificationOfIntegerNumbersStep {

    private Integer number;
    private String result;

    @Given("the integer number requested is {int}")
    public void the_integer_number_requested_is(Integer number) {
        this.number = number;
    }

    @When("I classify the integer number")
    public void i_classify_the_integer_number() {
        if (number == 0) {
            this.result = Constants.CLASSIFY_NUMBERS.get(0);
        } else if (number > 0) {
            this.result = Constants.CLASSIFY_NUMBERS.get(1);
        } else {
            this.result = Constants.CLASSIFY_NUMBERS.get(2);
        }
    }

    @Then("the result of classifying the integer number should be {string}")
    public void the_result_of_classifying_the_integer_number_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
