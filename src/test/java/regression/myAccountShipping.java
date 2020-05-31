package regression;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import regression.customerPortalPOM.MyAccountPage;

public class myAccountShipping extends TestRunner {
    public MyAccountPage accountShipping;
    @Before
    public void start() {
        accountShipping = new MyAccountPage();
        //driver.get("http://142.93.198.238/ecom/public/profile");
    }
    @After
    public void stop(Scenario scenario) {

        if (!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }

    @And("^click on Shipping Address$")
    public void clickOnShippingAddress() {
    }

    @And("^Enter First Name Last Name$")
    public void enterFirstNameLastName() {
    }

    @And("^shipping address and postal code$")
    public void shippingAddressAndPostalCode() {
    }

    @And("^select country state and city$")
    public void selectCountryStateAndCity() {
    }

    @And("^click on Add Address$")
    public void clickOnAddAddress() {
    }

    @Then("^address should add sucessfully$")
    public void addressShouldAddSucessfully() {

        accountShipping.setShippingaddress();
    }

    @Given("^user on the profile page$")
    public void userOnTheProfilePage() {
    }
}
