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

public class DoubleAverageCalculationStep {

    private final List<List<Double>> gradesList = new ArrayList<>();
    private final List<Double> averageList = new ArrayList<>();
    private final List<Double> averagesCalculated = new ArrayList<>();

    @Given("a list of decimal numbers:")
    public void a_list_of_decimal_numbers(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            this.gradesList.add(MethodsGeneric.convertStringToDoubleList(columns.get("grades")));
            this.averageList.add(Double.parseDouble(columns.get("average")));
        }
    }

    @When("I calculate the average of the list of decimal numbers")
    public void i_calculate_the_average_of_the_list_of_decimal_numbers() {
        for (List<Double> arrayGrade : gradesList) {
            this.averagesCalculated.add(MethodsGeneric.calculateAverage(arrayGrade));
        }
    }

    @Then("the result of the average of the list of decimal numbers should be correct")
    public void the_result_of_the_average_of_the_list_of_decimal_numbers_should_be_correct() {
        for (int pos = 0; pos < gradesList.size(); pos++) {
            assertEquals(averageList.get(pos), averagesCalculated.get(pos));
        }
    }

}
