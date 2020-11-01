package test.findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {
    public static void main(String[] args)  {
        //TC#4:	Google	search1-Open	a	chrome	browser

        WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2-Go	to:	https://google.com
        driver.get("https://www.google.com");
        // 3-Write “apple” in search box
        // 4-Click google search button
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);



        // 5-Verify	title:Expected: Title should start with “apple”
        String actualTitle = driver.getTitle();
        String expectedInTitle="apple";

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Google search verification PASSED");
        }else {
            System.out.println("Google search verification FAILED");
        }



    }

}
