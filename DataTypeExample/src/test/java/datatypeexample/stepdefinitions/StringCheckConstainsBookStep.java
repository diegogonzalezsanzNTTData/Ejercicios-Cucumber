package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckConstainsBookStep {

    private List<String> booksList;
    private String bookIntroduce;
    private Boolean result;

    @Given("a list of books {listOfStrings}")
    public void a_list_of_books(List<String> booksList) {
        this.booksList = booksList;
    }

    @Given("the book introduce is {string}")
    public void the_book_introduce_is(String bookIntroduce) {
        this.bookIntroduce = bookIntroduce;
    }

    @When("I check for the presence of book")
    public void i_check_for_the_presence_of_book() {
        this.result = booksList.contains(bookIntroduce);
    }

    @Then("it should be determined that the presence of book: {booleanValue}")
    public void it_should_be_determined_that_the_presence_of_book(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
