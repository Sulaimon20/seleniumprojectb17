package test.day7_JavaFaker_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class TC8_Cybertek_Select_month_dropdown {

    WebDriver driver;
    DateTimeFormatter monthFormatter=DateTimeFormatter.ofPattern("MMMM");
    LocalDate currentMonth=LocalDate.now();

    //TC#7: Cybertek “month”dropdown default value1.Open browser

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        // close browser
        Thread.sleep(5000);
        driver.close();
    }
    @Test
        public void registartionForm() throws InterruptedException {
        // 2.Go to website: http://practice.cybertekschool.com/dropdowns

        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 3.Verify default value is always showing the current month

        Select defaultValueOfMonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));

        String actualMonth=defaultValueOfMonth.getFirstSelectedOption().getText();

        DateTimeFormatter monthFormatter=DateTimeFormatter.ofPattern("MMMM");
        LocalDate currentMonth=LocalDate.now();
        String expectedMonth=currentMonth.format(monthFormatter);

        // o Expected: If currently in June, should show June selected

        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertTrue(actualMonth.contains(expectedMonth));

    }

}
