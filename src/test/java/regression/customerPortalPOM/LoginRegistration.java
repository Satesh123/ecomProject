package regression.customerPortalPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class LoginRegistration extends BasePage {

    // ==================login Page =========================

    @FindBy(how= How.XPATH,using="//a[@class='nav-link -before']")
    WebElement loginLink;

    @FindBy(how= How.XPATH,using="//input[@id='email']")
    WebElement emailid;

    @FindBy(how=How.CSS,using="#password")
    WebElement pass;

    @FindBy(how=How.XPATH,using="//a[@class='nav-link padding-r0']")
    WebElement logoutlink;

    @FindBy(how=How.CSS,using="#email")
    WebElement femail;

    @FindBy(how=How.XPATH,using="//button[contains(text(),'Send')]")
    WebElement sendemail;


    public void homeAlert(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
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

    public void logout(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        WebElement logoutlink= driver.findElement(By.xpath("//a[@class='nav-link padding-r0']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", logoutlink);
    }

 public void gotoForgotPasswordPage(){
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
     WebElement flink= driver.findElement(By.xpath("//a[@class='btn btn-link']"));
     JavascriptExecutor executor = (JavascriptExecutor)driver;
     executor.executeScript("arguments[0].click();", flink);

 }

  public void ForgotPassMail(String email){
       femail.sendKeys(email);
       sendemail.click();

  }

    // ==================Registration Page =========================

    @FindBy(how=How.ID,using="firstName")
    WebElement firstname;

    @FindBy(how=How.ID,using="lastName")
    WebElement lastname;

    @FindBy(how=How.XPATH,using="//input[@id='inlineFormInputGroup']")
    WebElement uemail;

    @FindBy(how=How.XPATH,using="//form[@name='signup']//input[@id='password']")
    WebElement password;

    @FindBy(how=How.XPATH,using="//input[@id='re_password']")
    WebElement confirmpass;

    @FindBy(how=How.XPATH,using="//select[@id='inlineFormCustomSelect']")
    WebElement ugender;

    @FindBy(how=How.XPATH,using="//input[@class='form-controlt checkbox-validate']")
    WebElement check;

//    @FindBy(how=How.XPATH,using="//button[@class='btn btn-light swipe-to-top']")
//    WebElement createaccount;

    public void createUserAccount(String fname, String lname, String email, String pass, String cpass, String gender){

     firstname.sendKeys(fname);
     lastname.sendKeys(lname);
     uemail.sendKeys(email);
     password.sendKeys(pass);
     confirmpass.sendKeys(cpass);
     ugender.sendKeys(gender);

    }

    public void checkAcceptTerms(){
        check.click();

    }

    public void submitAccount(){

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;

        WebElement accountbutton= driver.findElement(By.xpath("//button[@class='btn btn-light swipe-to-top']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", accountbutton);
    }

















}
