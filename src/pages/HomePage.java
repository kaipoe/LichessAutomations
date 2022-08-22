package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By LoginBtn = By.cssSelector(".signin.button.button-empty");

    By createBotGm = By.cssSelector(".button.button-metal.config_ai");

    By randomSide = By.cssSelector("button[title='Random side'] i");


    public void clickLogin() {
        driver.findElement(LoginBtn).click();
    }

    public void clickCreateBotGm() {
        driver.findElement(createBotGm).click();
    }


    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void sfDropdown(int index) {
        WebElement testDropDown = driver.findElement(By.cssSelector("#sf_variant"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(index);
    }

    public void clickRandomSide() {
        driver.findElement(randomSide).click();
    }
}
