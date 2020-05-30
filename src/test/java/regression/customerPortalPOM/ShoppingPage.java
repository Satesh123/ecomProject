package regression.customerPortalPOM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingPage extends BasePage {
    @FindBy(how = How.CSS, using = ".container > .close > span")
            WebElement popUp;
    @FindBy(how = How.LINK_TEXT, using= "SHOP")
            WebElement shopButton;
    @FindBy(how = How.LINK_TEXT, using = "Men's")
            WebElement mensButton;
    @FindBy(how = How.CSS,using = "#men-s .list-item:nth-child(1) > .list-link")
            WebElement mensAccessories;
    @FindBy(how = How.XPATH, using = "/html/body/section/section/div/div/div[2]/div[1]/section/div/div/div[1]/div/article/div[2]/span")
            WebElement mensAccessoriesItem;
    @FindBy(how = How.XPATH, using = ("//*[@id=\"men-s\"]/ul/li[3]/a"))
            WebElement mensShirts;
    @FindBy(how = How.XPATH, using = ("//*[@id=\"swap\"]/div/div/div[2]/div/article/div[2]/span"))
            WebElement mensShirtsItem;

    public void clickingPopUp () throws InterruptedException {
        Thread.sleep(4000);
        popUp.click();
        }
    public void clickingShopButton() {shopButton.click();}
    public void clickingMensButton() {mensButton.click();}
    public void clickingMensAccessoriesButton() {mensAccessories.click();}
    public void findingMensAccessoriesItem() {
        String MensAccessoriesCheck = mensAccessoriesItem.getText();
        Assert.assertEquals("MEN'S ACCESSORIES",MensAccessoriesCheck);
    }
    public void clickingMensShirts(){mensShirts.click();}
    public void findingMensShirtsItem() {
        String ShirtCheck = mensAccessoriesItem.getText();
        Assert.assertEquals("MEN'S SHIRT",ShirtCheck);
    }
}
