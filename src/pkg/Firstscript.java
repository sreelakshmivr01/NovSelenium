package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// Chromedriver //access browser
		//Firefoxdriver
		//edgedriver
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String exp="Google";
		String actualtitle=driver.getTitle();
		
		if(exp.equals(actualtitle))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
		driver.quit();
		

	}

}
