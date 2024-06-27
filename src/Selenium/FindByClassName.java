package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/241776238171460");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.className("form-textbox"));
        firstName.sendKeys("Roma");

        List<WebElement> commonClassName = driver.findElements(By.className("form-sub-label"));
        System.out.println("size of the common class names: "+commonClassName.size());
        for (WebElement e:commonClassName){
            System.out.println("commonClassName WebElements: " +e.getText());
        }


        MyFunctions.Wait(3);
        driver.quit();
    }
}
