package Selenium;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assert extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String message = "Selenium WebDriver message";
        driver.findElement(By.cssSelector("#user-message")).sendKeys(message);
        driver.findElement(By.cssSelector("form#get-input > .btn.btn-primary")).click();
        WebElement assertMessage = driver.findElement(By.cssSelector("span#display"));

        if (assertMessage.getText().equals(message)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        WaitQuit();
    }
}
