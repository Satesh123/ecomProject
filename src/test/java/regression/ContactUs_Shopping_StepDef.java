package regression;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import regression.customerPortalPOM.ContactUsPage;
import regression.customerPortalPOM.PriceRange;

import java.io.IOException;

public class ContactUs_Shopping_StepDef extends TestRunner {

    public ContactUsPage contactUsPage;
    public PriceRange priceRange;

    @Before
    public void start() {

        contactUsPage = new ContactUsPage();
        priceRange = new PriceRange();

        driver.get("http://142.93.198.238/ecom/public/");

    }

    @After
    public void stop(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }


    //===============Contact Us Page=================================
    @Given("^User click on Contact Us link$")
    public void userClickOnContactUsLink() {
        contactUsPage.clickOnContactUs();
    }

    @When("^User fill required field FullName as \"([^\"]*)\" Email as \"([^\"]*)\" Message as \"([^\"]*)\" and click submit$")
    public void userFillRequiredFieldFullNameAsEmailAsMessageAs(String name, String email, String message) {
        contactUsPage.fillRequiredField(name, email, message);

    }

    @Then("^User message should be deliver successfully$")
    public void userMessageShouldBeDeliverSuccessfully() {

        contactUsPage.isMessageSent();
    }
//================Price Range=====================================

    @Given("^User click on shop link in header menu$")
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

    @When("^User enter minimum price and max price  in the box$")
    public void userEnterMinimumPriceAndMaxPriceInTheBox() {
        priceRange.putRandomPrice();
    }
}
