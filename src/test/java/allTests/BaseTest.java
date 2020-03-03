package allTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.HomePage;



public class BaseTest {
  private static BaseTest instance;
  
  WebDriver driver;
  
  HomePage homePage;
  
  
  private BaseTest() {
	  
  }
  
  
 
  
	
	public WebDriver getDriver(String driverValue) {
		if (driver==null) {
			
			if (driverValue.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/shahid2/Desktop/bootCamp1/pnt2-mct-autoproject/chromedriver");
				driver =new ChromeDriver();
				
				
				
			} else if (driverValue.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/shahid2/Desktop/bootCamp1/pnt2-mct-autoproject/chromedriver.exe");
				driver =new FirefoxDriver();
			}
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// overloading 
		return driver;
	}
	
	
	public static BaseTest getInstance () {
		if (instance==null) {
			instance= new BaseTest();
		
		}
		return instance;
		
	}
	
public HomePage getHomePage() {
	if (homePage==null) {
		homePage= new HomePage(driver);
	}
	return homePage;
}
	
	
	
	
	
	
}
