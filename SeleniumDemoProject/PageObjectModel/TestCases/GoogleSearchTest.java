package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	static WebDriver driver= null;
	
	
	public static void main(String[] args) {
		GoogleSearch();
	}
	
	public static void GoogleSearch() {
		System.setProperty("webdriver.chrome.driver","C://CollegeExecutionwrokspace//SeleniumDemoProject//Driver//chromedriver 1.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		GoogleSearchPage obj= new GoogleSearchPage();
		obj.Searchtext("Selenum");
		obj.Search();
		driver.close();
		driver.quit();
		
	}
	
	

}
