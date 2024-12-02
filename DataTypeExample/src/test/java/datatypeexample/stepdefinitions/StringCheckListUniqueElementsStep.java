package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckListUniqueElementsStep {

    private List<String> stringsList;
    private Boolean result;

    @Given("the list of elements {listOfStrings}")
    public void the_list_of_elements(List<String> stringsList) {
        this.stringsList = stringsList;
    }

    @When("I check if the list has all unique elements")
    public void i_check_if_the_list_has_all_unique_elements() {
        Set<String> uniqueElements = new HashSet<>(stringsList);

        this.result = uniqueElements.size() == stringsList.size();
    }

    @Then("the list uniqueness result should be {booleanValue}")
    public void the_list_uniqueness_result_should_be(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
