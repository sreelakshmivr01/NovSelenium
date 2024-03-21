package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		WebElement source=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement destination=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destination2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement source3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement destination3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement source4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destination4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, destination);
		act.dragAndDrop(source2, destination2);
		act.dragAndDrop(source3, destination3);
		act.dragAndDrop(source4, destination4);
		
		
		act.perform();
		boolean ele=driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
		if(ele)
		{
			System.out.println("Perfect is displayed");
			
		}
		else
		{
			System.out.println("Not displayed");
		}
	}
}
