package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCheckSubListInMatrixStep {

    List<List<Integer>> matrixIntegers;
    private Boolean result;

    @Given("the matrix with integers {matrixOfIntegers}")
    public void the_matrix_with_integers(List<List<Integer>> matrixIntegers) {
        this.matrixIntegers = matrixIntegers;
    }

    @When("I check if the matrix with integers contains the sublist {listOfIntegers}")
    public void i_check_if_the_matrix_with_integers_contains_the_sublist(List<Integer> numbersList) {
        this.result = matrixIntegers.stream()
                .anyMatch(row -> row.containsAll(numbersList));
    }

    @Then("it should be {booleanValue} that the matrix with integers contains the sublist {listOfIntegers}")
    public void it_should_be_that_the_matrix_with_integers_contains_the_sublist(Boolean expectedResult, List<Integer> numbersList) {
        assertEquals(result, expectedResult);
    }

}
