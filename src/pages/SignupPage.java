package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameBox = By.cssSelector("#form3-username");

    By passwdBox = By.cssSelector("#form3-password");

    By emailBox = By.cssSelector("#form3-email");

    By consent1 = By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_assistance']");

    By consent2 = By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_nice']");

    By consent3 = By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_account']");

    By consent4 = By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_policy']");

    By signupBtn = By.cssSelector(".submit.button.text.big");

    By usernameError = By.cssSelector("body > div:nth-child(3) > main:nth-child(1) > form:nth-child(2) > div:nth-child(1) > p:nth-child(4)");

    public void enterUsername(String user) {
        driver.findElement(usernameBox).sendKeys(user);
    }

    public void enterPasswd(String passwd) {
        driver.findElement(passwdBox).sendKeys(passwd);
    }

    public void enterEmail(String email) {
        driver.findElement(emailBox).sendKeys(email);
    }

    public void clickConsent1() {
        driver.findElement(consent1).click();
    }

    public void clickConsent2() {
        driver.findElement(consent2).click();
    }

    public void clickConsent3() {
        driver.findElement(consent3).click();
    }

    public void clickConsent4() {
        driver.findElement(consent4).click();
    }

    public void clickRegister() {
        driver.findElement(signupBtn).click();
    }

    public void printUsernameError() {
        System.out.println(driver.findElement(usernameError).getText());
    }

}
