package test.day3_cssSelector_xpath;

import com.google.gson.internal.$Gson$Preconditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURLVerifacation {
    public static void main(String[] args) {
     //TC #3: PracticeCybertek/ForgotPassword URL verification

        WebDriverManager.chromedriver().setup();
        // 1. Open Chrome browser
        WebDriver driver=new ChromeDriver();
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String sentence ="this is a sentence";
// 3. Enter any email into input box
        WebElement emailInput=driver.findElement(By.name("email"));
        // 4. Click on Retrieve password
        emailInput.sendKeys("anyemail@email.com");

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        // 5. Verify URL contains:  Expected: “email_sent”
        String actualURL=driver.getCurrentUrl();
        String expectedInURL="email_sent";
       if (actualURL.contains(expectedInURL)){
           System.out.println("URL verification PASSED");
       }else{
           System.out.println("URL verification FAILED");
       }
        // 6. Verify textbox displayed the content as expected.

        // Expected: “Your e-mail’s been sent!”
        WebElement confirmationMessage=driver.findElement(By.name("confirmation_message"));
        confirmationMessage.getText();

        String actualMessageText=confirmationMessage.getText();
        String expectedMessageText="Your e-mail's been sent!";
        if (actualMessageText.equals(expectedMessageText)){
            System.out.println("Confirmation message text verification PASSED");
        }else {
            System.out.println("Confirmation message text verification FAILED");
        }
        if (confirmationMessage.isDisplayed()){
            System.out.println("Message is displayed, verification PASSED");
        }else{
            System.out.println("Message is NOT displayed, verification FAILED");
        }


    }
}
