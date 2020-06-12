package regression.customerPortalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends BasePage {

    @FindBy(how = How.ID, using = "email")
    WebElement email2;
    @FindBy(how = How.ID,using = "password")
    WebElement password2;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Date of Birth']")
    WebElement dOB;
    @FindBy(how=How.XPATH, using ="//input[@placeholder='Phone Number']")
    WebElement phoneno;
    @FindBy(how=How.XPATH, using = "/html/body/section/section/div/div/div[3]/form/button")
    WebElement updateprofile;
    //------------------shipping address
    @FindBy(how = How.ID,using = "//a[@class='nav-link'][contains(text(),'Shipping Address')]")
    WebElement shippingaddress;
    @FindBy(how=How.ID,using = "entry1_firstname")
    WebElement firstnamee;
    @FindBy(how=How.ID, using = "entry1_lastname")
    WebElement lastnamee;
    @FindBy(how=How.ID,using = "entry1_street_address")
    WebElement address;
    @FindBy(how = How.ID, using = "entry_country_id")
    WebElement country;
    @FindBy(how = How.ID, using = "entry_city1")
    WebElement city;
    @FindBy(how = How.ID, using = "entry_postcode1")
    WebElement postcode;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Address')]")
    WebElement addaddressbutton;
    /*@FindBy(how = How.CSS,using = "button.btn.btn-secondary")
    WebElement loginbutton2;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Login')]")
    WebElement loginbutton3;
    ////button[contains(text(),'Login')]
    @FindBy(how = How.ID,using = "allow-cookies" )
    WebElement cookie2;
    @FindBy(how = How.CSS,using = "a.nav-link")
    WebElement profile2;
    @FindBy(how = How.LINK_TEXT, using = "Profile")
    WebElement profile3;*/


   /* public void loginframe()
    {

        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/div[1]")));

        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div[2]/form/div[3]")));

    }*/

    public void setLogin(){

        email2.sendKeys("blacklabel@whisky.com");
        password2.sendKeys("blacklabel1");
        //loginframe();
        //loginbutton2.click();
        //driver.switchTo().defaultContent();

        WebElement firstbutton= driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", firstbutton);

        //cookie2.click();
    }
    public void setProfie2() throws InterruptedException {
        Thread.sleep(2000);
        //driver.switchTo().frame(driver.findElement(By.xpath("//nav[@id='navbar_0_6']//div[@class='navbar-collapse']")));

        //profile2.click();
        //driver.switchTo().parentFrame();
        WebElement profilelink= driver.findElement(By.xpath("//*[@id=\"navbar_0_6\"]/div[2]/ul/li[2]/a"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", profilelink);

    }
    public void profileforum(String gender,String dateofbirth,String mobileno){
        dOB.sendKeys(dateofbirth);
        phoneno.sendKeys(mobileno);

    }
    public void profilesubmit() {
        //updateprofile.click();
       WebElement updatebutton= driver.findElement(By.xpath("//button[contains(text(),'Update')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", updatebutton);
        driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']")).isDisplayed();
    }
        public void setShippingaddress() {
            WebElement shippinglink= driver.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'Shipping Address')]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
             executor.executeScript("arguments[0].click();", shippinglink);
            //shippingaddress.click();
            firstnamee.sendKeys("blacklabel");
            lastnamee.sendKeys("whisky");
            address.sendKeys("10 newroad, ilford");
            city.sendKeys("london");
            postcode.sendKeys("Ab12cd");
            country.sendKeys("UK");
            //addaddressbutton.click();
            WebElement shippingaddressbutton= driver.findElement(By.xpath("//button[contains(text(),'Add Address')]"));
            JavascriptExecutor executor1 = (JavascriptExecutor)driver;
            executor1.executeScript("arguments[0].click();", shippingaddressbutton);


        }




}


