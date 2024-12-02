package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerPrimeNumberCheckStep {

    private Integer number;
    private Boolean result;

    @Given("I enter the number {int}")
    public void i_enter_the_number(Integer number) {
        this.number = number;
    }

    @When("I check if the number is prime")
    public void i_check_if_the_number_is_prime() {
        this.result = MethodsGeneric.isPrime(number);
    }

    @Then("I should see the result as {booleanValue}")
    public void i_should_see_the_result_as(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
