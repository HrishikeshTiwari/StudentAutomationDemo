package ParameterPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"Browser","url","EmailId"})
	public void YahoologinPage(String Browser,String url, String EmailId) throws Exception {
		
		if(Browser.equals("chrome")) {
		System.setProperty("Webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		 driver= new ChromeDriver();
		}
		
		else {
			if(Browser.equals("firefox"))
				System.setProperty("Webdriver.gecko.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys(EmailId); // this email id can be changed and we dont want to pass it again 
		 // and again from here. we don't want to hardcode so to avoid this we will pass from somewhere else.
		 
		// 1. We can pass from Testng.xml --> Environment variable
		// 2. we can pass from excel --> test data
		// 3. properties file --> Environment variable or test data
		 //4. Json file
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
		 driver.quit();
		 
		
	}
}
