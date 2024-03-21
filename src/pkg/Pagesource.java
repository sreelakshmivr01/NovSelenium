package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String baseurl="https://www.google.com";
		driver.get(baseurl);
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("Gmail is present");
		}
		else
		{
			System.out.println("Gmail is not present");
		}
		driver.quit();
	

	}

}
