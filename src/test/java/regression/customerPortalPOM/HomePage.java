package regression.customerPortalPOM;


import com.sun.org.apache.xpath.internal.objects.XBoolean;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.management.snmp.jvminstr.JvmMemPoolEntryImpl;

import javax.swing.*;
import java.net.PortUnreachableException;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {


    @FindBy(how = How.XPATH, using = "//div[@class='search-field-wrap']//input[@placeholder='Search Products...']")
    WebElement searchfield;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),\"Women's Shoes\")]")
    WebElement shoesdisplayed;

    @FindBy(how = How.XPATH, using = "//span[@class='tag']")

    WebElement oildisplayed;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary swipe-to-top']")
    WebElement clickbutton;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-body']//div[@class='container']//span[contains(text(),'×')]")

    WebElement popup;


//@FindBy(how = How.XPATH, using = "//div[@class='header-navbar bg-menu-bar']//a[contains(@class,'nav-link')][contains(text(),'SHOP')]")

    @FindBy(how = How.LINK_TEXT, using = "SHOP")

    // @FindBy(how = How.PARTIAL_LINK_TEXT, using = "SHOP")
            WebElement Shop;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Shop')]")
    WebElement shoppageDisplayed;


    //@FindBy(how = How.LINK_TEXT, using = "SPECIAL")
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Special')]")
    //@FindBy(how = How.CLASS_NAME, using = "nav-link btn active")
    WebElement speciallink;

    @FindBy(how = How.XPATH, using = "//div[@class='slick slick-slide slick-active']//a[contains(text(),'Men Polo Casual Shirt')]")

               WebElement viewDeatil;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Men Polo Casual Shirt')]")
    WebElement speciallinkDisplayed;

    @FindBy(how = How.XPATH, using = "//button[@id='allow-cookies']")
    WebElement cookies;

    public void poup() {

        popup.click();
    }


    public void searchproduct(String product) throws InterruptedException {

        //searchfield.click();

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(2000);
        popup.click();
        searchfield.sendKeys(product);
        clickbutton.click();
    }

    public boolean issearchDisplayed() {

        return shoesdisplayed.isDisplayed();

    }


    //// ***********@clickshop*************

    public void shopcclick() throws InterruptedException {

        Thread.sleep(2000);
        popup.click();
        Shop.click();
    }

    public boolean isShopPlaceDispalyed() {

        return shoppageDisplayed.isDisplayed();
    }

//// ***********@speciallink Navigation*************

    public void speciallink() throws InterruptedException {
        Thread.sleep(2000);
        popup.click();

        cookies.click();
        Thread.sleep(2000);

        speciallink.click();

       // Actions actions = new Actions(driver);

        // Scroll Down using Actions class
        //actions.moveToElement(speciallink).click().perform();


        viewDeatil.click();
    }


    public boolean isSpecialPageDisplayed() {

        return speciallinkDisplayed.isDisplayed();
    }

}
