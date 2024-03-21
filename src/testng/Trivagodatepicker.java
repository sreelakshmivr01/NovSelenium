package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivagodatepicker {
	ChromeDriver driver;
	String baseurl="https://www.trivago.in/";
	
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
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
			String monthtext=month.getText();
			System.out.println(monthtext);
			if(monthtext.equals("July 2024"))
			{
				break;
				
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
			
		}
		List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		//Thread.sleep(2000);
		for(WebElement ele:li)
		{
			
			String date=ele.getText();
			if(date.equals("18"))
			{
				ele.click();
				break;
			}
					
		}
		List<WebElement> li2=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		//Thread.sleep(2000);
		for(WebElement ele:li2)
		{
			
			String date=ele.getText();
			if(date.equals("25"))
			{
				ele.click();
				break;
			}
					
		}
	}
	

}
