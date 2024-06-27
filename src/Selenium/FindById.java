package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/241776238171460");
        driver.manage().window().maximize();

        driver.findElement(By.id("first_3")).sendKeys("Tester");
        driver.findElement(By.id("last_3")).sendKeys("Testerov");
        driver.findElement(By.id("input_4_addr_line1")).sendKeys("Address Line 1");
        driver.findElement(By.id("input_4_addr_line2")).sendKeys("Street address line");
        driver.findElement(By.id("input_4_addr_line2")).sendKeys("Street address line 2");
        driver.findElement(By.id("input_4_city")).sendKeys("City");
        driver.findElement(By.id("input_4_state")).sendKeys("State");
        driver.findElement(By.id("input_4_state")).sendKeys("1234567890");
        driver.findElement(By.id("input_6")).sendKeys("example@ymail.com");
        MyFunctions.Wait(2);


        WebElement submitButton = driver.findElement(By.id("input_25"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", submitButton);
        submitButton.click();



        MyFunctions.Wait(3);
        driver.quit();
    }
}
