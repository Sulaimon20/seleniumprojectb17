package test.GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.utilities.Driver;

import java.util.List;

public class GoogleSearchSuggestion {

    public static void main(String[] args) {

        Driver.getDriver().get("http://www.google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("testing");
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//li[@role='presentation']"));
        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("i = " + list.get(i).getText());
        }

    }


}
