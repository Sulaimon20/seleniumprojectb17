package test.ChooseButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.utilities.WebDriverFactory;

public class chooseCountry {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/autocomplete");
        driver.findElement(By.id("myCountry")).sendKeys("T");
        WebElement countryValue=driver.findElement(By.xpath("//*[@id='myCountryautocomplete-list']/div[2]"));
        countryValue.click();
        WebElement submitButton=driver.findElement(By.xpath("//*[@id='content']/div/form/input"));
        submitButton.click();
        String s=driver.findElement(By.xpath("//*[@id='result']")).getText();

        if(s.contains("Tajikistan")){
            System.out.println("PASSED");
            System.out.println(s);
        }else{
            System.out.println("FAILED");
        }





    }
}
