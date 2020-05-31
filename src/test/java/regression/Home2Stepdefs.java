package regression;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import regression.TestRunner;
import regression.customerPortalPOM.HomePage2;
import regression.customerPortalPOM.InfoPage;
import regression.customerPortalPOM.NewsPage;

public class Home2Stepdefs extends TestRunner {

    public HomePage2 homePage2;





    @Before
    public void start() {
        homePage2 = new HomePage2();




        driver.get("http://142.93.198.238/ecom/public/");
    }

    @After
    public void stop(Scenario scenario) {

        if (!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }
    // ==================Subscribe for Newsletter =========================


    @Given("^User navigate to the home page$")
    public void userNavigateToTheHomePage() {
    }

    @When("^he enter the valid email address$")
    public void heEnterTheValidEmailAddress() throws InterruptedException {
        homePage2.subscribefornewaletter();
    }

    @And("^Click on subscribe button$")
    public void clickOnSubscribeButton() {
    }

    @Then("^he successfully subscribe for news letter$")
    public void heSuccessfullySubscribeForNewsLetter() throws InterruptedException {
    homePage2.subscribefornewaletter();

    }

    // ==================Trending Fashion wear Link  =========================


    @Given("^View All Range link display on Trending Fashion Wear$")
    public void viewAllRangeLinkDipslayOnResndingFashionWear() {
    }

    @When("^User clicks on to the view all range button$")
    public void userClicksOnToTheVeiwAllRangeButton() {
    }

    @Then("^navigates to the shopping page$")
    public void navigatesToTheShopPage() {


    }


    // ==================Information on footer =========================


//    @Given("^Refund Policy link display in footer on Information$")
//    public void refundPolicyLinkDisplayInFooterOnInformation() {
//    }
//
//    @And("^Terms & Services link displays in footer on Information$")
//    public void termsServicesLinkDisplaysInFooterOnInformation() {
//    }
//
//    @When("^User click on to Refund Policy$")
//    public void userClickOnToRefundPolicy() {
//    }
//
//    @And("^User click on to Terms & Services$")
//    public void userClickOnToTermsServices() {
//    }
//
//    @Then("^navigate to the Refund Policy page$")
//    public void navigateToTheRefundPolicyPage() {
//
//    }
//
//    @And("^navigate to the Terms & Services Page$")
//    public void navigateToTheTermsServicesPage() {
//    }
}
