package regression.customerPortalPOM;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class HomePage2 extends BasePage {
    @FindBy(how = How.XPATH, using = "//div[@class='newsletter']//h5[contains(text(),'Subscribe for Newsletter')]")
    WebElement Subscribefornewaletter;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary swipe-to-top mailchimp-btn']")
    WebElement subscribebtn;

    @FindBy(how = How.XPATH, using = "//body[@class='animation-s5']/div[15]/div[1]")
    WebElement SneakerCouplesFootwear;

    @FindBy(how = How.XPATH, using = "//body[@class='animation-s5']/div[15]/div[1]")
    WebElement readmorebtn1;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Your email address here...']")
    WebElement enteremail;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary swipe-to-top mailchimp-btn']")
    WebElement messagedisplayed;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-body']//div[@class='container']//span[contains(text(),'×')]")
    WebElement popup;

    @FindBy (how = How.XPATH, using = "//div[@class='col-12 col-md-6 col-lg-3']//a[contains(text(),'Refund Policy')]")
    WebElement refundPolicylink;

    @FindBy(how = How.XPATH, using = "//div[@class='col-12 col-md-6 col-lg-3']//a[contains(text(),'Term & Services')]")
    WebElement termsAndserviceslink;

    @FindBy(how = How.XPATH, using ="//h2[contains(text(),'Refund Policy')]")
    WebElement refundPolicypage;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Term & Services')]")
    WebElement termsAndservicesPage;

    @FindBy(how =How.XPATH, using = "//div[16]//a[1]")
            WebElement TrendingFashionWearLink;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Shop')]")
            WebElement viewRangebtn;



    Fairy fairy = Fairy.create();
    Person person = fairy.person();
    public void subscribefornewaletter() throws InterruptedException {
      //  Thread.sleep(2000);
        enteremail.sendKeys(person.getEmail());
    }
        public void setPopup(){
            popup.click();
    }
    public void setSubscribebtn() {
        subscribebtn.click();
    }
    public void setTrendingFashionWearLink(){
        viewRangebtn.click();
    }
    public boolean isRefundPolicyPage() {
        refundPolicylink.click();
       return refundPolicypage.isDisplayed();
    }
    public boolean isTermsAndServicesPage() {
        termsAndserviceslink.click();
        return termsAndservicesPage.isDisplayed();
    }


}



