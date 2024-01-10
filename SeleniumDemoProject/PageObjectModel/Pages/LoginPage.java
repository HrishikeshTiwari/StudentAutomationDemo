package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	WebDriver driver;
	By UserID = By.xpath("//*[contains(@id,'Login1_UserName')]");
	By password = By.xpath("//*[contains(@id,'Login1_Password')]");
	By Submit = By.xpath("//*[contains(@id,'Login1_LoginButton')]");
	//Constructor to initialize object
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginToSite(String Username, String Password)
	{
		this.enterUsername(Username);
		this.enterPasssword(Password);
		this.clickSubmit();
	}
	
	
	public void enterUsername(String Username)
	{
		driver.findElement(UserID).sendKeys(Username);
	}
	
	
	public void enterPasssword(String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}
	
	
	public void clickSubmit()
	{
		driver.findElement(Submit).click();
	}
	
	
}