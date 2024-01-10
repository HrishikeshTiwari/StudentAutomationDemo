import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitandExplicitwait {
	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//input[@id=\"identifierId\"]"));
		
		// entering username
		element.sendKeys("hrishikeshbihar@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	
		// entering password
		driver.findElement(By.id("Passwd")).sendKeys("Mahadev@1296");
		
		 // Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
		// click on the compose button as soon as the "compose" button is visible\
		// PageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		driver.quit();
		
		
	}

}
