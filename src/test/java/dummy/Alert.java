package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//driver.switchTo().alert().accept();
		
		//confimation alrt 
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		//driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
		

	}

}
