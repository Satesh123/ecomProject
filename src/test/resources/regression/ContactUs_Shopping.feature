Feature: Contact Us Page and Price Range filter


  Scenario Outline: Verify that user can send a message using Contact Us form
    Given User click on Contact Us link in the header menu
    When User fill required field FullName as "<FullName>" Email as "<Email>" Message as "<Message>" and click submit
    Then User message should be delivered successfully
    Examples:
      | FullName | Email         | Message |
      | AbcName  | abc@gmail.com | Testing |
      |          | abc@gmail.com | Testing |
      | AbcName  |               | Testing |


  Scenario Outline: Verify user can set minimum and maximum  price range using price range filter
    Given User click on shop link in the header menu
    When User enter minimum price as "<minPrice>" and max price as "<maxPrice>" in the box
    Then Product list find within selected price range
    Examples:
      | minPrice | maxPrice |
      | 20       | 70       |
      | 50       | 90       |
      | 70       | 110      |
      | 100      | 130      |

