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

public class ListSubsetCheckStep {

    private final List<Object> elementsListA = new ArrayList<>();
    private final List<Object> elementsListB = new ArrayList<>();
    private Boolean result;

    @Given("a list of objects to list A:")
    public void a_list_of_objects_to_list_a(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            if (columns.get("elements") != null) {
                elementsListA.add(MethodsGeneric.convertToAppropriateType(columns.get("elements")));
            }
        }
    }

    @Given("a list of objects to list B:")
    public void a_list_of_objects_to_list_b(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            if (columns.get("elements") != null) {
                elementsListB.add(MethodsGeneric.convertToAppropriateType(columns.get("elements")));
            }
        }
    }

    @When("I check if list A is a subset of list B")
    public void i_check_if_list_a_is_a_subset_of_list_b() {
        this.result = elementsListA.containsAll(elementsListB);
    }

    @Then("the result if list A is an subset of list B should be {booleanValue}")
    public void the_result_if_list_a_is_an_subset_of_list_b_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
