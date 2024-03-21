package testng;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Assertionprogrm {
	
	ChromeDriver driver;
	String baseurl="http://www.facebook.com";
	
	@BeforeMethod
	public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
	
	@Test
	public void test()
	{
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(exp, actualtitle);
		
		System.out.println("TestNG");
	}

}
