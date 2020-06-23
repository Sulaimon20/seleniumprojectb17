package test.day0_self_practice.VyTack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.day3_cssSelector_xpath.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

// this is Aylin project
public class VyTrackMyProject {
    // this is instance variable.
    WebDriver driver;
    // this method we need to setup the browser
    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    //this method we need to close the browser
    @AfterMethod
    public void tearDown() {
      //  driver.close();
    }
    @Test
    public void loginValid() throws InterruptedException {
        //Log IN to system
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user154" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123" + Keys.ENTER);
        // TC #1 Verify that truck driver should be able to see all the Vehicle Odometer information

        // 1. Click the Fleet button
        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]")).click();

        // 2. Click Vehicle Odometer button
         driver.findElement(By.xpath("//span[contains(text(),'Vehicle Odometer')]")).click();

        // 3. Verify that driver in the Vehicle Odometer page
        Thread.sleep(1500);
        String VehicleOdometerPageTitle="Vehicle Odometer - Entities - System - Car - Entities - System";
        Assert.assertTrue(driver.getTitle().contains(VehicleOdometerPageTitle));

        //3.Verify that driver able to see in the Vehicle Odometer page Fleet, Customer,Activities,System modules
        List<WebElement> ActualList = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li"));
        String[] VehicleOdometerPage = {"Fleet", "Customers", "Activities", "System"};
        for (int i = 0; i < VehicleOdometerPage.length; i++) {
            System.out.println(ActualList.get(i).getText().equals(VehicleOdometerPage[i]));
            Assert.assertTrue(ActualList.get(i).getText().equals(VehicleOdometerPage[i]));
        }
        //Click "Create Vehicle odometer"
        String CreateVehicleOdometer= driver.findElement(By.xpath("//a[@title='Create Vehicle Odometer']")).getText();
        Assert.assertTrue(CreateVehicleOdometer.contains("Create Vehicle Odometer"));





/*
        //3.Verify that after driver login driver able to see Fleet, Customer,Activities,System modules
        List<WebElement> ActualList = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li"));
        String[] homePageHeader = {"Fleet", "Customers", "Activities", "System"};
        for (int i = 0; i < homePageHeader.length; i++) {
            // System.out.println(ActualList.get(i).getText().equals(homePageHeader[i]));
            Assert.assertTrue(ActualList.get(i).getText().equals(homePageHeader[i]));
        }
    }
    @Test  //1.Verify that truck driver should not be able to LOGIN with Invalid UserName Credential
    public void loginInvalidUsername() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("userabc" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(3000);
        String userName = "userabc";
        String password = "UserUser123";
        Assert.assertTrue(driver.getTitle().equals("Dashboard"));
    }
    @Test           //1.Verify that truck driver should not be able to LOGIN without any credential
    public void loginWithoutCredential() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement element = driver.findElement(By.name("_username"));
        String validationMessage = element.getAttribute("validationMessage");
        Assert.assertTrue(validationMessage.contains("Please fill out this field"));
    }
    @Test   //2.Verify that when user(truck driver) click on any car on the grid,
    // system should display general information about the car
    public void clickCar() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user154" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123" + Keys.ENTER);
        String userName = "user154";
        String password = "UserUser123";
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        driver.findElement(By.xpath("//span[.='Vehicles']")).click();
        driver.findElement(By.xpath("(//tbody[@class='grid-body']/tr)[1]")).click();
        driver.findElement(By.xpath("(//tbody[@class='grid-body']/tr)[2]")).click();
        driver.findElement(By.xpath("(//tbody[@class='grid-body']/tr)[3]")).click();
        Thread.sleep(2000);
        //3.Verify that truck driver can add Event and it should display under Activity tab and General  information page as well.
        //driver.findElement(By.xpath("//div[@class='pull-left btn-group icons-holder']/a/i")).click();//Vasy
        //Click Activities
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[3]/a/span"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//ul/li[@data-route='oro_calendar_event_index']/a"))).click().build().perform();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-name']")).isDisplayed());
        //4.Verify that Truck driver can reset the Grid by click on Grid setting;
        driver.findElement(By.xpath("//div[@class='column-manager dropdown']/a")).click();
        WebElement element = driver.findElement(By.xpath("//td[@class='visibility-cell']"));
        element.click();
        Assert.assertFalse(element.isSelected());
        */

    }
}