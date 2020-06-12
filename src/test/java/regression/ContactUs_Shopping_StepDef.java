package regression;

import cucumber.api.java.en.*;
import regression.customerPortalPOM.*;


public class ContactUs_Shopping_StepDef extends TestRunner {

    public ContactUsPage contactUsPage = new ContactUsPage();
    public PriceRange priceRange = new PriceRange();
    public ProductDetails productDetails = new ProductDetails();
    public CheckOut checkOut = new CheckOut();


    //===============Contact Us Page=================================
    @Given("^User click on Contact Us link in the header menu$")
    public void userClickOnContactUsLink() {

        contactUsPage.clickOnContactUs();
    }

    @When("^User fill required field FullName as \"([^\"]*)\" Email as \"([^\"]*)\" Message as \"([^\"]*)\" and click submit$")
    public void userFillRequiredFieldFullNameAsEmailAsMessageAs(String name, String email, String message) {
        contactUsPage.fillRequiredField(name, email, message);

    }

    @Then("^User message should be delivered successfully$")
    public void userMessageShouldBeDeliverSuccessfully() {

        contactUsPage.isMessageSent();
    }
//================Price Range=====================================

    @Given("^User click on shop link in the header menu$")
    public void userClickOnShopLinkOnHeaderMenu() {

        priceRange.headerShopTab();

    }

    @When("^User enter minimum price as \"([^\"]*)\" and max price as \"([^\"]*)\" in the box$")
    public void userEnterMinimumPriceAsAndMaxPriceAsInTheBox(String minPrice, String maxPrice) {

        priceRange.priceRangeBar(minPrice, maxPrice);

    }

    @Then("^Product list find within selected price range$")
    public void productListFindWithinSelectedPriceRange() {
        priceRange.isItemRecordShowing();
    }



    //===================Product Details=====================================
    @When("^User click on product name under the product image$")
    public void userClickProductNameUnderTheProductImage() {

        productDetails.checkProductDetail();


    }

    @Then("^User can see detail product Description in detail$")
    public void userCanSeeDetailProductDescriptionInDetail() {
        productDetails.isDisplayProductDetail();

    }

    @When("^User mouse hovers on the product image and clicks on the Quick View button$")
    public void userMouseHoversOnTheProductImageAndClicksOnTheQuickViewButton() {
        productDetails.quickView();

    }

    @Then("^User can see some product detail in the popup window$")
    public void userCanSeeSomeProductDetailInThePopupWindow() {
        productDetails.isDisplayInPopUpInfo();

    }

    @And("^User can able to add a product to cart from Quick View window$")
    public void userCanAbleToAddAProductToCartFromQuickViewWindow() {
        productDetails.popupWindowAddToCart();
    }
    //==============================Guest CheckOut========================================

    @When("^User mouse hovers on the product image and click on ADD To CART$")
    public void userMouseHoversOnTheProductImageAndClickOnADDToCART() {
        checkOut.addToCart();


    }
    @And("^Click on the cart item and select CHECKOUT option$")
    public void clickOnTheCartItemAndSelectCHECKOUTOption() {
        checkOut.goToCheckOut();
    }

    @When("^User select GUEST CHECKOUT option and Fill up Shipping Address detail and click continue button$")
    public void userSelectGUESTCHECKOUTOptionAndFillUpShippingAddressDetailAndClickContinueButton() {
        checkOut.addShippingAddressDetails();

    }


    @And("^If Billing Address is same as a shipping address then select same shipping and billing address option and click on continue$")
    public void ifBillingAddressIsSameAsAShippingAddressThenSelectSameShippingAndBillingAddressOptionAndClickOnContinue() {
        checkOut.addBillingAddress();
    }

    @When("^Select shipping method and click continue$")
    public void selectShippingMethodAndClickContinue() {
        checkOut.selectShippingMethod();
    }

    @And("^User can see order detail,add note,select payment method and click ORDER NOW button$")
    public void userCanSeeOrderDetailAddNoteSelectPaymentMethodAndClickORDERNOWButton() {
        checkOut.orderDetail();
    }

    @Then("^User placed order successfully\\.$")
    public void userPlacedOrderSuccessfully() {
        checkOut.orderPlaced();

    }
}
