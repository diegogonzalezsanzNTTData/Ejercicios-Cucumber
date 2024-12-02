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

public class ListEmptyCheckStep {

    private final List<Object> elementsList = new ArrayList<>();
    private Boolean result;

    @Given("a list of elements:")
    public void a_list_of_elements(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            if (columns.get("elements") != null) {
                elementsList.add(MethodsGeneric.convertToAppropriateType(columns.get("elements")));
            }
        }
    }

    @When("I check if the list is empty")
    public void i_check_if_the_list_is_empty() {
        this.result = elementsList.isEmpty();
    }

    @Then("the result if the list is empty should be {booleanValue}")
    public void the_result_if_the_list_is_empty_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
