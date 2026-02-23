package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	WebDriver driver;
	
	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()=\"Login\"]")
	WebElement login;
	
	
	public void setUsername(String name) {
		username.sendKeys(name);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLoginButton() {
		login.click();
	}

}
