package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

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
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("fblogin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
