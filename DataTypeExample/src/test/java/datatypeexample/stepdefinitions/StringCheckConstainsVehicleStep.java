package datatypeexample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCheckConstainsVehicleStep {

    private List<String> vehiclesList;
    private String vehicleIntroduce;
    private Boolean result;

    @Given("a list of vehicles {listOfStrings}")
    public void a_list_of_vehicles(List<String> vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

    @Given("the vehicle introduce is {string}")
    public void the_vehicle_introduce_is(String vehicleIntroduce) {
        this.vehicleIntroduce = vehicleIntroduce;
    }

    @When("I check for the presence of vehicle")
    public void i_check_for_the_presence_of_vehicle() {
        this.result = vehiclesList.contains(vehicleIntroduce);
    }

    @Then("it should be determined that the presence of vehicle: {booleanValue}")
    public void it_should_be_determined_that_the_presence_of_vehicle(Boolean expectedResult) {
        assertEquals(result, expectedResult);
    }

}
