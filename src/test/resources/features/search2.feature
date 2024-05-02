@SearchGG
Feature: Search on Google

  Scenario: Search on google for MIT open course, then search on MIT for "Advanced Algorithms"
    Given I am on the Google homepage
    When I type keyword "MIT open course" and click search
    When I access the MIT page
    When I search "Advanced Algorithms"
    Then I should see the Advanced Algorithms courses