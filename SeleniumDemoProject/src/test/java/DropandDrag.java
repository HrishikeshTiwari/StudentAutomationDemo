import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		File file= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//srceenshot/image.png"));
		WebElement from = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To= driver.findElement(By.xpath("//*[@id='bank']/li"));
		// Using Action Class for Drag and drop
		Actions action= new Actions(driver);
		// Drag and Droppped
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.dragAndDrop(from, To).build().perform();
		
		
		driver.quit();
		
	}

}
