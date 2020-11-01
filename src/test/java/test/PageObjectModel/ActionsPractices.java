package test.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class ActionsPractices {

    @Test
    public void scrolling_with_actions() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/");
        // creating actions inctance to be able to use its methods
        Driver.getDriver().manage().window().maximize();
        Actions actions=new Actions(Driver.getDriver());
        //using actions intance we use moveToElement method
        WebElement cybertekSchoolLink=Driver.getDriver().findElement(By.linkText("Cybertek School"));
        Thread.sleep(1000);
        actions.moveToElement(cybertekSchoolLink).perform();




    }



}
