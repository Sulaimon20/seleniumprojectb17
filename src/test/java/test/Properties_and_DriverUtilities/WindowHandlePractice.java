package test.Properties_and_DriverUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.PageObjectModel.Base.TestBase;

import java.util.Set;

//TC-WarmUp# : Window Handlepractice
// 1.Create a new class called: WindowHandleWarmup
public class WindowHandlePractice extends TestBase {

    @Test
    public void multiple_window_test(){

        driver.get("https://www.amazon.com");
        // 4.Copy paste the lines from below into your class
        //we are downcasting our driver to Javascript to be able to use its methods
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        // 5.Create a logic to switch to the tab where Etsy.com is open
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("current title = " + driver.getTitle());
            //driver.switchTo().window("http://etsy.com','_blank')");
            if (driver.getCurrentUrl().contains("etsy")){
                // 6.Assert: Title contains “Etsy”Lines to be pasted:
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }

        }





}





    // These lines will simple open new tabsusing something called JavaScriptExecutand get those pages.

    // We will learn JavaScriptExecutor later as well.


}
