package test.day11_Page_Object_Model;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class TC_36_Vytrack_forgot_password_pageverification {

    @Test
    public void forgot_password_page_verifications_with_errorMessage() throws InterruptedException {

        //1.Go to https://qa3.vytrack.com/user/reset-request

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        LoginPage loginPage=new LoginPage();
        loginPage.forgotPasswordLink.click();
        // 2.Enter random username
        String random_username="sefdfgry";
        loginPage.inputUserName.sendKeys(random_username);

        // 3. Click to request button
        loginPage.requestButton.click();
        // 4. Verify error message is displayed
        Assert.assertTrue(loginPage.errorMessage2.isDisplayed());

        // 5. Verify error message text is as expected.
        // Expected: There is no active user with username or email address “given text
        String expectedText="There is no active user with username or email address";
        System.out.println(loginPage.errorMessage2.getText());
        System.out.println(loginPage.errorMessage2.getText()+" "+"\""+random_username+"\"");
        Assert.assertEquals(loginPage.errorMessage2.getText(),expectedText+" \""+random_username+"\".");
    }
}
