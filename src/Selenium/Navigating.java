package Selenium;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("fakealert")).click();
        Wait();

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Wait();

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        WaitQuit();
    }
}
