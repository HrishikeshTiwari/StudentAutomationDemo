import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://CollegeExecutionwrokspace//SeleniumDemoProject//Driver//geckodriver.exe");
		FirefoxOptions options= new FirefoxOptions();
		options.addArguments("headless");
		WebDriver driver= new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
