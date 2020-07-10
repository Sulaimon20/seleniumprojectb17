package test.day10_JSExecutor_Upload_Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class TC17_Context_Click {
    //TC	#17:	Context	Click	–	HOMEWORK




    @Test
    public void contextClick_Test(){
        // 1. Go	to	https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Driver.getDriver().manage().window().maximize();

        // 2. Right	click	to	the	box.
        WebElement triangleArea=Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(triangleArea).perform();

        // 3. Alert	will	open.
        Alert alert=Driver.getDriver().switchTo().alert();

        // 4. Accept	alert	No	assertion	needed	for	this	practice.
        alert.accept();

    }

}
