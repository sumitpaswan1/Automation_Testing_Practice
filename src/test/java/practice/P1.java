package practice;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class P1 {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        // Correct file path
        FileInputStream file = new FileInputStream(
                System.getProperty("user.dir") + "/testdata/data.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rows = sheet.getLastRowNum();

        for (int i = 1; i <= rows; i++) {

            XSSFRow row = sheet.getRow(i);

            if (row == null) continue;

            String username = row.getCell(0).toString();
            String password = row.getCell(1).toString();

            // Replace with valid locators
            driver.findElement(By.name("q")).sendKeys(username); // example for Google
            driver.findElement(By.name("q")).sendKeys(password);

            // Example (Google doesn't have login button like this)
            // driver.findElement(By.id("login-btn")).click();
        }

        workbook.close();
        file.close();
        driver.quit();
    }
}