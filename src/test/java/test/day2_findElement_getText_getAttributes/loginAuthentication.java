package test.day2_findElement_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAuthentication {
    public static void main(String[] args) throws InterruptedException {
        //TC#5:	Basic	login	authentication
        // 1-Open	a	chrome	browser
        // 2-Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 3-Verify	title	equals:Expected:	Web	Orders	Login
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders Login";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Web Orders Login verification PASSED");
        }else {
            System.out.println("Web Orders Login verification FAILED");
        }
        driver.manage().window().maximize();
        // 4-Enter	username:	Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        // 5-Enter	password:	test
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        // 6-Click	“Sign	In”	button
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        // 7-Verify	titleequals:Expected:	Web	Orders
        String actualTitle1=driver.getTitle();
        String expectedTitle1="Web Orders";
                if (actualTitle.contains(expectedTitle)){
            System.out.println("Web Orders Login verification PASSED");
        }else {
            System.out.println("Web Orders Login verification FAILED");
        }
               // Thread.sleep(3000);
       // driver.findElement(By.id("ctl00_logout")).click();


    }
}
