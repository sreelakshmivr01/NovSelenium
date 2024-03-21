package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoItfileUpload {
	
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void main() throws Exception, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\sreel\\Downloads\\autoitfolder\\T1.exe");
		Thread.sleep(3000);
	}


}
