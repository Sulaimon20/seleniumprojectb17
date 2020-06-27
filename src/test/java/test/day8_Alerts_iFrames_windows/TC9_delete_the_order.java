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

public class TC9_delete_the_order {
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
        //TC #9: SmartBear delete order
        // 1.Open browser and login to SmartBear

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmartBearUtilities.login(driver);
        Thread.sleep(1000);
        // 2.Delete “Mark Smith” from the list
        WebElement clicking_Mark_Smith=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl03_OrderSelector']"));
        clicking_Mark_Smith.click();

        WebElement deleting_Mark_Smith= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']"));
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        deleting_Mark_Smith.click();
        Thread.sleep(1000);
        // 3.Assert it is deleted from the list

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

       for (WebElement each : namesList) {
            if (each.getText().equals("Mark Smith")){
                System.out.println("The name exists in the list! Verification FAILED!!!!");
            }else{
                System.out.println("The name does not exist in the list! Verification PASSED!!!!");
            }
            break;
       }

    }
}
