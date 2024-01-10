package Testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportwithtestng {
	ExtentSparkReporter spark ;
	ExtentReports extent;
	WebDriver driver;
	@BeforeTest
	void Setup() {
		
		// directory where output is to be printed
		 spark = new ExtentSparkReporter("HtmlExtent report");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);

		System.setProperty("Webdriver.chrome.dirver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
	     driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void test1() {
		  WebDriver driver=null;
		ExtentTest test = extent.createTest("MyFirstTest").pass("Pass");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google url");
		driver.findElement(By.name("q")).sendKeys("Autoamtion");
	    
		
	}
	
	@AfterTest
	public void Teardown() {
		
	}

}
