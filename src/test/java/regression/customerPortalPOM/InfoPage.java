package regression.customerPortalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InfoPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'header-navbar bg-menu-bar')]//" +
            "a[contains(@class,'dropdown-toggle')][contains(text(),'INFO PAGES')]")
    WebElement infoPages;
    @FindBy(how = How.XPATH, using = "//div[@class='header-navbar bg-menu-bar']//" +
            "a[@class='dropdown-item'][contains(text(),'About Us')]")
    WebElement aboutUs;
    @FindBy(how = How.XPATH, using = "//div[@class='header-navbar bg-menu-bar']//" +
            "a[@class='dropdown-item'][contains(text(),'Privacy Policy')]")
    WebElement privacyPolicy;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'About Us')]")
    WebElement aboutUsPage;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Privacy Policy')]")
    WebElement privacyPolicyPage;


    public boolean isInfoPagesLinkDisplay() {

        return infoPages.isDisplayed();
    }
    public void mouseHoverOnInfoPages() {
        Actions action = new Actions(driver);
        action.moveToElement(infoPages);
    }

    public void goToAboutUsPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='container']//span[contains(text(),'×')]")).click();
        Thread.sleep(1000);

        Actions action = new Actions(driver);
        action.moveToElement(infoPages).moveToElement(aboutUs).click().build().perform();
    }
    public boolean isAboutUsPage() {
        return aboutUsPage.isDisplayed();
    }
    public void goToPrivacyPolicyPage() {
        Actions action = new Actions(driver);
        action.moveToElement(infoPages).moveToElement(privacyPolicy).click().build().perform();
    }
    public boolean isPrivacyPolicyPage() {
        return privacyPolicyPage.isDisplayed();
    }


}
