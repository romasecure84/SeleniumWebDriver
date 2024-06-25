package Selenium.Utilities;

public class MyFunctions {
    public static void Wait(int second) {
        try {
            Thread.sleep(1000*second);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
