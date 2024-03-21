package junitpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
	
	String link="http://www.google.com";
	
	@Test
	public void test()
	{
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			
			if(code==200)
			{
				System.out.println("response code is 200- successful");
			}
			else 
			{
				System.out.println("not expected");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}

	}

}
