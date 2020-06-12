package regression.customerPortalPOM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import regression.WebDriverActions;

public class ProductDetails extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Straight long coat")
    WebElement productDetail;

    @FindBy(how = How.ID, using = "description-tab")
    WebElement descriptionTab;

    @FindBy(how = How.XPATH, using = "//div[@class = 'icon swipe-to-top modal_show ' and @products_id='32']")
    WebElement quickViewBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='popup-detail-info']")
    WebElement popupDetailInfo;

    @FindBy(how = How.XPATH, using = " //button[@class='btn btn-secondary btn-lg swipe-to-top add-to-Cart']")
    WebElement addToCart_PopUpWindow;

    @FindBy(how = How.XPATH, using = " //div[@class='modal-body']//span[contains(text(),'×')]")
    WebElement closePopUpWindow;

    @FindBy(how = How.CSS, using = "  body.animation-s5:nth-child(2) section.pro-content:nth-child(14) section.shop-content.shop-two div.container div.row div.col-12.col-lg-9:nth-child(2) div.products-area section.shop-content div.products-area div.row div.col-12.col-lg-4.col-sm-6.griding:nth-child(1) div.product article:nth-child(1) div.thumb > img.img-fluid")
    WebElement productImage;

    @FindBy(how = How.XPATH, using = "//i[@class='fas fa-plus']")
    WebElement addQty;

    @FindBy(how = How.XPATH, using = "//div[@id='alert-pro']//div[1]")
    WebElement alertMsg;


    public void checkProductDetail() {
        productDetail.click();
    }

    public void isDisplayProductDetail() {
        Assert.assertTrue(descriptionTab.isDisplayed());
    }

    public void quickView() {

        Actions actions = new Actions(driver);
        actions.moveToElement(productImage).build().perform();
        WebDriverActions.waitForFewSec(1);
        quickViewBtn.click();
    }

    public void isDisplayInPopUpInfo() {
        WebDriverActions.waitForFewSec(1);
        Assert.assertTrue(popupDetailInfo.isDisplayed());
    }

    public void popupWindowAddToCart() {
        WebDriverActions.waitForFewSec(1);
        addQty.click();
        addToCart_PopUpWindow.click();

        Assert.assertTrue(alertMsg.isEnabled());

    }

}
