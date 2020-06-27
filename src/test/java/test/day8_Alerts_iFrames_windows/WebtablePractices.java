package test.day8_Alerts_iFrames_windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.SmartBearUtilities;
import test.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class WebtablePractices {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void p4_verifyOrder_test() throws InterruptedException{
        //Logging into smartbear
        SmartBearUtilities.login(driver);

        Thread.sleep(1000);

        //Call my method the verify if given name is in the list or not.
        SmartBearUtilities.verifyOrder(driver, "Paul Brown");




    }


    @Test
    public void p5_print_names_cities_test(){
        SmartBearUtilities.login(driver);
        SmartBearUtilities.printNamesAndCities(driver);

    }




}
