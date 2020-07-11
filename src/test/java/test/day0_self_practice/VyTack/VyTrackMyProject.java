package test.day0_self_practice.VyTack;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;
import test.utilities.VyTrackUtilities;
import test.utilities.WebDriverFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VyTrackMyProject {
    WebDriver driver=Driver.getDriver();
    Actions actions;

    @BeforeMethod
    public void setUp_and_credentials() throws InterruptedException {
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys(ConfigurationReader.getProperty("username"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
        Thread.sleep(1500);
    }

    @Test
    public void TC1_FleetButton_Verification() throws InterruptedException {
    //1. Verify that truck driver should be able to see all vehicle odometer information on the grid

        //Step 1. Click the "Fleet" button
    actions = new Actions(driver);
    actions.click(driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/a"))).perform();

    //Step 2. Click "Vehicle odometer" in the Fleet menu bar
    actions.click(driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[4]/a/span"))).perform();

    //Step 3.Verify that user on the "Vehicle odometer" page
    Thread.sleep(1000);
    Assert.assertTrue(driver.getTitle().contains("Vehicle Odometer"),"User is not able to be on Vehicle odometer page");

        //2.Verify that Truck driver should be able to create Vehicle odometer or cancel it. 
        Thread.sleep(1500);
        //1. Click "Create Vehicle odometer" button.
        WebElement create_Vehicle_odometer_button = Driver.getDriver().findElement(By.xpath("//a[@title='Create Vehicle Odometer']"));
        create_Vehicle_odometer_button.click();

        //2. Fill the Odometer Value box with random value

        Thread.sleep(1500);

        WebElement OdometerValue = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[OdometerValue]']"));

        OdometerValue.sendKeys(ConfigurationReader.getProperty("odometerValue"));

        Thread.sleep(1000);
        //3. Choose the date of creating

        WebElement date = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Choose a date']"));
        date.click();

        //WebElement day=Driver.getDriver().findElement(By.xpath("//td/a[@class='ui-state-default'][1]"));
        //date.click();
        //System.out.println("day.getText() = " + day.getText());

        Driver.getDriver().findElement(By.xpath("//tr[1]/td[6]/a")).click();
        Thread.sleep(3000);

        //4. Write the driver name
        WebElement driverName = Driver.getDriver().findElement(By.xpath("//div[@class='control-group control-group-text']//following::input[1]"));
        driverName.sendKeys(ConfigurationReader.getProperty("driverName"));
        //5. Chose miles/km
        WebElement UnitOfDistance = Driver.getDriver().findElement(By.xpath("//option[@value='miles']"));
        UnitOfDistance.click();
        //6. Choose the car model

        //BUG!!!

        //WebElement carModel = Driver.getDriver().findElement(By.xpath("//span[@class='select2-chosen' and @xpath='1']"));
        //carModel.click();

        //7. Click the "+Add" button and add Lisence plate
        Thread.sleep(2000);
        WebElement addButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-plus']"));
        addButton.click();
        //8. Click on Lisence plate number
        String plateNumber=ConfigurationReader.getProperty("plateNumber");



      //  Actions actions=new Actions(Driver.getDriver());
       // actions.moveToElement(driver.findElement(By.xpath("//div[@tabindex='-1'")));
/*
        List<WebElement> plateNumbers =driver.findElements(By.xpath("//tr[@class='grid-row']"));

        for (int i = 0; i < plateNumbers.size(); i++) {
            if (plateNumbers.get(i).getText().equals(plateNumber)) {
                List<WebElement> clickElement = driver.findElements(By.xpath("//tr[@class='grid-row']"));
                clickElement.get(i).click();
*/
            }
        }


        //table[@class='SampleTable']//td[2]


        //Select selectPlateNumber=new Select(Driver.getDriver().findElement(By.xpath()))
        //9. Verify that the info is added

        //10. Once you created Vehicle odometer Click "CANCEL" button on the page.

        //11. Verify that after canceling user should be in the Vehical odometer page


/*
        // 1. Click the Fleet button
        driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/a")).click();
        Thread.sleep(1500);
        //2. Click "Vehicle odometer" in the Fleet menu bar
        //driver.findElement(By.xpath())
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a/span")).click();

        //3.Verify that driver able to see in the Vehicle Odometer page Fleet, Customer,Activities,System modules
        List<WebElement> ActualList = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li"));

        // ActualList.forEach(gridElements-> System.out.println(gridElements.getText())); <== this can give you a list of text

        String[] expectedVehicleOdometer = {"Fleet", "Customers", "Activities", "System"};

        for (int i = 0; i < expectedVehicleOdometer.length; i++) {
            System.out.println(ActualList.get(i).getText());
            Assert.assertTrue(ActualList.get(i).getText().equals(expectedVehicleOdometer[i]));
        }

        //4 Verify that truck driver should be able to see all vehicle odometer information on the grid
      //  List<WebElement> vehicle_odometer_information_grid=driver.findElements(By.xpath("//table/thead[2]/tr//th"));
        //vehicle_odometer_information_grid.forEach(gridElements-> System.out.println("gridElements = " + gridElements.getText()));

        //String [] expectedVehicle_odometerTableValue={"Odometer Value", "Date", "Driver", "Unit", "Model"};
/*
        for (int i = 0; i < 7; i++) {
            System.out.println(vehicle_odometer_information_grid.get(i).getText());
            //Assert.assertTrue(ActualList.get(i).getText().equals(expectedVehicleOdometerPage[i]));
        }
*/

        //

        //Assert.assertTrue(vehicle_odometer_information_grid,expectedVehicle_odometerTableValue);

       // for (WebElement list: vehicle_odometer_information_grid) {
          //  list.getText();
        //}




        //Click "Create Vehicle odometer"
        //String CreateVehicleOdometer= driver.findElement(By.xpath("//a[@title='Create Vehicle Odometer']")).getText();
        //Assert.assertTrue(CreateVehicleOdometer.contains("Create Vehicle Odometer"));





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

