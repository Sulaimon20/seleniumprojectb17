package test.day0_self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

public class CybertekReservationRoom {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://cybertek-reservation-qa3.herokuapp.com/");
        driver.manage().window().maximize();
    }
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
    }
    @Test
    public void titleVerification(){
        Assert.assertEquals(driver.getTitle(),"bookit");
    }
    @Test
    public void credential(){
        driver.findElement(By.name("email")).sendKeys("bbursnoll8d@acquirethisname.com");
        driver.findElement(By.name("password")).sendKeys("johndillinger"+ Keys.ENTER);
    }

    public void choosingRoomButton() throws InterruptedException {
        for (int i=1; i<=4; i++){
            driver.findElement(By.id("room-12"+i)).click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
        }

    }
    @Test
    public void clickingHunt(){
        driver.findElement(By.xpath("//a[@class='navbar-item'][text()='hunt']")).click();
    }
    public void verifyingHintPage(){
        Assert.assertEquals(driver.getTitle(),"");
    }

    /*


        driver.findElement(By.xpath("//a[@class='navbar-item'][text()='hunt']")).click();
        driver.findElement(By.id("mat-input-0")).sendKeys("June-9-2020");
        driver.findElement(By.id("mat-select-0")).sendKeys("7:00PM");
        driver.findElement(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id='mat-option-33']")).click();



        ////*[@id="mat-select-1"]/div/div[1]/span
        //navbar-item

     */

    }