package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleArrayGreaterThanValueStep {

    private List<Double> numbersList;
    private Boolean result;

    @Given("an array of decimal numbers {listOfDoubles}")
    public void an_array_of_decimal_numbers(List<Double> numbersList) {
        this.numbersList = numbersList;
    }

    @When("I check if all decimal numbers are greater than {double}")
    public void i_check_if_all_decimal_numbers_are_greater_than(Double number) {
        for (double elem : numbersList) {
            if (elem < number) {
                this.result = false;
                return;
            }
        }
        this.result = true;
    }

    @Then("the result of whether all decimal numbers are greater than the provided value should be {booleanValue}")
    public void the_result_of_whether_all_decimal_numbers_are_greater_than_the_provided_value_should_be(
            Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
