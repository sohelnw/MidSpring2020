package homework1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwwebelements {
	
	WebDriver driver;
	
	@Before
	public void learnelement() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  
	}
	@Test
	public void webelement() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
//		driver.findElement(By.className("active")).click();
//	    driver.findElement(By.className("nav-label")).click();
//	    driver.findElement(By.className("fa arrow")).click();
//		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/ibilling/?ng=transactions/deposit/");
         driver.findElement(By.className("ibox-title")).click();
         driver.findElement(By.id("account")).sendKeys("Mean258");
         driver.findElement(By.id("description")).sendKeys("dep.by.sohel");
         driver.findElement(By.id("amount")).sendKeys("510");
         driver.findElement(By.id("submit")).click();
        // driver.close();

	
	}
}
