package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashmapContainsValueStep {

    private final HashMap<String, String> keyValue = new HashMap<>();
    private Boolean result;

    @Given("a key-value pair map with the following entries:")
    public void a_key_value_pair_map_with_the_following_entries(DataTable dataTable) {

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            String key = columns.get("key");
            String value = columns.get("value");

            if (value != null && !value.isEmpty() || key != null && !key.isEmpty()) {
                this.keyValue.put(key, value);
            }
        }
    }

    @When("I search for the value {string}")
    public void i_search_for_the_value(String valueSearch) {
        this.result = keyValue.containsValue(valueSearch);
    }

    @Then("it should be {booleanValue} that the value {string} exists in the map")
    public void it_should_be_true_that_the_value_exists_in_the_map(Boolean expectedResult, String valueSearch) {
        assertEquals(result, expectedResult);
    }

}
