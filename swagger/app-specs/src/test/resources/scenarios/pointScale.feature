Feature: PointScale tests

  Background:
    Given there is a gamification server

  Scenario: register new pointscale
    Given I have a pointscale payload "pointscaletest"
    When I POST it to /pointscales endpoint
    Then I receive a 201 status code

  Scenario: Get all pointscales
    When I GET all pointscales from /pointscales endpoint
    Then I receive a 200 status code
    And the result contains the correct pointscale "pointscaletest"

  Scenario: Get a pointscale
    When I GET a pointscale from /pointscales/"pointscaletest" endpoint
    Then I receive a 200 status code
    And the pointscale is the correct pointscale

  Scenario: Update a pointscale
    Given I have a new pointScale payload
    When I GET a pointscale from /pointscales/"pointscaletest" endpoint
    Then I receive a 200 status code
    And I PUT it to the /pointscales endpoint
    Then I receive a 200 status code

  Scenario: Delete a pointscale
    When I GET a pointscale from /pointscales/"pointscaletest" endpoint
    Then I receive a 200 status code
    When I DELETE the pointscale "pointscaletest" at the /pointscales endpoint
    Then I receive a 200 status code
    When I DELETE the pointscale "pointscaletest" at the /pointscales endpoint
    Then I receive a 404 status code
