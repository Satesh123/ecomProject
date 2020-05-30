package regression.customerPortalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class ContactUsPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//header[@id='headerTen']//a[contains(text(),'Contact Us')]")
    WebElement contactUs;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Contact Us')]")
    WebElement contactUsPage;
    @FindBy(how = How.ID, using = "name")
    WebElement fullName;
    @FindBy(how = How.ID, using = "validationCustomUsername")
    WebElement CustomerUsername;
    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='write your message here...']")
    WebElement writeMessage;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    WebElement submitButton;



    public boolean isContactUsTabDisplay() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='container']//" +
                "span[contains(text(),'×')]")).click();
        return contactUs.isDisplayed();
    }
    public void clickOnContactUs(){
        contactUs.click();
    }
    public void isContactPageDisplay(){
        contactUsPage.isDisplayed();
    }
    public void fillRequiredField(String name, String email, String message){
        fullName.sendKeys(name);
        CustomerUsername.sendKeys(email);
        writeMessage.sendKeys(message);
        submitButton.click();

    }

}
