package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCheckIfListsSortedStep {

    private List<Double> numbersList;
    private Boolean result;

    @Given("the list of decimal numbers {listOfDoubles} to check if sorted")
    public void the_list_of_decimal_numbers_to_check_if_sorted(List<Double> numbersList) {
        this.numbersList = numbersList;
    }

    @When("I check if the list of decimal numbers is sorted in ascending order")
    public void i_check_if_the_list_of_decimal_numbers_is_sorted_in_ascending_order() {
        this.result = MethodsGeneric.isSortedAscending(numbersList);
    }

    @Then("the sorter result with decimal numbers should be {booleanValue}")
    public void the_sorter_result_with_decimal_numbers_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
