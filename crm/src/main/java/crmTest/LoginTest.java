package crmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		login();
		tearDown();
		
	}

	public static void launchBrowser() {
		       // Setting up the property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohel\\eclipse-workspace\\Spring2020Selenium\\crm\\driver\\chromedriver.exe");
			// OR...	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
				// Creating web driver instance
			    driver = new ChromeDriver();
				
				 // Maximizing Browser
				driver.manage().window().maximize();
				
				 // Get to the site
				driver.get("http://www.techfios.com/ibilling/?ng=dashboard/");
		
	}
	
	public static void login() throws InterruptedException {
		
		 // Identifying the  username field pass  username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		// Identifying the password field
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		// Identifying the signin button and click
		driver.findElement(By.name("login")).click();
		
		// Stopping the browser for 2 sec
		Thread.sleep(2000);
				
				
	}
	
	public static void tearDown() {
		
		// Close the browser
		driver.close();
		
	}
}
