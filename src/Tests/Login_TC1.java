package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login_TC1 {

    // This automation tests the login functionality of lichess.org.
    // It performs a negative test of submitting incorrect credentials to try to login.
    // The end result should display an error message due to the submission of incorrect credentials.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");
        driver.findElement(By.cssSelector(".signin.button.button-empty")).click();
        driver.findElement(By.cssSelector("#form3-username")).sendKeys("testUser");
        driver.findElement(By.cssSelector("#form3-password")).sendKeys("testPass");
        driver.findElement(By.cssSelector("div[class='one-factor'] button[type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
        driver.quit();
    }
}
