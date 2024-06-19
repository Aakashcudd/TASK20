package seleniumwebcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviLogin {

	public static void main(String[] args) throws Exception {

		// Setup WebDriver
		WebDriverManager.chromedriver().setup();

		// Launching Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to Website
		driver.navigate().to("https://www.guvi.in/");
		
		// Locate Signup Button
		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
		
		// Filling Signup Form
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aakash Sundar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sundarselvamuthu1@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aakashsundar@1512");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8940271319");
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		Thread.sleep(3000);
		
		// Login Process
		driver.findElement(By.xpath("//a[text()='Click here to Login']")).click();
		driver.findElement(By.id("email")).sendKeys("sundarselvamuthu1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aakashsundar@1512");
		driver.findElement(By.id("logged-in")).click();
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(3000);
		
		// Verifying User Login
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.guvi.in/courses/?current_tab=myCourses")) {
            System.out.println("User successfully registered and redirected to Guvi Homepage");
        } else {
            System.out.println("Registration failed or not redirected to Guvi homepage");
        }
        
		
	}

}
