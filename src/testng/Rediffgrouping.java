package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Rediffgrouping {
        ChromeDriver driver;
		String basicurl="https://register.rediff.com/register/register.php?FormName=user_details";
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		
		@BeforeMethod
		public void urlloading()
		{
			driver.get(basicurl);
		}
		
		@Test(priority=5, groups = {"smoke"})
		public void titleverification()
		{
			String exp="Rediffmail Free Unlimited Storage";
			String actualtitle=driver.getTitle();
			if(actualtitle.equals(exp))
			{
				System.out.println("Title is same");
			}
			else
			{
				System.out.println("Title is not same");
			}
		}
		@Test(priority=3, groups = {"smoke", "sanity"})
		public void logodisplay()
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
		}
		@Test(priority=1, groups = {"smoke"})
		public void createmyaccounttbutton()
		{
			boolean button=driver.findElement(By.id("Register")).isEnabled();
			if(button)
			{
				System.out.println("Button is Enabled");
			}
			else
			{
				System.out.println("button is not enabled");
			}
			
		}
		@Test(priority=2, groups = {"sanity"})
		public void createmyaccounttextverification()
		{
			
	        String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	        if(buttontext.contains("Create my account >>"))
	        {
	        	System.out.println("Text is present");
	        }
	        else
	        {
	        	System.out.println("Text is not present");
	        }
			
		}
		@Test(priority=4, enabled=false)
		public void fullnametextverification()
		{
	        String src=driver.getPageSource();
			
			if(src.contains("Full Name"))
			{
				System.out.println("Full name is present");
			}
			else
			{
				System.out.println("Full name is not present");
			}
		}

	


}
