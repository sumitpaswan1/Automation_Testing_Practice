package dummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement>list = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(list.size());
		
		
		//select all the checkboxes
		for(WebElement id : list) {
			String title = id.getAttribute("value");
			System.out.println(title);
			
			if(title.equalsIgnoreCase("Monday")) {
				//id.click();
			}
		}
		//selecting last three checkboxes
		for(int i = 4;i<list.size();i++) {
			list.get(i).click();
			
		}
		
		//driver.close();

	}

}
