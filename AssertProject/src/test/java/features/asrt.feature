Feature: Cucumber assertion test cases
  Scenario: Test logic on palindrome
    Given I entered string "radar"
    When I test it for palindrome
    Then the result should be "true"