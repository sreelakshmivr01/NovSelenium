package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationsignup {

	ChromeDriver driver;
	String baseurl="https://automationexercise.com/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("name")).sendKeys("Sreelakshmi");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sreelak123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sree123456");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("04");
	    WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	    Select monthdetails=new Select(month);
	    monthdetails.selectByValue("11");
	    WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	    Select yeardetails=new Select(year);
	    yeardetails.selectByValue("1996");
		
		driver.findElement(By.xpath("")).sendKeys("sreelak123@gmail.com");
		driver.findElement(By.xpath("")).sendKeys("sreelak123@gmail.com");
	}

}
