package ch.heig.amt.gamification.spec.steps;

import ch.heig.amt.gamification.DefaultApi;
import ch.heig.amt.gamification.tests.model.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import ch.heig.amt.gamification.tests.ApiException;
import ch.heig.amt.gamification.tests.ApiResponse;
import ch.heig.amt.gamification.spec.helpers.Environment;
import org.junit.Rule;
import org.threeten.bp.OffsetDateTime;

import java.util.List;

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

    //variables de tests
    private String token = "fcb3cd0c1efd8afe09d0505e46cefa4c";
    private BadgeDTO badge;
    private List<BadgeDTO> badges;
    private int status;
    private PointScaleDTO pointScale;
    private List<PointScaleDTO> pointscales;
    private EventDTO event;
    private RuleDTO rule;
    private List<RuleDTO> rules;


    private BadgeDTO findBadgeByName(String name)
    {
        for(BadgeDTO thing : this.badges) {
            if (thing.getName().equals(name))
                return thing;
        }
        return null;
    }

    private PointScaleDTO findPointScaleByName(String name)
    {
        for(PointScaleDTO thing : this.pointscales) {
            if (thing.getName().equals(name))
                return thing;
        }
        return null;
    }

    private RuleDTO findRuleByName(String name)
    {
        for(RuleDTO thing : this.rules) {
            if (thing.getName().equals(name))
                return thing;
        }
        return null;
    }


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

    @Given("^I have a badge payload$")
    public void i_have_a_badge_payload() throws Throwable {
        this.badge = new BadgeDTO();
        this.badge.setName("bade-test");
    }

    @When("^I POST it to /badges endpoint$")
    public void i_POST_it_to_badges_endpoint() throws Throwable {
        try{
            ApiResponse<Void> apiResponse = api.badgesPostWithHttpInfo(token, badge);
            this.status = apiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.status = apiException.getCode();
        }
    }

    @When("^I GET all badges from /badges endpoint$")
    public void i_GET_all_badges_from_badges_endpoint() throws Throwable {
        try{
            ApiResponse<List<BadgeDTO>> apiResponse = api.badgesGetWithHttpInfo(token);
            this.status = apiResponse.getStatusCode();
            this.badges = apiResponse.getData();
        }catch (ApiException apiException){
            this.status = apiException.getCode();
        }
    }

    @When("^I DELETE the badge at the /badges endpoint$")
    public void i_DELETE_the_badge_at_the_badges_endpoint(String arg) throws Throwable {
        BadgeDTO badgeDTO = this.findBadgeByName(arg);
        if(badgeDTO != null){
            try{
                ApiResponse<Void> apiResponse = api.badgesDeleteWithHttpInfo(token, badgeDTO.getName());
                this.status = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.status = apiException.getCode();
            }
        }
    }

    @Given("^I have a pointscale payload$")
    public void i_have_a_pointscale_payload() throws Throwable {
        pointScale = new PointScaleDTO();
        pointScale.setName("pointscale-test");
    }

    @When("^I POST it to /pointscales endpoint$")
    public void i_POST_it_to_pointscales_endpoint() throws Throwable {
        try{
            ApiResponse<Void> apiResponse = api.pointScalesPostWithHttpInfo(token, pointScale);
            this.status = apiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.status = apiException.getCode();
        }
    }

    @When("^I GET all pointscales from /pointscales endpoint$")
    public void i_GET_all_pointscales_from_pointscales_endpoint() throws Throwable {
        try{
            ApiResponse<List<PointScaleDTO>> apiResponse = api.pointScalesGetWithHttpInfo(token);
            this.status = apiResponse.getStatusCode();
            this.pointscales = apiResponse.getData();
        }catch (ApiException apiException){
            this.status = apiException.getCode();
        }
    }

    @Then("^the result contains the correct pointscales$")
    public void the_result_contains_the_correct_pointscales() throws Throwable {
        assertNotNull(this.findPointScaleByName("pointscale-test"));
    }

    @When("^I GET a pointscale from /pointscales/(\\d+) endpoint$")
    public void i_GET_a_pointscale_from_pointscales_endpoint(String arg) throws Throwable {
        PointScaleDTO pointScaleDTO = this.findPointScaleByName(arg);
        if(pointScaleDTO != null){
            try{
                ApiResponse<PointScaleDTO> apiResponse = api.pointScalesNameGetWithHttpInfo(token, pointScaleDTO.getName());
                this.status = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.status = apiException.getCode();
            }
        }
    }

    @Then("^the pointscale is the correct pointscale$")
    public void the_pointscale_is_the_correct_pointscale() throws Throwable {
        assertNotNull(this.findPointScaleByName("pointscale-test"));
    }

    @Given("^I have a new pointScale payload$")
    public void i_have_a_new_pointScale_payload() throws Throwable {
        pointScale = new PointScaleDTO();
        pointScale.setName("pointscale-test-test");
    }

    @Then("^I PUT it to the /pointscales endpoint$")
    public void i_PUT_it_to_the_pointscales_endpoint() throws Throwable {
        PointScaleDTO pointScaleDTO = this.findPointScaleByName("pointscale-test-test");
        if(pointScaleDTO != null){
            /*
            try{
                // Il semble manquer un petit truc
                ApiResponse<PointScaleDTO> apiResponse = api.pointScalesNamePutWithHttpInfo(token, pointScaleDTO.getName());
                this.status = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.status = apiException.getCode();
            }
            */
        }
    }

    @When("^I DELETE the pointscale at the /pointscales endpoint$")
    public void i_DELETE_the_pointscale_at_the_pointscales_endpoint(String arg) throws Throwable {
        PointScaleDTO pointScaleDTO = this.findPointScaleByName(arg);
        if(pointScaleDTO != null){
            try{
                ApiResponse<Void> apiResponse = api.pointScalesNameDeleteWithHttpInfo(token, pointScaleDTO.getName());
                this.status = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.status = apiException.getCode();
            }
        }
    }



    @Given("^I have an event payload$")
    public void i_have_an_event_payload() throws Throwable {
        event = new EventDTO();
        event.setUser("Henri");
        event.setType("Boom");
        event.setTimestamp(OffsetDateTime.MAX.now());
        //Attentio c'est quoi ce Object Properties  dans les events
    }

    @When("^I POST it to the /events endpoint$")
    public void i_POST_it_to_the_events_endpoint() throws Throwable {
        try{
            ApiResponse<Void> apiResponse = api.eventsPostWithHttpInfo(token, event);
            this.status = apiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.status = apiException.getCode();
        }
    }

    @Given("^I have a new rules payload$")
    public void i_have_a_new_rules_payload() throws Throwable {
        rule = new RuleDTO();
        rule.setName("règles_une");
        rule.setThreshold(23);
    }

    @When("^I POST it to /events endpoint$")
    public void i_POST_it_to_events_endpoint() throws Throwable {
        try{
            ApiResponse<Void> apiResponse = api.rulesPostWithHttpInfo(token, rule);
            this.status = apiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.status = apiException.getCode();
        }
    }

    @When("^I GET all event rules from /rules endpoint$")
    public void i_GET_all_event_rules_from_rules_endpoint() throws Throwable {
        try{
            ApiResponse<List<RuleDTO>> apiResponse = api.rulesGetWithHttpInfo(token);
            this.status = apiResponse.getStatusCode();
            this.rules = apiResponse.getData();
        }catch (ApiException apiException){
            this.status = apiException.getCode();
        }
    }

    @Then("^the result contains the correct rules$")
    public void the_result_contains_the_correct_rules() throws Throwable {
        assertNotNull(findRuleByName("règles_une"));
    }

    @When("^I GET a rule from /rules endpoint$")
    public void i_GET_a_rule_from_rules_endpoint() throws Throwable {
        try{
            ApiResponse<List<RuleDTO>> apiResponse = api.rulesGetWithHttpInfo(token);
            this.rules = apiResponse.getData();
            this.status = apiResponse.getStatusCode();
        }catch (ApiException exception){
            this.status = exception.getCode();
        }
    }

    @Then("^the rule is the correct rule$")
    public void the_rule_is_the_correct_rule() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a new rule payload$")
    public void i_have_a_new_rule_payload() throws Throwable {
        rule = new RuleDTO();
        rule.setName("règles_deux");
        rule.setThreshold(75);
    }

    @When("^I GET a rule from the /rules endpoint$")
    public void i_GET_a_rule_from_the_rules_endpoint() throws Throwable {
        try{
            ApiResponse<List<RuleDTO>> apiResponse = api.rulesGetWithHttpInfo(token);
            this.rules = apiResponse.getData();
            this.status = apiResponse.getStatusCode();
        }catch (ApiException exception){
            this.status = exception.getCode();
        }
    }

    @Then("^I PUT it to the /rules endpoint$")
    public void i_PUT_it_to_the_rules_endpoint() throws Throwable {
        RuleDTO ruleDTO = this.findRuleByName("règles_deux");
        if(ruleDTO != null){
            /*
            try{
                // Il semble manquer un petit truc
                ApiResponse<RuleDTO> apiResponse = api.rulesNamePutWithHttpInfo(token, ruleDTO.getName());
                this.status = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.status = apiException.getCode();
            }
            */
        }
    }

    @When("^I DELETE the rule at the /rules endpoint$")
    public void i_DELETE_the_rule_at_the_rules_endpoint(String arg) throws Throwable {
        RuleDTO ruleDTO = this.findRuleByName(arg);
        if(ruleDTO != null){
            try{
                ApiResponse<Void> apiResponse = api.pointScalesNameDeleteWithHttpInfo(token, ruleDTO.getName());
                this.status = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.status = apiException.getCode();
            }
        }
    }

    @Then("^the response contains new badgeID$")
    public void the_response_contains_new_badgeID() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the response contains my badge$")
    public void the_response_contains_my_badge() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the event triggered some pointAward$")
    public void the_event_triggered_some_pointAward() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
