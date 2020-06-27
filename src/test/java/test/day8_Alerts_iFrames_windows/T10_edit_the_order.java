package test.day8_Alerts_iFrames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.SmartBearUtilities;
import test.utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T10_edit_the_order {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void registartionForm() throws InterruptedException {

        //TC #10: SmartBear edit order
        // 1.Open browser and login to SmartBear
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmartBearUtilities.login(driver);
        Thread.sleep(1000);
        // 2.Click to edit button from the right for “Steve Johns”
        WebElement clicking_Steve_Johns=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[4]/td[2]"));
        clicking_Steve_Johns.click();
        WebElement editing_Steve_Johns=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[4]/td[13]"));
        editing_Steve_Johns.click();
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtName']")).clear();

        // 3.Change name to “Michael Jordan”
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys("Michael Jordan");

        // 4.Click Update
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();
        // 5.Assert “Michael Jordan” is in the list

        SmartBearUtilities.verifyOrder(driver,"Michael Jordan");

    }

}
