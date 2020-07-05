package session2pkg;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session2cls {

	WebDriver driver;
@Before
	public void learelement() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
@Test
public void webelement1() {
	driver.findElement(By.name("firstname")).sendKeys("Sohel");
	driver.findElement(By.name("lastname")).sendKeys("NW");
	driver.findElement(By.id("sex-0")).click();
	//driver.findElement(By.className("input-file")).click();
	driver.findElement(By.partialLinkText("TF-API")).click();
}


}
