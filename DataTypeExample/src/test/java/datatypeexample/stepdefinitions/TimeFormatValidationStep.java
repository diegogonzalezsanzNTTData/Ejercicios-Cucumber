package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.RegexUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeFormatValidationStep {

    private String time;
    private String result;

    @Given("the time {string}")
    public void the_time(String time) {
        this.time = time;
    }

    @When("I check the time format")
    public void i_check_the_time_format() {
        this.result = RegexUtils.isValidTime(time) ? "valid" : "invalid";
    }

    @Then("the time format should be {string}")
    public void the_time_format_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
