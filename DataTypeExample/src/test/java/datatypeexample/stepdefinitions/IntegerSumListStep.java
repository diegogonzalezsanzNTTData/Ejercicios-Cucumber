package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerSumListStep {

    private final List<Integer> numbersList = new ArrayList<>();
    private Integer sumTotal = 0;

    @Given("a list of integer numbers to calculate a sum:")
    public void a_list_of_integer_numbers_to_calculate_a_sum(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            numbersList.add(Integer.parseInt(columns.get("numbers")));
        }
    }

    @When("I calculate the sum of the list of integers")
    public void i_calculate_the_sum_of_the_list_of_integers() {
        for (Integer number : numbersList) {
            this.sumTotal += number;
        }
    }

    @Then("the result of the list of integers numbers should be {int}")
    public void the_result_of_the_list_of_integers_numbers_should_be(Integer expectedResult) {
        assertEquals(sumTotal, expectedResult);
    }

}
