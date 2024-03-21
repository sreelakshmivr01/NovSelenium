package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rightclickanddoubleclick {
	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]"));
	//	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]")).click();
		Actions act=new Actions(driver);
		act.contextClick(ele);
	//
		act.contextClick(ele).perform();
		act.click(ele2);
		
		act.perform();
		Alert a=driver.switchTo().alert();
		a.accept();
		
		
		WebElement ele3=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(ele3);
		act.perform();
		Alert a1=driver.switchTo().alert();
		String alerttext=a1.getText();
		System.out.println("alerttext :"+alerttext);
		a1.accept();
		
	}

}
