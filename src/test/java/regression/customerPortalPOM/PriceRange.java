package regression.customerPortalPOM;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.BaseProducer;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;


import java.util.List;


public class PriceRange extends BasePage {
    @FindBy(how = How.XPATH, using = "//header[@id='headerTen']//a[contains(text(),'SHOP')]")
    WebElement headerShopLink;

    @FindBy(how = How.XPATH, using = "//input[@class='js-input-from form-control']")
    WebElement minPriceBox;

    @FindBy(how = How.XPATH, using = "//input[@class='js-input-to form-control']")
    WebElement maxPriceBox;

    @FindBy(how = How.ID, using = "apply_options_btn")
    WebElement apply_btn;

    @FindBy(how = How.XPATH, using = "//span[@class='showing_record']")
    WebElement showing_record;

    @FindBy(how = How.XPATH, using = "//span[@class='showing_total_record']")
    WebElement showing_total_record;


    public void headerShopTab() {
        headerShopLink.click();
    }

    public void priceRangeBar(String minPrice, String maxPrice) {
        minPriceBox.clear();
        maxPriceBox.clear();
        minPriceBox.sendKeys(minPrice);
        maxPriceBox.sendKeys(maxPrice);

        Actions actions = new Actions(driver);
        actions.moveToElement(apply_btn).click().build().perform();

        List<WebElement> search = driver.findElements(By.className("price"));

        System.out.println(search.size());
        System.out.println(showing_record.getText());
        int i = Integer.parseInt(showing_record.getText());
        Assert.assertEquals(search.size(), i);

        for (WebElement webElement : search) {
            String priceList = webElement.getText();
            System.out.println(priceList);
        }

    }

    public void isItemRecordShowing() {
        Assert.assertEquals(showing_record.getText(), showing_total_record.getText());
    }

    public void putRandomPrice() {
        Fairy fairy = Fairy.create();
        BaseProducer baseProducer = fairy.baseProducer();
        minPriceBox.clear();
        maxPriceBox.clear();
        minPriceBox.sendKeys(String.valueOf(baseProducer.randomBetween(10, 50)));
        maxPriceBox.sendKeys(String.valueOf(baseProducer.randomBetween(51, 130)));

        Actions actions = new Actions(driver);
        actions.moveToElement(apply_btn).click().build().perform();

        List<WebElement> search = driver.findElements(By.className("price"));

        System.out.println(search.size());
        System.out.println(showing_record.getText());
        int i = Integer.parseInt(showing_record.getText());
        Assert.assertEquals(search.size(), i);

        for (WebElement webElement : search) {
            String priceList = webElement.getText();
            System.out.println(priceList);
        }

    }
}
