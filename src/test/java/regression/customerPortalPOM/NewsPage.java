package regression.customerPortalPOM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class NewsPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class='header-navbar bg-menu-bar']//" +
            "a[contains(@class,'nav-link')][contains(text(),'News')]")
    WebElement newsPageLink;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'News')]")
    WebElement newsPage;
    @FindBy(how = How.XPATH, using = "//button[@id='allow-cookies']")
    WebElement acceptCookies;


    public void clickNewsPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='container']//" +
                "span[contains(text(),'×')]")).click();
        acceptCookies.click();
        newsPageLink.click();
    }

    public boolean isNewsPageDisplay() {
        return newsPage.isDisplayed();
    }


}
