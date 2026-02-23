package dataPicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyDatePicker {
	
	public static void selectPastDate(WebDriver driver,String Year,String Month,String Date) {
		
		while(true) {
			
			String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(Month) && currentYear.equals(Year)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}
		
		//pick date:
		
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		for(WebElement dt : alldates) {
			if(dt.getText().equals(Date))
			{
				dt.click();
				break;
			}
		}
	}

    public static void main(String[] args) {
        // Initializes a new instance of the ChromeDriver.
        // This line assumes that the ChromeDriver executable is in your system's PATH or specified via System.setProperty.
        WebDriver driver = new ChromeDriver();

        // Sets an implicit wait of 10 seconds.
        // If an element is not found immediately, Selenium will wait up to 10 seconds before throwing an exception.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigates the browser to the specified URL, which contains a jQuery UI Datepicker.
        driver.get("https://jqueryui.com/datepicker/");

        // Maximizes the browser window.
        driver.manage().window().maximize();
        
        // switch to frame 
        WebElement frmae = driver.findElement(By.cssSelector(".demo-frame"));
        
        driver.switchTo().frame(frmae);

        // Finds the date picker input field using its XPath locator.
        // The date picker on the jQuery UI site has an ID of 'datepicker'.
        WebElement txt = driver.findElement(By.xpath("//input[@id='datepicker']"));

        // Enters the date "10/02/2025" into the date picker input field.
        // This directly sends the text to the input field without interacting with the calendar UI.
       // txt.sendKeys("10/02/2025");
        
        String year ="2022";
        String month="May";
        String Date="10";
        
        selectPastDate(driver,year,month,Date);
    }
}