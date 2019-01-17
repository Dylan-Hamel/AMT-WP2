Feature: Creation of user

  Background:
    Given there is a messaging server

  Scenario: create a user
    Given I have a user payload
    When I POST it to the /users endpoint
    Then I receive a 201 status code