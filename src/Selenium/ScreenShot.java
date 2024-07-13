package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.io.File;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.Date;
import java.util.List;

public class ScreenShot extends BaseDriver {
    @Test
    public void Test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("dmin123");
        driver.findElement(By.className("oxd-button")).click();

        Date currentDate = new Date();

        List<WebElement> errorWE = driver.findElements(By.xpath("//p[text()='Invalid credentials']"));

        if (!errorWE.isEmpty()) {
            System.out.println("Invalid credential");

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File savingWE = screenshot.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(savingWE, new File("src/ScreenShots/screenshot" + currentDate.getTime() + ".png"));
        }

        WaitQuit(5);
    }
}
