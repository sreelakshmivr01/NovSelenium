package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	ChromeDriver driver;
	String baseurl="http://www.facebook.com";
	
	@Before
	public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
	@Test
	public void linkcount()
	{
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println("Linkcount=" +linklist.size());
		for(WebElement element:linklist)
		{
			System.out.println("text :" +element.getText());
			System.out.println("Link :" +element.getAttribute("href"));
		}
//		for(int i=0;i<linklist.size();i++)
//		{
//		
//		System.out.println(i+":"+linklist.get(i).getText()+"-"+linklist.get(i).getAttribute("href"));
//		}
//		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
