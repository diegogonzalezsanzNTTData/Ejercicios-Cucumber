package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCompareIntegerArraysAreEqualsStep {

    private final List<Integer> numbersFirstList = new ArrayList<>();
    private final List<Integer> numbersSecondList = new ArrayList<>();
    private Boolean result;

    @Given("the first array of numbers:")
    public void the_first_array_of_numbers(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            this.numbersFirstList.add(Integer.parseInt(columns.get("numbers")));
        }
    }

    @Given("the second array of numbers:")
    public void the_second_array_of_numbers(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            this.numbersSecondList.add(Integer.parseInt(columns.get("numbers")));
        }
    }

    @When("I compare the arrays")
    public void i_compare_the_arrays() {
        this.result = numbersFirstList.equals(numbersSecondList);
    }

    @Then("the result verify two arrays of integers are equal should be {booleanValue}")
    public void the_result_verify_two_arrays_of_integers_are_equal_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
