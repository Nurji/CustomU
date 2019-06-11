Feature: Testing Etsy WebSite
  Scenario: Verifying Search Functionality
    Given User is on esty homepage
    Then User searches for "iphone fireless charger"
    And User verifies the result is only for searched item



