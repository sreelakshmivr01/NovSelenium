package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebookloginuserneame {
	
	ChromeDriver driver;
	String basicurl="https://facebook.com";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get(basicurl);
	}
	
	@Parameters({"username", "password"})
	@Test
	public void login(String username, String password)
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	

}
