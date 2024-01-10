import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//workbook--> sheet---> row--->cells 
// before writing into the excel we have create the excel in the above steps
public class WritinginExcel {

	public static void main(String[] args) throws Exception {
		// We are creting a blank workbook
		XSSFWorkbook workbook= new  XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Emp info"); // inside the sheet we have given the name of the sheet which we want to create
		// for writig the data in excel first we have to create and store the data in some datastructure which we are doing below
		Object empdata[][]= {
				{"Empid", "Name","jobid"},
				{1,"David", "Testing"},
				{2,"Smith", "Developer"}
		};
		
		// using normal for loop
		int rows= empdata.length;
		int cells= empdata[0].length;
		System.out.println(rows);
		System.out.println(cells);
		for(int i=0;i<rows;i++) {
			XSSFRow row=sheet.createRow(i);
		for(int j=0;j<cells;j++) {
			// before writing the data into the cell we have to create cell
			XSSFCell cell=row.createCell(j);// we created the cell now we will write the data
			Object value= empdata[i][j];
			// before seting the value we have to understand the data type of the value
			if(value instanceof String);
			cell.setCellValue((String)value);
			
			if(value instanceof Integer);
			cell.setCellValue((Integer)value);
			
			if(value instanceof Boolean);
			cell.setCellValue((Boolean)value);
			
		}
			
		}
		String file=".\\Datasheet\\emplye.xlsx";
		FileOutputStream outputsream= new FileOutputStream(file);
		workbook.write(outputsream);
		outputsream.close();
		System.out.println("the writing operation in excel is sucessful");
		
		
	}

}
