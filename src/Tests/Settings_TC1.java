package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Settings_TC1 {

    // This automation will test the 'change language' function in the settings
    // This test succeeds if the app language changes to Spanish
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");
        driver.findElement(By.cssSelector("span[title='Preferences']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("header[id='top'] button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("button[title='es-ES']")).click();

    }
}
