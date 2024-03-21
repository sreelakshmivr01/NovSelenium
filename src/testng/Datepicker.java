package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	
	ChromeDriver driver;
	String baseurl="https://www.goibibo.com/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	@Test
	public void test() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
			String monthtext=month.getText();
			System.out.println(monthtext);
			if(monthtext.equals("July 2024"))
			{
				break;
				
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
			}
			
		}
		List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/p"));
		//Thread.sleep(2000);
		for(WebElement ele:li)
		{
			
			String date=ele.getText();
			if(date.equals("10"))
			{
				ele.click();
			}
					
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
	}
	

}
