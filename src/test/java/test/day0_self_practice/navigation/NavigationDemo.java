package test.day0_self_practice.navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.bonzamovers.com");
        String actualTitle="Bonza Movers";//Bonza Movers
        String expectedInTitle=driver.getTitle();
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("PASSED!!!!!!!!!");
        }else{
            System.out.println("FAILED!!!!!!!!!!!!");
        }
        driver.navigate().to("https://www.pamir.shop");
        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL="+currentURL);
        //driver.close();

    }
}
