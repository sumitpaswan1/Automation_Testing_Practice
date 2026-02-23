package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initilize the web driver
		WebDriver driver=new ChromeDriver();
		
		//navigate the browser
		driver.get("https://tutorialsninja.com/demo/");
		
		//maximize the browser 
		driver.manage().window().maximize();
		
		//name
		//WebElement searchBox=driver.findElement(By.name("search"));
		//searchBox.sendKeys("MacBook");
		
		driver.findElement(By.name("search")).sendKeys("MacBook");   // single step
		
		//id
		//WebElement logo=driver.findElement(By.id("logo"));
		//boolean status=logo.isDisplayed();
		
		//boolean status=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println("Display status:"+ status);
		
		//linkText & partialLinkText   --  only for link
		
		//driver.findElement(By.linkText("Tablets")).click();   //linkText  //preferable
		//driver.findElement(By.partialLinkText("Tab")).click();  //partialLinkText
		
		//classname total number of links in header section
		
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerLinks.size()); //7
		
		//tagname 
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		//List<WebElement> images=driver.findElements(By.tagName("img"));
	//	System.out.println(images.size()); //18
		
		
		//finElement() Vs findElements()
		
		//WebElement ele=driver.findElement(By.id("xyz")); //NoSuchElementException
		
		//List<WebElement> ele=driver.findElements(By.id("xyz")); 
		//System.out.println(ele.size());
		
	}

	}


