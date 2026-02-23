package SDET_2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	loginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//username
	@FindBy(name="username")
	WebElement user;
	
	//password
	@FindBy(name="password")
	WebElement pwd;
	
	//login button
	@FindBy(xpath="//button[normalize-space()=\"Login\"]")
	WebElement login;
	
	
	public  void setUserName(String username) {
		user.sendKeys(username);
	}
	
	public void setUserPassword(String pwds) {
		pwd.sendKeys(pwds);
	}
	public void login_button() {
		login.click();
	}
	
		
	

	
}
