package dummy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DynamicWritingDataIntoExcel {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method st
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("dynamic_data");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many rows?");
		int noOfrows=sc.nextInt();
		
		System.out.println("Enter how many cells?");
		int noOfcells=sc.nextInt();
		
		for(int r=0; r<noOfrows; r++) {
			
			XSSFRow currentrow = sheet.createRow(r);
			for(int c=0; c<noOfcells;c++) {
				
				XSSFCell cell =currentrow.createCell(c);
				cell.setCellValue(sc.next());
				
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
