package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://tutorialsninja.com/demo/");
		
		String title = "Your Store";
		
		if(title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		

	}

}
