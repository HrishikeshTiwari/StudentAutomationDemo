package ParameterPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ExcelDataProvider {
	WebDriver driver;
	 @Test(dataProvider="Logindata")
	 public void TestLogin(String Username, String Passsword) throws Exception {
		 System.setProperty("Webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(Username);
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(Passsword);
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		// System.out.println(driver.getTitle());
		// Assert.assertTrue(driver.findElement(By.xpath("(//p[text()='Burak İkinci'])[1]"))).isDi
		 Thread.sleep(6000);
		 
		 
	 }
	 
//	 @DataProvider(name="Logindata")
//	 public Object[][] Logindata() {
//		 Object[][] data= new Object[2][2];
//		 data[0][0]="Admin";
//		 data[0][1]="admin123";
//		 
//		 data[1][0]="Admin";
//		 data[1][1]="admin133";
//		 
//		 return data;
//	 }
	 
	 @DataProvider(name="Logindata")
	 
	 public String[][] GetData(String Username, String Passsword) throws Exception {
		 String path=".\\Datasheet\\loginData.xlsx";
		 // Now we want to use the utility class for that we have to create the object of the Utility class
		 ExcelUtility obj= new ExcelUtility(path);
		 
		 // Now with object we can create all the method present in the ExcelUtility class
		int totalrows= obj.getRowCount("Sheet1");
		int totlacolms= obj.getCellCount("Sheet1", 1);
		String loginData[][]=new String[totalrows][totlacolms];
		
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totlacolms;j++) {
				loginData[i-1][j]=obj.getCellData("Sheet1", i, j);
				
			}
		}
		return loginData;
				
				}
	 
	 @AfterClass
	 public void TearDown() {
		 driver.quit();
	 }
	

}
