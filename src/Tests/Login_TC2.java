package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// This automation tests the login functionality of lichess.org
// This test assumes you have valid login credentials
// The result of this positive test should be a confirmation of a successful logged in.

public class Login_TC2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");
        driver.findElement(By.cssSelector(".signin.button.button-empty")).click();
        driver.findElement(By.cssSelector("#form3-username")).sendKeys("testUser");
        driver.findElement(By.cssSelector("#form3-password")).sendKeys("testPass");
        driver.findElement(By.cssSelector("div[class='one-factor'] button[type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
