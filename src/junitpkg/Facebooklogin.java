package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	
	ChromeDriver driver;
	String baseurl="http://www.facebook.com";
	
	@Before
	public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
	@Test
	public void facebooklogin()
	{
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("fblogin");
		driver.findElement(By.name("login")).click();
	}
	
}
