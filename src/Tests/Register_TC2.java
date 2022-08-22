package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class Register_TC2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");

        pages.HomePage home = new HomePage(driver);

        pages.LoginPage login = new LoginPage(driver);

        pages.SignupPage signup = new SignupPage(driver);

        home.clickLogin();

        login.clickRegister();

        signup.enterUsername("testuser");

        signup.enterPasswd("testpass");

        signup.enterEmail("test@email.com");

        signup.clickConsent1();

        signup.clickConsent2();

        signup.clickConsent3();

        signup.clickConsent4();

        signup.clickRegister();

        signup.printUsernameError();

        driver.quit();





    }
}
