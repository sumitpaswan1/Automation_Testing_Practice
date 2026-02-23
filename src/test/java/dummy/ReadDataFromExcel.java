package dummy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ExcelFile  --> Workbook  --> Sheet --> Row --> cell
public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Reading the data from excel sheet
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		//opening the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//fetching the sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// capture total row and column from sheet
		int rows = sheet.getLastRowNum();
		
		int colmns = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows : "+rows); //5
		System.out.println("Total number of columns :"+colmns);//4
		
		//Readinf the data from excel sheet 
		
		for(int r=0;r<=rows;r++) {
			
			//jump to first row
			XSSFRow currentRow =sheet.getRow(r);
			for(int c=0;c<colmns;c++) {
				
				XSSFCell currentCell =currentRow.getCell(c);
				
				System.out.print(currentCell.toString()+"\t");
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		

	}

}
