package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String mainwindow = driver.getWindowHandle();
		
		//driver.findElement(By.linkText("OrangeHRM, Inc"));
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		
		Set<String> windid = driver.getWindowHandles();
		
		for(String id : windid) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
				
				System.out.println("Closing the Window with Title :" + title);
				driver.close();
				break;
				
			}
			
		}
		

	}

}
