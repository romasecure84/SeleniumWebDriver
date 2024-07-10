package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Frame extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement frame1 = driver.findElement(By.id("frm1"));
        driver.switchTo().frame(frame1);
        Wait(2);

        WebElement dropdown = driver.findElement(By.id("selectnav1"));
        new Actions(driver).scrollToElement(dropdown).perform();
        dropdown.click();

        Select select = new Select(dropdown);
        select.selectByVisibleText("- Frames Practice");
        Wait(2);
        driver.switchTo().parentFrame();

//        Actions actions = new Actions(driver);
//        Action action1 = actions.sendKeys(Keys.UP).sendKeys(Keys.UP).sendKeys(Keys.UP).sendKeys(Keys.UP)
//                .sendKeys(Keys.ENTER).build();
//        action1.perform();

        WebElement frame2 = driver.findElement(By.id("frm2"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.id("firstName")).sendKeys("Roma");
        driver.findElement(By.id("lastName")).sendKeys("Roma");
        driver.findElement(By.id("englishchbx")).click();
        Wait(2);
        driver.switchTo().parentFrame();

        WebElement frame3 = driver.findElement(By.id("frm3"));
        driver.switchTo().frame(frame3);
        new Actions(driver).scrollByAmount(0,800).perform();

        WaitQuit(5);
    }
}
