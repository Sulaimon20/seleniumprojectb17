package test.day0_self_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.day3_cssSelector_xpath.WebDriverFactory;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://m.youtube.com/watch?v=d7TU9TPF-D0");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[22]/div[2]/div[1]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[22]/div[2]/div[1]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();


        // driver.close();



    }
}
