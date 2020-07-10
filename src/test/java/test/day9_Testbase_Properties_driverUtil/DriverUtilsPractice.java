package test.day9_Testbase_Properties_driverUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class DriverUtilsPractice {

    @Test
    public void driver_practice(){
        Driver.getDriver().get("https://www.google.com");
        WebElement googleSearch=Driver.getDriver().findElement(By.name("q"));
        googleSearch.sendKeys(ConfigurationReader.getProperty("testdata")+ Keys.ENTER);

    }
}
