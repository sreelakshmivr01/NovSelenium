package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/sreel/Desktop/display.html";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void alertbox()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext :"+alerttext);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Amritha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
