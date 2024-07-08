package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

public class Alert2 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Wait(2);

        driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
        Wait(1);
        driver.switchTo().alert().dismiss();
        Wait(2);

        Assert.assertTrue("test failed", driver.findElement(By.id("confirm-demo")).isDisplayed());

        WaitQuit(3);
    }
}
