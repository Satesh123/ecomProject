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
import regression.TestRunner;
import regression.customerPortalPOM.HomePage;
import regression.customerPortalPOM.LoginRegistration;

public class Login_Register_Stepdefs extends TestRunner {

    public LoginRegistration loginRegistration;
    public HomePage homePage;

    @Before
    public void start(){
        loginRegistration = new LoginRegistration();
        homePage = new HomePage();

        driver.get("http://142.93.198.238/ecom/public/");
    }

    @After
    public void stop(Scenario scenario){

        if(!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }

    // ==================Login Page =========================
    @Given("^user is in login page$")
    public void userIsInLoginPage() throws InterruptedException {
        Thread.sleep(5000);
        loginRegistration.homeAlert();
       loginRegistration.navigateToLogin();
        Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'LOGIN')]")).isDisplayed());
    }

    @When("^he login with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void heLoginWithEmailAndPassword(String email, String password) throws Throwable {
        loginRegistration.login(email,password);
    }

    @Then("^the login should be successful$")
    public void theLoginShouldBeSuccessful() {
        loginRegistration.homeAlert();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='nav-avatar nav-link']//span[contains(text(),'Welcome ')]")).isDisplayed());
        System.out.println("Login success");

    }


    @Then("^the error message is shown \"([^\"]*)\"$")
    public void theErrorMessageIsShown(String message) throws Throwable {
        Assert.assertEquals(message,driver.findElement(By.xpath("//span[contains(text(),'Error:')]")).getText());
    }

    @When("^he clicks on forgot password link$")
    public void heClicksOnForgotPasswordLink() {
        loginRegistration.gotoForgotPasswordPage();
    }

    @And("^he navigates to forgot password page$")
    public void heNavigatesToForgotPasswordPage() {
        Assert.assertTrue(driver.findElement(By.xpath("//h5[contains(text(),'Forgot Password')]")).isDisplayed());
    }


    @And("^enter and send the email \"([^\"]*)\"$")
    public void enterAndSendTheEmail(String email) throws Throwable {
   loginRegistration.ForgotPassMail(email);
    }

    @Then("^the email should be sent and success message shown \"([^\"]*)\"$")
    public void theEmailShouldBeSentAndSuccessMessageShown(String msg) throws Throwable {
        Assert.assertEquals(msg,driver.findElement(By.xpath("//span[contains(text(),'Success:')]")).getText());
    }

    @Then("^the email should be not sent and error message shown \"([^\"]*)\"$")
    public void theEmailShouldBeNotSentAndErrorMessageShown(String M) throws Throwable {
        Assert.assertEquals(M,driver.findElement(By.xpath("//span[contains(text(),'Error:')]")).getText());
    }
}

// ==================End of login Page =========================
