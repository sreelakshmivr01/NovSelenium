package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instaxpath {
	
	ChromeDriver driver;
	String basicurl="http://www.instagram.com";
	 
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(basicurl);
	}
	
	@Test
	public void instaxpath() throws InterruptedException
	{
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("nfngffv@gmail.com");
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("adfkhka");
		WebElement login=driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
		login.sendKeys("ajfkdfjk",Keys.ENTER);
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
		
	}
	

}