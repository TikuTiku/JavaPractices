package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Registration 
{	
	@Test
	public void TC01() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhash\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("subhash.thakur478@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("921subhash921");
		driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.xpath(xpathExpression))
		/*driver.findElement(By.xpath("//*[@id='u_0_k']")).sendKeys("subhash");
		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Thakur");
		driver.findElement(By.xpath("//*[@id='u_0_p']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys(arg0);*/
		driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		
		
	}
}
