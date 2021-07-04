Feature: Delete Created Service
  I want to delete the service

  Scenario Outline: To validate deletion of created service with valid service id
    Given I have the service id of created service
    When I post the delete request at specified endpoint
    Then I validate response code as "<responseCode>"
    Examples:
      | responseCode |
      | 200          |
