Feature: Simple event processing
    Background
        Given a token for a new gamified application A1


    Scenario: send the first event for a user the gamified application
        Given a user U1 of the gamified application A1
        Given the application detects that user U1 is producing an event
        When the application POSTs 1 payload on the /events endpoint
        Then it receives a 201 status code
        When the application GETs the user U1 from the /users/ endpoint
        Then it receives a 200 status code
        And the payload in the response has a property numberOfEvents with a value of 1
