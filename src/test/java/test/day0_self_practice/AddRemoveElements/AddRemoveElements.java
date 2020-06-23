package test.day0_self_practice.AddRemoveElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

public class AddRemoveElements {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
    }
    @Test
    public void add_remove_Elements(){
        Assert.assertEquals(driver.getTitle(), "Practice");
        driver.findElement(By.xpath("//button[@ onclick]")).click();



    }


}
