package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.shopByDepartmentObjects;

import java.time.Duration;

import static utility.commonMethods.*;

public class shopByDepartmentSteps {

    pageObjects.shopByDepartmentObjects shopByDepartmentObjects = new shopByDepartmentObjects();
    WebDriver driver;
    WebDriverWait wait;

    public void SetupDriver(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, shopByDepartmentObjects);
         this.wait =new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void openAmazon() {
        driver.get("https://www.amazon.in/");
    }

    public void clickHamburgerMenu() {

        wait.until(ExpectedConditions.elementToBeClickable(shopByDepartmentObjects.hamburgerMenu));
        Assert.assertTrue(shopByDepartmentObjects.hamburgerMenu.isDisplayed());
//        shopByDepartmentObjects.hamburgerMenu.click();
                clickOn(shopByDepartmentObjects.hamburgerMenu);
    }

    public void shopByDepartmentHeaderShouldDisplay() {
        wait.until(ExpectedConditions.visibilityOf(shopByDepartmentObjects.shopByDepartment));
//        Assert.assertTrue(shopByDepartmentObjects.shopByDepartment.isDisplayed());
        isElementDisplayed(shopByDepartmentObjects.shopByDepartment);
    }

    public void userClicksOnTV_Appliances_ElectronicsDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(shopByDepartmentObjects.tv_appliances_electronics));
//        shopByDepartmentObjects.tv_appliances_electronics.click();
        clickOn(shopByDepartmentObjects.tv_appliances_electronics);
    }

    public void userClicksOnTelevision(){
        wait.until(ExpectedConditions.elementToBeClickable(shopByDepartmentObjects.televisions));
        shopByDepartmentObjects.televisions.click();

    }


}
