package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Settings_TC2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");
        driver.findElement(By.cssSelector("span[title='Preferences']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("header[id='top'] button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div[class='content'] button:nth-child(6)")).click();
        driver.findElement(By.cssSelector(".head.text")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.quit();
    }
}
