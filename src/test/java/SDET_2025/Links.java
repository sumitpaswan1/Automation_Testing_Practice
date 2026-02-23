package SDET_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {

	public static void main(String[] args) {
		// Auto Suggest dropdown 
		
	//1.Initilize the webDriver 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> suggestions = mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//div[@role='option']")));
		
		System.out.println(suggestions.size());
		
		for(WebElement suggest : suggestions) {
			
            String suggestionText = suggest.getText();
            System.out.println(suggestionText);
            
            if(suggestionText.contains("selenium rich foods")) {
            	
            	suggest.click();
            }
			
			
		}

	}

}
