package dummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@class='form-control' and @id='country']"));
		
		Select dropDown = new Select(element);
		
		List<WebElement> option = dropDown.getOptions();
		
		for(WebElement opt : option) {
			System.out.print(opt.getText()+"\t");
			
		}
		dropDown.selectByVisibleText("Japan");
		
		dropDown.selectByIndex(2);
		
		dropDown.selectByValue("japan");
		
		WebElement el2 = driver.findElement(By.xpath("//select[@class='form-control' and @id='colors']"));
		Select  dp2 = new Select(el2);
		
		
		List<WebElement> list = dp2.getOptions();
		
		for(WebElement opt1 : list) {
			System.out.print(opt1.getText()+"\t");
		}
	
		
	
	}

}
