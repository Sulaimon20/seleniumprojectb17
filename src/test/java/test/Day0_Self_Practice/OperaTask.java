package test.Day0_Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTask {
    public static void main(String[] args) {

        WebDriverManager.operadriver().setup();
        WebDriver driver1=new OperaDriver();

        driver1.get("https://www.opera.com");
        driver1.manage().window().maximize();



    }
}
