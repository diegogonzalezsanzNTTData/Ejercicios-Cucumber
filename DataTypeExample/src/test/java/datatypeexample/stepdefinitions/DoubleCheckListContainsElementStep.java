package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCheckListContainsElementStep {

    private List<Double> numbersList;
    private Boolean result;

    @Given("the list of decimal numbers {listOfDoubles}")
    public void the_list_of_decimal_numbers(List<Double> numbersList) {
        this.numbersList = numbersList;
    }

    @When("I check if the list contains this decimal number {double}")
    public void i_check_if_the_list_contains_this_decimal_number(Double number) {
        this.result = numbersList.contains(number);
    }

    @Then("the list contains element result should be {booleanValue}")
    public void the_list_contains_element_result_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
