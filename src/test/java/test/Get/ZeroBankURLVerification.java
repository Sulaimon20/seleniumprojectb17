package test.Get;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankURLVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement forgotPasswordLink=driver.findElement(By.partialLinkText("Forgot"));

        String actualHrefValue=forgotPasswordLink.getAttribute("href");
        String expectedInHrefValue="/forgot-password.html";
        if (actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("Href value verification is PASSED!!!");
        }else{
            System.out.println("Href value verification is FAILED!!!");
        }
        System.out.println();

    }
}
