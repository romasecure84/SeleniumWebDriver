package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeysControl extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://amazon.com.tr");
        Wait(2);
        driver.findElement(By.id("sp-cc-rejectall-link")).click();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

        Wait(2);
        Actions actions = new Actions(driver);
        Action action = actions.click(searchBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("i")
                .keyUp(Keys.SHIFT)
                .sendKeys("phone 15 pro max").build();
        Wait(3);
        action.perform();

        WaitQuit(3);
    }
}
