package dummy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*1 scrolling the page by piexel number 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)","");
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		/*2. scroll till element is visible
		
		WebElement home = driver.findElement(By.xpath("//a[@class=\"home-link\"]"));
		
		js.executeScript("arguments[0].scrollIntoView()",home);
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
	
		*/
		
		//3 scroll the page till the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(3000);
		
		//4 scroll upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
	

	}

	
}
