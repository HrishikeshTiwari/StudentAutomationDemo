package Testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
	// All the prerequisite starting with @Before
	@BeforeSuite // 1
	public void Setup() {
		System.out.println("Doing the setup process");
	}
	
	@BeforeClass //3
	public void LuchBrowser(){
		System.out.println("Lucnhing the chrome browser");
		
	}
	
	@BeforeMethod //4
	public void EnterUrl() {
		System.out.println("entering the url for the website");
	}
	
	@BeforeTest //2
	
	public void Loginmethod() {
		System.out.println("Doing the login process");
	}
	@Test // this is the test cases 
	public void GoogleTest() {
		System.out.println("Google title test");
	}
	
	
	// Post Conditions are started with @After
	@AfterTest //5
	public void DeleteAllcookies() {
		System.out.println("Deleting the cookies");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Closing the browser");
	}
	@AfterSuite
	public void Suttr() {
		
	}
// IN Any testng class we have three section 
	//1. Precondition
//	2. test cases
//3. Post condition
}
