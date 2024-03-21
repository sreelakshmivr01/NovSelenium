package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void titleverification()
	{
		String exp="Google";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
	}
	
	@After
	public void closebrowser()
	{
		driver.quit();
	}

}
