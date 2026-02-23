package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		for(int p=1; p<=3; p++) {
			
			if(p>1) {
				
				//WebElement element = driver.findElement("//ul[@id='pagination']//*[text()='+p+']");
				
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
			int noOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			for(int r=1;r<=noOfRows;r++)
			{
				String ID=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]/td[1]")).getText();
				String Name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]/td[2]")).getText();
				String Price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]/td[3]")).getText();
				
				System.out.println(ID+"\t"+Name+"\t"+Price);
		}
		}
}
		
		
		
}


