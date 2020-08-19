package test.day0_self_practice.Lamda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;

import java.util.List;
import java.util.stream.Collectors;

public class findElements {
    WebDriver driver;
    @Test
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        List<WebElement> linksList = driver.findElements(By.tagName("a"));

        linksList.forEach(elements-> System.out.println(elements.getText()));

        List<String> collectList=linksList.
                stream().
                    filter(element ->!element.getText().equals("")).
                        map(element -> element.getText()).
                            collect(Collectors.toList());

        collectList.forEach(element-> System.out.println(element));
        System.out.println(linksList.size());

    }


}
