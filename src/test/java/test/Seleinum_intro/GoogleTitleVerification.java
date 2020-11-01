package test.Seleinum_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerification {

    public static void main(String[] args) {
        //TC	#1:	Google	Title	Verification
        // 1.Open	Chrome	browser
        WebDriverManager.chromedriver().setup();//this line create the connection
                                        //btw browser driver and the selenium

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2.Go	to	https://www.google.com
        driver.get("http://www.google.com");
        // 3.Verify	title:	Expected:	Google

        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification is PASSED");
        }else{
            System.out.println("Google title verification is FAILED");
        }



    }

}
