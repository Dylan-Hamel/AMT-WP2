Feature: Creation of user with password too short

  Scenario: create a user with a password too short
    Given I have a user payload with weak password
    When I send a POST request to the /users endpoint
    Then I receive a 400 status code