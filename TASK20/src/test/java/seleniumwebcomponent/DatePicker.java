package seleniumwebcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	   public static void main(String[] args) {

			// Setup WebDriver
			WebDriverManager.chromedriver().setup();

			// Launching Chrome Browser
			WebDriver driver = new ChromeDriver();

			// Navigate to Website
			driver.navigate().to("https://jqueryui.com/datepicker/");
			
	        try {

	            // Switch to the iframe containing the datepicker
	            WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
	            driver.switchTo().frame(iframe);

	            // Open the datepicker
	            WebElement datePickerInput = driver.findElement(By.id("datepicker"));
	            datePickerInput.click();
	            Thread.sleep(3000);

	            // Click the button to go to the next month
	            WebElement nextButton = driver.findElement(By.cssSelector(".ui-datepicker-next"));
	            nextButton.click();
	            Thread.sleep(3000);
	            
	            // Select the date "22"
	            WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
	            dateToSelect.click();
	            Thread.sleep(3000);
	            
	            // Print the selected date to the console
	            String selectedDate = datePickerInput.getAttribute("value");
	            System.out.println("Selected date: " + selectedDate);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser and quit the WebDriver instance
	            driver.quit();
	        }
	    }
	}

