package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FrameByIndex extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(2);
        WebElement dropdown = driver.findElement(By.id("selectnav1"));
        new Actions(driver).scrollToElement(dropdown).perform();
        dropdown.click();

        Select select = new Select(dropdown);
        select.selectByVisibleText("- Frames Practice");
        Wait(2);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        new Actions(driver).scrollByAmount(0,300).perform();
        driver.findElement(By.id("firstName")).sendKeys("Roma");
        Wait(2);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(4);
        WebElement menuButton = driver.findElement(By.id("selectnav2"));
        new Select(menuButton).selectByVisibleText("Home");
        Wait(2);
        driver.switchTo().frame(2);

        WaitQuit(5);
    }
}
