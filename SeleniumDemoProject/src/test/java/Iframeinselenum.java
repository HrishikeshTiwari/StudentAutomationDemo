import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeinselenum {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://CollegeExecutionwrokspace//SeleniumDemoProject//Driver//chromedriver 1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
		//driver.switchTo().frame(3);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@frameborder=\"0\"])[2]")));
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File(".//screenshot/screen.png"));
		driver.findElement(By.id("name")).sendKeys("Testing");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		Thread.sleep(5000);
		driver.quit();

	}

}
