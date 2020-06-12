@ignore
Feature: E-Commerse Shop

  Scenario: Verifying the field of Mens Accessories option
    Given Navigate to Shop option
    When  Navigate to Mens Button
    And   opens on Mens Accessories
    Then  Mens Accessories should appear

  Scenario: Verifying the field of Mens Shirt option
    Given Navigate to Shop option
    When  Navigate to Mens Button
    And   opens on Mens Shirt
    Then  Mens Shirt should appear

  Scenario: Verifying the field of womens option
    Given Navigate to Shop option
    When  Navigate to Womens Button
    Then  Womens option should appear

  Scenario: Verifying the field of Womens tops option

    Given Navigate to Shop option
    When  Navigate to Womens Button
    And   opens on Womens top option
    Then  Womens top option should appear

  Scenario: Verifying the field of Kids option

    Given   Navigate to Shop option
    When    Navigate to Kids option button
    Then    Kids option button should appear

  Scenario: Verifying the field of Girls option

    Given   Navigate to Shop option
    And     Navigate to Kids option button
    When    Opens on Girls option
    Then    Girls option should appear

  Scenario: Verifying minimum price box entering maximum value

    Given Navigate to Shop option
    And   Navigate to price bar
    When  Entered maximum value in minimum value box
    Then  Error message should appear

  Scenario: Verifying the field of Mens option

    Given Navigate to Shop option
    When  Navigate to Mens Button
    Then  Mens option should appear

  Scenario: Verifying the field of Mens Jeans option

    Given Navigate to Shop option
    When  Navigate to Mens Button
    And   opens on Mens Jeans
    Then  Mens Jeans should appear

  Scenario: Verifying the field of Mens Shoes option

    Given Navigate to Shop option
    When Navigate to Mens Button
    And opens on Mens Shoes
    Then Mens Shoes should appear

  Scenario:Verifying the field of Womens Accessories option

    Given Navigate to Shop option
    When  Navigate to Womens Button
    And   opens on Womens Accessories option
    Then  Womens Accessories option should appear

  Scenario:Verifying the field of Womens Bottoms option

    Given Navigate to Shop option
    When  Navigate to Womens Button
    And   opens on Womens Bottoms option
    Then  Womens Bottom option should appear

  Scenario:Verifying the field of Womens Winter Wear option

    Given Navigate to Shop option
    When Navigate to Womens Button
    And opens on Womens winter wear option
    Then Womens winter wear  option should appear


  Scenario:Verifying the field of Womens Shoes option

    Given Navigate to Shop option
    When Navigate to Womens Button
    And opens on Womens Shoes option
    Then Womens Shoes option should appear

  Scenario: Verifying the field of Boys option

    Given   Navigate to Shop option
    And     Navigate to Kids option button
    When    Opens on Boys option
    Then    Boys option should appear

  Scenario: Verifying the field of kids shoes option

    Given   Navigate to Shop option
    And     Navigate to Kids option button
    When    Opens on kids shoes option
    Then    Kids shoes option should appear
  @Siri
  Scenario: Verifying the field of Add to Cart option

    Given   Navigate to Shop option
    When    Click on Add to Cart option
    Then    Item should appear in the Cart Box
