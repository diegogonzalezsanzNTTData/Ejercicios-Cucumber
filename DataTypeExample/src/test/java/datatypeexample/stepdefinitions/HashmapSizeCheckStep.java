package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashmapSizeCheckStep {

    private final HashMap<String, String> keyValue = new HashMap<>();
    private Integer result;

    @Given("a collection of key-value pairs in a map:")
    public void a_collection_of_key_value_pairs_in_a_map(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            String key = columns.get("key");
            String value = columns.get("value");

            if (value != null && !value.isEmpty() || key != null && !key.isEmpty()) {
                this.keyValue.put(key, value);
            }
        }
    }

    @When("I count the elements in the map")
    public void i_count_the_elements_in_the_map() {
        this.result = keyValue.size();
    }

    @Then("the size should be {int}")
    public void the_size_should_be(Integer expectedResult) {
        assertEquals(result, expectedResult);
    }

}
