Feature: Product details and checkout


  Scenario: Verify the user can see the details of the product
    Given User click on shop link in the header menu
    When User click on product name under the product image
    Then User can see detail product Description in detail


  Scenario: Verify the user can see details in quick view
    Given User click on shop link in the header menu
    When User mouse hovers on the product image and clicks on the Quick View button
    Then User can see some product detail in the popup window


  Scenario: Verify the user can see details in quick view and add to cart
    Given User click on shop link in the header menu
    When User mouse hovers on the product image and clicks on the Quick View button
    Then User can see some product detail in the popup window
    And User can able to add a product to cart from Quick View window


  Scenario: Verify the user can check out as a Guest
    Given User click on shop link in the header menu
    When User mouse hovers on the product image and click on ADD To CART
    And Click on the cart item and select CHECKOUT option
    When User select GUEST CHECKOUT option and Fill up Shipping Address detail and click continue button
    And If Billing Address is same as a shipping address then select same shipping and billing address option and click on continue
    When Select shipping method and click continue
    And User can see order detail,add note,select payment method and click ORDER NOW button
    Then  User placed order successfully.







