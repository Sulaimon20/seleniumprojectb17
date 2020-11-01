package test.Seleinum_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class fireFoxTest2 {
//    public static void main(String[] args) throws Exception{
////      this line create connection btw driver and selenium
////      and sets up the driver.
//
//        WebDriverManager.firefoxdriver().setup();
//// Creating the instance of ChromeDriver to be able to do action on ChromeDriver
//        WebDriver driver = new FirefoxDriver();
////      we get google.com
//
//        driver.get("http://www.yahoo.com");
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());//it prints the web title
////      BROWSER NAVIGATION
//        Thread.sleep(2000);
//        driver.navigate().back();// takes us to the previous page
//
//        Thread.sleep(2000);
//        driver.navigate().refresh();// refresh the page
//
//        Thread.sleep(2000);
//        driver.navigate().forward();// takes us to the next page
//
//        driver.navigate().to("http://www.facebook.com");// same like get()method
//
//        System.out.println(driver.getTitle());//it prints the web title
//        System.out.println(driver.getPageSource());
//
//        driver.manage().window().maximize();// this line is gonna maximize the window
//        driver.close();
//        //driver.quit();
//
//
//
//    }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Acer/Desktop/");
        List<WebElement> list = driver.findElements(By.xpath("//td[1]"));
        List<String> newlist = new ArrayList<>();
        for (WebElement each : list) {
            newlist.add(each.getText());
        }
        Assert.assertTrue(newlist.contains("test2.bmp"), "FAILED");
    }
}
