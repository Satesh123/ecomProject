package regression.customerPortalPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import regression.BrowserFactory;

public class BasePage {

    WebDriver driver;



    public BasePage(){
        driver = BrowserFactory.getDriver();
//        PageFactory.initElements(driver,super.getClass());
        PageFactory.initElements(driver,this);
    }
}
