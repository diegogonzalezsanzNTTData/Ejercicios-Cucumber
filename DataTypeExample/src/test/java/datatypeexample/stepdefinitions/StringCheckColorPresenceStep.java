package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckColorPresenceStep {

    private List<String> colorsList;
    private String colorIntroduce;
    private Boolean result;

    @Given("a list of colors {listOfStrings}")
    public void a_list_of_colors(List<String> colorsList) {
        this.colorsList = colorsList;
    }

    @Given("the color introduce is {string}")
    public void the_color_introduce_is(String colorIntroduce) {
        this.colorIntroduce = colorIntroduce;
    }

    @When("I check for the presence of color")
    public void i_check_for_the_presence_of_color() {
        this.result = colorsList.contains(colorIntroduce);
    }

    @Then("it should be determined that the presence of color: {booleanValue}")
    public void it_should_be_determined_that_the_presence_of_color(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
