package Selenium;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollJS extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1000);");
        Wait(2);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // scrolling by JavascriptExecutor end of the page

        WaitQuit(5);
    }
}
