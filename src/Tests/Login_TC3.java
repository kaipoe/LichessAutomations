package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");

        pages.HomePage home = new HomePage(driver);

        pages.LoginPage login = new LoginPage(driver);

        home.clickLogin();

        login.enterUsername("test");

        login.enterPassword("test");

        login.clickLogin();

        Thread.sleep(3000);

        login.printError();

        driver.quit();

    }
}
