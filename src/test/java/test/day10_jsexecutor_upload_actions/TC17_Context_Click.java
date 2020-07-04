package test.day10_jsexecutor_upload_actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class TC17_Context_Click {
    //TC	#17:	Context	Click	–	HOMEWORK
    // 1. Go	to	https://the-internet.herokuapp.com/context_menu
    // 2. Right	click	to	the	box.
    // 3. Alert	will	open.
    // 4. Accept	alert	No	assertion	needed	for	this	practice.

    @Test
    public void contextClick_Test(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Driver.getDriver().manage().window().maximize();
        WebElement triangleArea=Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));

        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(triangleArea).perform();
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();

    }

}
