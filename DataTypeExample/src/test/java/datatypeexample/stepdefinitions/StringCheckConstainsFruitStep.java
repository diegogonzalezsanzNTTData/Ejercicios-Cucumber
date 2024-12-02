package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckConstainsFruitStep {

    private List<String> fruitsList;
    private String fruitIntroduce;
    private Boolean result;

    @Given("a list of fruits {listOfStrings}")
    public void a_list_of_fruits(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

    @Given("the fruit introduce is {string}")
    public void the_fruit_introduce_is(String fruitIntroduce) {
        this.fruitIntroduce = fruitIntroduce;
    }

    @When("I check for the presence of fruit")
    public void i_check_for_the_presence_of_fruit() {
        this.result = fruitsList.contains(fruitIntroduce);
    }

    @Then("it should be determined that the presence of fruit: {booleanValue}")
    public void it_should_be_determined_that_the_presence_of_fruit(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
