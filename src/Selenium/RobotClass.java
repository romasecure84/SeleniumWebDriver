package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("https://www.copado.com/robotic-testing");
        String windowID = driver.getWindowHandle();

        Robot robot = new Robot();

        driver.switchTo().window(windowID);

        for (int i = 0; i < 9; i++){
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Wait(2);

        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("pricing"));

        WaitQuit(5);
    }
}
