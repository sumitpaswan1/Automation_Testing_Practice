package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//navigate the browser
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//maximize the browser 
		driver.manage().window().maximize();
		
        // Locate header section using class name
        WebElement header = driver.findElement(By.className("widget-content"));

        // Find all anchor (<a>) tags inside the header
        List<WebElement> headerLinks = header.findElements(By.tagName("a"));
        System.out.println(headerLinks.size());
        
        //print all links
        for(WebElement lnk : headerLinks) {
        	System.out.println(lnk.getText().trim() +"--->"+ lnk.getAttribute("href"));
        }
		
		
		driver.close();

	}

}
