package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SelectStructure extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.cssSelector("#sp-cc-rejectall-link")).click();

        WebElement allCategories = driver.findElement(By.id("searchDropdownBox"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        Select categoryMenu = new Select(allCategories);
        categoryMenu.selectByVisibleText("Bilgisayarlar");

        searchBox.sendKeys("Macbook");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement message = driver.findElement(By.xpath("(//span[contains(text(),'Macbook')])[1]"));
        Wait();
        Assert.assertTrue(message.isDisplayed());

        WaitQuit();
    }
}
