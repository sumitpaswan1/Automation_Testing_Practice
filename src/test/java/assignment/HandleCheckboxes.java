package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
	
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input' ]"));
	
	System.out.println(checkbox.size());
	
	
	//click on each checkbox
	for(WebElement chkbox: checkbox) {
		
		String text = chkbox.getAttribute("value");
		
		System.out.println(text);
		//System.out.println(text);
		if(text.equalsIgnoreCase("Monday")) {
			chkbox.click();
		}
		
	}
	
	
	
	
	
	
		
	


}
}
