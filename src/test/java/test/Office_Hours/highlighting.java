package test.Office_Hours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.utilities.Driver;
import test.utilities.Methods;

public class highlighting {

    public static void main(String[] args) throws InterruptedException {

        Driver.getDriver().get("https://www.google.com/");
       WebElement element= Driver.getDriver().findElement(By.xpath("(//input[@value='Google Search'])[2]"));

        Methods.highlightElement(element);

        //(
    }


}
