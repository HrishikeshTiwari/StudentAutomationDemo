package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	By Textbox_Search= By.id("lst-ib");
	By Button_Search= By.name("btnk");
	
	
	public void GoogleSearchPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void Searchtext(String text) {
		driver.findElement(Textbox_Search).sendKeys("text");
		
	}
	
	public void Search() {
		driver.findElement(Button_Search).sendKeys(Keys.RETURN);
		
	}

}
