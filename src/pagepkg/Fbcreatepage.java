package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class Fbcreatepage {
	
	WebDriver driver;
	
	By fbcreatepage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void createpageclick()
	{
		driver.findElement(fbcreatepage).click();
	}
	
	public String titleverification()
	{
		String actual=driver.getTitle();
		return actual;
	
	}
	
	public void signupclick()
	{
		driver.findElement(fbsignup).click();
	}
	

}
