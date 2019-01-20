Feature: Badges tests

  Background:
    Given there is a gamification server

  Scenario: register new badge
    Given I have Badge payload
    When I POST it to /badges endpoint
    Then I receive a 201 status code

  Scenario: Get all badges
    When I GET all badges from /badges endpoint
    Then I receive a 200 status code

  Scenario: Delete a badge
    When I GET all badges from /badges endpoint
    Then I receive a 200 status code
    When I DELETE the badge at the /badges endpoint
    Then I receive a 200 status code
    When I DELETE the badge at the /badges endpoint
    Then I receive a 404 status code
