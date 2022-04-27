package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.shopByDepartmentSteps;

import java.util.concurrent.TimeUnit;


public class shopByDepartment {

    steps.shopByDepartmentSteps shopByDepartmentSteps=new shopByDepartmentSteps();

    WebDriver driver ;
    @Before()
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        shopByDepartmentSteps.SetupDriver(driver);
    }

    @Given("User Open Amazon")
    public void userOpenAmazon(){
        shopByDepartmentSteps.openAmazon();
    }

    @When("User clicks on the hamburger menu")
    public void userClickOnHamburgerMenu(){
        shopByDepartmentSteps.clickHamburgerMenu();
    }

    @Then("Shop By Department header should display")
    public void shopByDepartmentHeaderShouldDisplay() {
        shopByDepartmentSteps.shopByDepartmentHeaderShouldDisplay();
    }

    @When("User clicks on TV_Appliances_Electronics dropdown")
    public void userClicksOnTV_Appliances_ElectronicsDropdown() {
        shopByDepartmentSteps.userClicksOnTV_Appliances_ElectronicsDropdown();
    }

    @Then("User clicks on Television")
    public void userClicksOnTelevision(){
        shopByDepartmentSteps.userClicksOnTelevision();
    }

    @After
    public void terminateBrowserSession(){
        driver.quit();
    }
}
