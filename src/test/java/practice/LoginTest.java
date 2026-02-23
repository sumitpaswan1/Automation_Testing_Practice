package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
	@Test
	void testLogin() {
		
		LoginPage lpp = new LoginPage(driver);
		
		lpp.setUsername("Admin");
		lpp.setPassword("admin123");
		lpp.clickLogin();
	}
	
	
	@AfterClass
	public void setDown() {
		
		driver.close();
		
	}
	

}
