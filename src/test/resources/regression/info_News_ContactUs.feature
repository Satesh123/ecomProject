@ignore
Feature: InfoNewsContact

  @regression
  Scenario: Navigate Info Pages
    Given Info Pages link display in main menu
    When User do mouse hover on InfoPages link in main menu on homepage
    And select About Us link
    Then  navigate to the About Us page
    And select Privacy policy link
    Then navigate to the Privacy Page
  @regression
  Scenario: NewsPage
    When User click on News in main menu tab
    Then  Navigate to the News Page



  Scenario Outline: Contact Us
    Given User is on Home Page
    When  Click on Contact Us link
    Then Navigate to Contact Us Page
    When User fill required field FullName as "<FullName>" Email as "<Email>" Message as "<Message>" and click submit
    Then User message should be deliver successfully
    Examples:
      | FullName | Email         | Message |
      | AbcName  | abc@gmail.com | Testing |
      |          | abc@Gmail.com | Testing |
      | AbcName  |               | Testing |
