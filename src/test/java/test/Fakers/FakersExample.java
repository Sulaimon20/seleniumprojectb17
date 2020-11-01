package test.Fakers;

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

import java.util.concurrent.TimeUnit;

public class FakersExample {


    WebDriver driver;
    Faker faker = new Faker();
    @BeforeMethod
    public void setUp() {
        //TC#6: Cybertek registration form confirmationNote: Use JavaFaker when possible.
        // 1.Open browser
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
            // 2.Go to website: http://practice.cybertekschool.com/registration_form
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 3.Enter first name
        WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='first name']"));
        firstName.sendKeys(faker.name().firstName());
        Thread.sleep(1000);
        // 4.Enter last name
        WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='last name']"));
        lastName.sendKeys(faker.name().lastName());
        Thread.sleep(1000);
        // 5.Enter username
        WebElement userName=driver.findElement(By.xpath("//input[@placeholder='username']"));
        userName.sendKeys(faker.name().username().replace(".",""));
        Thread.sleep(1000);
        // 6.Enter email address
        WebElement emailAddress=driver.findElement(By.xpath("//input[@placeholder='email@email.com']"));
        emailAddress.sendKeys(faker.internet().emailAddress());
        Thread.sleep(1000);
        // 7.Enter password
        WebElement emailPassword=driver.findElement(By.xpath("//input[@name='password']"));
        emailPassword.sendKeys(faker.internet().password());
        Thread.sleep(1000);
        // 8.Enter phone number
        WebElement phoneNumber=driver.findElement(By.xpath("//input[@placeholder='571-000-0000']"));
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone().replace(".","-"));
        Thread.sleep(1500);
        // 9.Select a gender from radio buttons

        WebElement gender=driver.findElement(By.xpath("//div[@class='col-sm-5']//div[1]//label[1]//input[1]"));
        gender.click();
        Thread.sleep(1000);
        // 10.Enter date of birth

        WebElement dateOfBirth=driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        dateOfBirth.sendKeys("06/12/1999");
        Thread.sleep(1000);

        // 11.Select Department/Office
        Select department=new Select(driver.findElement(By.xpath("//select[@name='department']")));
        department.selectByValue("DE");
        Thread.sleep(1000);
        // 12.Select Job Title

        Select jobTitle=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(3);
        Thread.sleep(1000);
        // 13.Select programming language from checkboxes

        WebElement progLanguages=driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        progLanguages.click();
        Thread.sleep(1000);

        // 14.Click to sign up button

        WebElement signUpButton=driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUpButton.click();
        Thread.sleep(1500);

        // 15.Verify success message “You’ve successfully completed registration.”is displayed.

        String expectedOption = "You've successfully completed registration!";

        Assert.assertTrue(driver.getPageSource().contains(expectedOption));



    }

}
