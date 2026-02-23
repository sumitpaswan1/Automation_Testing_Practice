package SDET_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// total links on header 
		
		WebElement header = driver.findElement(By.xpath("//div[@name='Cross-Column']"));
		
		List<WebElement> links = header.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement lnk : links) {
			
			System.out.println(lnk.getText().trim() + " --> " + lnk.getAttribute("href"));
		}
		

	}

}
