package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHover extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://amazon.com.tr");
        driver.findElement(By.id("sp-cc-rejectall-link")).click();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

        Wait(2);
        searchBox.sendKeys("iphone 15 pro");
        searchButton.click();

        WebElement productIphone = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Sarı')]"));

        new Actions(driver).scrollToElement(productIphone).perform();
        productIphone.click();
        Wait(1);
        driver.findElement(By.xpath("//p[contains(text(),'256 GB')]")).click();
        Wait(2);
        WebElement addToCardButton = driver.findElement(By.id("add-to-cart-button"));
        addToCardButton.click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Sepete Eklendi')]")).isDisplayed());

        WaitQuit(3);
    }
}
