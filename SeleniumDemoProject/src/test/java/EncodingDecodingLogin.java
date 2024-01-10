import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodingDecodingLogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("Testing@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys(decodeString("dGVzdDEyMw=="));
		Thread.sleep(3000);
		driver.quit();

	}
	
	public static String decodeString(String Password) {
		byte[] decodedString= Base64.decodeBase64(Password);
		
		return(new String(decodedString));
		
	}

}
