package test.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import test.utilities.WebDriverFactory;

import java.util.List;

public class SelectMultipleDrapdown_getAllSelectedOptions {
    /*
    TC #4: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
     */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Ignore
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void multipleSelect() throws InterruptedException {
        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        for (int i = 0; i < 6; i++) {
            selectMultiple.selectByIndex(i);
        }

        List<WebElement> list=selectMultiple.getAllSelectedOptions();

        for (WebElement each: list) {
            System.out.println(each.getText());
        }

        Thread.sleep(3000);
        selectMultiple.deselectAll();


    }

}
