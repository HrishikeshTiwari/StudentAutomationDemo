import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.media.sound.Toolkit;

public class FileUploadingUsingRobotClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[@id='heroSection-container']/div[3]/div[2]/div[2]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).click(); // here click method is not working so we will use javascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement Button= driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		js.executeScript("arguments[0].click();",Button);
		
		Thread.sleep(3000);
		
		// Now for uploading the file  we need to do three step
		// 1.Copy the path
		// 2.Paste(CTRL+V) it in the window popup
		 //3. Press Enter
		
		Robot rb= new Robot();
		rb.delay(2000);
		 // Copy the path
		StringSelection ss = new StringSelection("C:\\Users\\HrishikeshTiwari\\OneDrive - Anthology Inc\\Desktop//clarkson clg TC.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		// Releasing the above command
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		// Pressing the Enter Key
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("The file is uploaded Sucessfully");
		
		
		driver.quit();
		
	}

}
