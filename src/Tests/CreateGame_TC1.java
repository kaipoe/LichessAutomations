package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGame_TC1 {


    // This automation test checks whether the 'create game' function is working
    // This test assumes the user is not logged in
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");
        driver.findElement(By.cssSelector(".button.button-metal.config_hook")).click();
        driver.findElement(By.cssSelector("label[for='sf_mode_casual']")).click();
        driver.findElement(By.cssSelector("button[title='Random side'] i")).click();
        driver.close();
    }
}
