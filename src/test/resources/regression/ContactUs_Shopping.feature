Feature: Contact Us Page and Price Range filter

  @001
  Scenario Outline: Verify that user able to send a message to admin
    Given User click on Contact Us link
    When User fill required field FullName as "<FullName>" Email as "<Email>" Message as "<Message>" and click submit
    Then User message should be deliver successfully
    Examples:
      | FullName | Email         | Message |
      | AbcName  | abc@gmail.com | Testing |
      |          | abc@gmail.com | Testing |
      | AbcName  |               | Testing |

  @002
  Scenario Outline: Verify min and max price range bar working
    Given User click on shop link in header menu
    When User enter minimum price as "<minPrice>" and max price as "<maxPrice>" in the box
    Then Product list find within selected price range
    Examples:
      | minPrice | maxPrice |
      | 40       | 70       |
      | 70       | 90       |
      | 90       | 110      |
      | 110      | 130      |

  @003
  Scenario: Verify min and max random price range working
    Given User click on shop link in header menu
    When User enter minimum price and max price  in the box
    Then Product list find within selected price range