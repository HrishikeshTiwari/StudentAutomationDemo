import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://CollegeExecutionwrokspace//SeleniumDemoProject//Driver//chromedriver 1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// in case of Authentication Popup we will give username and password along with the url.
		String username="admin";
		String password="admin";
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		System.out.println(driver.getTitle());
		//driver.get("admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(6000);
		driver.quit();

	}

}
