package dummy;

import java.time.Duration;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAndChhromeOption {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Full page screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "\\screenshot\\p1.png");
        source.renameTo(target); // copy sourcefile to target file
        
        Thread.sleep(3000);
        
        // Capture specific area of webpage
        WebElement scr = driver.findElement(By.xpath("//table[@class='section-columns columns-2']"));
        File sfile = scr.getScreenshotAs(OutputType.FILE);
        File dfile = new File(System.getProperty("user.dir") + "\\screenshot\\p2.png"); // Fixed "urser.dir"
        sfile.renameTo(dfile);
       
        
        driver.quit();
    }
}
