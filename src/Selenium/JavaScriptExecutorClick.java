package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class JavaScriptExecutorClick extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.copado.com/robotic-testing");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement learnMoreButton = driver.findElement(By.xpath("(//div[@class='button-text-with-right-icon'])[7]"));
        //learnMoreButton.click();

        js.executeScript("arguments[0].scrollIntoView(true);", learnMoreButton);
        js.executeScript("arguments[0].click();", learnMoreButton);

        WaitQuit(5);
    }
}
