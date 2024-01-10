import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BrowserLunch{
   public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("https://www.google.com/");
      // identify element
      WebElement p=driver.findElement(By.id("APjFqb"));
      //enter text with sendKeys() then apply submit()
      p.sendKeys("Selenium Java");
      driver.findElement(By.xpath("//ul[@role=\"listbox\"]/li[1]")).click();
      Thread.sleep(2);
      // Explicit wait condition for search results
     // WebDriverWait w = new WebDriverWait(driver, 5);
     // w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
      p.submit();
      driver.close();
   }
}