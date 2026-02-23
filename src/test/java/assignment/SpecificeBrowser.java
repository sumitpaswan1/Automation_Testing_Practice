package assignment;

import java.time.Duration;
//import java.util.List;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver. manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		
		// search Result
		
		WebElement result  = driver.findElement(By.xpath("//div[@class='wikipedia-search-results']"));
		
		// count the total links
		
		List<WebElement> links =result.findElements(By.tagName("a"));
		
		System.out.println("Total links: "+ links.size());
		
		// main window
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		// 3) Click on each link using for-each loop (open in new tabs)
		// 3) Click on each link using for-each loop (open in new tabs)
		for (WebElement link : links) {
		    String href = link.getAttribute("href");
		    if (href != null && !href.isEmpty()) {
		        // Open link in new tab using JavaScript
		        ((ChromeDriver) driver).executeScript("window.open('" + href + "','_blank');");
		        Thread.sleep(1000);
		    }
		}

		
		// 4) get window ID's for every browser window
		
		Set<String> ids = driver.getWindowHandles();
		
		System.out.println("windows id:"+ids);
		
		//5. close specifice browser
		
		for(String handle : ids) {
			
			int count = 0;
			if(!handle.equals(mainWindow)) {
				
				count++;
				
				if(count == 2) {
					driver.switchTo().window(handle);
					driver.close();

					 System.out.println("Closed window with ID: " + handle);
					 break;

				}
			}
		}


		  // Switch back to main window
		        driver.switchTo().window(mainWindow);
		        driver.quit();

		
		
		
	}

}
