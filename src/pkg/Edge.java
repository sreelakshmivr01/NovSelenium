package pkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		String baseurl="http://www.irctc.co.in";
		driver.get(baseurl);
		String exp="IRCTC Next Generation eTicketing System";
		String actualTitle=driver.getTitle();
		String src=driver.getPageSource();
		if(exp.equals(actualTitle))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("not same");
		}
		if(src.contains("Hotel"))
		{
			System.out.println("Hotel is present");
		}
		else
		{
			System.out.println("Hotel is not present");
		}
		driver.quit();

	}

}
