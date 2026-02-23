package dummy;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
public class AllHeaderLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find the all headerLinks
		
		WebElement header = driver.findElement(By.xpath("//button[@class='btn btn-primary']/ancestor::header[@class='jumbotron text-center header_style']"));
		
		List<WebElement> lnk = header.findElements(By.tagName("button"));
		
		System.out.println("total links in header:"+lnk.size());
		
		//print the all links present in header
		
		for(WebElement link: lnk) {
			String value = link.getText();
			System.out.println(value);
		}
		
		

	}

}
