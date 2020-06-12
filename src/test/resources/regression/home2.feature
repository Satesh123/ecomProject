@ankit
Feature: Subscribe for Newsletter

  Scenario: Verify if the user can subscribe for news letter with valid email
    Given User navigate to the home page
    When he enter the valid email address
    And Click on subscribe button
    Then he successfully subscribe for news letter

  Scenario: Information Links on Footer
    Given Refund Policy link display in footer on Information
    And Terms & Services link displays in footer on Information
    When User click on to Refund Policy
    And User click on to Terms & Services
    Then  navigate to the Refund Policy page
    And navigate to the Terms & Services Page

    Scenario: Trending Fashion Wear on Home Page
      Given View All Range link display on Trending Fashion Wear
      When User clicks on to the view all range button
      Then navigates to the shopping page


