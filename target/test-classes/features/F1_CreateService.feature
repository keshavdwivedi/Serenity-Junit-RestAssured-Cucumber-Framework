Feature: Create new service
  I want to check creation of new service

  Scenario Outline: To validate creation of new service with valid data
    Given I create service by using create service API
    When I provide valid "<ServiceName>" for service creation
    And I store id of service created
    Then I validate status code "<StatusCode>"
    Examples:
      | ServiceName | StatusCode |
      | Barber      | 201        |