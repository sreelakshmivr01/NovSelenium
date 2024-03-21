package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazoncartwindow {
	
	ChromeDriver driver;
	String baseurl="https://www.amazon.in/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
		String exp="Amazon.in : mobiles";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title doesn't match");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentWindow=driver.getWindowHandle(); //current window
		System.out.println("Parent window title"+ driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		
		Set<String> allWindowhandles=driver.getWindowHandles();
		
		for(String handle : allWindowhandles)
		{
			Thread.sleep(2000);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				
				
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\\\"nav-cart-count-container\\"));
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		

}

}
