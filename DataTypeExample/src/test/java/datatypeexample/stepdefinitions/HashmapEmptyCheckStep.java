package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashmapEmptyCheckStep {

    private final HashMap<String, String> keyValue = new HashMap<>();
    private Boolean result;

    @Given("a hashmap that includes these key-value pairs:")
    public void a_hashmap_that_includes_these_key_value_pairs(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            String key = columns.get("key");
            String value = columns.get("value");

            if (value != null && !value.isEmpty() || key != null && !key.isEmpty()) {
                this.keyValue.put(key, value);
            }
        }
    }

    @When("I check if the map is empty")
    public void i_check_if_the_map_is_empty() {
        this.result = keyValue.isEmpty();
    }

    @Then("it should be {booleanValue} that the hashmap is empty")
    public void it_should_be_true_that_the_hashmap_is_empty(Boolean expectedResult) {
        assertEquals(expectedResult, result);
    }

}
