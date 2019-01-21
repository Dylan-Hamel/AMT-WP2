Feature: Badges tests

  Background:
    Given there is a gamification server

  Scenario: Create new badge
    Given I have a badge "badgetest" payload
    When I POST it to /badges endpoint
    Then I receive a 201 status code
    And the response contains new badgeID

  Scenario: Get all badges
    When I GET all badges from /badges endpoint
    Then I receive a 200 status code
    And the response contains my badge "badgetest"

  Scenario: Delete a badge
    When I GET all badges from /badges endpoint
    Then I receive a 200 status code
    When I DELETE the badge "badgetest" at the /badges endpoint
    Then I receive a 200 status code
    When I DELETE the badge "badgetest" at the /badges endpoint
    Then I receive a 404 status code
