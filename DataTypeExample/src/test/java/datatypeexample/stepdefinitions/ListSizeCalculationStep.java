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

public class ListSizeCalculationStep {

    private final List<Object> elementsList = new ArrayList<>();
    private Integer result;

    @Given("a list of objects elements:")
    public void a_list_of_objects_elements(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            if (columns.get("elements") != null) {
                elementsList.add(MethodsGeneric.convertToAppropriateType(columns.get("elements")));
            }
        }
    }

    @When("I calculate the size of the list")
    public void i_calculate_the_size_of_the_list() {
        this.result = elementsList.size();
    }

    @Then("the result of the size should be {int}")
    public void the_result_of_the_size_should_be(Integer expectedResult) {
        assertEquals(result, expectedResult);
    }

}
