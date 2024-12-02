package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckConstainsAnimalStep {

    private List<String> animalsList;
    private String animalIntroduce;
    private Boolean result;

    @Given("a list of animals {listOfStrings}")
    public void a_list_of_animals(List<String> animalsList) {
        this.animalsList = animalsList;
    }

    @Given("the animal introduce is {string}")
    public void the_animal_introduce_is(String animalIntroduce) {
        this.animalIntroduce = animalIntroduce;
    }

    @When("I check for the presence of animal")
    public void i_check_for_the_presence_of_animal() {
        this.result = animalsList.contains(animalIntroduce);
    }

    @Then("it should be determined that the presence of animal: {booleanValue}")
    public void it_should_be_determined_that_the_presence_of_animal(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }
}
