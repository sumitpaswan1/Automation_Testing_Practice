package dummy;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	
	//Expicit wait
	
	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='demo-frame']")));
	driver.switchTo().frame(0);
	//driver.findElement(By.cssSelector(".hasDatepicker")).sendKeys("02/04/2026");
	
	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); 
	
	String year= "2027";
	String month = "March";
	String date = "10";
	driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
	selectFuterDate(driver,year,month,date);
	
	

	}
	public static void selectFuterDate(WebDriver driver,String year,String month,String date) {
		while(true) {
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(currentYear.equals(year) && currentMonth.equals(month)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
				
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		
		for(WebElement date1 : dates) {
			if(date1.getText().equals(date)) {
				date1.click();
				break;
			}
		}
	}

	
}
