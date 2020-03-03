package allTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest {

	BaseTest instance= BaseTest.getInstance();
	
	
	
	
	@Test
	public void titileValidation() {
		instance.getDriver("chrome");
		instance.getHomePage().url();
		String title = instance.getHomePage().getTitle();
		
		System.out.println(title);
		
		
		
		
	// Assert.assertEquals(title, "Target : Expect More. Pay Less.");
	// System.out.println("hii");
	 
	 SoftAssert logic1 = new SoftAssert();
	 
	 logic1.assertEquals(title, "Target : Expect More. Pay Less.");
	 System.out.println("hii");
	 
	 logic1.assertAll();
	 
	}
	
	
	@Test
	public void valiadteComputertext() {
		instance.getDriver("chrome");
		instance.getHomePage().url();
		instance.getHomePage().searching();
		
		String actul = instance.getHomePage().searchResult();
		
		
		Assert.assertEquals(actul, "computer");
	}
	
	
	@AfterClass
	public void teardown() {
		instance.driver.close();
	}
	
}
