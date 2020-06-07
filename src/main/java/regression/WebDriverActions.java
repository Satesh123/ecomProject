package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverActions {


    public static void waitForFewSec(){
        try {
            Thread.sleep(AutomationConstants.FEWSECS*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void waitForFewSec(int FEWSECS){
        try {
            Thread.sleep(FEWSECS*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void moveTheElement(WebDriver driver, WebElement targetElement){
        Actions builder = new Actions(driver);
        builder.moveToElement(targetElement).build().perform();


    }
}
