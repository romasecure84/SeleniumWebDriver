package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WindowsHandle extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/");
        String mainPageId = driver.getWindowHandle();
        List<WebElement> blankLists = driver.findElements(By.xpath("//a[@target='_blank']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (WebElement e : blankLists) {
            if (!e.getAttribute("href").contains("mail")){
                Wait(1);
                js.executeScript("arguments[0].click();", e);
                System.out.println(e.getAttribute("href"));
            }
        }

        Set<String> windowsIDList = driver.getWindowHandles();

        for (String id : windowsIDList){
            System.out.println("id = " + id);
        }
        Wait(3);
        driver.switchTo().window(mainPageId);

        WaitQuit(5);
    }
}
