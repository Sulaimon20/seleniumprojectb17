package test.day7_javafaker_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.SmartBearUtilities;
import test.utilities.WebDriverFactory;

public class listOfAllOrders {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    //      //td[.='Steve Johns']//../td[5]
    //      //td[.=‘Clare Jefferson’]/following-sibling::td[5]
    //      //table[@class='SampleTable']//tr[6]/td[7]
    //      //table[@class='SampleTable']//tr[9]/td[2]


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




}
