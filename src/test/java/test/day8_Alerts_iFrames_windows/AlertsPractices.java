package test.day8_Alerts_iFrames_windows;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void p1_information_alert_test(){
        //Locating the alert button to be able to click.
        WebElement infoAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //Clicking to the alert button so that the alert should pop-up
        infoAlertButton.click();
        //1- Create the Alert instance and switch to it
        Alert alert = driver.switchTo().alert();
        //2- Use "alert" to accept the alert.
        alert.accept();
        WebElement resultText=driver.findElement(By.xpath("p[id='result']"));
        Assert.assertTrue(resultText.isDisplayed());

    }
    @Test
    public void p2_confirmation_Alert_test(){
        WebElement confirmationButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmationButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(result.getText().contains("Ok"));

    }

    @Test
    public void p2_prompt_Alert_test() throws InterruptedException {
        WebElement confirmationButton=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        confirmationButton.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hello World"+Keys.ENTER);
        Thread.sleep(1500);




    }


}