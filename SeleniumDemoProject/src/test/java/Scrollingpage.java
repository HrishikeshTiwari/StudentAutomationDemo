import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://CollegeExecutionwrokspace//SeleniumDemoProject//Driver//chromedriver 1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(3000);
		driver.quit();
	}

}
