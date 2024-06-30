package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    static {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE); //Xetalari gostermek ucun

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(20);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
    }
    public static void WaitQuit(){
        MyFunctions.Wait(3);
        driver.quit();
    }
}
