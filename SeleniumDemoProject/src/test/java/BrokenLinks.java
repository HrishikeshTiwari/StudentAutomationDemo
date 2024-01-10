//package BstackDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class BrokenLinks {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\CollegeExecutionwrokspace\\SeleniumDemoProject\\Driver\\chromedriver 1.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

		// Navigate to BStackDemo Website
		driver.get("https://bstackdemo.com/");


		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());


		// Iterating each link and checking the response status
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}


		driver.quit();
	}


	public static void verifyLink(String url) {
		try {
			URL link = new URL(url);
			// HttpULLconnection class is used to check weather the links is connecting to the target page or not without clicking the link.
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			
			// Connect() is a method used to establish the connection.
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
		} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
		}
	}
}