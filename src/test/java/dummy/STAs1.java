package dummy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class STAs1 {

	public static void main(String[] args) {
		//initilize the webDriver
		WebDriver driver = new ChromeDriver();
		
		//set time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate the page
		driver.get("https://blazedemo.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		// departure city
		WebElement departure = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select dep = new Select(departure);
		
		dep.selectByValue("Paris");
		
		// destination ciry
		
		WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select des = new Select(destination);
		des.selectByIndex(1);
		
		// clicking on find flight button
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		// count the number of rows and column in table 
		
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		
		int colmn = driver.findElements(By.xpath("//table[@class='table']//th")).size();
		
		System.out.println("Totla number of rows: "+rows);
		System.out.println("Total number of columns: "+colmn);
		
		// capture all the values 
		for(int r = 1 ; r<rows; r++) {
			for(int c= 1; c<=colmn; c++) {
				
				String value = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
			
		}
		// capture the lowest price 
		
		for(int r = 1; r<rows; r++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			System.out.print(price+"\t");
		}
		System.out.println();
		
		// Find the row with the lowest price
		int rowWithLowestPrice = 0;
		double lowestPrice = Double.MAX_VALUE;

		for (int r = 1; r<rows; r++) {  // Start from 2, as 1 is the header
		    String priceText = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
		    double price = Double.parseDouble(priceText.replace("$", "").trim());

		    if (price < lowestPrice) {
		        lowestPrice = price;
		        rowWithLowestPrice = r;
		    }
		}

		System.out.println("Lowest price: $" + lowestPrice + " at row: " + rowWithLowestPrice);

		// Click the "Choose This Flight" button in the corresponding row
		driver.findElement(By.xpath("//table[@class='table']//tr[" + rowWithLowestPrice + "]//td[1]//input")).click();
		

		}

	// Find the row with  the highest price 
	/* 
	 *double highestPrice = 0.0;  // Start with the smallest realistic price

int rowWithHighestPrice = 0;

for (int r = 2; r <= rows; r++) {
    String priceText = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
    double price = Double.parseDouble(priceText.replace("$", "").trim());

    if (price > highestPrice) {
        highestPrice = price;
        rowWithHighestPrice = r;
    }
}

System.out.println("Highest price: $" + highestPrice + " at row: " + rowWithHighestPrice);

// Click the corresponding "Choose This Flight" button
driver.findElement(By.xpath("//table[@class='table']//tr[" + rowWithHighestPrice + "]//td[1]//input")).click();
 
	 * */

	}


