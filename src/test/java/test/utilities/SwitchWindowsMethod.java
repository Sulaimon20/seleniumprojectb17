package test.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchWindowsMethod {

    //* This method will switch webdriver from current window
 //* to target window based on page title
 //* @param title of the window to switch

    public static void switchWindow(String title, WebDriver driver){
        Set<String> windowHandles = driver.getWindowHandles();
        for(String window : windowHandles){
            driver.switchTo().window(window);
            if(driver.getTitle().equals(title)){
                break;
            }
        }
    }
}
