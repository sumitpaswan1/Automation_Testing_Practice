package dummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(drp);
		
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("japan");
		drpCountry.selectByIndex(2);
		
		// count the totla number of options
		List<WebElement> option = drpCountry.getOptions();
		System.out.println(option.size());
		
		// print all the option
		
		for(int i =0;i<option.size(); i++) {
			String list = option.get(i).getText();
			System.out.println(list);
		}
		
		
		

	}
}
