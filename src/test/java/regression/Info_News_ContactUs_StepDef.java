package regression;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import regression.customerPortalPOM.InfoPage;
import regression.customerPortalPOM.NewsPage;

public class Info_News_ContactUs_StepDef extends TestRunner {

    public InfoPage infoPage;
    public NewsPage newsPage;

    @Before
    public void start() {
        infoPage = new InfoPage();
        newsPage = new NewsPage();

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
    @When("^User click on News$")
    public void userClickOnNews() throws InterruptedException {
        newsPage.clickNewsPage();
    }

    @Then("^Navigate to the News Page$")
    public void navigateToNewsPage() {
        newsPage.isNewsPageDisplay();
    }

}
