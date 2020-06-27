package test.day8_Alerts_iFrames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class iFramePractice {
    //TC #4: Iframe practice
    // 1.Create a new class called: IframePractice
    // 2.Create new test and make set ups
    // 3.Go to: http://practice.cybertekschool.com/iframe


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
@Test
    public void iframe_practice_test() throws InterruptedException {
        WebElement iFrame=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iFrame);

        // 4.Assert: “Your content goes here.” Text is displayed.
        WebElement yourContentGoesHereText=driver.findElement(By.xpath("//p"));
        System.out.println(yourContentGoesHereText.isDisplayed());
        yourContentGoesHereText.clear();
        yourContentGoesHereText.sendKeys("Hello World!!");
         Thread.sleep(3000);

         driver.switchTo().parentFrame();
        WebElement p=driver.findElement(By.xpath("//div[@id='mceu_29']"));
        p.click();

        Thread.sleep(3000);

        // 5.Assert: “An iFrame containing the TinyMCEWYSIWYG Editor


   // WebElement checkingEditorText=driver.findElement(By.xpath("//h3"));
  //  driver.switchTo().parentFrame();
   // Assert.assertTrue(checkingEditorText.isDisplayed());




    }




}
