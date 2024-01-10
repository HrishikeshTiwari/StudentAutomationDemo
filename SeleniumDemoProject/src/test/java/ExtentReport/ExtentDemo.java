package ExtentReport;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentDemo {
	static  ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
		report = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
		report.addSystemInfo("HostName","Local Host");
		report.addSystemInfo("Environment","QA");
		report.addSystemInfo("User Name","Hrishikesh");
	report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml")); // this is optional
	}
	@Test
	public void extentReportsDemo()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		
		if(driver.getTitle().equals("Google"))
		{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		
		}
		
		else
		{
			test.log(LogStatus.FAIL, "Test Failed");
		}
		driver.quit();
	}
	@Test
	public void DemoReportPass() {
		test= report.startTest("DemoReport pass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condition is true");
	}
	
	@Test
	public void DemoReportFail() {
		test= report.startTest("Checking the Fail result");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert pass as condition is false");
	}
	
	@AfterMethod
	public void getresult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		report.endTest(test);
	}
	
	@AfterClass
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
	}
}