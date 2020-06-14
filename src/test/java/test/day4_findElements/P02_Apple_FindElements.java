package test.day4_findElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.day3_cssSelector_xpath.WedDriverFactory;
import java.util.List;

public class P02_Apple_FindElements {
    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WedDriverFactory.getDriver("chrome");
        // 2.Go to https://www.apple.com
        driver.manage().window().maximize();
        // 3.Click to iPhone
        driver.get("https://www.apple.com");
        WebElement iPhoneLinks = driver.findElement(By.xpath("//span[.='iPhone']/.."));
        iPhoneLinks.click();
        // 4.Print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        int linksWithoutText = 0;
        int linksWithText = 0;
        for (WebElement eachLink : allLinks) {
            String textOfLink = eachLink.getText();
            System.out.println(textOfLink);
        // 5.Print out how many link is missing text
            if (textOfLink.isEmpty()) {
                linksWithoutText++;
            } else {
                linksWithText++;
            }
        }
        // 6.Print out how many link has text
        System.out.println("The number of links that has text: " + linksWithoutText);
        // 7.Print out how many total link
        System.out.println("Total links on this text: "+linksWithText);

        ////*[@id="ac-globalnav"]/div/ul[2]
        System.out.println("Number of TOTAL LINKS "+allLinks.size());
    }

}