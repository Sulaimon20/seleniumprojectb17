package test.Office_Hours;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class ExcelIO {

    @Test
    public void readExcelFile(){
//this is need to put the path
        try (FileInputStream fileInputStream=new FileInputStream("VytrackTestUsers.xlsx")){
            // .xlsx
            //XSSWorkbook= to create an object of .xlsx file
            //HSSWorkbook  = to create an object of .xls file
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            //the name of the sheet in excel
            Sheet sheet=workbook.getSheet("QA1-short");
            Row row=sheet.getRow(0);
            Cell cell=row.getCell(0);

            System.out.println("cell = " + cell);

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
