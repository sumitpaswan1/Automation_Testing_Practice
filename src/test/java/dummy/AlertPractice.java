package dummy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		/*simple alert 
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		// confirmation alert 
		driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Confirm\"]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		 * 
		 

		
		//Promt Alert
		
		driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		
		System.out.println("Text msg on alert:"+myalert.getText());
		
		myalert.sendKeys("Welcome");
		myalert.accept();
		
		
		String str = "You entered: Welcome";
		
		if(str.contains("Welcome")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
	}
	*/
	// handling alert button using explict wait
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click(); //opens alert box
		Thread.sleep(5000);
	
		Alert alt = mywait.until(ExpectedConditions.alertIsPresent());
		alt.accept();
	
	

}
	}
