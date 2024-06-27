package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/241776238171460");
        driver.manage().window().maximize();

        try {
            WebElement firstname = driver.findElement(By.id("wrongLocator"));
        }catch (Exception e){
            System.out.println("Web element locator wrong!! \n" + e.getMessage());
        }

        MyFunctions.Wait(3);
        driver.quit();
    }
}
