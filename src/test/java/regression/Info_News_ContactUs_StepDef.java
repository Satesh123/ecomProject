package regression;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import regression.customerPortalPOM.ContactUsPage;
import regression.customerPortalPOM.InfoPage;
import regression.customerPortalPOM.NewsPage;

public class Info_News_ContactUs_StepDef extends TestRunner {

    public InfoPage infoPage;
    public NewsPage newsPage;
    public ContactUsPage contactUsPage;

    @Before
    public void start() {
        infoPage = new InfoPage();
        newsPage = new NewsPage();
        contactUsPage = new ContactUsPage();

        driver.get("http://142.93.198.238/ecom/public/");
    }

    @After
    public void stop(Scenario scenario) {

        if (!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }

    // ==================Info Page =========================
    @Given("^Info Pages link display in main menu$")
    public void infoPagesLinkDisplayInMainMenu() {

        infoPage.isInfoPagesLinkDisplay();
    }

    @When("^User do mouse hover on InfoPages link in main menu on homepage$")
    public void userDoMouseOverOnInfoPagesLinkInMainMenuOnHomepage() {
        infoPage.mouseHoverOnInfoPages();
    }

    @And("^select About Us link$")
    public void selectLinkAboutUs() throws InterruptedException {
        infoPage.goToAboutUsPage();

    }

    @Then("^navigate to the About Us page$")
    public void navigateToTheAboutUsPage() {
        infoPage.isAboutUsPage();
    }

    @And("^select Privacy policy link$")
    public void selectPrivacyPolicyLink() {
        infoPage.goToPrivacyPolicyPage();
    }

    @Then("^navigate to the Privacy Page$")
    public void navigateToThePrivacyPage() {
        infoPage.isPrivacyPolicyPage();
    }

    //================News Scenario=============================
    @When("^User click on News in main menu tab$")
    public void userClickOnNews() throws InterruptedException {
        newsPage.clickNewsPage();
    }

    @Then("^Navigate to the News Page$")
    public void navigateToNewsPage() {
        newsPage.isNewsPageDisplay();
    }

    //===============Contact Us=================================
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws InterruptedException {
        contactUsPage.isContactUsTabDisplay();
    }

    @When("^Click on Contact Us link$")
    public void clickOnContactUsLink() {
        contactUsPage.clickOnContactUs();

    }

    @Then("^Navigate to Contact Us Page$")
    public void navigateToContactUsPage() {
        contactUsPage.isContactPageDisplay();

    }

    @When("^User fill required field FullName as \"([^\"]*)\" Email as \"([^\"]*)\" Message as \"([^\"]*)\" and click submit$")
    public void userFillRequiredFieldFullNameAsEmailAsMessageAs(String name, String email, String message) {
        contactUsPage.fillRequiredField(name, email, message);

    }

    @Then("^User message should be deliver successfully$")
    public void userMessageShouldBeDeliverSuccessfully() {
        contactUsPage.isContactPageDisplay();
    }


}
