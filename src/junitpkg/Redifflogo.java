package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	
	ChromeDriver driver;
	String basicurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(basicurl);
	}
	@Test
	public void logo()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		boolean radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radiobutton)
		{
			System.out.println("button is checked");
		}
		else
		{
			System.out.println("button is not checked");
		}
	}

}
