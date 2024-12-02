package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerArrayGreaterThanValueStep {

    private final List<Integer> numberList = new ArrayList<>();
    private Boolean result;

    @Given("an array of numbers:")
    public void an_array_of_numbers(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            numberList.add(Integer.parseInt(columns.get("numbers")));
        }
    }

    @When("I check if all integer numbers are greater than {int}")
    public void i_check_if_all_integer_numbers_are_greater_than(Integer number) {
        for (Integer elem : numberList) {
            if (elem < number) {
                this.result = false;
                return;
            }
        }
        this.result = true;
    }

    @Then("the result of whether all integer numbers are greater than the provided value should be {booleanValue}")
    public void the_result_of_whether_all_integer_numbers_are_greater_than_the_provided_value_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
