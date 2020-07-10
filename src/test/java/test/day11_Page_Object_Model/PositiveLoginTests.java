package test.day11_Page_Object_Model;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import test.utilities.ConfigurationReader;
import test.utilities.Driver;

public class PositiveLoginTests {
    LoginPage loginPage;
    @Test
    public void store_login_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);
        //loginPage.loginButton.click();  <== we can use click

        //Title verification
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Dashboard") );

    }

}
