package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashmapContainsKeyStep {

    private final HashMap<String, String> keyValue = new HashMap<>();
    private Boolean result;

    @Given("a map containing the following key-value pairs:")
    public void a_map_with_the_following_key_value_pairs(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            String key = columns.get("key");
            String value = columns.get("value");

            if (value != null && !value.isEmpty() || key != null && !key.isEmpty()) {
                this.keyValue.put(key, value);
            }
        }
    }

    @When("I search for the key {string}")
    public void i_search_for_the_key(String keySearch) {
        this.result = keyValue.containsKey(keySearch);
    }

    @Then("the result of searching for {string} should be {booleanValue}")
    public void the_result_of_searching_for_should_be(String keySearch, Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
