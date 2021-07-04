Feature: Get All services
  I want to get details of all created services

  Scenario Outline: To validate Getting all services with valid data limit
    Given I want to get details of "<serviceCount>" services
    When I get the products details of "<serviceCount>" services using Get all service API endpoint
    Then I validate status code as "<statusCode>"
    And I validate product count as "<totalCount>"
    Examples:
      | serviceCount | statusCode | totalCount |
      | 50           | 200        | 21         |