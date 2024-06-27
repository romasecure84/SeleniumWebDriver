package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/241776238171460");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("q3_fullName3[first]"));
        firstName.sendKeys("Roma");
        driver.findElement(By.name("q3_fullName3[last]")).sendKeys("Secure");

        MyFunctions.Wait(3);
        driver.quit();
    }
}
