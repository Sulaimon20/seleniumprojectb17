package test.Day0_Self_Practice.Radio_CheckedBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.day3_cssSelector_xpath.WedDriverFactory;

import java.util.concurrent.TimeUnit;

public class Radio {
    public static void main(String[] args) {
        WebDriver driver= WedDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        String [] colors={"black", "yellow", "red", "blue"};
        for (int i = 0; i <colors.length ; i++) {
            driver.findElement(By.id(colors[i])).click();
            driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        }




    }
}
