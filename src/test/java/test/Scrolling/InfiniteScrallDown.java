package test.Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class InfiniteScrallDown {


    @Test
    public void jsexecutor_test2() {
        Driver.getDriver().get("https://infinite-scroll.com/demo/full-page/");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        WebElement element = Driver.getDriver().findElement(By.xpath("//p[@class='scroller-status__message infinite-scroll-last']"));
        Driver.getDriver().manage().window().maximize();

        while (!element.isDisplayed()) {
            javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }
    }
}
