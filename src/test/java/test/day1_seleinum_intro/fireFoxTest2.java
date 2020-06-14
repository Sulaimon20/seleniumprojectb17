package test.day1_seleinum_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFoxTest2 {
    public static void main(String[] args) throws Exception{
//      this line create connection btw driver and selenium
//      and sets up the driver.

        WebDriverManager.firefoxdriver().setup();
// Creating the instance of ChromeDriver to be able to do action on ChromeDriver
        WebDriver driver = new FirefoxDriver();
//      we get google.com

        driver.get("http://www.yahoo.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());//it prints the web title
//      BROWSER NAVIGATION
        Thread.sleep(2000);
        driver.navigate().back();// takes us to the previous page

        Thread.sleep(2000);
        driver.navigate().refresh();// refresh the page

        Thread.sleep(2000);
        driver.navigate().forward();// takes us to the next page

        driver.navigate().to("http://www.facebook.com");// same like get()method

        System.out.println(driver.getTitle());//it prints the web title
        System.out.println(driver.getPageSource());

        driver.manage().window().maximize();// this line is gonna maximize the window
        driver.close();
        //driver.quit();






    }
}
