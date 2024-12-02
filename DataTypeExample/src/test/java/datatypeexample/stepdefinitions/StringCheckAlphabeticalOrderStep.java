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

public class StringCheckAlphabeticalOrderStep {

    private final List<String> wordsList = new ArrayList<>();
    private String result;

    @Given("a list of words:")
    public void a_list_of_words(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            wordsList.add(columns.get("words"));
        }
    }

    @When("I check if the list is in alphabetical order")
    public void i_check_if_the_list_is_in_alphabetical_order() {
        this.result = MethodsGeneric.isAlphabeticallySorted(wordsList) ? "ordered" : "unordered";
    }

    @Then("it should be determined that the list is in alphabetical order: {string}")
    public void it_should_be_determined_that_the_list_is_in_alphabetical_order(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
