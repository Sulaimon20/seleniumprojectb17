package test.day10_JSExecutor_Upload_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class TC18_Hover_Test {
//TC	#16:	Hover	Test
// 1. Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
// 2. Drag	and	drop	the	small	circle	to	bigger	circle.
// 3. Assert:		-Text	in	big	circle	changed	to:	“You	did	great!”


    @Test
    public void hover_test() throws InterruptedException {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().manage().window().maximize();
        Thread.sleep(1000);

        WebElement smallCircle=Driver.getDriver().findElement(By.xpath("//div[@class='demo-section k-content']//div[2]"));
        Actions actions=new Actions(Driver.getDriver());
        WebElement bigCircle= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        actions.clickAndHold(smallCircle).moveToElement(bigCircle).dragAndDrop(smallCircle,bigCircle).perform();
        String expectedText="You did great!";
        Assert.assertEquals(bigCircle.getText(),expectedText);

        Driver.getDriver().close();

    }

}
