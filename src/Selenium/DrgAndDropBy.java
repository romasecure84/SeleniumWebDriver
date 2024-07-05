package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DrgAndDropBy extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement priceRange = driver.findElement(By.id("amount"));
        String message1 = priceRange.getText();
        System.out.println(priceRange.getText());

        Actions actions = new Actions(driver);
        WebElement leftHandle = driver.findElement(By.cssSelector("div#slider-range > span:nth-of-type(1)"));
        WebElement rightHandle = driver.findElement(By.cssSelector("div#slider-range > span:nth-of-type(2)"));

        Action action = actions.dragAndDropBy(leftHandle, -50, 0).build();
        action.perform();
        Action action1 = actions.dragAndDropBy(rightHandle, 50,0).build();
        action1.perform();

        String message2 = priceRange.getText();
        System.out.println(priceRange.getText());

        Assert.assertNotEquals("Price range not changed", message1, message2);

        WaitQuit(5);
    }
}
