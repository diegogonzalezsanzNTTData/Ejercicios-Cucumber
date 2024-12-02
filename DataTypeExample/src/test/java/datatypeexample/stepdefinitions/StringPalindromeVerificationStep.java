package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringPalindromeVerificationStep {

    private String word;
    private Boolean result;

    @Given("the word {string}")
    public void the_word(String word) {
        this.word = word;
    }

    @When("I check if the word is a palindrome")
    public void i_check_if_the_word_is_a_palindrome() {
        this.result = MethodsGeneric.validPalindrome(word);
    }

    @Then("the result of whether the word is a palindrome should be {booleanValue}")
    public void the_result_of_whether_the_word_is_a_palindrome_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
