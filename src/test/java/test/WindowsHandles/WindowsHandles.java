package test.WindowsHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class WindowsHandles {

    //TC	#	:	Window	Handlepractice
    // 1.Create	a	new	class	called:	WindowHandlePractice
    // 2.Create	new	test	and	make	set	ups
    // 3.Go	to	:	http://practice.cybertekschool.com/windows

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/windows");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    // 4.Assert:	Title	is	“Practice”
    // 5.Click	to:	“Click	Here”text
    // 6.Switch	to	new	Window.
    // 7.Assert:	Title	is	“New	Window”
    @Test
    public void p5_window_handle_practice(){
       String currentWindowHandle=driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);
        WebElement clickHereLink=driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereLink.click();
      for (String each: driver.getWindowHandles()){
            driver.switchTo().window(each);
            if (driver.getTitle().equals("New Windows")){
                Assert.assertTrue(driver.getTitle().equals("New Window"));
                break;
            }
        }
       driver.switchTo().window(currentWindowHandle);
        System.out.println(driver.getTitle());




    }

}
