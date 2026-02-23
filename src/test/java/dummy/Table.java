package dummy;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.Chrome.chromeDirver;
public class Table {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// cout the total number of rows
		int rows = driver.findElements(By.xpath("//table[@class='table-display']//tr")).size();
		System.out.println(rows);
		
		int colms = driver.findElements(By.xpath("//table[@class='table-display']//tr//th")).size();
		System.out.println(colms);
		
		
		// print the all the data frome table
		System.out.println("Instructor"+ "\t"+"Course"+"\t"+"Price");
		for(int r= 2; r<=rows;r++) {
			for(int c=1;c<=colms;c++) {
				String values = driver.findElement(By.xpath("//table[@class='table-display']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(values+"\t");
					
			}
			System.out.println();
		}
		// name of course where price is greater than 20:
		
		for(int r=2; r<=rows;r++) {
			String value= driver.findElement(By.xpath("//table[@class='table-display']//tr["+r+"]//td[3]")).getText();
			int price = Integer.parseInt(value);
			
			if(price > 30) {
				String course = driver.findElement(By.xpath("//table[@class='table-display']//tr["+r+"]//td[2]")).getText();
				
				System.out.print(course+"\t");
			}
			System.out.println();
		}
		// calculate the total price :
		int sum = 0;
		for(int r=2;r<=rows;r++) {
			
			String value= driver.findElement(By.xpath("//table[@class='table-display']//tr["+r+"]//td[3]")).getText();
			sum = sum +Integer.parseInt(value);
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
