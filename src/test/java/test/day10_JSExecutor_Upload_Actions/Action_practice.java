package test.day10_JSExecutor_Upload_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class Action_practice {


    public void hover_over_test1() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com/");


        Actions actions=new Actions(Driver.getDriver());
        WebElement languageOption=Driver.getDriver().findElement(By.id("icp-nav-flyout"));
        Thread.sleep(3000);
        actions.moveToElement(languageOption).perform();

    }
@Test
    public void TC15_hover_over() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        WebElement img1=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement img2=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        WebElement img3=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));

        WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed());
        Thread.sleep(1000);

        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());
        Thread.sleep(1000);

        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());
        Thread.sleep(1000);





}

}
