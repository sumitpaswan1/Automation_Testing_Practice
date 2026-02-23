package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.elementToBeClickable(By.name("q"))).sendKeys("Selenium");

        // Allow time for suggestions to load (just in case)
        Thread.sleep(2000); 

        List<WebElement> list1 = wait.until(
            ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span")
            )
        );

        System.out.println("Number of suggestions: " + list1.size());

        for (WebElement e : list1) {
            String title = e.getText().trim();
            
            System.out.println(title);
            
           /* if(title.equals("selenium")) {
            	e.click();
            }
            */
            
            
        }

        //driver.quit();
    }
}
