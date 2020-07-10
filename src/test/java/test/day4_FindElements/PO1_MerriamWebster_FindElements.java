package test.day4_FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO1_MerriamWebster_FindElements {
    public static void main(String[] args) {
        //TC #0: FINDELEMENTS
    // 1.Open Chrome browser
    // 2.Go to https://www.merriam-webster.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    //Implicit wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.merriam-webster.com/");
        // 3.Print out the texts of all links
        List<WebElement> listOfLinks=driver.findElements(By.xpath("//body//a"));
        int linksWithoutText=0;
        int linksWithText=0;

        for (WebElement eachLink : listOfLinks) {
            //System.out.println(eachLink.getText());
            String textOfEachLink=eachLink.getText();
            // 4.Print out how many link is missing text
            if (textOfEachLink.isEmpty()){
               linksWithoutText++;
            }else {
                System.out.println(textOfEachLink);
                linksWithText++;
            }

        }
        // 5.Print out how many link has text
        System.out.println("The number of links that has text: "+linksWithText);
        // 6.Print out how many total link
        System.out.println("Total links on this page: "+listOfLinks.size());


    }
}
