package test.day0_self_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekReservationRoom {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertek-reservation-qa3.herokuapp.com/");
        driver.findElement(By.name("email")).sendKeys("bbursnoll8d@acquirethisname.com");
        driver.findElement(By.name("password")).sendKeys("johndillinger"+ Keys.ENTER);
        driver.manage().window().maximize();
        for (int i=1; i<=4; i++){
            driver.findElement(By.id("room-12"+i)).click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
        }

        driver.findElement(By.xpath("//a[@class='navbar-item'][text()='hunt']")).click();
        driver.findElement(By.id("mat-input-0")).sendKeys("June-9-2020");
        driver.findElement(By.id("mat-select-0")).sendKeys("7:00PM");
        driver.findElement(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id='mat-option-33']")).click();



        ////*[@id="mat-select-1"]/div/div[1]/span
        //navbar-item

    }
}
