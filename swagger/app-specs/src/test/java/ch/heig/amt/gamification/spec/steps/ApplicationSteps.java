package ch.heig.amt.gamification.spec.steps;

import ch.heig.amt.gamification.DefaultApi;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import ch.heig.amt.gamification.tests.ApiException;
import ch.heig.amt.gamification.tests.ApiResponse;
import ch.heig.amt.gamification.spec.helpers.Environment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Yannis Ansermoz on 07/01/19
 */
public class ApplicationSteps {

    private Environment environment;
    private DefaultApi api;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    public ApplicationSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a gamification server$")
    public void there_is_a_gamification_server() throws Throwable {
        assertNotNull(api);
    }

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(arg1, lastStatusCode);
    }


    @Given("^I have Badge payload$")
    public void i_have_Badge_payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I POST it to /badges endpoint$")
    public void i_POST_it_to_badges_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I GET all badges from /badges endpoint$")
    public void i_GET_all_badges_from_badges_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I DELETE the badge at the /badges endpoint$")
    public void i_DELETE_the_badge_at_the_badges_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a pointscale payload$")
    public void i_have_a_pointscale_payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I POST it to /pointscales endpoint$")
    public void i_POST_it_to_pointscales_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I GET all pointscales from /pointscales endpoint$")
    public void i_GET_all_pointscales_from_pointscales_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the result contains the correct pointscales$")
    public void the_result_contains_the_correct_pointscales() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I GET a pointscale from /pointscales/(\\d+) endpoint$")
    public void i_GET_a_pointscale_from_pointscales_id_endpoint(int id) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the pointscale is the correct pointscale$")
    public void the_pointscale_is_the_correct_pointscale() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a new pointScale payload$")
    public void i_have_a_new_pointScale_payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I PUT it to the /pointscales endpoint$")
    public void i_PUT_it_to_the_pointscales_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I DELETE the pointscale at the /pointscales endpoint$")
    public void i_DELETE_the_pointscale_at_the_pointscales_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @Given("^I have an event payload$")
    public void i_have_an_event_payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I POST it to the /events endpoint$")
    public void i_POST_it_to_the_events_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a new rules payload$")
    public void i_have_a_new_rules_payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I POST it to /events endpoint$")
    public void i_POST_it_to_events_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I GET all event rules from /rules endpoint$")
    public void i_GET_all_event_rules_from_rules_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the result contains the correct rules$")
    public void the_result_contains_the_correct_rules() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I GET a rule from /rules endpoint$")
    public void i_GET_a_rule_from_rules_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the rule is the correct poinruletscale$")
    public void the_rule_is_the_correct_poinruletscale() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a new rule payload$")
    public void i_have_a_new_rule_payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I GET a rule from the /rules endpoint$")
    public void i_GET_a_rule_from_the_rules_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I PUT it to the /rules endpoint$")
    public void i_PUT_it_to_the_rules_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I DELETE the rule at the /rules endpoint$")
    public void i_DELETE_the_rule_at_the_rules_endpoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
