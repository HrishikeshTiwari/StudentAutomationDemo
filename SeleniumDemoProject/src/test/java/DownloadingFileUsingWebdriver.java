import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingFileUsingWebdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id=\"textbox\"]")).sendKeys("Hi I am passing this character for testing purpise");
		driver.findElement(By.id("createTxt")).click();
		//link-to-download
		driver.findElement(By.id("link-to-download")).click();
		driver.quit();
		
		
		// in Chrome driver we can download the file directly but in firefox we can not download the file directly
	}

}
