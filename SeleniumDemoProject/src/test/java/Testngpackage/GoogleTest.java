package Testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	@BeforeMethod

	public void SetUp() {
		System.setProperty("Webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=0Gew2XOuum8&list=PLFGoYjJG_fqp25buwscrsKA5q8qsLsuUy");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test

	public void YoutubeTitle() {
		String title= driver.getTitle();
		System.out.println("the tilte is"+title);
	}
	@Test
	public void verify() {
		String title= driver.getTitle();
		System.out.println("the tilte is"+title);
		Assert.assertEquals(title, "TestNG Framework- Selenium Tutorial Part-1 - YouTube");

	}

	@Test
	public void Logotest() {
		Boolean b=driver.findElement(By.xpath("(//yt-icon[@id=\"logo-icon\"])[1]")).isDisplayed();
	}
	@AfterMethod

	public void Teardown() {
		driver.quit();

	}
}
