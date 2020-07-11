package test.day6_TestNG_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

public class TC5_selectValue {
    /*
    TC #5: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
     */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        //driver.close();
    }
    @Test
    public void selectValue(){
      // driver.findElement(By.xpath("//div[@class='dropdown']")).click();
       driver.findElement(By.xpath("//a[@href='#']")).click();

       driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']")).click();
        Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");






    }



}
