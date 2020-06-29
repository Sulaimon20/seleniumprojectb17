package test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrackUtilities {

    public static void login(WebDriver driver){

        WebElement inputUsername=driver.findElement(By.xpath("//input[@type='text']"));
        inputUsername.sendKeys("user154");

        WebElement inputPassword =driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("UserUser123" + Keys.ENTER);
    }
}
