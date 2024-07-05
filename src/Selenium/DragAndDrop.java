package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);

        WebElement rome = driver.findElement(By.id("box6"));

        System.out.println(rome.getCssValue("background-color"));
        WebElement italy = driver.findElement(By.id("box106"));

        //First method
        actions.clickAndHold(rome).build().perform();
        actions.moveToElement(italy).release().build().perform();

        System.out.println(rome.getCssValue("background-color"));

        Assert.assertEquals("Rome is not want going!", "rgba(0, 255, 0, 1)", rome.getCssValue("background-color"));

        //Second method

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        actions.dragAndDrop(oslo,norway).perform();
        Assert.assertEquals("Oslo is not want going!", "rgba(0, 255, 0, 1)", oslo.getCssValue("background-color"));


        WaitQuit(2);
    }
}
