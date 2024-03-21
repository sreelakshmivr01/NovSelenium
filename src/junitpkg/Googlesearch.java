package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

		
		ChromeDriver driver;
		String basicurl="http://www.google.com";
		 
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(basicurl);
		}
		
		@Test
		public void search()
		{
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("school",Keys.ENTER);
		//2	search.submit();
			
		//1	driver.findElement(By.name("q")).sendKeys("facebook");//element not intractable exception
		//	driver.findElement(By.name("btnK")).click();
		}

	}

