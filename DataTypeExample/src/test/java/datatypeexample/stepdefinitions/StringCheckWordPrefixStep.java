package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckWordPrefixStep {

    private String word;
    private Boolean result;

    @Given("the word is {string}")
    public void the_word_is(String word) {
        this.word = word;
    }

    @When("I check if it starts with {string}")
    public void i_check_if_it_starts_with(String prefix) {
        this.result = word.startsWith(prefix);
    }

    @Then("the result if it starts with {string} should be {booleanValue}")
    public void the_result_if_it_starts_with_should_be(String prefix, Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
