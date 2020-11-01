package test.PageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class TC_35_Vytrack_forgot_password_page_verifications {


@Test
    public void forgot_password_page_verifications() throws InterruptedException {
        //1. Go to https://qa3.vytrack.com
        // Note: Follow Page Object Model design pattern

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        LoginPage loginPage=new LoginPage();
        // 2. Click to “Forgot your password?”link
        loginPage.forgotPasswordLink.click();

        Thread.sleep(1000);
        // 3. Verify title changed to expectedExpected: “Forgot Password”
        String expectedTitle="Forgot Password";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        // 4. Verify url is as expected:Expected: “https://qa3.vytrack.com/user/reset-request”
        String currentUrl=Driver.getDriver().getCurrentUrl();
        String expectedURL="https://qa3.vytrack.com/user/reset-request";
        Assert.assertEquals(currentUrl,expectedURL);
    }



}
