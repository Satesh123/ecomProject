Feature: Home Page

#  @Selecting currency
#Scenario: SelectingCurrency
#
#   Given close the popupwindow
#  And click on currency
#  Then select GBP

@ProductSearch
  Scenario Outline: Search Product

  When user search product type "<product>"
  Then search item should be displayed

    Examples:
      | product |
      | shoes |




  @clickshop
  Scenario: Customer navigating to shop

    Given click to shop link
    Then navigate to shop page


#  @Special
#  Scenario: Customer clicking on most liked
#
#    Given Click on Special link and view details of the product
#   # And  Click on view details
#    Then navigate to MEN POLO CASUAL SHIRT
#
