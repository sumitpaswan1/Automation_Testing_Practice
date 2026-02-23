package dummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // opens dropdown options
		
		//selecting the single element
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all the element
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println(list.size());
		
		for(WebElement op : list) {
			
			String title = op.getText().trim();
			System.out.println(title);
			
			if(title.equals("Java") || title.equals("Python") || title.equals("MySQL")){
				op.click();
			}
		}
		
		
	}

}
