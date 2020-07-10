package test.day4_FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.utilities.WebDriverFactory;

public class xPath_Practices {
    public static void main(String[] args) {
//TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
// 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
// 2. Go to http://practice.cybertekschool.com/add_remove_elements
         driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
// 3. Click to “Add Element” button 50 times
        int addButtonCounter=0;
        int deleteButtonCounter=0;

        for(int i=1; i<=50; i++) {
            driver.findElement(By.xpath("//*[@id='content']/div/button")).click();
            addButtonCounter++;
            deleteButtonCounter++;
        }
        //driver.findElement(By.xpath("//*[@id='elements']/button")).click();
        WebElement deleteElement=driver.findElement(By.xpath("//*[@id='elements']/button"));
        if (deleteElement.isDisplayed()&&deleteButtonCounter==50){
            System.out.println("Verification of \"50 Delete button is displayed\" is PASSED");
        }else {
            System.out.println("Verification of \"50 Delete\" button is displayed is FAILED");
        }
        System.out.println("DELETE Button displayed "+deleteButtonCounter+" times");


// 4. Verify 50 “Delete” button is displayed after clicking.
// 5. Click to ALL “Delete” buttons to delete them.
// 6. Verify “Delete” button is NOT displayed after clicking. USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
