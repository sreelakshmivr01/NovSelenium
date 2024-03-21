package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		WebElement choosefile = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		choosefile.sendKeys("C:\\Users\\sreel\\Downloads\\Manual Questions and Answers.pdf");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		System.out.println(submit.getText());
		submit.click();		
	}

}
