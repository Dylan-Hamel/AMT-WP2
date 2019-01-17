package ch.heig.amt.steps;

import ch.heig.amt.ApiResponse;
import ch.heig.amt.helpers.Shared;
import ch.heig.amt.api.DefaultApi;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;


public class PasswordTooShortSteps {

    DefaultApi api;
    Shared shared;

    public PasswordTooShortSteps(Shared shared, DefaultApi api) {
        this.api = api;
        this.shared = shared;
    }

    @Given("^I have a user payload with weak password$")
    public void i_have_a_user_payload() throws Throwable {

        // a password too short
        shared.getUser().setPass("ab");
        assert shared.getUser() != null;
    }

    @When("^I send a POST request to the /users endpoint$")
    public void i_send_a_POST_request_to_the_users_endpoint() throws Throwable {

        DefaultApi api = new DefaultApi();
        ApiResponse<Object> userWithHttpInfo = api.createUserWithHttpInfo(shared.getUser());
        shared.setStatusCode(userWithHttpInfo.getStatusCode());
    }

    @Then("^I receive a (\\d+) status code 400$")
    public void i_receive_a_status_code400(int arg1) throws Throwable {

        assertEquals(arg1, shared.getStatusCode());
    }
}
