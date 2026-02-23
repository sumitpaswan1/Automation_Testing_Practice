package dummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		//capture the all the checkbox
		String element =driver.findElement(By.xpath("//label[text()='Days:']")).getText();
		
		System.out.println(element);

		List<WebElement> list = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*
		for(WebElement checkbox : list) {
			checkbox.click();
		}
		*/
		
		for(int i=0;i<list.size();i++) {
			list.get(i).click();
		}
		//select last threee
		//7-3
		for(int i=4;i<list.size();i++) {
			list.get(i).click();
			
		}
		//unchacked the checked checkbos
		
		for(WebElement check : list) {
			if(check.isSelected()) {
				check.click();
			}
		}
	}

}
