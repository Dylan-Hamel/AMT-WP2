Feature: Registration of an app

  Background:
    Given there is a registration server

  Scenario: register an app
    Given I have a app to register
    When I POST it to the /registration endpoint
    Then I receive a 201 status code