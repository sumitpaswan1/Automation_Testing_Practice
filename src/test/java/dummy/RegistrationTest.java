package dummy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	void setup(String br) {
		switch(br.toLowerCase()) {
		case "chrome" : driver = new ChromeDriver();break;
		case "edge" : driver = new EdgeDriver();break;
		default : System.out.println("Invalid Browser");return;
		}
		//driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	//login test
	@Test
	void login() {
		Registration res = new Registration(driver);
		res.setUsername("Admin");
		res.setPassword("admin123");
		res.clickOnLoginButton();
	}
	//void quite driver
	@AfterClass
	void tearsDown() {
		//driver.quit();
	}

}
