package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckAnagramWordStep {

    private String firstWord;
    private String secondWord;
    private Boolean result;

    @Given("the first word is {string}")
    public void the_first_word_is(String word) {
        this.firstWord = word;
    }

    @Given("the second word is {string}")
    public void the_second_word_is(String word) {
        this.secondWord = word;
    }

    @When("I check if they are anagrams")
    public void i_check_if_they_are_anagrams() {
        this.result = MethodsGeneric.iCheckIfTheyAreAnagrams(firstWord, secondWord);
    }

    @Then("it should be determined that the words are anagrams: {booleanValue}")
    public void it_should_be_determined_that_the_words_are_anagrams(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
