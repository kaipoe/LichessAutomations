package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateGame_TC2 {

    // This automation will test the 'create game' functionality for a person not logged in
    // default game settings / random side

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/keda/Desktop/Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lichess.org");
        driver.findElement(By.cssSelector(".button.button-metal.config_ai")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //set mode to casual
        WebElement testDropDown = driver.findElement(By.cssSelector("#sf_variant"));
        Select dropdown = new Select(testDropDown);
        //select 'Crazyhouse' game mode
        dropdown.selectByIndex(1);
        driver.findElement(By.cssSelector("button[title='Random side'] i")).click();
        driver.quit();

        }
        }
