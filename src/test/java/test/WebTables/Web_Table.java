package test.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import test.utilities.SmartBearUtilities;
import test.utilities.WebDriverFactory;

public class Web_Table {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();

    }
    //      //td[.='Steve Johns']//../td[5]
    //      //td[.=‘Clare Jefferson’]/following-sibling::td[5]
    //      //table[@class='SampleTable']//tr[6]/td[7]
    //      //table[@class='SampleTable']//tr[9]/td[2]

    @Ignore
    @Test
    public void table(){
        SmartBearUtilities.login(driver);
        driver.findElement(By.xpath("//*[@id='ctl00_menu']/li[1]/a")).click();

        //2. Click on View all orders
        //3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement susansDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));

        String expectedDate = "01/05/2010";
        String actualDate = susansDate.getText();

        Assert.assertEquals(actualDate, expectedDate);



    }

    @Test
    public void checkAllList() throws InterruptedException {
        SmartBearUtilities.login(driver);
        driver.findElement(By.xpath("//*[@id='ctl00_menu']/li[1]/a")).click();
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_btnCheckAll']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_btnUncheckAll']")).click();



    }



}
