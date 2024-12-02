package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashmapValueRetrievalStep {

    private final HashMap<String, String> keyValue = new HashMap<>();
    private String result;

    @Given("a set of entries in the map as follows:")
    public void a_set_of_entries_in_the_map_as_follows(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            String key = columns.get("key");
            String value = columns.get("value");

            if (value != null && !value.isEmpty() || key != null && !key.isEmpty()) {
                this.keyValue.put(key, value);
            }
        }
    }

    @When("I search for the value of the key {string}")
    public void i_search_for_the_value_of_the_key(String keySearch) {
        String value = keyValue.get(keySearch);
        this.result = (value != null) ? value : "null";
    }

    @Then("the value should be {string}")
    public void the_value_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
