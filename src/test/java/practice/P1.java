package practice;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
//import org.testng.annotations.Test;
import java.util.*;
import java.io.FileInputStream;
import java.time.Duration;
public class P1 {
	
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");  
		
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=rows;i++) {
			
			XSSFRow row = sheet.getRow(i);
			String username = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath("")).sendKeys(username);
			driver.findElement(By.xpath("")).sendKeys(password);
			 driver.findElement(By.id("login-btn")).click();
		}
       
       
        	
        	
        }
	}
	
		            
	}


