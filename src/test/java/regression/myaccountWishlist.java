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
import regression.customerPortalPOM.MyAccountPage;



public class myaccountWishlist extends TestRunner {

    public MyAccountPage myAccountPage;


    @Before
    public void start() {
        myAccountPage = new MyAccountPage();
    }

    @After
    public void stop(Scenario scenario) {

        if (!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }








    @Given("^user on home$")
    public void userOnHome() {

    }

    @And("^hover to desired product$")
    public void hoverToDesiredProduct() {
    }

    @And("^click on wishlist button$")
    public void clickOnWishlistButton() {
    }

    @When("^clicked product added to wishlist$")
    public void clickedProductAddedToWishlist() {
    }

    @Then("^desired products should appear in wishlist page$")
    public void desiredProductsShouldAppearInWishlistPage() {
    }
}
