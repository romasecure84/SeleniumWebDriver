package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Butunelementlerin yuklenmesini gozlemek ucun vaxt teyin etmek ucun istifade edilir

        WebElement button = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.id("demo"), "Selenium"));
        //Elemente xususi olarag gozleme vaxti teyin edirik, Explicity wait adlanir
        System.out.println(driver.findElement(By.id("demo")).getText());

        Assert.assertEquals("selenium", driver.findElement(By.id("demo")).getText().toLowerCase());

        WaitQuit(3);
    }
}
