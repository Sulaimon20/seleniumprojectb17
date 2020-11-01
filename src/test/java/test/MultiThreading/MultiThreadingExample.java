package test.MultiThreading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class MultiThreadingExample extends Thread {
     WebDriver driver;
     String browsertype;

    public MultiThreadingExample(String name, String browsertype) {
        super(name);
        this.browsertype = browsertype;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            setUp(this.browsertype);
            testGoogleSearch();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // main method to create the thread and run multiple threads
    public static void main(String[] args) {
        Thread t1 = new MultiThreadingExample("Thread Chrome", "Chrome");
        Thread t2 = new MultiThreadingExample("Thread Firefox", "Firefox");
        t1.start();
        t2.start();
    }

    // set up the method to initialize driver object
    public void setUp(String browsertype) throws Exception {
        if (browsertype.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.close();

        } else if (browsertype.contains("Firefox")) {
            System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/geckpdriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.google.com");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.close();
        }

    }

    // test scripts
    public void testGoogleSearch() throws Exception {
        String actualtitle = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println("This is cool");
        Assert.assertEquals(actualtitle, expectedTitle, "The expected title matched");
        System.out.println("################Actual:" + actualtitle + "Expected:" + expectedTitle + "#################");
    }


}