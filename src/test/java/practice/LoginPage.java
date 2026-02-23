package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//constuctor
	
	LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		//PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()=\"Login\"]")
	WebElement login;
	
	
	public void setUsername(String name) {
		username.sendKeys("nama");
	}
	
	public void setPassword(String name) {
		password.sendKeys("nama");
	}
	public void clickLogin()
	{
		login.click();
	}

 

}
