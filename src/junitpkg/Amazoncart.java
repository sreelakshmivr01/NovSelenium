package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoncart {
	
	ChromeDriver driver;
	String basicurl="http://www.amazon.in";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(basicurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void mobilesearch() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]/span[1]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/i")).click();
	}

}
