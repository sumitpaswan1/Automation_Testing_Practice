package webDriverMethod;

import java.time.Duration;

// getTitle(), getCurrentUrl(), getPageSouce(),getWindowHandle(), getWindowHandles()
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

		//getTitle() - returns title of the page
		System.out.println(driver.getTitle());  //OrangeHRM

		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//getPageSource()- returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single Browser window
		String windoid = driver.getWindowHandle();
		System.out.println("Window Id : "+ windoid);
	
		
		//getWindowHandles() - retuns ID's of the multiple browser windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will opens new browser window
		
		//Set<String> windowids=driver.getWindowHandles();
		//System.out.println(windowids); //[495D26972EA78583B6AC4278855D6EA0, EA208DEDD8103214FE92B755519C704D]
		
		
	
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
		
		
		
		
	}



	}


