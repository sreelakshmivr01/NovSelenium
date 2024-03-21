package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffmail {
	ChromeDriver driver;
	String basicurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(basicurl);
	}
	
	@Test
	public void dateofbirth()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("04");
	    WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	    Select monthdetails=new Select(month);
	    monthdetails.selectByValue("11");
	    WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	    Select yeardetails=new Select(year);
	    yeardetails.selectByValue("1996");
	}
 
}
