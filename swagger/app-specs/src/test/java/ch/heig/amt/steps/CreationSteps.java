package ch.heig.amt.steps;

import ch.heig.amt.ApiResponse;
import ch.heig.amt.helpers.Shared;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ch.heig.amt.api.DefaultApi;

import static org.junit.Assert.*;


public class CreationSteps {

    DefaultApi api;
    Shared shared;

    public CreationSteps(Shared shared, DefaultApi api) {
        this.api = api;
        this.shared = shared;
    }

    @Given("^there is a messaging server$")
    public void there_is_a_messaging_server() throws Throwable {
        assert true;
    }

    @Given("^I have a user payload$")
    public void i_have_a_user_payload() throws Throwable {

        assert shared.getUser() != null;
    }

    @When("^I POST it to the /users endpoint$")
    public void i_POST_it_to_the_users_endpoint() throws Throwable {

        DefaultApi api = new DefaultApi();
        ApiResponse<Object> fruitWithHttpInfo = api.createUserWithHttpInfo(shared.getUser());
        shared.setStatusCode(fruitWithHttpInfo.getStatusCode());
    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {

        assertEquals(arg1, shared.getStatusCode());
    }
}
