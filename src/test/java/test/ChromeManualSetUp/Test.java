package test.ChromeManualSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//WebDriverManager.chromedriver().setup(); ==>not allows in some companies due to security
//  We do it manually, look for chromedrive: https://chromedriver.chromium.org/downloads
//  download it, unpack it, copy in intelliJ and then
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.close();
    }
}
