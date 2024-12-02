package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.RegexUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFormatValidationStep {

    private String date;
    private String result;

    @Given("the date {string}")
    public void the_date(String date) {
        this.date = date;
    }

    @When("I check the date format")
    public void i_check_the_date_format() {
        this.result = RegexUtils.isValidDate(date) ? "valid" : "invalid";
    }

    @Then("the date format should be {string}")
    public void the_date_format_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
