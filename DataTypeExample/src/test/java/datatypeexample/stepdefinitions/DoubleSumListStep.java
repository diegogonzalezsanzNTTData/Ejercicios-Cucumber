package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleSumListStep {

    private final List<Double> numbersList = new ArrayList<>();
    private Double sumTotal = 0.0;

    @Given("a list of decimal numbers to calculate a sum:")
    public void a_list_of_decimal_numbers_to_calculate_a_sum(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            this.numbersList.add(Double.parseDouble(columns.get("numbers")));
        }
    }

    @When("I calculate the sum of the list of decimal numbers")
    public void i_calculate_the_sum_of_the_list_of_decimal_numbers() {
        for (Double number : numbersList) {
            this.sumTotal += number;
        }
    }

    @Then("the result of the list of decimal numbers should be {double}")
    public void the_result_of_the_list_of_decimal_numbers_should_be(Double expectedResult) {
        assertEquals(sumTotal, expectedResult);
    }

}
