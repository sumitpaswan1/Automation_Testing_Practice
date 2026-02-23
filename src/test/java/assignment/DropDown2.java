package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		// Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//div//li[2]/a"))).click();
		
		// click on dropdown
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]"))).click();
		
 
		//capture size and all values from dropdown
		
		// Wait until dropdown options are visible
		List<WebElement> list = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']/span")));
		
		System.out.println(list.size());
		
		// capture all the dropdown value 
		for(WebElement e : list) {
			String value = e.getText().trim();
			System.out.println(value);
			
			if(value.equals("Full-Time Probation"))
				e.click();
		}
		
		
	}

}
