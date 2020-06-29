package test.day7_javafaker_webtables;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC7_Cybertek_dorpdown_Month {

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

        WebElement clickingMonthButton=driver.findElement(By.xpath("//select[@id='month']"));
        clickingMonthButton.click();

        List<String> expectedValues=new ArrayList<>(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November", "December" ));

        List<WebElement> listOfWebElements=driver.findElements(By.xpath("//select[@id='month']/option"));

        List<String> actualValues=new ArrayList<>();

        for (WebElement each: listOfWebElements  ) {
            actualValues.add(each.getText());
        }
        Thread.sleep(1500);
        System.out.println("actualValues = " + actualValues);
        System.out.println("expectedValues = " + expectedValues);

        Assert.assertEquals(actualValues,expectedValues);
    }

}
