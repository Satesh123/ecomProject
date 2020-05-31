package regression.customerPortalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import regression.BrowserFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(){
        driver = BrowserFactory.getDriver();
        PageFactory.initElements(driver,this);
    }
}
