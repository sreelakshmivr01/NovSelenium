package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Notificationpopup {
	
	ChromeDriver driver;
	String baseurl="https://www.justdial.com/";
	
	@BeforeTest
	public void setup()
	{
		//driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification--");
		driver=new ChromeDriver(options);
		
	}
	@Test
	public void test()
	{
		driver.get(baseurl);
	}
}
