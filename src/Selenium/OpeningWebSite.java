package Selenium;

import Selenium.Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebSite {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/");
        driver.findElement(By.xpath("/html/body[@class='td-home']/div[@class='container-fluid td-default td-outer']/main[@role='main']/section[2]//a[@href='https://selenium.dev/selenium-ide/']")).click();

        MyFunctions.Wait(5);
        driver.quit();
    }

}
