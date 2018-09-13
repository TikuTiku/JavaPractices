package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Facebook_Test 
{
	@Test
	public void TC01() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhash\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("subhash.thakur478@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("921subhash921");
		driver.findElement(By.id("loginbutton")).click();
	}
}
