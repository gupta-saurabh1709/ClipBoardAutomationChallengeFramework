package utility;

import org.openqa.selenium.WebElement;

public class commonMethods {

    public static void clickOn(WebElement element){
        element.click();
    }

    public static Boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public static void enterText(WebElement element,String message){
        element.sendKeys(message);
    }
}
