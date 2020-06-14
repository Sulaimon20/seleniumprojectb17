package test.Day0_Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import test.day3_cssSelector_xpath.WedDriverFactory;

public class Bonza {
    public static void main(String[] args) throws InterruptedException {
   WebDriver driver = WedDriverFactory.getDriver("chrome");

        for (int i = 0; i <=50 ; i++) {
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            driver.findElement(By.name("q")).sendKeys(" bonza movers" + Keys.ENTER);
            driver.navigate().back();
        }
       /*
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='bs-6']/span/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='bs-7']/span/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='bs-8']/span/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='guacBg34101']/div[3]/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='guacBg34103']/div[3]/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='guacBg34105']/div[3]/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"a83c4c65-6f5e-4770-bc17-feedb4c44258-bootstrap-container\"]/span/div/div/div/div[1]/nav/ul/li[1]/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"a83c4c65-6f5e-4770-bc17-feedb4c44258-bootstrap-container\"]/span/div/div/div/div[1]/nav/ul/li[2]/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"a83c4c65-6f5e-4770-bc17-feedb4c44258-bootstrap-container\"]/span/div/div/div/div[1]/nav/ul/li[3]/a")).click();
        Thread.sleep(3000);
        driver.navigate().back();
*/


    }
}
