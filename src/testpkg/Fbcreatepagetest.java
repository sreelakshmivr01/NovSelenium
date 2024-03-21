package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pagepkg.Fbcreatepage;



public class Fbcreatepagetest {
	
WebDriver driver;
String exp="Facebook";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void test()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpageclick();
		String actualtitle=ob.titleverification();
		Assert.assertEquals(exp, actualtitle);
		ob.signupclick();
		
	}

}
