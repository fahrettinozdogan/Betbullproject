Feature: TextValidationTest
  Scenario: User should be able to valid text and validate it
    Given User sends a text a PurgoMalum
    |text|Hello World!|
    Then User should get the status code 200
    And User should get the correct text in response

