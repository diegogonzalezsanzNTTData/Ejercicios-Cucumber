package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAccessByRoleStep {

    private final ArrayList<String> ALLOWED_ROLES = new ArrayList<String>(Arrays.asList("admin", "editor", "manager",
            "supervisor", "owner"));

    private final ArrayList<String> DENIED_ROLES = new ArrayList<String>(
            Arrays.asList("viewer", "guest", "anonymous", "banned", "restricted"));

    private String role;
    private String result;

    @Given("the user has the role {string}")
    public void the_user_has_the_role(String role) {
        this.role = role;
    }

    @When("I attempt to access the protected resource")
    public void i_attempt_to_access_the_protected_resource() {
        if (ALLOWED_ROLES.contains(role)) {
            this.result = "allowed";
        } else if (DENIED_ROLES.contains(role)) {
            this.result = "denied";
        } else {
            this.result = "unknown";
        }
    }

    @Then("the access should be {string}")
    public void the_access_should_be(String expectedResult) {
        assertEquals(result, expectedResult);
    }

}
