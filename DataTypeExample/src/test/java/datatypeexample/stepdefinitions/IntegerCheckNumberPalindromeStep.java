package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerCheckNumberPalindromeStep {

    private Integer number;
    private Boolean result;

    @Given("the number is {int}")
    public void the_number_is(Integer number) {
        this.number = number;
    }

    @When("I check if the number is a palindrome")
    public void i_check_if_the_number_is_a_palindrome() {
        this.result = MethodsGeneric.validPalindrome(String.valueOf(number));
    }

    @Then("the result should be {booleanValue}")
    public void the_result_should_be_true(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
