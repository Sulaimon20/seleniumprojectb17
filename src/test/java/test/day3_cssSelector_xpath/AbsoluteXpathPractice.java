package test.day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbsoluteXpathPractice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement homelink=driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
if (homelink.isDisplayed()){
    System.out.println("Home link is displayed on the page: PASS");
}else {
    System.out.println("Home link is NOT displayed on the page: FAILED");
}


    }
}
