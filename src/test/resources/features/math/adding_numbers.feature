
@vivian
Feature: Adding Numbers

  Scenario Outline: Adding two numbers
    Given a is <int1>
    And b is <int2>
    When I add a and b
    Then the total should be <int3>
    Examples:
    |int1|int2|int3|
    | 1 | 2 | 1 |
    | 2 | 4 | 6 |
