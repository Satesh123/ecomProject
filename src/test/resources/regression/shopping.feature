Feature: E-Commerse Shop
  @Siri
  Scenario: Verifying the field of Mens Accessories option
    Given Navigate to Shop option
    When  Navigate to Mens Button
    And   opens on Mens Accessories
    Then  Mens Accessories should appear
  @Siri
  Scenario: Verifying the field of Mens Shirt option
    Given Navigate to Shop option
    When  Navigate to Mens Button
    And   opens on Mens Shirt
    Then  Mens Shirt should appear
  @Siri
  Scenario: Verifying the field of womens option
    Given Navigate to Shop option
    When  Navigate to Womens Button
    Then  Womens option should appear
 
  Scenario: Verifying the field of Price range bar option
    Given Navigate to Shop option
    And   Navigate to minimum Price range bar option
    When  Enter the minimum value
    Then  Minimum price value should enter

  Scenario:Verifying the field of Womens tops option

    Given Navigate to Shop option
    When Navigate to Womens Button
    And opens on Womens top option
    Then Womens top option should appear





