package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerNumberInRangeCheckStep {

    private Integer number;
    private Integer minNumber;
    private Integer maxNumber;
    private Boolean result;

    @Given("the range is between {int} and {int}")
    public void the_range_is_between_and(Integer minNumber, Integer maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    @Given("the number introduced is {int}")
    public void the_number_introduced_is(Integer number) {
        this.number = number;
    }

    @When("I check if the number is within the range")
    public void i_check_if_the_number_is_within_the_range() {
        this.result = number <= maxNumber && number >= minNumber;
    }

    @Then("the number {int} should be within the range {int} and {int}: {booleanValue}")
    public void the_number_should_be_within_the_range_and(Integer number, Integer minNumber, Integer maxNumber,
                                                          Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
