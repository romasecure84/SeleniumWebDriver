package Selenium;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#inputValEnter"));

        System.out.println("color: "+ searchBox.getCssValue("color"));
        System.out.println("class: "+ searchBox.getAttribute("class"));
        System.out.println("background: "+ searchBox.getCssValue("background"));
        System.out.println("font-size: "+ searchBox.getCssValue("font-size"));
        System.out.println("background-color: "+ searchBox.getCssValue("background-color"));


        WaitQuit();
    }
}
