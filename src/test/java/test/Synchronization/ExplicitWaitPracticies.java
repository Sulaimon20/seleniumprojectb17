package test.Synchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading7Page;
import test.utilities.Driver;

public class ExplicitWaitPracticies {
//TC#40: Dynamically Loaded Page Elements 7
// 1.Go tohttp://practice.cybertekschool.com/dynamic_loading/7
// 2.Wait until title is “Dynamic Title”
// 3.Assert : Message “Done” is displayed.
// 4.Assert : Image is displayed.
// Note: Follow POM
    @Test
    public void TC40_dynamic_title_test() {

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
        Loading7Page loading7Page=new Loading7Page();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);


        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        Assert.assertTrue(loading7Page.doneMessage.isDisplayed());

        Assert.assertTrue(loading7Page.spongeBobImage.isDisplayed());


    }
}
