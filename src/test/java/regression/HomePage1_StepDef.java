package regression;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import regression.customerPortalPOM.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePage1_StepDef extends TestRunner {

    public HomePage homePage;

    @Before
    public void start() {

        homePage = new HomePage();
        driver.get("http://142.93.198.238/ecom/public/");
    }

    @After
    public void stop(Scenario scenario) {

        if (!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }


    //***SelectingCurrency***///
    @Given("^close the popupwindow$")
    public void closeThePopupwindow() {

        homePage.poup();
    }

    @And("^click on currency$")
    public void clickOnCurrency() {


    }

    @Then("^select GBP$")
    public void selectGBP() {
    }


    //****@SearchProduct
    @When("^user search product type \"([^\"]*)\"$")
    public void userSearchProductType(String product) throws InterruptedException {


        homePage.poup();

        homePage.searchproduct(product);


    }

    @Then("^search item should be displayed$")
    public void searchItemShouldBeDisplayed() {

        homePage.issearchDisplayed();
    }

    ///navigate to shop link****

    @Given("^click to shop link$")
    public void clickToShopLink() throws InterruptedException {
        homePage.shopcclick();

    }

    @Then("^navigate to shop page$")
    public void navigateToShopPage() {

        homePage.isShopPlaceDispalyed();
    }


    @Given("^Click on Special link and view details of the product$")
    public void clickOnSpecialLinkAndViewDetailsOfTheProduct() throws InterruptedException {

        homePage.speciallink();
    }

    @Then("^navigate to MEN POLO CASUAL SHIRT$")
    public void navigateToMENPOLOCASUALSHIRT() {

        homePage.isSpecialPageDisplayed();
    }





      /* //***** @Special****
    @Given("^close the pop-up$")
    public void closeThePopUp() {

        homePage.poup();
    }


    @And("^Click on Special link$")
    public void clickOnSpecialLink() {

        homePage.speciallink();
    }

    @Then("^Click on view details$")
    public void clickOnViewDetails() {

        homePage.viewdetails();
    }
    */

    // Navigating through special link

   /* @Given("^Click on Special link$")
    public void clickOnSpecialLink() throws InterruptedException {

    homePage.speciallink();
    }

   /* @And("^Click on view details$")
    public void clickOnViewDetails() {
       homePage.viewDetails();
    }*/

   /* @Then("^navigate to MEN POLO CASUAL SHIRT$")
    public void navigateToMENPOLOCASUALSHIRT() {

   homePage.isSpecialPageDisplayed();
    }*/
}



