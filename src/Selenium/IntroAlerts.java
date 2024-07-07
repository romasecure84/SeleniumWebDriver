package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class IntroAlerts extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Wait(2);

        WebElement buttonOnClick = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        buttonOnClick.click();
        Wait(1);

        driver.switchTo().alert().accept();
        Wait(1);

        driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
        Wait(1);
        driver.switchTo().alert().dismiss();

        WaitQuit(3);
    }
}
