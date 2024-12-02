package datatypeexample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;
import utilities.object_sum_list_integer.SumListInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCalculatedAverageListStep {

    private final List<SumListInteger> gradesAndAverageList = new ArrayList<>();
    private final List<Double> averagesCalculated = new ArrayList<>();

    @Given("a list of integers:")
    public void a_list_of_integers(DataTable dataTable) {

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            this.gradesAndAverageList
                    .add(new SumListInteger(MethodsGeneric.convertStringToIntegerList(columns.get("grades")),
                            Double.parseDouble(columns.get("average"))));
        }

    }

    @When("I calculate the average of the list of integers")
    public void i_calculate_the_average_of_the_list_of_integers() {
        for (SumListInteger elem : gradesAndAverageList) {
            double averageTotal = 0.0;
            for (int number : elem.getListNumbers()) {
                averageTotal += number;
            }

            this.averagesCalculated.add((averageTotal / elem.getListNumbers().size()));
        }
    }

    @Then("the result of the average of the list of integers should be correct")
    public void the_result_of_the_average_of_the_list_of_integers_should_be_correct() {
        List<Double> allAverage = new ArrayList<>();

        for (int pos = 0; pos < gradesAndAverageList.size(); pos++) {
            allAverage.add(gradesAndAverageList.get(pos).getAverage());
        }
        assertEquals(allAverage, averagesCalculated);
    }

}
