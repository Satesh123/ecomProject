package regression;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import regression.customerPortalPOM.ShoppingPage;

public class Hooks {

    WebDriver driver;

    @Before
    public void start() {
        driver = BrowserFactory.getDriver();
        driver.get(AutomationConstants.MAIN_URL);
    }

    @After
    public void stop(Scenario scenario) {

        if (!scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

    }
}
