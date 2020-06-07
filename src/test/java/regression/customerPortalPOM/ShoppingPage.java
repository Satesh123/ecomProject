package regression.customerPortalPOM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import regression.AutomationConstants;
import regression.WebDriverActions;

import java.util.List;

public class ShoppingPage extends BasePage {
    @FindBy(how = How.LINK_TEXT, using = "SHOP")
    WebElement shopButton;
    @FindBy(how = How.LINK_TEXT, using = "Men's")
    WebElement mensButton;
    @FindBy(how = How.CSS, using = "#men-s .list-item:nth-child(1) > .list-link")
    WebElement mensAccessories;
    @FindBy(how = How.XPATH, using = "/html/body/section/section/div/div/div[2]/div[1]/section/div/div/div[1]/div/article/div[2]/span")
    WebElement mensAccessoriesItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"men-s\"]/ul/li[3]/a")
    WebElement mensShirts;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[2]/div/article/div[2]/span")
    WebElement mensShirtsItem;
    @FindBy(how = How.LINK_TEXT, using = "Women's")
    WebElement womensButton;
    @FindBy(how = How.LINK_TEXT, using = "Women's Tops")
    WebElement womensTopsButton;
    @FindBy(how = How.CSS, using = ".js-input-from")
    WebElement minPriceValue;
    @FindBy(how = How.XPATH, using = "//*[@id=\"test\"]/div[1]/div/div[2]/div/span[2]/input[1]")
    WebElement maxPriceValue;
    @FindBy(how = How.XPATH, using = "//button[@id='apply_options_btn']")
    WebElement applyButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[2]/div/article/div[2]/span")
    WebElement womensTopsItem;
    @FindBy(how = How.XPATH, using = "/html/body/section/section/div/div/div[1]/div/a[3]")
    WebElement kidsButton;
    @FindBy(how = How.LINK_TEXT, using = "Kid's Shoes")
    WebElement kidsShoesButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"kid-s\"]/ul/li[2]/a")
    WebElement girlsButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[2]/div/article/div[2]/span")
    WebElement findingGirlsItem;
    @FindBy(how = How.XPATH, using = "/html/body/section/section/div/div/div[2]/h3")
    WebElement errorMessage;
    @FindBy(how = How.XPATH, using = "//*[@id=\"allow-cookies\"]")
    WebElement cookieAccept;
    @FindBy(how = How.XPATH, using = "//*[@id=\"test\"]/div[2]/div/div/ul/li[1]/div/label")
    WebElement redButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[3]/div/article/div[1]/div[2]/a")
    WebElement girlDressItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"add-Product-form\"]/div[1]/div/div/select")
    WebElement girlsDressColourSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"men-s\"]/ul/li[2]/a")
    WebElement mensJeans;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[1]/div/article/div[2]/span")
    WebElement mensJeansItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"men-s\"]/ul/li[4]/a")
    WebElement mensShoes;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[1]/div/article/div[2]/span")
    WebElement mensShoesItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"women-s\"]/ul/li[1]/a")
    WebElement womensAccessories;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[1]/div/article/div[2]/span")
    WebElement womensAccessoriesItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"women-s\"]/ul/li[2]/a")
    WebElement womensBottoms;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[1]/div/article/div[2]/span")
    WebElement womensBottomsItem;
    @FindBy(how = How.XPATH, using = "/html/body/section/section/div/div/div[1]/div/div[2]/ul/li[4]/a")
    WebElement womensWinterWear;
    @FindBy(how = How.XPATH, using = "/html/body/section/section/div/div/div[2]/div[1]/section/div/div/div[2]/div/article/div[2]/span")
    WebElement womensWinterWearItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"women-s\"]/ul/li[5]/a")
    WebElement womensShoes;
    @FindBy(how = How.LINK_TEXT, using = "Party Dinner Shoes Woman")
    WebElement womensShoesIteam;
    @FindBy(how = How.XPATH, using = "//*[@id=\"kid-s\"]/ul/li[1]/a")
    WebElement kidsBoysButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[2]/div/article/div[2]/span")
    WebElement kidsBoysButtonItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"kid-s\"]/ul/li[3]/a")
    WebElement kidsShoesButtonOption;
    @FindBy(how = How.TAG_NAME, using = "section")
    WebElement errorTag;
    @FindBy(how = How.XPATH, using = "//*[@id=\"swap\"]/div/div/div[2]/div/article/div[1]/div[2]/button")
    WebElement addToCart;
    @FindBy(how = How.CSS, using = ".product-hover > .active.product-hover > .active")
    WebElement cartButton;
    @FindBy(how = How.XPATH, using = "//section[@class=' cart-content']//h4")
    WebElement cartItem;

    @FindBy(how = How.XPATH, using = "//button[text()='Add to Cart']")
    List<WebElement> addToCartButtons;

    @FindBy(how = How.XPATH, using = "//button[text()='Add to Cart']")
    WebElement addToCartButton;

    //GET ALL THE PRODUCTS LOCATORS
    @FindBy(how = How.CLASS_NAME, using = "product")
    List<WebElement> productList;


    public void clickingShopButton() {
        shopButton.click();
    }

    public void clickingMensButton() {
        mensButton.click();
    }

    public void clickingMensAccessoriesButton() {
        mensAccessories.click();
    }

    public void findingMensAccessoriesItem() {
        String MensAccessoriesCheck = mensAccessoriesItem.getText();
        Assert.assertEquals("MEN'S ACCESSORIES", MensAccessoriesCheck);
    }

    public void clickingMensShirts() {
        mensShirts.click();
    }

    public void findingMensShirtsItem() {
        String ShirtCheck = mensShirtsItem.getText();
        Assert.assertEquals("MEN'S SHIRTS", ShirtCheck);
    }

    public void clickingWomensButton() {
        womensButton.click();
    }

    public void findingWomensTopsButton() {
        String WomensTopsCheck = womensTopsButton.getText();
        Assert.assertEquals("Women's Tops", WomensTopsCheck.trim());
    }

    public void clickingWomensTopButton() {
        womensTopsButton.click();
    }

    public void findingWomensTopsItemButton() {
        String WomensTopsItemCheck = womensTopsItem.getText();
        Assert.assertEquals("WOMEN'S TOPS", WomensTopsItemCheck);
    }

    public void clickingKidsButton() {
        kidsButton.click();
    }

    public void findingKidsShoesOption() {
        String KidsShoesCheck = kidsShoesButton.getText();
        Assert.assertEquals("Kid's Shoes", KidsShoesCheck.trim());
    }

    public void clickingGirlsButton() {
        girlsButton.click();
    }

    public void findingGirlsItemOption() {
        String GirlsItemCheck = findingGirlsItem.getText();
        Assert.assertEquals("GIRL'S CLOTHING", GirlsItemCheck);
    }

    public void clickingPriceBarButton() {
        minPriceValue.clear();
    }

    public void enteringMaxValueInMinVal() throws InterruptedException {
        minPriceValue.sendKeys("80");
        maxPriceValue.clear();
        maxPriceValue.sendKeys("70");
        cookieAccept.click();
        Thread.sleep(2000);
        Actions builder = new Actions(driver);
        builder.moveToElement(applyButton).click();
    }

    public void gettingErrorMessage() {
        String bodyText = errorTag.getText();
        Assert.assertTrue("Record", bodyText.contains("NEW"));
    }

    public void clickingRedButton() {
        redButton.click();
        Actions builder = new Actions(driver);
        builder.moveToElement(applyButton).click();
    }

    public void findingRedColourOption() {
        girlDressItem.click();
        Select GirlsDressColour = new Select(girlsDressColourSelect);
        GirlsDressColour.selectByVisibleText("Red");
    }

    public void findingMensOption() {
        mensAccessories.getText();
        String MensItemsCheck = mensAccessories.getText();
        Assert.assertEquals("Men's Accessories", MensItemsCheck.trim());
    }

    public void clickingMensJeansOption() {
        mensJeans.click();
    }

    public void findingMensJeansOption() {
        String MensJeansItemCheck = mensJeansItem.getText();
        Assert.assertEquals("MEN'S JEANS", MensJeansItemCheck);
    }

    public void clickingMensShoesOption() {
        mensShoes.click();
    }

    public void findingMensShoesOption() {
        String MensShoesItemCheck = mensShoesItem.getText();
        Assert.assertEquals("MEN'S SHOES", MensShoesItemCheck);
    }

    public void clickingWomensAccessoriesOption() {
        womensAccessories.click();
    }

    public void findingWomensAccessoriesItemOption() {
        String WomensAccessoriesItemCheck = womensAccessoriesItem.getText();
        Assert.assertEquals("WOMEN'S ACCESSORIES", WomensAccessoriesItemCheck);
    }

    public void clickingWomensBottomsOption() {
        womensBottoms.click();
    }

    public void findingWomensBottomsItemOption() {
        String WomensBottomsItemCheck = womensBottomsItem.getText();
        Assert.assertEquals("WOMEN'S BOTTOMS", WomensBottomsItemCheck);
    }

    public void clickingWomensWinterWearOption() {
        Actions builder = new Actions(driver);
        builder.moveToElement(womensWinterWear).click();
    }

    public void findingWomensWinterWearItemOption() {
        String WomensWinterwearItemCheck = womensWinterWearItem.getText();
        Assert.assertEquals("WOMEN'S WINTER WEAR", WomensWinterwearItemCheck);
    }

    public void clickingWomensShoesOption() {
        Actions builder = new Actions(driver);
        builder.moveToElement(womensShoes).click();
    }

    public void findingWomensShoesItemOption() {
        String WomensShoesIteamCheck = womensShoesIteam.getText();
        Assert.assertTrue("WOMEN'S SHOES", WomensShoesIteamCheck.contains("Shoes"));
    }

    public void clickingKidsBoysOption() {
        kidsBoysButton.click();
    }

    public void findingKidsBoysItem() {
        String KidsBoysItemCheck = kidsBoysButtonItem.getText();
        Assert.assertEquals("BOY'S CLOTHING", KidsBoysItemCheck);
    }

    public void clickingKidsShoesOption() {
        Actions builder = new Actions(driver);
        builder.moveToElement(kidsShoesButtonOption).click();
    }

    public void addingToCart() {
       // WebElement firstElement = productList.get(0);
       // System.out.println(firstElement.getText());
     //   WebDriverActions.moveTheElement(driver,firstElement);
        addToCartButton.click();
    }

    public void checkingCartList() {

        driver.navigate().to(AutomationConstants.MAIN_URL+"viewcart");
        String CartItemCheck = cartItem.getText();
        Assert.assertTrue( CartItemCheck.contains("Idayan Oil"));
    }

}


