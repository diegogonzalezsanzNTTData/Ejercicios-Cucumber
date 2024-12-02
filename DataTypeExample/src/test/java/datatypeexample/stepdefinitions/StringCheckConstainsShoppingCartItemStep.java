package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckConstainsShoppingCartItemStep {

    private List<String> itemsList;
    private String itemIntroduce;
    private Boolean result;

    @Given("a list of items in the cart {listOfStrings}")
    public void a_list_of_items_in_the_cart(List<String> itemsList) {
        this.itemsList = itemsList;
    }

    @Given("the item introduce is {string}")
    public void the_item_introduce_is(String itemIntroduce) {
        this.itemIntroduce = itemIntroduce;
    }

    @When("I check for the presence of item")
    public void i_check_for_the_presence_of_item() {

        this.result = itemsList.contains(itemIntroduce);
    }

    @Then("it should be determined that the presence of item: {booleanValue}")
    public void it_should_be_determined_that_the_presence_of_item(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
