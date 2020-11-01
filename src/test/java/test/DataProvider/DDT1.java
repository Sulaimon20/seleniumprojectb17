package test.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import java.io.IOException;

public class DDT1 {

    @DataProvider
    public Object[][] getData() throws IOException {
        //we create a path
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + "/src/test/resources/bitrixCredentials.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int countRow = sheet.getPhysicalNumberOfRows();
        int countColumn = sheet.getRow(0).getPhysicalNumberOfCells();

        String[][] data = new String[countRow][countColumn]; // multidimensional String

        for (int i = 0; i < countRow; i++) {
            for (int j = 0; j < countColumn; j++) {
                data[i][j] = sheet.getRow(i).getCell(j).toString();
            }
        }
        return data;
    }

    @Test (dataProvider = "getData")
    public void test(String username, String password) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password + Keys.ENTER);
        driver.close();

    }
}
