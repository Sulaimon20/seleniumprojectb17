package test.Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_getPage {

    public static void main(String[] args) {
        // Step 1 open chrome
        System.setProperty("webdriver.chrome.driver",
                "/Users/cybertekschool/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Step 2. go to url "https://google.com"
        driver.get("https://google.com");
//       Step  3. Verify title
//        Expected title: Google
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "Google";
        // verifying
        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual: " + actualTitle);
        }
    }



}
