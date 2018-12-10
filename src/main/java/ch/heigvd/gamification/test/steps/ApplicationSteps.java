package ch.heigvd.gamification.test.steps;

import ch.heigvd.gamification.model.Registration;
import ch.heigvd.gamification.model.RegistrationSummary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.annotations.ApiResponse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ApplicationSteps {

    private int statusCode;

    // private final Default api new DefaultApi();

    private Registration registration;
    private RegistrationSummary registrationSummary;

    @When("^I POST it to the /registration endpoint$")
    public void i_POST_it_to_the_registration_endpoint() throws Throwable {
        // api.RegistrationPost(registration);
        // ApiResponse res = api.registrationPostWithHTTPInfo(registration);
        // statusCode = res.getStatusCode();
    }

    @When("^I ask for a list of registered apps with a GET on the /registration endpoint$")
    public void i_ask_for_a_list_of_registered_apps_with_a_GET_on_the_registration_endpoint() throws Throwable {
        // registrations = api.registrationGet();
    }

    @Then("^I see my app in the list$")
    public void i_see_my_app_in_the_list() throws Throwable {
        RegistrationSummary rs = new RegistrationSummary();
        rs.setApplicationName(registration.getName());

        // assertThat(registrations).extracting("applicationName").contains("MyApplication");
    }

    @Given("^I have an application payload$")
    public void i_have_an_application_payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        registration = new Registration();
        registration.setName("MyApp");
        registration.setPassword("Test123");
        throw new PendingException();
    }

    @When("^I POST it to the registration$")
    public void i_POST_it_to_the_registration() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg1, statusCode);
        throw new PendingException();
    }

}
