package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initilize the web driver
		WebDriver driver=new ChromeDriver();
		
		//navigate the browser
		driver.get("https://demo.nopcommerce.com/");
		
		
		
		//maximize the browser 
		driver.manage().window().maximize();
		
		
		// total links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// name and links 
		for(WebElement l1: links) {
			System.out.println(l1.getText().trim() +" :"+l1.getAttribute("href"));
		}
		
        // Locate header section using class name
        //WebElement header = driver.findElement(By.className("header"));
        
        //
        WebElement header = driver.findElement(By.xpath("//div[@class='header-links']"));

        // Find all anchor (<a>) tags inside the header
        List<WebElement> headerLinks = header.findElements(By.tagName("a"));
        System.out.println(headerLinks.size());
		
        
        for(WebElement lnk : headerLinks) {
        	System.out.println(lnk.getText().trim() + " --> " + lnk.getAttribute("href"));
        }
		//link.getText().trim() to avoid empty lines from blank texts.
		
		
		
		driver.close();

	}

}
