Feature: Event tests

  Background:
    Given there is a gamification server

  Scenario: Create new event
    Given I have an event payload
    When I POST it to the /events endpoint
    Then I receive a 201 status code