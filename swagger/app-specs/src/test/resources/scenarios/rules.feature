Feature: Rules test

  Background:
    Given there is a gamification server

  Scenario: Create new event rule
    Given I have a new rules payload
    When I POST it to /events endpoint
    Then I receive a 201 status code

  Scenario: list rules from current app
    When I GET all event rules from /rules endpoint
    Then I receive a 200 status code
    And the result contains the correct rules

  Scenario: Fetch specific event rule
    When I GET a rule from /rules endpoint
    Then I receive a 200 status code
    And the rule is the correct rule

  Scenario: Update specific rule
    Given I have a new rule payload
    When I GET a rule from the /rules endpoint
    Then I receive a 200 status code
    And I PUT it to the /rules endpoint
    Then I receive a 200 status code

  Scenario: Delete a rule
    When I GET a rule from /rules endpoint
    Then I receive a 200 status code
    When I DELETE the rule at the /rules endpoint
    Then I receive a 200 status code
    When I DELETE the rule at the /rules endpoint
    Then I receive a 404 status code