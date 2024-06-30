package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        MyFunctions.Wait(3);
        //driver.findElement(By.linkText("Hepsiburada'da kalmaya devam et")).click();
        driver.findElement(By.linkText("Reddet")).click();

        WebElement musteriHizmetleri = driver.findElement(By.linkText("Müşteri Hizmetleri"));
        System.out.println(musteriHizmetleri.getText());

        System.out.println("href: "+musteriHizmetleri.getAttribute("href"));
        System.out.println("rel: "+musteriHizmetleri.getAttribute("rel"));
        System.out.println("title: "+musteriHizmetleri.getAttribute("title"));

        WebElement superFiyat = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println(superFiyat.getText());

        MyFunctions.Wait(2);
        driver.quit();
    }
}
