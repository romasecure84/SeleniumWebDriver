package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


public class ActionStructure extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.cssSelector("#doubleClickBtn"));
        WebElement rightClickBtn = driver.findElement(By.cssSelector("#rightClickBtn"));
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        driver.manage().deleteAllCookies();


        Actions actions = new Actions(driver);


        actions.doubleClick(doubleClickBtn).perform();
        Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

        actions.scrollByAmount(0,300).perform();
        Wait(1);
        actions.contextClick(rightClickBtn).perform();
        Assert.assertTrue(driver.findElement(By.id("rightClickMessage")).isDisplayed());

        actions.click(clickBtn).perform();
        Assert.assertTrue(driver.findElement(By.id("dynamicClickMessage")).isDisplayed());

        WaitQuit(2);
    }
}
