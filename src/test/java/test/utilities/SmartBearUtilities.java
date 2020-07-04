package test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearUtilities {


    public static void login(WebDriver driver){
        //3. Enter username: “Tester”
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        inputUsername.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        inputPassword.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
    }


    /*
    @param: WebDriver driver, String name
    • Method should verify if given name exists in orders.
    • This method should simply accepts a name(String), and assert whether
    given name is in the list or not.
    • Create a new TestNG test to test if the method is working as expected.
     */
    public static void verifyOrder(WebDriver driver, String name){

        //Finding and storing all of the names in our web table in a list of web element
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));


        for (WebElement each : namesList) {
            if (each.getText().equals(name)){
               //if our webelement
                Assert.assertTrue(true);
                return;
            }
        }

        Assert.fail("The name does not exist in the list! Verification failed!");

    }
    public static void printNamesAndCities(WebDriver driver) {
        // The list where we store all the names in the web table
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        // The list where we store all of the cities in the web table
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

        //instead of creating for-each loop, we will create regular for loop
        //because we can use the int i index number to get both names and cities values

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println("Name: " + namesList.get(i).getText() + ", Cities: " + citiesList.get(i).getText());
        }
    }
    //TC #11: Create a method called removeName()
    // 1.Accepts two parameters: WebDriver, String name
    // 2.Method will remove the given name from the list of Smartbear
    // 3.Create a new TestNG test, and call your method.
    // 4.Assert that your method removed the given name

    public static void removeName(WebDriver driver, String name) throws InterruptedException {





       // METHOD 2  ==> long way to remove
          List<WebElement> namesList = driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
        for (int i = 0; i < namesList.size(); i++) {
            if (namesList.get(i).getText().equals(name)) {
                List<WebElement> element = driver.findElements(By.xpath("//table[@class='SampleTable']//td[1]"));
                element.get(i).click();
                driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']")).click();
            }
        }

          /*
        String xpath="//td[.='"+name+"']/..//td";
        //td[.='Paul Brown']/..//td
        driver.findElement(By.xpath(xpath)).click();
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']")).click();

         */



    }


}