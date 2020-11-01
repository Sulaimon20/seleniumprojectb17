package test.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Double_Click {
//TC	#16:	Double	Click	Test
// 1. Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
// 2. Switch	to	iframe.
// 3. Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
// 4. Assert:	Text’s	“style”	attribute	value	contains	“red”.
    WebDriver driver;
    @Test
    public void changingTextColor() throws InterruptedException {

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().manage().window().maximize();
        Thread.sleep(1000);

        WebElement iFrame2=Driver.getDriver().findElement(By.xpath("//iframe[@ id='iframeResult']"));
        Driver.getDriver().switchTo().frame(iFrame2);

        Actions actions=new Actions(Driver.getDriver());
        WebElement text=Driver.getDriver().findElement(By.cssSelector("#demo"));

        actions.doubleClick(text).perform();
        Assert.assertTrue(text.getAttribute("style").contains("red"));

    }


    public void tearDown() {

        Driver.getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Driver.getDriver().close();
    }
}
