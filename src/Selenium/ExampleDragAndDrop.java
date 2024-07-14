package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ExampleDragAndDrop extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://formsmarts.com/form/yu?mode=h5/");
        Wait(2);
        WebElement personalUseBn = driver.findElement(By.xpath("//span[contains(text(),'Personal use')]"));
        personalUseBn.click();
        WebElement discoverUse = driver.findElement(By.cssSelector("#f > div:nth-child(6) > [aria-required='true']:nth-child(5)"));


        Select select = new Select(discoverUse);
        select.selectByVisibleText("Personal Use");
    }
}
