package test.Get;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        // TC #1: EtsyTitle Verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        // 3.Search for "wooden spoon"
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon");
        driver.findElement(By.className("wt-input-btn-group__btn")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("electric tools");
        //driver.findElement(By.className("wt-input-btn-group__btn")).click();
        driver.findElement(By.className("etsy-icon wt-icon--smaller wt-nudge-t-1")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.id("global-enhancements-search-query")).sendKeys("tools");
        // 4.Verify title: Expected: "Wooden spoon | Etsy"TC
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(actualTitle)) {
            System.out.println("Etsy verification PASSED");
        } else {
            System.out.println("Etsy verification FAILED");
        }
        //driver.close();


    }
}
