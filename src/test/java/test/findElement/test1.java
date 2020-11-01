package test.findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class test1 {
    public static void main(String[] args) {

        WebDriverManager.operadriver().setup();
        WebDriver driver=new OperaDriver();

        String s="http://www.opera.com";
        driver.get(s);
        System.out.println(driver.getCurrentUrl());


    }
}
