package regression;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import regression.customerPortalPOM.ShoppingPage;


public class Shopping_StepDef extends TestRunner {

    public ShoppingPage shoppingPage;


    @Given("^Navigate to Shop option$")
    public void navigateToShopOption() {
        shoppingPage = new ShoppingPage();
        shoppingPage.clickingShopButton();
    }

    @When("^Navigate to Mens Button$")
    public void navigateToMensButton() {
        shoppingPage.clickingMensButton();
    }

    @And("^opens on Mens Accessories$")
    public void opensOnMensAccessories() {
        shoppingPage.clickingMensAccessoriesButton();
    }

    @Then("^Mens Accessories should appear$")
    public void mensAccessoriesShouldAppear() {
        shoppingPage.findingMensAccessoriesItem();
    }

    @And("^opens on Mens Shirt$")
    public void opensOnMensShirt() {
        shoppingPage.clickingMensShirts();
    }

    @Then("^Mens Shirt should appear$")
    public void mensShirtShouldAppear() {
        shoppingPage.findingMensShirtsItem();
    }

    @When("^Navigate to Womens Button$")
    public void navigateToWomensButton() {
        shoppingPage.clickingWomensButton();
    }

    @Then("^Womens option should appear$")
    public void womensOptionShouldAppear() {
        shoppingPage.findingWomensTopsButton();
    }

    @And("^opens on Womens top option$")
    public void opensOnWomensTopOption() {
        shoppingPage.clickingWomensTopButton();
    }

    @Then("^Womens top option should appear$")
    public void womensTopOptionShouldAppear() {
        shoppingPage.findingWomensTopsItemButton();
    }

    @When("^Navigate to Kids option button$")
    public void navigateToKidsOptionButton() {
        shoppingPage.clickingKidsButton();
    }

    @Then("^Kids option button should appear$")
    public void kidsOptionButtonShouldAppear() {
        shoppingPage.findingKidsShoesOption();
    }

    @When("^Opens on Girls option$")
    public void opensOnGirlsOption() {
        shoppingPage.clickingGirlsButton();
    }

    @Then("^Girls option should appear$")
    public void girlsOptionShouldAppear() {
        shoppingPage.findingGirlsItemOption();
    }

    @And("^Navigate to price bar$")
    public void navigateToPriceBar() {
        shoppingPage.clickingPriceBarButton();
    }

    @When("^Entered maximum value in minimum value box$")
    public void enteredMaximumValueInMinimumValueBox() throws InterruptedException {
        shoppingPage.enteringMaxValueInMinVal();
    }

    @Then("^Error message should appear$")
    public void errorMessageShouldAppear() {
        shoppingPage.gettingErrorMessage();
    }

    @When("^select the red option button$")
    public void selectTheRedOptionButton() {
        shoppingPage.clickingRedButton();
    }

    @Then("^All red coloured items should appeared$")
    public void allRedColouredItemsShouldAppeared() {
        shoppingPage.findingRedColourOption();
    }

    @Then("^Mens option should appear$")
    public void mensOptionShouldAppear() {
        shoppingPage.findingMensOption();
    }

    @And("^opens on Mens Jeans$")
    public void opensOnMensJeans() {
        shoppingPage.clickingMensJeansOption();
    }

    @Then("^Mens Jeans should appear$")
    public void mensJeansShouldAppear() {
        shoppingPage.findingMensJeansOption();
    }

    @And("^opens on Mens Shoes$")
    public void opensOnMensShoes() {
        shoppingPage.clickingMensShoesOption();
    }

    @Then("^Mens Shoes should appear$")
    public void mensShoesShouldAppear() {
        shoppingPage.findingMensShoesOption();
    }

    @And("^opens on Womens Accessories option$")
    public void opensOnWomensAccessoriesOption() {
        shoppingPage.clickingWomensAccessoriesOption();
    }

    @Then("^Womens Accessories option should appear$")
    public void womensAccessoriesOptionShouldAppear() {
        shoppingPage.findingWomensAccessoriesItemOption();
    }

    @And("^opens on Womens Bottoms option$")
    public void opensOnWomensBottomsOption() {
        shoppingPage.clickingWomensBottomsOption();
    }

    @Then("^Womens Bottom option should appear$")
    public void womensBottomOptionShouldAppear() {
        shoppingPage.findingWomensBottomsItemOption();
    }

    @And("^opens on Womens winter wear option$")
    public void opensOnWomensWinterWearOption() throws InterruptedException {
        shoppingPage.clickingWomensWinterWearOption();
    }

    @Then("^Womens winter wear  option should appear$")
    public void womensWinterWearOptionShouldAppear() {
        shoppingPage.findingWomensWinterWearItemOption();
    }

    @And("^opens on Womens Shoes option$")
    public void opensOnWomensShoesOption() {
        shoppingPage.clickingWomensShoesOption();
    }

    @Then("^Womens Shoes option should appear$")
    public void womensShoesOptionShouldAppear() {
        shoppingPage.findingWomensShoesItemOption();
    }

    @When("^Opens on Boys option$")
    public void opensOnBoysOption() {
        shoppingPage.clickingKidsBoysOption();
    }

    @Then("^Boys option should appear$")
    public void boysOptionShouldAppear() {
        shoppingPage.findingKidsBoysItem();
    }

    @When("^Opens on kids shoes option$")
    public void opensOnKidsShoesOption() {
        shoppingPage.clickingKidsShoesOption();
    }

    @Then("^Kids shoes option should appear$")
    public void kidsShoesOptionShouldAppear() {
        shoppingPage.gettingErrorMessage();
    }

    @When("^Click on Add to Cart option$")
    public void clickOnAddToCartOption() {
        shoppingPage.addingToCart();
    }

    @Then("^Item should appear in the Cart Box$")
    public void itemShouldAppearInTheCartBox() {
        shoppingPage.checkingCartList();
    }
}

