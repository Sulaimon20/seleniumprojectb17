package test.day0_self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

public class CybertekReservationRoom {
    WebDriver driver;
    @Test
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://cybertek-reservation-qa3.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public void credential(){
        driver.findElement(By.name("email")).sendKeys("bbursnoll8d@acquirethisname.com");
        driver.findElement(By.name("password")).sendKeys("johndillinger"+ Keys.ENTER);
    }
    @Ignore
    @Test (priority = 2)
    public void clickingHunt(){
        WebElement huntButton=driver.findElement(By.xpath("//a[@href='/hunt']"));
        huntButton.click();
       // Assert.assertTrue(huntButton.getText().contains("hunt"));
    }


}