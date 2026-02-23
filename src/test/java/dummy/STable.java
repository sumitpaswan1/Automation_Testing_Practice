package dummy;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class STable {

	public static void main(String[] args) {

		//initilize the webDriver
		WebDriver driver = new ChromeDriver();
		
		//set time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate the page
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//count the total number of rows in a table 
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		
		// cout the total number of columns in a table
		int colmns  = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println(colmns);
		
		//Read data from specific row and column (ex: 5th row and 1st colum)
		String bk  = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bk);
		
		//4) read data from all the rows and colums
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");

		for(int r = 2 ; r<=rows; r++) {
			for(int c= 1; c<=colmns; c++) {
				
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		
		System.out.println("*************------------->>>>>*******************");
		// 5)Print book names whose author is Mukesh
		
		for(int r = 2; r <= rows; r++) {
			
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(authorName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();


				System.out.println(bookName+"\t"+authorName);
			}
			
		}
		
		System.out.println("*****************<<<<<<>>>>>>");
		//6) Find total price of all the books
		int total = 0;
		for(int r=2; r<=rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			
			total = total+ Integer.parseInt(price);
			
		}
		System.out.println("Total Price of Book :"+ total);
		
		
		//7 print the all values of column 3rd
		System.out.println("................................");
		
		for(int r=2; r<=rows; r++) {
			String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[3]")).getText();
			System.out.print(value + "\t");
		}
		System.out.println();
		
		
		

	}

}
