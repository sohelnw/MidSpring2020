package crmTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	WebDriver driver;

	// =============================	
	//	@Test
	//	public void launchBrowser() throws InterruptedException {
	//		 // Setting up the property
	//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohel\\eclipse-workspace\\Spring2020Selenium\\crm\\driver\\chromedriver.exe");
	//		
	//		       // Creating web driver instance
	//	    driver = new ChromeDriver();
	//		
	//		 // Maximizing Browser
	//		driver.manage().window().maximize();
	//		
	//		 // Get to the site
	//		driver.get("http://www.techfios.com/ibilling/?ng=dashboard/");
	//		
	//		 // Identifying the  username field pass  username
	//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	//		
	//		// Identifying the password field
	//		driver.findElement(By.id("password")).sendKeys("abc123");
	//		
	//		// Identifying the signin button and click
	//		driver.findElement(By.name("login")).click();
	//		
	//		// Stopping the browser for 2 sec
	//		Thread.sleep(2000);
	//		
	//		driver.close();
	//				
	//	}
	//=============================

	@Before
	public void launchBrowser() {
		// Setting up the property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sohel\\eclipse-workspace\\Spring2020Selenium\\crm\\driver\\chromedriver.exe");

		// Creating web driver instance
		driver = new ChromeDriver();

		// Maximizing Browser
		driver.manage().window().maximize();

		// Get to the site
		driver.get("http://www.techfios.com/ibilling/?ng=dashboard/");

	}

	@Test
	public void loginTest() throws InterruptedException {

		// Identifying the username field pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// Identifying the password field
		driver.findElement(By.id("password")).sendKeys("abc123");

		// Identifying the signin button and click
		driver.findElement(By.name("login")).click();

		// Stopping the browser for 2 sec
		Thread.sleep(2000);

	}

	@Test
	public void loginTest1() throws InterruptedException {

		// Identifying the username field pass username
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");

		// Identifying the password field
		driver.findElement(By.id("password")).sendKeys("abc123");

		// Identifying the signin button and click
		driver.findElement(By.name("login")).click();

		// Stopping the browser for 2 sec
		Thread.sleep(2000);

	}

	@After
	public void tearDown() {

		// Close the browser
		driver.close();

	}
}
