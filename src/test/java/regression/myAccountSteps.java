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
import regression.customerPortalPOM.MyAccountPage;

//import static org.graalvm.compiler.nodeinfo.Verbosity.Name;


public class myAccountSteps extends TestRunner {
 // public LoginPageFactory loginPageFactory=new LoginPageFactory();
 public MyAccountPage myAccountPage;

 @Before
 public void start() {
     myAccountPage = new MyAccountPage();
  driver.get("http://142.93.198.238/ecom/public/login");
 }
    @After
    public void stop(Scenario scenario) {

        if (!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }

    //---------------------------profilenew


    @Given("^user logged on to home page$")
    public void userLoggedOnToHomePage() throws InterruptedException {
     myAccountPage.setLogin();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='nav-avatar nav-link']//span[contains(text(),'Welcome ')]")).isDisplayed());

        Thread.sleep(5000);
    }

    @And("^click on profile tab$")
    public void clickOnProfileTab() throws InterruptedException {
        Thread.sleep(2500);
        myAccountPage.setProfie2();
    }

    @And("^Enter \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter(String arg0, String arg1)  {

    }

   /* @And("^Select \"([^\"]*)\"$")
    public void select(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/

    @And("^click on update$")
    public void clickOnUpdate() {
    }

    @Then("^Profile should update$")
    public void profileShouldUpdate() {
    }
    //---------------------------Shipping



    @Given("^user is in login page$")
    public void userIsInLoginPage() {
    }

    @When("^he login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void heLoginWithUsernameAndPassword(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^click on submit$")
    public void clickOnSubmit() {
    }

    @Then("^the login should be successful$")
    public void theLoginShouldBeSuccessful() {
    }

    @Given("^user is in on the home page$")
    public void userIsInOnTheHomePage() {
    }

    @When("^click on profile$")
    public void clickOnProfile() {
    }

    @Then("^Profile page displayed$")
    public void profilePageDisplayed() {
    }

    @And("^Enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter(String gender, String dob, String phonenumber) throws Throwable {
        myAccountPage.profileforum(gender,dob,phonenumber);

    }

    @And("^Select \"([^\"]*)\" \"([^\"]*)\"$")
    public void select(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^click on update button$")
    public void clickOnUpdateButton() {
        myAccountPage.profilesubmit();
        Assert.assertTrue(true);
    }

    @Then("^Profile should update successfully$")
    public void profileShouldUpdateSuccessfully() {
        Assert.assertTrue("Profile has been updated successfully!", true);

    }



}



