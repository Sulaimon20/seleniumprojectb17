package test.Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_URL {
    public static void main(String[] args) {
// THIS TEST IS SUPPOSED TO FAIL


        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl() ;
        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }
        System.out.println(driver.getPageSource()); // gets the HTML of the page
    }



}

