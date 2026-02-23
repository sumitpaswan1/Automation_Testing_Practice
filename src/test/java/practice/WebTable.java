package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// count the total rows
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);

		
		// count the column in table
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(cols);
		
		System.out.println("Book Name"+"\t"+"Author"+"\t"+"Subject"+"\t"+"price");
		
		for(int r =2; r<+rows;r++) {
			
			for(int c=1; c<=cols;c++) {
				
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println("");
		}
		////5) Print book names whose author is Mukesh
		
		for(int r=2; r<=rows; r++) {
			
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(author.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName+"\t"+author);
			}
		}

	}

}
