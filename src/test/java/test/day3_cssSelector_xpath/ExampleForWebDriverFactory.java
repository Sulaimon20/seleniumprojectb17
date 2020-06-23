package test.day3_cssSelector_xpath;

import org.openqa.selenium.WebDriver;
import test.utilities.WebDriverFactory;

public class ExampleForWebDriverFactory {
    public static void main(String[] args) {

       // WebDriver driver1=WedDriverFactory.getDriver("firefox");
        //driver1.get("https://www.google.com");


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");




    }
}
