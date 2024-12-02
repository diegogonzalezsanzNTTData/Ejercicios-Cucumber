package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringWordContainsLetterStep {

    private String word;
    private Boolean result;

    @Given("the word introduce is {string}")
    public void the_word_introduce_is(String word) {
        this.word = word;
    }

    @When("I search for the letter {string}")
    public void i_search_for_the_letter(String letter) {
        this.result = word.contains(letter);
    }

    @Then("the result to search for the letter {string} should be {booleanValue}")
    public void the_result_to_search_for_the_letter_should_be(String string, Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
