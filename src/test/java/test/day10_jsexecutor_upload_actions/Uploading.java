package test.day10_jsexecutor_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class Uploading {
    WebDriver driver;
    @Test
    public void uploading() throws InterruptedException {

       Driver.getDriver().get("http://practice.cybertekschool.com/upload");

       WebElement chooseFile= Driver.getDriver().findElement(By.id("file-upload"));

       Thread.sleep(3000);
       chooseFile.sendKeys("C:\\Users\\Acer\\Desktop\\test");
       WebElement fileUpload=Driver.getDriver().findElement(By.id("file-submit"));
       fileUpload.click();
       WebElement fileuplodedMessage=Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3"));
       Assert.assertTrue(fileuplodedMessage.isDisplayed());



    }
}
