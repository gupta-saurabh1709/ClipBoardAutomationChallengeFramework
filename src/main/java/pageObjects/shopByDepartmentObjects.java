package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shopByDepartmentObjects {

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//div[@id='hmenu-content']//div[text()='shop by department']")
    public WebElement shopByDepartment;

    @FindBy(xpath = "//div[@id='hmenu-content']//div[text()='TV, Appliances, Electronics']/..")
    public WebElement tv_appliances_electronics;

    @FindBy(xpath = "//div[@id='hmenu-content']//a[text()='Televisions']")
    public WebElement televisions;



}
