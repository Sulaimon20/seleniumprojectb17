package test.day1_seleinum_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws Exception{
//      this line create connection btw driver and selenium
//      and sets up the driver.
        WebDriverManager.chromedriver().setup();
// Creating the instance of ChromeDriver to be able to do action on ChromeDriver
        WebDriver driver = new ChromeDriver();
//      we get google.com

        driver.get("http://www.google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());//it prints the web title
//
//      BROWSER NAVIGATION
        Thread.sleep(3000);
        driver.navigate().back();// takes us to the previous page

        Thread.sleep(3000);
        driver.navigate().refresh();// refresh the page

        Thread.sleep(3000);
        driver.navigate().forward();// takes us to the next page
        Thread.sleep(3000);
        driver.navigate().to("http://www.facebook.com");// same like get()method

        System.out.println(driver.getTitle());//it prints the web title
        System.out.println(driver.getPageSource());

        Thread.sleep(3000);
        driver.manage().window().maximize();// this line is gonna maximize the window
        driver.close();
        //driver.quit();






    }
}
