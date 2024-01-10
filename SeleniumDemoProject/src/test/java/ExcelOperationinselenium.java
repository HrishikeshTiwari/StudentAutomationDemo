import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperationinselenium {
public static void main (String [] args) throws IOException{
//Path of the excel file
	File file= new File("C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Datasheet\\Student.xlsx");
 //Create an object of FileInputStream class to read excel file
FileInputStream inputStream = new FileInputStream(file);

//creating workbook instance that refers to .xls file
XSSFWorkbook wb=new XSSFWorkbook(inputStream);

//creating a Sheet object
XSSFSheet sheet=wb.getSheet("Sheet1");


//get all rows in the sheet
//int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
//or
int Row= sheet.getLastRowNum();
int cols= sheet.getRow(1).getLastCellNum();

//iterate over all the row to print the data present in each cell.
for(int i=0;i<=Row;i++){
    
   XSSFRow rows= sheet.getRow(i);
    
    //iterate over each cell to print its value
    System.out.println("Row"+ i+" data is :");
    
    for(int j=0;j<cols;j++){
        System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
    }
    System.out.println();
}

}
}