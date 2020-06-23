package test.day6_testNG_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import test.day3_cssSelector_xpath.WebDriverFactory;

import java.util.concurrent.TimeUnit;

/*
TC #3: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown

 */
public class TC3_SelectingDateOnDropDown {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        //driver.close();
    }
    @Test
    public void selectingYear() {
        //3. Select “December 1st, 1921” and verify it is selected.

        Select selectYearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYearDropDown.selectByVisibleText("1921");
        Assert.assertTrue(selectYearDropDown.getFirstSelectedOption().getText().equals("1921"));
    }
    @Test
    public void selectingMonth() {
        Select selectMonthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        selectMonthDropDown.selectByValue("11");
        Assert.assertTrue(selectMonthDropDown.getFirstSelectedOption().getText().equals("December"));
    }
    @Test
    public void selectingDay() {
        Select selectDayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        selectDayDropDown.selectByIndex(0);
        Assert.assertEquals(selectDayDropDown.getFirstSelectedOption().getText(),"1");

    }



        //Select year using : visible text
        //Select month using : value attribute
        //Select day using : index number


    }


