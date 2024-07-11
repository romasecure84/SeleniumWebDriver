package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Windows extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/");
        List<WebElement> blankLists = driver.findElements(By.xpath("//a[@target='_blank']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (WebElement e : blankLists) {
            if (!e.getAttribute("href").contains("mail")){
                Wait(1);
                js.executeScript("arguments[0].click();", e);
                System.out.println(e.getAttribute("href"));
            }
        }

        WaitQuit(5);
    }
}
