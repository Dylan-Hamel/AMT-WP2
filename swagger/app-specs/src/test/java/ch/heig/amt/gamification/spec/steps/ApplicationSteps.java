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
    private final String token = "fcb3cd0c1efd8afe09d0505e46cefa4c";
    private BadgeDTO badge;
    private List<BadgeDTO> badges;
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
        // lastStatusCode = lastApiResponse.getStatusCode();
        assertEquals(arg1, lastStatusCode);
    }

    @Given("^I have a badge \"(\\w+)\" payload$")
    public void i_have_a_badge_payload(String badgeName) throws Throwable {
        this.badge = new BadgeDTO();
        this.badge.setName(badgeName);
    }

    @When("^I POST it to /badges endpoint$")
    public void i_POST_it_to_badges_endpoint() throws Throwable {
        try{
            this.lastApiResponse = api.badgesPostWithHttpInfo(token, badge);
            this.lastStatusCode = lastApiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @Then("^the response contains new badgeID$")
    public void the_response_contains_new_badgeID() throws Throwable {
        //ToDo
    }

    @When("^I GET all badges from /badges endpoint$")
    public void i_GET_all_badges_from_badges_endpoint() throws Throwable {
        try{
            this.lastApiResponse = api.badgesGetWithHttpInfo(token);
            this.lastStatusCode = lastApiResponse.getStatusCode();
            ApiResponse<List<BadgeDTO>> apiResponse = this.lastApiResponse;
            this.badges = apiResponse.getData();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @When("^I DELETE the badge \"(\\w+)\" at the /badges endpoint$")
    public void i_DELETE_the_badge_at_the_badges_endpoint(String arg) throws Throwable {
        BadgeDTO badgeDTO = this.findBadgeByName(arg);
        if(badgeDTO != null){
            try{
                this.lastApiResponse = api.badgesDeleteWithHttpInfo(token, badgeDTO.getName());
                this.lastStatusCode = lastApiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.lastApiException = apiException;
                this.lastStatusCode = apiException.getCode();
            }
        }
    }

    @Given("^I have a pointscale payload \"(\\w+)\"$")
    public void i_have_a_pointscale_payload(String pointScaleName) throws Throwable {
        pointScale = new PointScaleDTO();
        pointScale.setName(pointScaleName);
    }

    @When("^I POST it to /pointscales endpoint$")
    public void i_POST_it_to_pointscales_endpoint() throws Throwable {
        try{
            this.lastApiResponse = api.pointScalesPostWithHttpInfo(token, pointScale);
            this.lastStatusCode = lastApiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @When("^I GET all pointscales from /pointscales endpoint$")
    public void i_GET_all_pointscales_from_pointscales_endpoint() throws Throwable {
        try{
            this.lastApiResponse = api.pointScalesGetWithHttpInfo(token);
            this.lastStatusCode = lastApiResponse.getStatusCode();
            ApiResponse<List<PointScaleDTO>> apiResponse = lastApiResponse;
            this.pointscales = apiResponse.getData();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @Then("^the result contains the correct pointscale \"(\\w+)\"$")
    public void the_result_contains_the_correct_pointscale(String pointScaleName) throws Throwable {
        assertNotNull(this.findPointScaleByName(pointScaleName));
    }

    @When("^I GET a pointscale from /pointscales/\"(\\w+)\" endpoint$")
    public void i_GET_a_pointscale_from_pointscales_endpoint(String arg) throws Throwable {
        PointScaleDTO pointScaleDTO = this.findPointScaleByName(arg);
        if(pointScaleDTO != null){
            try{
                this.lastApiResponse = api.pointScalesNameGetWithHttpInfo(token, pointScaleDTO.getName());
                this.lastStatusCode = lastApiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.lastApiException = apiException;
                this.lastStatusCode = apiException.getCode();
            }
        }
    }

    @Then("^the pointscale is the correct pointscale$")
    public void the_pointscale_is_the_correct_pointscale() throws Throwable {
        assertNotNull(this.findPointScaleByName("pointscaletest"));
    }

    @Given("^I have a new pointScale payload$")
    public void i_have_a_new_pointScale_payload() throws Throwable {
        pointScale = new PointScaleDTO();
        pointScale.setName("pointscaletesttest");
    }

    @Then("^I PUT it to the /pointscales endpoint$")
    public void i_PUT_it_to_the_pointscales_endpoint() throws Throwable {
        PointScaleDTO pointScaleDTO = this.findPointScaleByName("pointscaletesttest");
        if(pointScaleDTO != null){
            /*
            try{
                // Il semble manquer un petit truc
                ApiResponse<PointScaleDTO> apiResponse = api.pointScalesNamePutWithHttpInfo(token, pointScaleDTO.getName());
                this.lastStatusCode = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.lastApiException = apiException;
this.lastStatusCode = apiException.getCode();
            }
            */
        }
    }

    @When("^I DELETE the pointscale \"(\\w+)\" at the /pointscales endpoint$")
    public void i_DELETE_the_pointscale_at_the_pointscales_endpoint(String arg) throws Throwable {
        PointScaleDTO pointScaleDTO = this.findPointScaleByName(arg);
        if(pointScaleDTO != null){
            try{
                this.lastApiResponse = api.pointScalesNameDeleteWithHttpInfo(token, pointScaleDTO.getName());
                this.lastStatusCode = lastApiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.lastApiException = apiException;
                this.lastStatusCode = apiException.getCode();
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
            this.lastStatusCode = apiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @Given("^I have a new rules payload \"(\\w+)\"$")
    public void i_have_a_new_rules_payload(String ruleName) throws Throwable {
        rule = new RuleDTO();
        rule.setName(ruleName);
        rule.setThreshold(23);
    }

    @When("^I POST it to /events endpoint$")
    public void i_POST_it_to_events_endpoint() throws Throwable {
        try{
            ApiResponse<Void> apiResponse = api.rulesPostWithHttpInfo(token, rule);
            this.lastStatusCode = apiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @When("^I GET all event rules from /rules endpoint$")
    public void i_GET_all_event_rules_from_rules_endpoint() throws Throwable {
        try{
            ApiResponse<List<RuleDTO>> apiResponse = api.rulesGetWithHttpInfo(token);
            this.lastStatusCode = apiResponse.getStatusCode();
            this.rules = apiResponse.getData();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @Then("^the result contains the correct rule \"(\\w+)\"$")
    public void the_result_contains_the_correct_rules() throws Throwable {
        assertNotNull(findRuleByName("regles_une"));
    }

    @When("^I GET a rule from /rules/\"(\\w+)\" endpoint$")
    public void i_GET_a_rule_from_rules_endpoint(String ruleName) throws Throwable {
        try{
            ApiResponse<List<RuleDTO>> apiResponse = api.rulesGetWithHttpInfo(token);
            this.rules = apiResponse.getData();
            this.lastStatusCode = apiResponse.getStatusCode();
        }catch (ApiException apiException){
            this.lastApiException = apiException;
            this.lastStatusCode = apiException.getCode();
        }
    }

    @Then("^the rule is the correct rule$")
    public void the_rule_is_the_correct_rule() throws Throwable {
        //ToDo
    }

    @Given("^I have a new rule payload$")
    public void i_have_a_new_rule_payload() throws Throwable {
        rule = new RuleDTO();
        rule.setName("regles_deux");
        rule.setThreshold(75);
    }

    @When("^I GET a rule from the /rules endpoint$")
    public void i_GET_a_rule_from_the_rules_endpoint() throws Throwable {
        try{
            ApiResponse<List<RuleDTO>> apiResponse = api.rulesGetWithHttpInfo(token);
            this.rules = apiResponse.getData();
            this.lastStatusCode = apiResponse.getStatusCode();
        }catch (ApiException exception){
            this.lastStatusCode = exception.getCode();
        }
    }

    @Then("^I PUT it to the /rules endpoint$")
    public void i_PUT_it_to_the_rules_endpoint() throws Throwable {
        RuleDTO ruleDTO = this.findRuleByName("regles_deux");
        if(ruleDTO != null){
            /*
            try{
                // Il semble manquer un petit truc
                ApiResponse<RuleDTO> apiResponse = api.rulesNamePutWithHttpInfo(token, ruleDTO.getName());
                this.lastStatusCode = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.lastApiException = apiException;
this.lastStatusCode = apiException.getCode();
            }
            */
        }
    }

    @When("^I DELETE the rule \"(\\w+)\" at the /rules endpoint$")
    public void i_DELETE_the_rule_at_the_rules_endpoint(String arg) throws Throwable {
        RuleDTO ruleDTO = this.findRuleByName(arg);
        if(ruleDTO != null){
            try{
                ApiResponse<Void> apiResponse = api.pointScalesNameDeleteWithHttpInfo(token, ruleDTO.getName());
                this.lastStatusCode = apiResponse.getStatusCode();
            }catch (ApiException apiException) {
                this.lastApiException = apiException;
                this.lastStatusCode = apiException.getCode();
            }
        }
    }

    @Then("^the response contains my badge \"(\\w+)\"$")
    public void the_response_contains_my_badge(String badgeName) throws Throwable {
        if(findBadgeByName(badgeName) != null){
            //ToDo
        }
    }

    @Then("^the event triggered some pointAward$")
    public void the_event_triggered_some_pointAward() throws Throwable {
        //ToDo
    }

}
