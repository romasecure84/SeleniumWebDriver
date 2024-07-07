package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeysUpKeysDown extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/auto-complete");
        WebElement colorInput = driver.findElement(By.id("autoCompleteMultipleContainer"));

        Wait(2);
        Actions actions = new Actions(driver);
        Action action = actions.click(colorInput)
                .sendKeys("g")
                .build();
        action.perform();

        Wait(2);
        actions.scrollToElement(colorInput).perform();

        Action action1 = actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        action1.perform();

        actions.scrollToElement(colorInput).perform();

        Action action2 = actions
                .sendKeys("a")
                .build();
        action2.perform();
        Wait(2);

        Action action3 = actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        action3.perform();

        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Magenta']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Aqua']")).isDisplayed());

        WaitQuit(5);
    }
}
