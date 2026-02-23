package dummy;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PaginationTable {
    
    WebDriver driver;
    
    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        // Implicit wait helps when the table reloads after a click
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void retrieveDataFromPage3() {
        // 1. Get total number of pagination links
        int totalPages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
        System.out.println("Total pages available: " + totalPages);
        
        // 2. Loop to find and click Page 3 specifically
        // Note: Starting from 1 as page numbers usually start at 1
        for(int i = 1; i <= totalPages; i++) {
            if(i == 3) {
                // Fixed XPath: Added single quotes '"+i+"' so it looks for text '3'
                WebElement pageLink = driver.findElement(By.xpath("//ul[@id='pagination']//li/a[text()='"+i+"']"));
                pageLink.click();
                System.out.println("Clicked Page " + i);
                break; // Exit loop once page 3 is clicked
            }
        }
        
        // 3. Get row and column counts for the table on Page 3
        // Rows count includes the <tr> in <thead>, so we loop from r=2 to skip header
        int rows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
        int columns = driver.findElements(By.xpath("//table[@id='productTable']//tr/th")).size();
        
        System.out.println("Rows found: " + (rows-1)); // -1 to exclude header count
        
        // 4. Extract data from the table
        for(int r = 2; r <= rows; r++) { // Start at 2 to skip the <th> header row
            for(int c = 1; c <= columns; c++) {
                // Dynamic XPath using row index (r) and column index (c)
                String value = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println(); // New line after each row
        }
    }

    @AfterClass
    void tearDown() {
        // driver.quit(); // Uncomment to close browser after test
    }
}
