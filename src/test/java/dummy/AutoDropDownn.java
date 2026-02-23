package dummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoDropDownn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> list = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span")));
		
		System.out.println(list.size());
		
		
		for(int i=0; i< list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
			/*
			if(list.get(i).getText().equals("selenium")) {
				list.get(i).click();
				break;
			}
			*/
		}

	}

}
