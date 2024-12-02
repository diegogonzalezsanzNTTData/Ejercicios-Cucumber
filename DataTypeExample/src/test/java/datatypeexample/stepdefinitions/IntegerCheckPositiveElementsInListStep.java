package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCheckPositiveElementsInListStep {

    private List<Integer> numbersList;
    private Boolean result;

    @Given("the list of numbers {listOfIntegers}")
    public void the_list_of_numbers(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    @When("I check if all elements in the list are positive")
    public void i_check_if_all_elements_in_the_list_are_positive() {
        for (int number : numbersList) {
            if (number < 0) {
                this.result = false;
                return;
            }
        }
        this.result = true;
    }

    @Then("the result of all elements are positive should be {booleanValue}")
    public void the_result_of_all_elements_are_positive_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
