package dummy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class JsExecuter1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement name = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		
		// passing value using javascript executor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','sumit')",name);
		
		//click on radio button
		WebElement button = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()",button);
		
		//scrolling the page by piexel 
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(3000);
		
		// scrolling till the element is visible
		WebElement home = driver.findElement(By.xpath("//a[@class=\"home-link\"]"));
		js.executeScript("arguments[0].scrollIntoView()",home);
		
		Thread.sleep(2000);
		
		//3 scroll the page till the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(3000);
		
		//4 scroll upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		//minimize and maximize using javascript executor
		js.executeScript("document.body.style.zoom='60%'");
		
		Thread.sleep(3000);
		
		js.executeScript("document.body.style.zoom='100%'");
	
		
		
		

	}

}
