package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCheckPositiveElementsInListStep {

    private List<Double> numbersList;
    private Boolean result;

    @Given("I have the list of decimal numbers {listOfDoubles}")
    public void i_have_the_list_of_decimal_numbers(List<Double> numbersList) {
        this.numbersList = numbersList;
    }

    @When("I evaluate whether all elements in the list are positive")
    public void i_evaluate_whether_all_elements_in_the_list_are_positive() {
        for (double number : numbersList) {
            if (number < 0) {
                this.result = false;
                return;
            }
        }
        this.result = true;
    }

    @Then("I should see that the result of all elements being positive is {booleanValue}")
    public void i_should_see_that_the_result_of_all_elements_being_positive_is(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
