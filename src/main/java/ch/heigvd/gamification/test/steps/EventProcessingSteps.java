package ch.heigvd.gamification.test.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EventProcessingSteps {

    @Given("^a user U(\\d+) of the gamified application A(\\d+)$")
    public void a_user_U_of_the_gamified_application_A(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the application detects that user U(\\d+) is producing an event$")
    public void the_application_detects_that_user_U_is_producing_an_event(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the application POSTs (\\d+) payload on the /events endpoint$")
    public void the_application_POSTs_payload_on_the_events_endpoint(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();}

    @Then("^it receives a (\\d+) status code$")
    public void it_receives_a_status_code(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the application GETs the user U(\\d+) from the /users/ endpoint$")
    public void the_application_GETs_the_user_U_from_the_users_endpoint(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the payload in the response has a property numberOfEvents with a value of (\\d+)$")
    public void the_payload_in_the_response_has_a_property_numberOfEvents_with_a_value_of(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
