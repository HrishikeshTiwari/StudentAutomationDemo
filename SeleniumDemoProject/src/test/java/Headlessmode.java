import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headlessmode {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://CollegeExecutionwrokspace//SeleniumDemoProject//Driver//chromedriver 1.exe");
	ChromeOptions options= new ChromeOptions();
	options.addArguments("headless");
	WebDriver driver = new ChromeDriver(options);
	//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.quit();
	}

}
