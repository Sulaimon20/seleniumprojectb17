package test.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WedDriverFactory {

    public static WebDriver getDriver(String arg){
       if (arg.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
           return new ChromeDriver();
       } else if (arg.equalsIgnoreCase("firefox")){
               WebDriverManager.firefoxdriver().setup();
               return new FirefoxDriver();
       }else {
           System.out.println("Given browser type does not exist. Driver null");
           return null;
       }
   }

}
