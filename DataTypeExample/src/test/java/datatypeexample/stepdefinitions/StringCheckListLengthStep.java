package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckListLengthStep {

    private List<String> wordsList;
    private int sizeList;

    @Given("the list of items {listOfStrings}")
    public void the_list_of_items(List<String> wordsList) {
        this.wordsList = wordsList;
    }

    @When("I check the length of the list")
    public void i_check_the_length_of_the_list() {
        this.sizeList = wordsList.size();
    }

    @Then("the length of the list should be {int}")
    public void the_length_of_the_list_should_be(Integer expectedResult) {
        assertEquals(sizeList, expectedResult);
    }

}
