package Selenium;

import Utilities.BaseDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertMethods extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String message = "Selenium WebDriver";
        driver.findElement(By.cssSelector("#user-message")).sendKeys(message);
        driver.findElement(By.cssSelector("form#get-input > .btn.btn-primary")).click();
        WebElement assertMessage = driver.findElement(By.cssSelector("span#display"));

        Assert.assertEquals(message, assertMessage.getText(), "Test Failed");
        Assert.assertTrue(assertMessage.isDisplayed(), "Message is Displayed");

        WaitQuit(2);
    }
}
