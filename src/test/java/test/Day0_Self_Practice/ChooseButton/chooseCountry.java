package test.Day0_Self_Practice.ChooseButton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.day3_cssSelector_xpath.WedDriverFactory;

import java.security.Key;

public class chooseCountry {
    public static void main(String[] args) {
        WebDriver driver= WedDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/autocomplete");
        driver.findElement(By.id("myCountry")).sendKeys("T");
        WebElement countryValue=driver.findElement(By.xpath("//*[@id=\"myCountryautocomplete-list\"]/div[2]"));
        countryValue.click();
        WebElement submitButton=driver.findElement(By.xpath("//*[@id='content']/div/form/input"));
        submitButton.click();
        String s=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();

        if(s.contains("Tajikistan")){
            System.out.println("PASSED");
            System.out.println(s);
        }else{
            System.out.println("FAILED");
        }





    }
}
