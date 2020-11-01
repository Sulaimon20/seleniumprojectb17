package test.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;
;

public class DropdownSelectDate {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //GOAL is to open new browser for each test.
        //What annotation I should be using for this? BeforeMethod or BeforeClass?
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        //5- close browser
        Thread.sleep(2000);
        driver.close();
    }

    @Test(priority = 2) public void selectDate(){
        Select selectYear=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYear.selectByValue("1921");
        Assert.assertTrue(selectYear.getFirstSelectedOption().getText().equals("1921"));

        Select selectmonth=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectmonth.selectByValue("11");

        Select selectday=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectday.selectByIndex(0);
    }


}
