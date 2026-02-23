package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initilize the web driver
		WebDriver driver=new ChromeDriver();
		
		//navigate the browser
		driver.get("https://tutorialsninja.com/demo/");
		
		//maximize the browser 
		driver.manage().window().maximize();
		
		//total number of links on webPage
		List<WebElement>lnks = driver.findElements(By.tagName("a"));
		System.out.println(lnks.size());
		
		for(WebElement lnk : lnks ) {
			System.out.println(lnk.getText().trim() + " --> " + lnk.getAttribute("href"));
		}
		
		
        // Locate both header sections: top links and menu bar
        WebElement topLinks = driver.findElement(By.id("top-links"));
        WebElement menuBar = driver.findElement(By.id("menu"));

        // Find all <a> tags inside both sections
        List<WebElement> topLinksAnchors = topLinks.findElements(By.tagName("a"));
        List<WebElement> menuAnchors = menuBar.findElements(By.tagName("a"));

        // Combine total links
        int totalHeaderLinks = topLinksAnchors.size() + menuAnchors.size();

        // Output total number of header links
        System.out.println("Total number of links in the header section: " + totalHeaderLinks);

        // Optional: Print all link texts and URLs
        System.out.println("\nTop Links:");
        for (WebElement link : topLinksAnchors) {
            System.out.println(link.getText().trim() + " --> " + link.getAttribute("href"));
        }

        System.out.println("\nMenu Links:");
        for (WebElement link : menuAnchors) {
            System.out.println(link.getText().trim() + " --> " + link.getAttribute("href"));
        }
		driver.close();

	}

}
