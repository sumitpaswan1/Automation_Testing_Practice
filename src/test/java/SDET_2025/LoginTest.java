package SDET_2025;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	}
	@Test(dataProvider="loginData")
	void loginTest(String username, String pwd) throws InterruptedException {
		
		loginPage lp = new loginPage(driver);
		lp.setUserName(username);
		lp.setUserPassword(pwd);
		Thread.sleep(300);
		lp.login_button();
	}
	
	
	@AfterClass
	void tearsDown() {
		
	}
	
	@DataProvider(name ="loginData")
	Object[][] getData(){
		return new Object[][] {
			{"admin123","admin123"},
			{"Admin2","admin123"},
			{"Admin","admin123"}};
	}

	

}
