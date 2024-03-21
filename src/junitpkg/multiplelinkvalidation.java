package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplelinkvalidation {
	
	ChromeDriver driver;
	String basicurl="http://www.google.com";
	 
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(basicurl);
	}
	@Test
	public void linkdetails() throws InterruptedException
	{
		Thread.sleep(25000);
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("link count"+linklist.size());
		for(WebElement ele:linklist)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
	}
	private void verify(String link)
	{
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("response is successful-200");
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("response is brokenlink-404");
			}
			else
			{
				System.out.println("not excepted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
	}
	@After
	public void close()
	{
		driver.quit();
	}
	

}
