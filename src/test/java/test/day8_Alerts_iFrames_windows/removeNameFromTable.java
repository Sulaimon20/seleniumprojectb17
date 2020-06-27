package test.day8_Alerts_iFrames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.SmartBearUtilities;
import test.utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class removeNameFromTable {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();
    }
    @Test
    public void removeNameTest()throws InterruptedException {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmartBearUtilities.login(driver);
        Thread.sleep(1000);
        //3.Create a new TestNG test, and call your method.
        String name="Steve Johns";
        SmartBearUtilities.removeName(driver,name);
        // 4.Assert that your method removed the given name
        List<WebElement> names =driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
        for (WebElement each : names) {
            if (!each.getText().contains(name)) {
                Assert.assertTrue(true);
                return;
            }
        }
    }



}
