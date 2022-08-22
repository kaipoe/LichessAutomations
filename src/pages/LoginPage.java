package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By uName = By.cssSelector("#form3-username");

    By passwd = By.cssSelector("#form3-password");

    By loginBtn = By.cssSelector("div[class='one-factor'] button[type='submit']");

    By registerBtn = By.cssSelector("a[href='/signup']");

    By loginError = By.cssSelector("p[class='error']");

    public void enterUsername(String user) {
        driver.findElement(uName).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(passwd).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void clickRegister() {
        driver.findElement(registerBtn).click();
    }

    public void printError() {
        System.out.println(driver.findElement(loginError).getText());
    }
}
