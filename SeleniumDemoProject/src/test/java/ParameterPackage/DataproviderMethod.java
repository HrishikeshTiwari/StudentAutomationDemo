package ParameterPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DataproviderMethod {
	WebDriver driver;
	 @Test(dataProvider="Logindata")
	 public void TestLogin(String User, String Password) throws Exception {
		 System.setProperty("Webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(User);
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(Password);
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		// System.out.println(driver.getTitle());
		// Assert.assertTrue(driver.findElement(By.xpath("(//p[text()='Burak İkinci'])[1]"))).isDi
		 Thread.sleep(6000);
		 
		 
	 }
	 
	 @DataProvider(name="Logindata")
	 public Object[][] Logindata() {
		 Object[][] data= new Object[2][2];
		 data[0][0]="Admin";
		 data[0][1]="admin123";
		 
		 data[1][0]="Admin";
		 data[1][1]="admin133";
		 
		 return data;
	 }
	 
	 @AfterMethod
	 public void TearDown() {
		 driver.quit();
	 }
	

}
