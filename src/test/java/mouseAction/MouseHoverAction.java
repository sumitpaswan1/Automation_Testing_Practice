package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//hover on desktop
		WebElement dsk = driver.findElement(By.xpath("//a[normalize-space()=\"Desktops\"]"));
		
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()=\"Mac (1)\"]"));
		
		Actions act  = new Actions(driver);
		
		act.moveToElement(dsk).moveToElement(mac).click().build().perform();
			
		
		

	}

}
