package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	
	ChromeDriver driver;
	String basicurl="https://automationexercise.com/login";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(basicurl);
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("sreelachu.525@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		String exp="https://automationexercise.com/";
		if(driver.getCurrentUrl().equals(exp))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login unsuccessful");
		}
	}

}
