package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleCheckSubListInMatrixStep {

    List<List<Double>> matrixDouble;
    private Boolean result;

    @Given("the matrix with doubles {matrixOfDoubles}")
    public void the_matrix_with_doubles(List<List<Double>> matrixDouble) {
        this.matrixDouble = matrixDouble;
    }

    @When("I check if the matrix with doubles contains the sublist {listOfDoubles}")
    public void i_check_if_the_matrix_with_doubles_contains_the_sublist(List<Double> numbersList) {
        this.result = matrixDouble.stream()
                .anyMatch(row -> row.containsAll(numbersList));
    }

    @Then("it should be {booleanValue} that the matrix with doubles contains the sublist {listOfDoubles}")
    public void it_should_be_that_the_matrix_with_doubles_contains_the_sublist(Boolean expectedResult, List<Double> numbersList) {
        assertEquals(result, expectedResult);
    }

}
