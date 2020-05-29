package regression.customerPortalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class LoginRegistration extends BasePage {


    @FindBy(how= How.XPATH,using="//a[@class='nav-link -before']")
    WebElement loginLink;

    @FindBy(how= How.XPATH,using="//input[@id='email']")
    WebElement emailid;

    @FindBy(how=How.CSS,using="#password")
    WebElement pass;


    @FindBy(how=How.CSS,using="#email")
    WebElement femail;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Send')]")
    WebElement sendemail;


    public void homeAlert(){
        driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='container']//span[contains(text(),'×')]")).click();
    }

    public void navigateToLogin(){

        loginLink.click();

    }

    public void login(String email,String password) throws InterruptedException {

        emailid.sendKeys(email);
        pass.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;

        WebElement firstbutton= driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", firstbutton);


    }

 public void gotoForgotPasswordPage(){

     WebElement flink= driver.findElement(By.xpath("//a[@class='btn btn-link']"));
     JavascriptExecutor executor = (JavascriptExecutor)driver;
     executor.executeScript("arguments[0].click();", flink);

 }

  public void ForgotPassMail(String email){
       femail.sendKeys(email);
       sendemail.click();

  }

}
