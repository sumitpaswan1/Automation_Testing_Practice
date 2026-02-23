package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing the webDriver
		WebDriver driver = new ChromeDriver();
		
		//initilializing the browser
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		
		for(WebElement sr: image) {
			System.out.println(sr.getAttribute("src"));
		}

	}

}
