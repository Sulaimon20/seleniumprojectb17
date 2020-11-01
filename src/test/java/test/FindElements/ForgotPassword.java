package test.FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.utilities.WebDriverFactory;

public class ForgotPassword {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // 3. Locate all the WebElements on the page using XPATH locator only

        //*[@id="content"]/div[1]/button[1]

        driver.findElement(By.xpath("//*[@id='content']/div[1]/button[1]")).click();
        Thread.sleep(1000);
        //*[@id="content"]/div[1]/button[2]
        driver.findElement(By.xpath("//*[@id='content']/div[1]/button[2]")).click();
        Thread.sleep(1000);
        // (total of 6)
        driver.findElement(By.xpath("//*[@id='content']/div[1]/button[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='content']/div[1]/button[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='content']/div[1]/button[5]")).click();
        Thread.sleep(1000);
        // a.    “Home” link
        WebElement homePage= driver.findElement(By.className("nav-link"));
        Thread.sleep(1000); homePage.click();
        //b.    “Forgot password” header.
        WebElement forgotButton=driver.findElement(By.xpath("//*[@id='content']/ul/li[20]/a"));
        //“E-mail” text.  E-mail input box. “Retrieve password” button.
        // “Powered byCybertek School” text
        // 4. Verify all WebElements are displayed.
        forgotButton.click();
        String actualUrl=driver.getCurrentUrl();
        String expectedURL="http://practice.cybertekschool.com/forgot_password";
        if (actualUrl.contains(expectedURL)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("actualUrl= "+actualUrl);
            System.out.println("expectedURL= "+expectedURL);
        }






    }
}
