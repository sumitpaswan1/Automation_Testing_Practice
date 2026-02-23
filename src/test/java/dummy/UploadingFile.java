package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class UploadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		 *single file uploading 
		
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("C:\\AutomationPractice\\K_fileHandling.txt");
		
		//verify file is uploaded or not
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"] /li")).getText().equals("K_fileHandling.txt")) {
			System.out.println("file has uploaded successfully");
		}
		else {
			System.out.println("file has not uploaded successfully");
		}
		
		*/
		
		//Multiple file uploading
		String file1 = "C:\\AutomationPractice\\K_fileHandling.txt";
		String file2 = "C:\\AutomationPractice\\kunakl.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int toalFileUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(toalFileUploaded==2) {
			System.out.println("All file has uploaded");
		}
		else {
			System.out.println("all file not uploaded");
		}
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("K_fileHandling.txt") &&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("kunakl.txt"))
			
			{
				System.out.println("File names matching..");
			}
			else
			{
				System.out.println("Files are not not matching.");
			}
				
			
		
 
	}

}
