package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		WebElement option = driver.findElement(By.id("country-list"));
		
		Select opt = new Select(option);
		
		// total number of option 
		
		List<WebElement> list = opt.getOptions();
		
		System.out.println(list.size());
		
		// capture all the option 
		for(WebElement e : list) {
			String title = e.getText().trim();
			
			System.out.println(title);
		}
		
		// selecting one option
		
		opt.selectByIndex(2);
		
		
		
		

	}

}
