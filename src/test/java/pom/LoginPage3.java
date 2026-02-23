package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 {
	
	WebDriver driver;
	
	LoginPage3(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	
	@FindBy(xpath="//button[normalize-space()=\"Login\"]")
     WebElement btn_login;
	
	
	public void setUserName(String user) {
		
		txt_username.sendKeys(user);
	}
	
	public void setUserPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	public void loginButton() {
		btn_login.click();
	}
	

}
