package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckWordInListStep {

    private List<String> stringsList;
    private Boolean result;

    @Given("the list of strings {listOfStrings}")
    public void the_list_of_strings(List<String> stringsList) {
        this.stringsList = stringsList;
    }

    @When("I check if the list contains the word {string}")
    public void i_check_if_the_list_contains_the_word(String wordUser) {
        for (String word : stringsList) {
            if (word.equals(wordUser)) {
                this.result = true;
                return;
            }
        }
        this.result = false;
    }

    @Then("it should be {booleanValue} that the list contains the word {string}")
    public void it_should_be_that_the_list_contains_the_word(Boolean expectedResult, String word) {
        assertEquals(result, expectedResult);
    }

}
