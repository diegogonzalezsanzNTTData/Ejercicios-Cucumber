package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckConstainsProgrammingLanguageStep {

    private List<String> programmingLanguageList;
    private String programmingLanguageIntroduce;
    private Boolean result;

    @Given("a list of programming languages {listOfStrings}")
    public void a_list_of_programming_languages(List<String> programmingLanguageList) {
        this.programmingLanguageList = programmingLanguageList;
    }

    @Given("the language introduce is {string}")
    public void the_language_introduce_is(String programmingLanguageIntroduce) {
        this.programmingLanguageIntroduce = programmingLanguageIntroduce;
    }

    @When("I check for the presence of language")
    public void i_check_for_the_presence_of_language() {
        this.result = programmingLanguageList.contains(programmingLanguageIntroduce);
    }

    @Then("it should be determined that the presence of language: {booleanValue}")
    public void it_should_be_determined_that_the_presence_of_language(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
