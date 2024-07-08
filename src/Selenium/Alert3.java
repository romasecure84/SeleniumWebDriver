package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Alert3 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Wait(2);

        WebElement onclick = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        new Actions(driver).scrollToElement(onclick).build().perform();
        Wait(2);
        onclick.click();
        driver.switchTo().alert().sendKeys("roma");
        Wait(2);
        driver.switchTo().alert().accept();
        Wait(2);
        Assert.assertTrue(driver.findElement(By.id("prompt-demo")).getText().toLowerCase().contains("roma"));

        WaitQuit(2);
    }
}
