package test.JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.utilities.Driver;

public class javaScriptExecutorPractice {
    @Test
    public void jsexecutor_test() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/");
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();

        Thread.sleep(4000);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", cybertekSchoolLink);
    }

    @Test
    public void Scrollingdown_test() throws InterruptedException {

        Driver.getDriver().get("https://infinite-scroll.com/demo/full-page/");
        WebElement Link = Driver.getDriver().findElement(By.linkText("End of content"));
        ////p[@class="scroller-status__message infinite-scroll-last"]
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", Link);


        Thread.sleep(4000);

    }
}




