package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCheckListContainsElementStep {

    private List<Integer> numbersList;
    private Boolean result;

    @Given("the list of values {listOfIntegers}")
    public void the_list_of_values(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    @When("I check if the list contains this integer number {int}")
    public void i_check_if_the_list_contains_this_integer_number(Integer number) {
        this.result = numbersList.contains(number);
    }

    @Then("the list contains elements result should be {booleanValue}")
    public void the_list_contains_elements_result_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
