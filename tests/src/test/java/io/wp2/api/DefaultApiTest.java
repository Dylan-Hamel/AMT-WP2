/*
 * GamificationAPI
 * This is the API documentation of the AMT Gamification project
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.wp2.api;

import io.wp2.ApiException;
import io.wp2.api.dto.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Authenticate an application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authPostTest() throws ApiException {
        Credentials body = null;
        Token response = api.authPost(body);

        // TODO: test validations
    }
    
    /**
     * List all badges linked to current application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void badgesGetTest() throws ApiException {
        List<Badge> response = api.badgesGet();

        // TODO: test validations
    }
    
    /**
     * Deletes specific badge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void badgesNameDeleteTest() throws ApiException {
        String name = null;
        api.badgesNameDelete(name);

        // TODO: test validations
    }
    
    /**
     * Fetch specific badge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void badgesNameGetTest() throws ApiException {
        String name = null;
        Badge response = api.badgesNameGet(name);

        // TODO: test validations
    }
    
    /**
     * Update specific badge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void badgesNamePostTest() throws ApiException {
        String name = null;
        Badge body = null;
        api.badgesNamePost(name, body);

        // TODO: test validations
    }
    
    /**
     * Create new badge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void badgesPostTest() throws ApiException {
        Badge body = null;
        api.badgesPost(body);

        // TODO: test validations
    }
    
    /**
     * Create an event
     *
     * Create event triggered by user action for a given application
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventsPostTest() throws ApiException {
        Event body = null;
        api.eventsPost(body);

        // TODO: test validations
    }
    
    /**
     * List point scales linked to current application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pointScalesGetTest() throws ApiException {
        List<PointScale> response = api.pointScalesGet();

        // TODO: test validations
    }
    
    /**
     * Deletes specific point scale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pointScalesNameDeleteTest() throws ApiException {
        String name = null;
        api.pointScalesNameDelete(name);

        // TODO: test validations
    }
    
    /**
     * Fetch specific point scale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pointScalesNameGetTest() throws ApiException {
        String name = null;
        List<PointScale> response = api.pointScalesNameGet(name);

        // TODO: test validations
    }
    
    /**
     * Update specific point scale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pointScalesNamePostTest() throws ApiException {
        String name = null;
        PointScale body = null;
        api.pointScalesNamePost(name, body);

        // TODO: test validations
    }
    
    /**
     * Create point scale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pointScalesPostTest() throws ApiException {
        PointScale body = null;
        api.pointScalesPost(body);

        // TODO: test validations
    }
    
    /**
     * Register an application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerPostTest() throws ApiException {
        GamifiedApplication body = null;
        api.registerPost(body);

        // TODO: test validations
    }
    
    /**
     * List events rules linked to current application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesEventsGetTest() throws ApiException {
        List<EventRule> response = api.rulesEventsGet();

        // TODO: test validations
    }
    
    /**
     * Delete specific event rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesEventsNameDeleteTest() throws ApiException {
        String name = null;
        api.rulesEventsNameDelete(name);

        // TODO: test validations
    }
    
    /**
     * Fetch specific event rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesEventsNameGetTest() throws ApiException {
        String name = null;
        EventRule response = api.rulesEventsNameGet(name);

        // TODO: test validations
    }
    
    /**
     * Update specific event rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesEventsNamePostTest() throws ApiException {
        String name = null;
        EventRule body = null;
        api.rulesEventsNamePost(name, body);

        // TODO: test validations
    }
    
    /**
     * Create a new event rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesEventsPostTest() throws ApiException {
        EventRule body = null;
        api.rulesEventsPost(body);

        // TODO: test validations
    }
    
    /**
     * List all trigger rules for current application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesTriggersGetTest() throws ApiException {
        List<TriggerRule> response = api.rulesTriggersGet();

        // TODO: test validations
    }
    
    /**
     * Delete specific trigger rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesTriggersNameDeleteTest() throws ApiException {
        String name = null;
        api.rulesTriggersNameDelete(name);

        // TODO: test validations
    }
    
    /**
     * Fetch specific trigger rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesTriggersNameGetTest() throws ApiException {
        String name = null;
        TriggerRule response = api.rulesTriggersNameGet(name);

        // TODO: test validations
    }
    
    /**
     * Update specific trigger rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesTriggersNamePostTest() throws ApiException {
        String name = null;
        TriggerRule body = null;
        api.rulesTriggersNamePost(name, body);

        // TODO: test validations
    }
    
    /**
     * Create trigger rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesTriggersPostTest() throws ApiException {
        TriggerRule body = null;
        api.rulesTriggersPost(body);

        // TODO: test validations
    }
    
    /**
     * List all users linked to current application
     *
     * List all users linked to current application
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersGetTest() throws ApiException {
        List<User> response = api.usersGet();

        // TODO: test validations
    }
    
    /**
     * Fetch specific user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdGetTest() throws ApiException {
        String id = null;
        User response = api.usersIdGet(id);

        // TODO: test validations
    }
    
}
