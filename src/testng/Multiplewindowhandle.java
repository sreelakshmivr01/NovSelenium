package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandle {
	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/popup.php";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		String parentWindow=driver.getWindowHandle(); //current window
		System.out.println("Parent window title"+ driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
		Set<String> allWindowhandles=driver.getWindowHandles();
		
		for(String handle : allWindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("avfgh@gmail.com");
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		

}
}
