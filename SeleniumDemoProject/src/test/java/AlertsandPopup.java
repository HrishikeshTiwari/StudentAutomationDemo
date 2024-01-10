import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;

public class AlertsandPopup {
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException, Exception  {									
		System.setProperty("webdriver.gecko.driver","C://CollegeExecutionwrokspace//SeleniumDemoProject//Driver//geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
	
        
        // Alert Message handling
                    		
        driver.get("https://demo.guru99.com/test/delete_customer.php");			
          driver.manage().window().maximize(); 
         // File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // this methods is to take the screenshot
          // now we have to store the screenshot for this we have to add one library in pom.xml file commons io
         // FileUtils.copyFile(srcFile, destFile);
           FileUtils.copyFile(file, new File(".//screenshot/screen.png"));
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();	// switch to alert	
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
        driver.close();
    }	

}
	