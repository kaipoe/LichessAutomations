package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Register_TC1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");
        driver.findElement(By.cssSelector(".signin.button.button-empty")).click();
        driver.findElement(By.cssSelector("a[href='/signup']")).click();
        driver.findElement(By.cssSelector("#form3-username")).sendKeys("testuser");
        driver.findElement(By.cssSelector("#form3-password")).sendKeys("testpass");
        driver.findElement(By.cssSelector("#form3-email")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_assistance']")).click();
        driver.findElement(By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_nice']")).click();
        driver.findElement(By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_account']")).click();
        driver.findElement(By.cssSelector("span[class='form-check-input'] label[for='form3-agreement_policy']")).click();
        driver.findElement(By.cssSelector(".submit.button.text.big")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.quit();
    }
}
