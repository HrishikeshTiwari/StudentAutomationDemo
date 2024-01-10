import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@id='heroSection-container']/div[3]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\HrishikeshTiwari\\OneDrive - Anthology Inc\\Desktop\\clarkson clg TC.docx");
		System.out.println("The file is uploaded Sucessfully");
		driver.quit();
	}

}
