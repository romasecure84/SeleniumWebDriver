package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionHover2 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://amazon.com.tr");
        Wait(2);
        driver.findElement(By.id("sp-cc-rejectall-link")).click();

        WebElement allCategory = driver.findElement(By.id("nav-hamburger-menu"));

        Actions actions = new Actions(driver);
        Action action = actions.click(allCategory).build();
        action.perform();

        WebElement newProducts = driver.findElement(By.xpath("(//*[text()='Yeni Çıkanlar'])[2]"));
        newProducts.click();

        Assert.assertTrue(driver.findElement(By.id("zg_banner_text")).isDisplayed());

        WaitQuit(2);
    }
}

