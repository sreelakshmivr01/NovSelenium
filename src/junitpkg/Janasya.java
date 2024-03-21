package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	
	ChromeDriver driver;
	String basicurl="http://www.janasya.in";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(basicurl);
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void newarrivals() throws InterruptedException
	{
		Thread.sleep(5000);
		String str=driver.getTitle();
		System.out.println("title ="+str);
		driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li/a[1]/span")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
//		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
//		search.sendKeys("kurthi",Keys.ENTER);
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
	}
//	@After
//	public void close()
//	{
//		driver.quit();
//	}

}
