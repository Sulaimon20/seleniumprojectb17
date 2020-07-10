package test.day12_Synchronization;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading1Page;
import test.utilities.Driver;

public class Loading1PageClass {
    //TC#41: Dynamically Loaded Page Elements 1
    // 1.Go tohttp://practice.cybertekschool.com/dynamic_loading/1
    // 2.Click to start
    // 3.Wait until loading bar disappears
    // 4.Assert username inputboxis displayed
    // 5.Enter username: tomsmith
    // 6.Enter password: incorrectpassword
    // 7.Click to Submit button
    // 8.Assert “Your username is invalid!” text is displayed.Note: Follow POM
        @Test
        public void Loading1Page(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        Loading1Page loading1Page=new Loading1Page();

        loading1Page.startButton.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

        wait.until(ExpectedConditions.invisibilityOf(loading1Page.loadingBar));
        String name="tomsmith";
        String password="incorrectpassword";

        Assert.assertTrue(loading1Page.userNameInput.isDisplayed(),"username input box is not displayed");

        loading1Page.userNameInput.sendKeys(name);
        loading1Page.passwordInput.sendKeys(password);
        loading1Page.submitButton.click();

        Assert.assertTrue(loading1Page.errorMessage.isDisplayed());








        }
}
