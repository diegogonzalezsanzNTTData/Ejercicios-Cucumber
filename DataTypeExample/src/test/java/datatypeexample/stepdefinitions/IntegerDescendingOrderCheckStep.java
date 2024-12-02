package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerDescendingOrderCheckStep {

    private final List<Integer> numbersList = new ArrayList<>();
    private Boolean result;

    @Given("a list of numbers:")
    public void a_list_of_numbers(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            this.numbersList.add(Integer.parseInt(columns.get("numbers")));
        }
    }

    @When("I check if the list is in descending order")
    public void i_check_if_the_list_is_in_descending_order() {
        this.result = MethodsGeneric.isSortedDescending(numbersList);
    }

    @Then("the result if the list is in descending order should be {booleanValue}")
    public void the_result_if_the_list_is_in_descending_order_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
