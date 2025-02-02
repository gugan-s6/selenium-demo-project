package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Actions action;
	
	@BeforeClass
	
	public void setup() {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	}
	
	
	@BeforeMethod
	public void method() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		action = new Actions(driver);
		
	}
	
	@AfterClass
	
	public void teardown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
	

}
