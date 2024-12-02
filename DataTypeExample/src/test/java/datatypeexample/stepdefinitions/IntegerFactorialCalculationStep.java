package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.MethodsGeneric;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerFactorialCalculationStep {

    private Integer number;
    private Integer resultFactorialNumber;

    @Given("the number to calculate the factorial is {int}")
    public void the_number_to_calculate_the_factorial_is(Integer number) {
        this.number = number;
    }

    @When("I calculate the factorial")
    public void i_calculate_the_factorial() {
        this.resultFactorialNumber = MethodsGeneric.calculateFactorial(number);
    }

    @Then("the factorial of {int} should be {int}")
    public void the_factorial_of_should_be(Integer number, Integer expectedResult) {
        assertEquals(resultFactorialNumber, expectedResult);
    }

}
