package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleHiddenDropDown{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		// Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// Wait for and click on PIM
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='PIM']"))).click();
		
		// Wait and click on Job Title dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'-- Select --')])[2]"))).click();
		
		// Wait until dropdown options are visible
		List<WebElement> list = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role=\"listbox\"]//span")));
		
		System.out.println("Dropdown size: " + list.size());
		
		// Print all values
		for (WebElement e : list) {
			System.out.println(e.getText().trim());
		}
		
		//driver.quit();
	}
}

