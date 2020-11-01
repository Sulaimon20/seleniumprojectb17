package test.DownloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;

public class changingPathForDownloding {
static WebDriver driver;
    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
        String downloadFilePath="C:/Users/Acer/Decktop";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilePath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("chromePrefs", chromePrefs);
        driver=new ChromeDriver(options);
        driver.get("http://practice.cybertekschool.com/download");
        driver.findElements(By.xpath("//*[@id='content']/div/a[5]"));
        Thread.sleep(3000);
        driver.close();
    }

}
