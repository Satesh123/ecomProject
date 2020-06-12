package regression.customerPortalPOM;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.company.Company;
import com.devskiller.jfairy.producer.person.Person;
import com.devskiller.jfairy.producer.text.TextProducer;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import regression.WebDriverActions;

public class CheckOut extends BasePage {
    @FindBy(how = How.LINK_TEXT, using = "Straight long coat")
    WebElement productDetail;
    @FindBy(how = How.XPATH, using = "//form[@name='attributes']//button[1]//i[1]")
    WebElement productDetail_Page_addQty;
    @FindBy(how = How.XPATH, using = "//form[@name='attributes']//button[contains(text(),'Add to Cart')]")
    WebElement productDetail_Page_AddToCart;

    @FindBy(how = How.CSS, using = "  body.animation-s5:nth-child(2) section.pro-content:nth-child(14) section.shop-content.shop-two div.container div.row div.col-12.col-lg-9:nth-child(2) div.products-area section.shop-content div.products-area div.row div.col-12.col-lg-4.col-sm-6.griding:nth-child(1) div.product article:nth-child(1) div.thumb > img.img-fluid")
    WebElement productImage;
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-block  btn-secondary cart swipe-to-top' and @products_id='32']")
    WebElement addToCartonImage;
    @FindBy(how = How.XPATH, using = "//li[4]//button[1]//i[1]")
    WebElement cartItem;
    @FindBy(how = How.XPATH, using = "//li[4]//div[1]//ul[1]//li[3]//a[2]")
    WebElement checkOutBtn;
    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-light swipe-to-top btn-block']")
    WebElement guestCheckOut;

    //Shipping Address
    @FindBy(how = How.ID, using = "firstname")
    WebElement firstName;
    @FindBy(how = How.ID, using = "lastname")
    WebElement lastName;
    @FindBy(how = How.ID, using = "email")
    WebElement email;
    @FindBy(how = How.ID, using = "company")
    WebElement companyName;
    @FindBy(how = How.ID, using = "street")
    WebElement delivery_Address;
    @FindBy(how = How.ID, using = "entry_country_id")
    WebElement country;
    @FindBy(how = How.ID, using = "entry_zone_id")
    WebElement state;
    @FindBy(how = How.ID, using = "city")
    WebElement city;
    @FindBy(how = How.ID, using = "postcode")
    WebElement postcode;
    @FindBy(how = How.ID, using = "delivery_phone")
    WebElement phone;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']//button[@class='btn swipe-to-top btn-secondary'][contains(text(),'Continue')]")
    WebElement shippingAddContinueBtn;

    //Billing Address
    @FindBy(how = How.ID, using = "same_billing_address")
    WebElement same_billing_address;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Continue')]")
    WebElement billingAddContinueBtn;

    //Shipping Methods
    @FindBy(how = How.ID, using = "Shipping Price")
    WebElement shipping_Price;
    @FindBy(how = How.XPATH, using = "//form[@id='shipping_mehtods_form']//div//div//button[contains(text(),'Continue')]")
    WebElement shippingMethod_ContinueBtn;

    //Order Detail
    @FindBy(how = How.XPATH, using = "//textarea[@name='comments']")
    WebElement orderNotes;
    @FindBy(how = How.ID, using = "cash_on_delivery_label")
    WebElement cash_on_delivery;
    @FindBy(how = How.ID, using = "cash_on_delivery_button")
    WebElement order_now_btn;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Thank You')]")
    WebElement thank_you_msg;


    Fairy fairy = Fairy.create();
    Person person = fairy.person();
    Company company = fairy.company();
    TextProducer text = fairy.textProducer();


    public void addToCart() {
        productDetail.click();
        productDetail_Page_AddToCart.click();
    }

    public void goToCheckOut() {
        WebDriverActions.waitForFewSec(2);
        cartItem.click();
        checkOutBtn.click();
        guestCheckOut.click();
    }

    public void addShippingAddressDetails() {
        firstName.sendKeys(person.getFirstName());
        lastName.sendKeys(person.getLastName());
        email.sendKeys(person.getEmail());
        companyName.sendKeys(company.getName());
        delivery_Address.sendKeys((text.latinWord()));
        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText("United Kingdom");
        city.sendKeys("London");
        postcode.sendKeys("235685"); // It is accept only numbers
        phone.sendKeys(person.getTelephoneNumber());
        shippingAddContinueBtn.click();

    }

    public void addBillingAddress() {
        if (same_billing_address.isSelected()) {
            billingAddContinueBtn.click();
        }
    }

    public void selectShippingMethod() {
        shipping_Price.click();
        shippingMethod_ContinueBtn.click();
    }

    public void orderDetail() {
        orderNotes.sendKeys(text.text());
        cash_on_delivery.click();
        order_now_btn.click();
    }

    public void orderPlaced() {
        Assert.assertTrue(thank_you_msg.isDisplayed());
    }

}
