package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Reportgeneration {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void setup()
	{
		reporter=new ExtentHtmlReporter("./Report/myreport.html");
		reporter.config().setDocumentTitle("Automation");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Testername", "Abc");
		extent.setSystemInfo("Browsername", "Chrome");
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, exp);
	}
	
	@AfterTest
	public void closebrowser()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void setdown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		test.log(Status.FAIL, "test case failed is "+result.getName());
		test.log(Status.FAIL, "test case failed is "+result.getThrowable());
		}
	
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
		test.log(Status.PASS, "test case passed is "+result.getName());
		}
	}
	
}
	
	
	
